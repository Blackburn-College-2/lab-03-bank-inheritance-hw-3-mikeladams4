/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab03;

/**
 *
 * @author adams
 */
public class SavingsAccount extends Account {

    double rate;

    public SavingsAccount(Money balance, double rate) {
        super(balance);
        this.rate = rate;
    }

    public void accrue() {
        this.balance.setAmount(this.balance.getAmount() + (this.balance.getAmount()*rate));
    }

    @Override
    public void withdraw(Money m) {
        this.balance = this.balance.subtract(m);
        this.history.add(new Money(m.getCurrency(), -m.getAmount()));
        accrue();
    }

}
