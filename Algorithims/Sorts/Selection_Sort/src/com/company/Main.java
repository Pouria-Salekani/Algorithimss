package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    //code below will demonstrate Selection Sort


        int randomNumbers[] = {4, 4, 2, 323, 12, 523, 21, 42, 12};
        int min;

        //code below will sort them from smallest to largest
        for(int i = 0; i < randomNumbers.length - 1; i++){
            min = i;
            for(int j = i+1; j < randomNumbers.length; j++){ //checks i+1 index and compares it with i
                if(randomNumbers[j] < randomNumbers[min]){
                    min = j;
                }
            }
            //this is where i gets swapped with i+1 (min)
            int temp = randomNumbers[i];
            randomNumbers[i] = randomNumbers[min];
            randomNumbers[min] = temp;
        }
        //print out array
        for(int i = 0; i < randomNumbers.length; i++){
            System.out.print(randomNumbers[i] + "   ");
        }
    }
}
