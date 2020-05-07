package com.myfile;
    public class MaximumOfThree<E extends Comparable<E>> {
        E firstInput;
        E secondInput;
        E thirdInput;
        //Default Constructor
        public MaximumOfThree(){

        }
        //Parameterised Constructor
        public MaximumOfThree(E firstInput, E secondInput, E thirdInput){
            this.firstInput=firstInput;
            this.secondInput=secondInput;
            this.thirdInput=thirdInput;
        }
        //function without parameter
        public E findMaximum(){
            E maximumResult = findMaximum(firstInput,secondInput,thirdInput);
            return maximumResult;
        }

        //Generic function that accepts all the data types
            public <E extends Comparable > E findMaximum(E firstInput, E secondInput, E thirdInput) {
                //<< >> != operators does not work in generics thus using .compare
                E maximum = firstInput;
                if (secondInput.compareTo(maximum) > 0)
                    maximum = secondInput;
                if (thirdInput.compareTo(maximum) > 0)
                    maximum = thirdInput;

                return maximum;
            }
        }
