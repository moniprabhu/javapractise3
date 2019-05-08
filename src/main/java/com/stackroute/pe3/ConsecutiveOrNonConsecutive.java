package com.stackroute.pe3;
import java.util.*;

public class ConsecutiveOrNonConsecutive {

        public static void main(String args[]){
            String s="";
            //getting the input
            System.out.println("Enter the input numbers");
            Scanner in = new Scanner(System.in);

              s=in.next();

              String[] array=s.split(",");
              int[] arr=new int[array.length];
            for (int i = 0; i < array.length; i++) {
                arr[i] = Integer.parseInt(array[i]);
            }
            boolean checking=true,checking1=true;
            for (int i = 0; i < arr.length-1 ; i++) {
                if ((arr[i + 1] - arr[i]) == 1){
                    checking=false;
                }
                else if((arr[i + 1] - arr[i]) == -1) {
                    checking1=false;
                } else {

                    break;
                }
            }
            if ( checking==false && checking1==true)
                System.out.println(s + "are consecutive numbers");
            else if( checking1==false && checking==true){
                System.out.println(s + "are consecutive numbers");
            }
            else if(checking==false && checking1==false){
                System.out.println(s + "are non consecutive numbers");
            }
            else
                System.out.println(s + "are non consecutive numbers");
}}