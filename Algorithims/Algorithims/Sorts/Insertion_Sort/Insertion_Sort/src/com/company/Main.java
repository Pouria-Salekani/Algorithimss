package com.company;

public class Main {

    public static void main(String[] args) {
	// Below is a demonstration of using Insertion Sort
        // Will be sorting in increasing order

        int randomNumbers[] = {4, 4, 2, 323, 12, 523, 21, 42, 12};

        int i;
        int j;

        for(i = 1; i < randomNumbers.length; i++){
            int temp = randomNumbers[i]; //stores the current value in a temp
            j = i;
            while(j > 0 && randomNumbers[j - 1] >= temp){ //checks to see j - 1 is greater than j, if so, shift
                randomNumbers[j] = randomNumbers[j - 1]; //will shift item to right
                --j;
            }
            randomNumbers[j] = temp;
        }

        for(int x = 0; x < randomNumbers.length; x++){
            System.out.print(randomNumbers[x] + "   ");
        }

    }
}
