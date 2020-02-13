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
public class Loan extends Account {

    double rate;

    public Loan(Money loan, double rate) {
        super(loan);
        this.rate = rate;
    }

    public void addTheInterest() {
        this.balance.setAmount(this.balance.getAmount() + (this.balance.getAmount() * rate));
    }

    public Money payLoan(Money payment) {
        this.balance.setAmount(this.balance.getAmount() - payment.getAmount());
        return this.balance;
    }

    @Override
    public String toString() {
        return "Car Loan Balance: " + this.balance.toString();
    }
}
