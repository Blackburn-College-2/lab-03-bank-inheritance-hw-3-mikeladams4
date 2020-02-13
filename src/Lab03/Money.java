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

    private Currency currency;
    private double amount;

    public Money(Currency currency, double amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }

    public Currency getCurrency() {
        return this.currency;
    }
    
    public void setAmount(double x){
        this.amount = x;
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

    public double multiply(double input) {
        double ans = this.amount * input;
        return ans;
    }

    @Override
    public String toString() {
        String s = this.currency.symbol + this.amount;
        return s;
    }
}
