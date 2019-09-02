package com.Samuel;

import java.util.Scanner;

public class BankAccount {

        private Scanner scanner = new Scanner(System.in);


        private String accountnumber, phonenumber;
        private double balance;
        private String customername, email;

        public BankAccount( String accountnumber, String phonenumber, double balance, String customername, String email){

            this.accountnumber = accountnumber;
            this.balance = balance;
            this.phonenumber = phonenumber;
            this.customername = customername;
            this.customername = email;

        }
        public BankAccount () {

            this ("22222", "+233xxxxxxxxxx", 0.00, "Default", "example@example.com");
        }
/**__________________________________________________________________________________________________________________**/
         public void setAccountnumber(String accountnumber){

            this.accountnumber = accountnumber;

        }
        public String getAcountnumber(){
       return this.accountnumber;
   }
/**___________________________________________________________________________________________________________________*/

        public void setBalance(double balance){
            this.balance = balance;
        }
        public double getBalance(){
            return this.balance;
        }
/**___________________________________________________________________________________________________________________*/

        public void setPhonenumber(String phonenumber){

            this.phonenumber = phonenumber;
        }
        public String getPhonenumber(){
            return this.phonenumber;
        }
/**___________________________________________________________________________________________________________________*/

        public void setCustomername(String customername){
            this.customername = customername;
        }
        public String getCustomername(){
            return this.customername;
        }
/**___________________________________________________________________________________________________________________*/

        public void setEmail(String email){

            this.email = email;
        }
        public String getEmail(){
            return this.email;
        }
/**___________________________________________________________________________________________________________________*/

        public void withdrawFunds(String answer){

            double withdraw;
            String smallletters = answer.toLowerCase();

                if(smallletters.equals("yes")){
                System.out.println("Please How Much ?");
                withdraw = scanner.nextDouble();


                if ( balance < withdraw){
                    System.out.println();
                    System.out.println("Insufficient Funds");

                    return;
                }

                else {
                        this.balance -= withdraw;

                        System.out.println();
                        System.out.println("You withdrew " + withdraw);

                        System.out.println();
                        System.out.println("Dear " + getCustomername() + " your new balance is Ghc " + getBalance());
                    }

            }
                else if ( smallletters.equals("no")) {
                    return; }

                else System.out.println(" Please Enter Yes or No");
        }
/*__________________________________________________________________________________________________________________*/
        public void deposit(String answer){

                double deposit;
                String intake =answer.toLowerCase();

                if ( intake.equals("yes")){
                    System.out.println("How much would You like To deposit please");
                    deposit = scanner.nextDouble();

                    this.balance += deposit;
                    System.out.println();

                    System.out.println("You made a deposit of Ghc " + deposit);
                    System.out.println();
                    System.out.println("Dear " + getCustomername() + " Your new balance is Ghc " + balance);

                    System.out.println();

                }
                else if ( intake == "no"){
                return;
                 }
                 else System.out.println("Please Enter Yes or NO")
                        ;
        }

}
