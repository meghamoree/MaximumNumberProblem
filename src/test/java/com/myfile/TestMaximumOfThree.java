package com.myfile;
import org.junit.Assert;
import org.junit.Test;

    public class TestMaximumOfThree {
        //Only object variable creation
        MaximumOfThree objectOfMaximumOfThree;
        @Test
        public void givenThreeInput_maxIntegerAtFirstPosition_shouldReturnMaximum()
        {
            objectOfMaximumOfThree = new MaximumOfThree(); //Instantiation or object address passing to objectOfMaximumOfThree
            int checkMaxInteger = objectOfMaximumOfThree.findMaxInteger(5,3,1);
            Assert.assertEquals(5,checkMaxInteger);
        }
    }


