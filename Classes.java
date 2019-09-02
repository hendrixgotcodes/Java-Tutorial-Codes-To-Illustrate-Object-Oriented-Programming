package com.Samuel;
import java.util.Scanner;
public class Classes {


            public static void main (String[] args){
                            Scanner scanner = new Scanner(System.in);

                            BankAccount one = new BankAccount();

                            System.out.println("What is your account number");
                            String accountnumber =  scanner.next();
                            one.setAccountnumber(accountnumber);
                            System.out.println( "Your account Number is " + one.getAcountnumber());
/**_________________________________________________________________________________________________________________**/
                            System.out.println("Please Enter Your Full name");
                            String fullname = scanner.next();

                            one.setCustomername(fullname);

                            System.out.println();
/**__________________________________________________________________________________________________________________**/
                            System.out.println("Making Deposit ?");
                            String answer = scanner.next();
                            one.deposit(answer);

                            System.out.println("Would You like to take some money?");
                            answer = scanner.next();
                            one.withdrawFunds(answer);
            }
}
