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
public abstract class Account {

    Money balance;
    ArrayList<Money> history = new ArrayList<>();
    ArrayList<Transactions> transactions = new ArrayList<>();

    public Account(Money balance) {
        this.balance = balance;
    }

    public void withdraw(Money m) {
        Transactions trans = new Transactions();
        trans.setOld(this.balance);
        trans.setChange(m);
        this.balance = this.balance.subtract(m);
        trans.setNew(this.balance);
        this.history.add(new Money(m.getCurrency(), -m.getAmount()));
        this.transactions.add(trans);
    }

    public void deposit(Money m) {
        Transactions trans = new Transactions();
        trans.setOld(this.balance);
        trans.setChange(m);
        this.balance = this.balance.add(m);
        trans.setNew(this.balance);
        this.history.add(m);
        this.transactions.add(trans);
    }

    public Money getBalance() {
        return this.balance;
    }
    
    public void setBalance(Money x){
        this.balance = x;
    }

    public void printHistory() {
        System.out.println("Account Action History:");
        for (int i = 0; i < this.history.size(); i++) {
            System.out.println(this.history.get(i).toString());
        }
    }
    
    public Transactions[] getHistory(){
        Transactions[] trans = new Transactions[transactions.size()];
        transactions.toArray(trans);
        return trans;
    }

    @Override
    public String toString() {
        return "Account Balance: " + this.balance.toString();
    }
}
