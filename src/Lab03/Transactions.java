/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab03;

import java.util.Calendar;

/**
 *
 * @author adams
 */
public class Transactions {

    Money oldBalance;
    Money change;
    Money newBalance;

    public Transactions() {
    }

    public void setOld(Money oldB) {
        this.oldBalance = oldB;
    }

    public void setChange(Money change) {
        this.change = change;
    }

    public void setNew(Money newB) {
        this.newBalance = newB;
    }

    static String generateStatement(Transactions[] list) {
        String x = null;
        String y = "Old Balance \t Change \t New Balance \t Date \n";
        for (int i = 0; i < list.length; i++) {
            x = list[i].toString()+ "\n";
            y = y + x;
        }
        return y;
    }

    @Override
    public String toString() {
        return oldBalance + "\t" + change + "\t" + newBalance;
    }
}
