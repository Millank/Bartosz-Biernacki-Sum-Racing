package com.kodilla;

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * Created by Bartosz Biernacki.
 */
public class SumRacing {

    public static void main(String[] args) throws java.lang.Exception
    {

        int sumaA = 1000;
        int sumaB = 0;
        int sampleCounter = 0;
        Random randomGenerator = new Random();

        while(sumaA>sumaB) {

            sampleCounter++;

            System.out.println("Numer przebiegu pętli: " + sampleCounter);

            int firstRandom = randomGenerator.nextInt(10);
            int secondRandom = randomGenerator.nextInt(50);

            sumaA = sumaA + firstRandom;
            sumaB = sumaB + secondRandom;

            System.out.println("sumaA = " + sumaA + ", sumaB = " + sumaB );
            System.out.println();
        }

    }

}
