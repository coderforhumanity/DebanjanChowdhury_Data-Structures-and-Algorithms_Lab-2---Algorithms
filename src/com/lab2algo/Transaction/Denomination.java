package com.lab2algo.Transaction;
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;


public class Denomination {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of currency denominations");
        int size = s.nextInt();
        Integer arr[] = new Integer[size];
        System.out.println("enter the currency denominations value");
        for(int i=0;i<size;i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.println("enter the amount you want to pay");
        int amount = s.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        int notes[] = new int[size];
        for(int i=0;i<size;i++)
        {
            if (amount>=arr[i])
            {
                notes[i] = amount/arr[i];
                amount = amount % arr[i];
            }
        }
        System.out.println("Your payment approach in order to give min no of notes will be");
        for(int i=0;i<size;i++)
        {
            if(notes[i] !=0)
            {
                System.out.println(arr[i]+":"+notes[i]);
            }
        }

    }
}
