package com.stackroute.pe3;
import java.util.*;
import java.lang.*;
public class Exceptions {


    public static void main(String[] args)
    {
        for(int choice = 0; choice<3 ; ++choice)
            try {
                switch(choice) {
                    case 0:
                        int[] a=new int[2];
                        a[3]=30;
                        break;
                    case 1:
                        int[] a1=new int[-3];
                        a1[2]=30;

                        break;
                    case 2:
                        String s=null;
                        int lenght=s.length();
                        break;
                }
            }
//checking ArrayIndexOfBoundException
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array index out of bound exception");
            }
//checking NegativeArraySizeException
            catch (NegativeArraySizeException e)
            {
                System.out.println("Negative array size exception");
            }
//NullPointerException
            catch (NullPointerException e)
            {
                System.out.println("null pointer exception");
            }
    }}
