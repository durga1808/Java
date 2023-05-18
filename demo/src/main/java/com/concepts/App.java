package com.concepts;

import java.util.Scanner;



/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * @param args
     */
    public static void main( String[] args )
    {
        JavaMethod method = new JavaMethod();
        method.myMethod();

        Javaparameters method1 = new Javaparameters();
        method1.myMethod1("Aathi", 26, "Madurai");
        method1.myMethod1("Anu", 27, "Chennai");
        method1.myMethod1("Arun", 30, "Kovilpatti");


        Javapmeteraddress method2 = new Javapmeteraddress();
        method2.myMethod2("Aathi", "Developer");
        method2.myMethod2("Anu", "Frontend developer");
        method2.myMethod2("Arun", "Full stack developer");
 
 
        Scanner ex =new Scanner(System.in);
        System.out.println("Enter the age of employee : ");
        
        try

        /*The try keyword creates a try...catch statement.

            The try statement allows you to define a block of c
            ode to be tested for errors while it is being executed.
            
            The catch statement allows you to define a block of code 
            to be executed, if an error occurs in the try block.*/

        {
        int age= ex.nextInt();
        System.out.println("The age is : "+age);
        Javacheckage method3 = new Javacheckage();
method3.CheckAge(age);
        }
        finally
        /*The finally keyword is used to execute code (used with exceptions - try..catch statements) 
        no matter if there is an exception or not. */
        
        {
            ex.close();
        }
        System.out.println("new line added ");


        Javaencapaccount account = new Javaencapaccount();
        account.setAcc_no(7508973289L);
       
        Javaencapaccount name =new Javaencapaccount();
        name.setName("Arun");
        
        Javaencapaccount email = new Javaencapaccount();
        email.setEmail("arunmuthu97@gmail.com");
       
   Javaencapaccount salary = new Javaencapaccount();
   salary.setSalary(20000f);
   
   System.out.println("Employee Name : " + name.getName()+ " Email ID : " + email.getEmail()+" Account Number : " + account.getAcc_no()+ " Salary : " + salary.getSalary() );
    }

    

}

    