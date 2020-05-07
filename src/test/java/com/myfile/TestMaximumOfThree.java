package com.myfile;
import org.junit.Assert;
import org.junit.Test;

    public class TestMaximumOfThree {
        //Only object variable creation
        MaximumOfThree objectOfMaximumOfThree;
        @Test
        public void givenThreeInput_maxIntegerAtFirstPosition_shouldReturnMaximum()
        {
            objectOfMaximumOfThree = new MaximumOfThree(5,3,1);
            int checkMaxInteger = (int) objectOfMaximumOfThree.findMaximum();
            Assert.assertEquals(objectOfMaximumOfThree.firstInput,checkMaxInteger);
        }
        @Test
        public void givenThreeInput_MaxIntegerAtSecondPosition_shouldReturnMaximum()
        {
            objectOfMaximumOfThree = new MaximumOfThree(65,110,87);
            int checkMaxInteger = (int) objectOfMaximumOfThree.findMaximum();
            Assert.assertEquals(objectOfMaximumOfThree.secondInput,checkMaxInteger);
        }
        @Test
        public void givenThreeInput_MaxIntegerAtThirdPosition_shouldReturnMaximum()
        {
            objectOfMaximumOfThree = new MaximumOfThree(112,450,870);
            int checkMaxInteger = (int) objectOfMaximumOfThree.findMaximum();
            Assert.assertEquals(objectOfMaximumOfThree.thirdInput,checkMaxInteger);
        }
        @Test
        public void givenThreeInput_MaxFloatAtFirstPosition_shouldReturnMaximumFloatNumber()
        {
            objectOfMaximumOfThree = new MaximumOfThree(120.45f,45.67f,100.00f);
            float checkFloat = (float) objectOfMaximumOfThree.findMaximum();
            Assert.assertEquals(objectOfMaximumOfThree.firstInput, checkFloat);
        }
        @Test
        public void givenThreeInput_maxFloatAtSecondPosition_shouldReturnMaximumFloatNumber()
        {
            objectOfMaximumOfThree = new MaximumOfThree(120.45f,450.67f,100.00f);
            float checkFloat = (float) objectOfMaximumOfThree.findMaximum();
            Assert.assertEquals(objectOfMaximumOfThree.secondInput, checkFloat);
        }
        @Test
        public void givenThreeInput_maxFloatAtThirdPosition_shouldReturnMaximumFloatNumber()
        {
            objectOfMaximumOfThree = new MaximumOfThree(120.45f,45.67f,1000.00f);
            float checkFloat = (float) objectOfMaximumOfThree.findMaximum();
            Assert.assertEquals(objectOfMaximumOfThree.thirdInput, checkFloat);
        }
        @Test
        public void givenThreeInput_maxStringAtFirstPosition_shouldReturnMaximumString()
        {
            objectOfMaximumOfThree = new MaximumOfThree("Peaches","Apple","Banana");
            String checkString = (String) objectOfMaximumOfThree.findMaximum();
            Assert.assertEquals(objectOfMaximumOfThree.firstInput,checkString);
        }
        @Test
        public void givenThreeInput_maxStringAtSecondPosition_shouldReturnMaximumString()
        {
            objectOfMaximumOfThree = new MaximumOfThree("Apples","Peaches","Banana");
            String checkString = (String) objectOfMaximumOfThree.findMaximum();
            Assert.assertEquals(objectOfMaximumOfThree.secondInput,checkString);
        }
        @Test
        public void givenThreeInput_maxStringAtThirdPosition_shouldReturnMaximumString()
        {
            objectOfMaximumOfThree = new MaximumOfThree("Apples","Banana","Peaches");
            String checkString = (String) objectOfMaximumOfThree.findMaximum();
            Assert.assertEquals(objectOfMaximumOfThree.thirdInput,checkString);
        }
    }


