package com.myfile;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
    public class MaximumOfThree<E extends Comparable<E>> {
        E firstInput;
        E secondInput;
        E thirdInput;

        //Default Constructor
        public MaximumOfThree() {

        }
        //Generic array to take any Input
        E[] inputArray;
             public MaximumOfThree(E[]inputArray){
                this.inputArray = inputArray;
            }
                public <E extends Comparable > E findMaximum(E... inputArray) {
                    Arrays.sort(inputArray); //Sort the elements in ascending order
                    int lastIndexHasMaxElement = inputArray.length - 1; //Last Index will hold max value after sort
                    MaximumOfThree.printMax(inputArray[lastIndexHasMaxElement]);
                    return inputArray[lastIndexHasMaxElement];
                }
        //Function that print Result
        public static <E> void printMax(E maxResult)
        {
            System.out.println("Maximum among all input is: "+maxResult);
        }
    }

