//program for removalofvowels in the string
package com.stackroute.pe3;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
public class RemovelOfVowel {

        static String removeVowels(String str)
        {
            Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};

            List<Character> al = Arrays.asList(vowels);

            StringBuffer strb = new StringBuffer(str);

            for (int i = 0; i < strb.length(); i++) {

                if(al.contains(strb.charAt(i))){
                    strb.replace(i, i+1, "") ;
                    i--;
                }
            }


            return strb.toString();
        }
        // Driver method to test the above function
        public static void main(String[] args)
        {
            System.out.print("Enter the input ");
            Scanner sc = new Scanner(System.in);
            int vowel = sc.nextInt();
            String[] vowellist = new String[vowel];
            for(int j = 0; j < vowellist.length;j++)
            {
                System.out.println(j);
                System.out.print("enter the word:");
                Scanner str = new Scanner(System.in);
                //printing the words without vowels
                vowellist[j] = str.next();
                System.out.println("Place name without vowels :"+j+" "+removeVowels(vowellist[j]));
            }


        }
    }


