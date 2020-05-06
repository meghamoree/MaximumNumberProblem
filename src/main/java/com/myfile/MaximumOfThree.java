package com.myfile;
    public class MaximumOfThree {
        public static Integer findMaxInteger(Integer firstInt, Integer secondInt, Integer thirdInt){
            Integer maxOfThree=firstInt;
            if (secondInt.compareTo(maxOfThree) > 0 )
                maxOfThree=secondInt;
            if ( thirdInt.compareTo(maxOfThree) > 0 )
                maxOfThree=thirdInt;

            return maxOfThree;
        }

        public Float findMaxFloat(Float firstFloat, Float secondFloat, Float thirdFloat){
            if(firstFloat > secondFloat && firstFloat > thirdFloat){
                return firstFloat;
            }else if (secondFloat > firstFloat && secondFloat > thirdFloat){
                return secondFloat;
            }else {
                return thirdFloat;
            }
        }
    }

