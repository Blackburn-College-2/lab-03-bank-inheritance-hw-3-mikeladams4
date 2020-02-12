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
public class Account {
    Money balance;
    
    public Account(Money balance){
        this.balance = balance;
    }
    
    public void withdraw(Money m){
        Money after = this.balance.subtract(m);
        this.balance = after;
    }
    
    public void deposit(Money m){
        Money after = this.balance.add(m);
        this.balance = after;
    }
    
    public Money getBalance(){
        return this.balance;
    }
}
