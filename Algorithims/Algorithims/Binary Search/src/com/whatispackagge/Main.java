package com.whatispackagge;

public class Main {

    public static void main(String[] args) {
        //Below will be a demonstration of Binary Search for an ordered array

        int randomNumbers[] = {4, 4, 2, 323, 12, 523, 21, 42, 12, 28238, 2383, 2387283, 1827, 29128, 34};
        int lower = 0;
        int upper = randomNumbers.length - 1;
        int currentInd;

        int key = 29128; //This is a key, this will be used to find the number corresponding to the key in the array
                         //using Binary Search

        int counter = 0; //This checks how many times the Binary Search attempted to find the key


        //First, lets sort this using an Insertion Sort
        int i;
        int j;

        for (i = 1; i < randomNumbers.length; i++) {
            int temp = randomNumbers[i]; //stores the current value in a temp
            j = i;
            while (j > 0 && randomNumbers[j - 1] >= temp) { //checks to see j - 1 is greater than j, if so, shift
                randomNumbers[j] = randomNumbers[j - 1]; //will shift item to right
                --j;
            }
            randomNumbers[j] = temp;
        }


        while (true) {
            currentInd = (lower + upper) / 2; //Binary Search, keeps on dividing in order to find the key

            if (randomNumbers[currentInd] == key) { //If key found
                System.out.println("Found key after " +counter+ " tries");
                return;
            }
            else if (lower > upper) {  //The key cannot be found in the array
                System.out.println("Cannot find key");
                return;
            }
            else {
                if (key > randomNumbers[currentInd]) {   //If the key is higher, search upper half
                    counter++;
                    lower = currentInd + 1;
                }
                else {    //If the key is lower, search lower half
                    counter++;
                    upper = currentInd - 1;
                }
            }
        }
    }
}
