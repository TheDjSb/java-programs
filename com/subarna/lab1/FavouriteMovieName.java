package com.subarna.lab1;

import java.util.Scanner;

public class FavouriteMovieName {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your Favourite Movie name : ");
        String moviename = input.next();
        System.out.println();
        System.out.println("Your Favourite Movie name is : \n"+moviename);
    }
}
