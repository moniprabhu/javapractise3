//Create a class with a main( ) that throws an object of class Exception inside a try block.
//a. Give the constructor for Exception a String argument.
//b. Catch the exception inside a catch clause and print the String argument.
//c. Add a finally clause and print a message to prove you were there.
package com.stackroute.pe3;
import java.util.*;

    class someMyexception extends Exception {
        public someMyexception(String str)
        {
            super(str);


        }
    }
    //dividebyzeroerror
    class ExceptionHandling {
        public void checkDivision(int num) throws someMyexception {
            if (num == 0) {
                someMyexception divideByZero = new someMyexception("Divide By Zero Exception");
                throw divideByZero;
            } else
                System.out.println(10/num);

        }

    }
    //main class
    public class ExceptionClass {
        public static void main(String ar[]) {
            int number;
            System.out.println("Enter Denominator...");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            ExceptionHandling handlingException = new ExceptionHandling();

            try {

                handlingException.checkDivision(number);
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }



            finally {
                System.out.println("Inside finally");
            }
        }
    }

