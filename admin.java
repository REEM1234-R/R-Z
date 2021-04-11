package SSSS;
import java.util.Scanner;
import java.util.ArrayList;

public class admin {
   public static void main(String[] args){

       admin [] Admins = new admin [2];
        ArrayList ad = new ArrayList();
         ad.add("REEM");
         ad.add("112233");
         ad.add("ZINAB");
         ad.add("12345");

       user [] USER= new user [3];
         ArrayList Us= new ArrayList();
          Us.add("AMAL");
          Us.add("1102093");
          Us.add("SARA");
          Us.add("6758399");
          Us.add("NOUF");
          Us.add("347282");
          // - - - - - - - - - - - - - - -
              user f=new user (2000);
    Scanner input = new Scanner(System.in);

     System.out.println("Welcom to ATM Bank A");
         System.out.println(" if you have an account , please Enter ( 1 ) ");
           System.out.println("If you don't have an account , please Enter ( 0 ) ");

          int Selection = input.nextInt();
           if(Selection== 1)
          {
          System.out.println( " Please enter your PASSWORD :   ");
          int password = input.nextInt();
          }
        else if(Selection==0){
           System.out.println(" New Account ,,, ");

           System.out.println( "Please Enter Your Email :");
           String email = input.next();

           System.out.println( "Please Enter Your Phone Number :");
          int phone_unm = input.nextInt();

          System.out.println( " Please enter the User name  :   ");
         String Username = input.next();

          System.out.println(" ACCOUNT SUCCEFULLU CREATED ,, THANK YOU .");

          System.out.println(" Welcome customer " +Username );
        }
       System.out.println("Please choice the options");
       System.out.println("Current Balance 1 ");
       System.out.println("Withdraw 2");
       System.out.println("Deposit 3");
       System.out.println("Transfer 4");
       System.out.println("Add a new account 5");
       System.out.println("Transactions History 6");
       System.out.println("Exit 7");
       System.out.println("**********************");

       boolean flag= true;
       while (flag){
          System.out.println("Enter  the operation code you want to perform");
           int fun = input.nextInt();
           switch (fun){
               case 1:
                   System.out.println("your Current Balance :"+f.CurrentBalance);
                   System.out.println("---------------------");
                   break;
               case 2:
                   System.out.println("Enter your withdraw amount");
                      double amount = input.nextDouble();
                   System.out.println("your balance now: "+f.Withdraw(amount));
                   System.out.println("---------------------");
                   break;
               case 3:
                   System.out.println("Enter your the deposite amount");
                     amount = input.nextDouble();
                   System.out.println("Your Deposit is = "+f.Deposit(amount));
                   System.out.println("---------------------");
                   break;
               case 4:
                   System.out.println("Enter your the Transfer amount");
                   amount = input.nextDouble();
                   System.out.println("Your Transfer is = "+f.Transfer(amount));
                    System.out.println("---------------------");
                    break;
               case 5:
                  System.out.println("Do you want to add a new aaccount?");
                  System.out.println("Yes Enter 1 , No Enter 2 ");
                     int us = input.nextInt();
                   if (us==1){
                   System.out.println("Please enter the new account number");
                     int accountnumber = input.nextInt();
                   System.out.println("Please enter the new user name :");
                     String nameaccount =input.next();
                   System.out.println("Beneficiary has been added successfully");
                   System.out.println("---------------------");
                   }
                    break;
               case 6 :
                   System.out.println(f.History);
                   System.out.println("=======================");
                   System.out.println("Thanks for using our ATM ");
                    break;
               case 7 :
                  System.out.println("Thanks for using our ATM Good bye");
                  flag = false;

   }

}}

   }
