/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab03;

/**
 *
 * @author mikel.adams
 */
public class Money {

    Currency currency;
    double amount;

    public Money(Currency currency, double amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getAmountString() {
        String s = "" + this.amount;
        return s;
    }

    public Money add(Money input) {
        double sum = this.amount + input.amount;
        Money money = new Money(this.currency, sum);
        return money;
    }

    public Money subtract(Money input) {
        double ans = this.amount - input.amount;
        Money money = new Money(this.currency, ans);
        return money;
    }
    
    @Override
    public String toString(){
        String s = this.currency.symbol + this.amount;
        return s;
    }
}
