package com.concepts;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        JavaMethod method = new JavaMethod();
        method.myMethod();

        Javaparameters method1 = new Javaparameters();
        method1.myMethod1("Aathi", 26);
        method1.myMethod1("Anu", 27);
        method1.myMethod1("Arun", 30);


        Javapmeteraddress method2 = new Javapmeteraddress();
        method2.myMethod2("Aathi", "Madurai");
        method2.myMethod2("Anu", "Chennai");
        method2.myMethod2("Arun", "Kovilpatti");
    }
}
