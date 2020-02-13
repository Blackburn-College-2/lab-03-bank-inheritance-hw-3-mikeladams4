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
        Account Mike = new CheckingAccount(fifty);
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
        Mike.printHistory();
        System.out.println(Mike.toString());
        System.out.println();
        Account James = new SavingsAccount(new Money(dollar, 0), .2);
        James.deposit(twenty);
        James.deposit(fifty);
        James.withdraw(ten);
        James.deposit(twenty);
        James.withdraw(ten);
        James.withdraw(ten);
        James.printHistory();
        System.out.println(James.toString());
        Loan carLoan = new Loan(new Money(dollar, 32032), .0523);
        carLoan.addTheInterest();
        System.out.println(carLoan.toString());
        carLoan.payLoan(new Money(dollar, 5000));
        System.out.println(carLoan.toString());
        System.out.println(Transactions.generateStatement(Mike.getHistory()));
        System.out.println();
        System.out.println(Transactions.generateStatement(James.getHistory()));
    }

}
