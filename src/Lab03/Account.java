/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab03;

import java.util.ArrayList;

/**
 *
 * @author mikel.adams
 */
public class Account {

    Money balance;
    ArrayList<Money> history = new ArrayList<>();

    public Account(Money balance) {
        this.balance = balance;
    }

    public void withdraw(Money m) {
        this.balance = this.balance.subtract(m);
        this.history.add(new Money(m.currency, -m.amount));
    }

    public void deposit(Money m) {
        this.balance = this.balance.add(m);
        this.history.add(m);
    }

    public Money getBalance() {
        return this.balance;
    }

    public void printHistory() {
        System.out.println("Account Action History:");
        for (int i = 0; i < this.history.size(); i++) {
            System.out.println(this.history.get(i).toString());
        }
    }

    @Override
    public String toString() {
        return this.balance.toString();
    }
}
