package com.myfile;
import org.junit.Assert;
import org.junit.Test;

    public class TestMaximumOfThree {
        //Only object variable creation
        MaximumOfThree objectOfMaximumOfThree;
        @Test
        public void givenThreeInput_maxIntegerAtFirstPosition_shouldReturnMaximum()
        {
            objectOfMaximumOfThree = new MaximumOfThree();
            int checkMaxInteger = objectOfMaximumOfThree.findMaxInteger(5,3,1);
            Assert.assertEquals(5,checkMaxInteger);
        }
        @Test
        public void givenThreeInput_MaxIntegerAtSecondPosition_shouldReturnMaximum()
        {
            objectOfMaximumOfThree = new MaximumOfThree();
            int checkMaxInteger = objectOfMaximumOfThree.findMaxInteger(65,110,87);
            Assert.assertEquals(110,checkMaxInteger);
        }
        @Test
        public void givenThreeInput_MaxIntegerAtThirdPosition_shouldReturnMaximum()
        {
            objectOfMaximumOfThree = new MaximumOfThree();
            int checkMaxInteger = objectOfMaximumOfThree.findMaxInteger(112,450,870);
            Assert.assertEquals(870,checkMaxInteger);
        }
        
    }


