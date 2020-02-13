/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab03;

/**
 *
 * @author paul.kline
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Currency dollar = new Currency("Dollar", "$");
        Money fifty = new Money(dollar, 50);
        Money twenty = new Money(dollar, 20);
        Money ten = new Money(dollar, 10);
        Account Mike = new Account(fifty);
        Mike.deposit(fifty);
        Mike.withdraw(twenty);
        Mike.deposit(fifty);
        Mike.withdraw(twenty);
        Mike.deposit(fifty);
        Mike.withdraw(ten);
        Mike.deposit(twenty);
        Mike.deposit(fifty);
        Mike.withdraw(ten);
        Mike.withdraw(fifty);
        System.out.println(Mike.balance.toString());
        System.out.println(Mike.toString());
        Mike.printHistory();
    }
    
}
