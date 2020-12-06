package com.company;

public class Main {

    public static void main(String[] args) {
	// Demonstration of Bubble Sort

        int randomNumbers[] = {4, 4, 2, 323, 12, 523, 21, 42, 12};

        //sorting them by increasing value
        for(int i = 0; i < randomNumbers.length - 1; i++) {
            for(int j = 0; j < randomNumbers.length - 1; j++){
                if(randomNumbers[j] > randomNumbers[j + 1]){    //swap
                    int temp = randomNumbers[j + 1];
                    randomNumbers[j + 1] = randomNumbers[j];
                    randomNumbers[j] = temp;
                }
            }
        }

        //printing array out
        for(int i = 0; i < randomNumbers.length; i++){
            System.out.print(randomNumbers[i] + "  ");
        }
    }
}
