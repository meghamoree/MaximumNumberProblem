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
        @Test
        public void givenThreeInput_MaxFloatAtFirstPosition_shouldReturnMaximumFloatNumber()
        {
            objectOfMaximumOfThree = new MaximumOfThree();
            float checkFloat = objectOfMaximumOfThree.findMaxFloat(120.45f,45.67f,100.00f);
            Assert.assertEquals(java.util.Optional.of((Float)120.45f), java.util.Optional.of(checkFloat));
        }
        @Test
        public void givenThreeInput_maxFloatAtSecondPosition_shouldReturnMaximumFloatNumber()
        {
            objectOfMaximumOfThree = new MaximumOfThree();
            float checkFloat = objectOfMaximumOfThree.findMaxFloat(120.45f,450.67f,100.00f);
            Assert.assertEquals(java.util.Optional.of((Float)450.67f), java.util.Optional.of(checkFloat));
        }
        @Test
        public void givenThreeInput_maxFloatAtThirdPosition_shouldReturnMaximumFloatNumber()
        {
            objectOfMaximumOfThree = new MaximumOfThree();
            float checkFloat = objectOfMaximumOfThree.findMaxFloat(120.45f,45.67f,1000.00f);
            Assert.assertEquals(java.util.Optional.of((Float)1000.00f), java.util.Optional.of(checkFloat));
        }
        @Test
        public void givenThreeInput_maxStringAtFirstPosition_shouldReturnMaximumString()
        {
            objectOfMaximumOfThree = new MaximumOfThree();
            String checkString = objectOfMaximumOfThree.findMaxString("Appples","Banana","Guava"); 
            Assert.assertEquals("Appples",checkString);
        }
    }


