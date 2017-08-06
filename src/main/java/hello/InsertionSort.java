package hello;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {



    public static void insertIntoSorted(int[] ar) {

            System.out.println();
            int temp=ar[ar.length-1];
            for(int j=ar.length-2; j>=0; j--){

                if(ar[j]>temp){
                    ar[j+1]=ar[j];
                }
                else{
                    ar[j+1]=temp;
                }
                for(int i=0;i<ar.length;i++){
                    System.out.print(" "+ar[i]);
                }
                System.out.println();

            }
    }




    /* Tail starts here */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = scan.nextInt();

        int ar[] = new int[size];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }

        System.out.println("input array is ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
        }
        insertIntoSorted(ar);
    }



}
