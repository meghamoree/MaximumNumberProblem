package com.myfile;
    public class MaximumOfThree<E extends Comparable<E>> {
        E firstInput;
        E secondInput;
        E thirdInput;

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
