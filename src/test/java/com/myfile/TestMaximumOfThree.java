package com.myfile;
import org.junit.Assert;
import org.junit.Test;

    public class TestMaximumOfThree {

        MaximumOfThree objectOfMaximumOfThree;
        @Test
        public void givenNNumberOfInput_maxIntegerAtFirstPosition_shouldReturnMaximum()
        {
            objectOfMaximumOfThree = new MaximumOfThree();
            int checkMaxInteger = (int) objectOfMaximumOfThree.findMaximum(5,3,1,2,4);
            Assert.assertEquals(5,checkMaxInteger);
        }

        @Test
        public void givenNNumberOfInput_maxIntegerAtSecondPosition_shouldReturnMaximum()
        {
            objectOfMaximumOfThree = new MaximumOfThree();
            int checkMaxInteger = (int) objectOfMaximumOfThree.findMaximum(65,110,87);
            Assert.assertEquals(110,checkMaxInteger);
        }

        @Test
        public void givenNNumberOfInput_maxIntegerAtLastPosition_shouldReturnMaximum()
        {
            objectOfMaximumOfThree = new MaximumOfThree();
            int checkMaxInteger = (int) objectOfMaximumOfThree.findMaximum(112,450,10,110,870);
            Assert.assertEquals(870,checkMaxInteger);
        }

        @Test
        public void givenNNumberOfInput_maxFloatAtFirstPosition_shouldReturnMaximumFloatNumber()
        {
            objectOfMaximumOfThree = new MaximumOfThree();
            float checkFloat = (float) objectOfMaximumOfThree.findMaximum(120.45f,45.67f,100.00f);
            Assert.assertEquals(java.util.Optional.of((Float)120.45f), java.util.Optional.of(checkFloat));
        }

        @Test
        public void givenNNumberOfInput_maxFloatAtSecondPosition_shouldReturnMaximumFloatNumber()
        {
            objectOfMaximumOfThree = new MaximumOfThree();
            float checkFloat = (float) objectOfMaximumOfThree.findMaximum(120.45f,450.67f,100.00f,25.56f);
            Assert.assertEquals(java.util.Optional.of((Float)450.67f), java.util.Optional.of(checkFloat));
        }

        @Test
        public void givenNNumberOfInput_maxFloatAtLastPosition_shouldReturnMaximumFloatNumber()
        {
            objectOfMaximumOfThree = new MaximumOfThree();
            float checkFloat = (float) objectOfMaximumOfThree.findMaximum(120.45f,45.67f,1000.00f);
            Assert.assertEquals(java.util.Optional.of((Float)1000.00f), java.util.Optional.of(checkFloat));
        }

        @Test
        public void givenNNumberOfInput_maxStringAtFirstPosition_shouldReturnMaximumString()
        {
            objectOfMaximumOfThree = new MaximumOfThree();
            String checkString = (String) objectOfMaximumOfThree.findMaximum("Strawberry", "Apple", "Banana","Cherries");
            Assert.assertEquals("Strawberry",checkString);
        }

        @Test
        public void givenNNumberOfInput_maxStringAtSecondPosition_shouldReturnMaximumString()
        {
            objectOfMaximumOfThree = new MaximumOfThree();
            String checkString = (String) objectOfMaximumOfThree.findMaximum("Apples","Peaches","Banana","Orange");
            Assert.assertEquals("Peaches",checkString);
        }
        @Test
        public void givenNNumberOfInput_maxStringAtLastPosition_shouldReturnMaximumString()
        {
            objectOfMaximumOfThree = new MaximumOfThree();
            String checkString = (String) objectOfMaximumOfThree.findMaximum("Apple","Banana", "Peaches", "Oranges");
            Assert.assertEquals("Peaches",checkString);
        }
    }


