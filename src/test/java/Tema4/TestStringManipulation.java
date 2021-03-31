package Tema4;

import HomeWork.Teme4.StringManipulation;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestStringManipulation {

    @Before
    public void before() {
        System.out.println("inainte de test");
    }

    @After
    public void after() {
        System.out.println("dupa test");
    }

    @Test
    public void testIsTrue() {
        boolean isAnagram = StringManipulation.CheckIfAnagram("abc", "cba");
        Assert.assertTrue(isAnagram);
    }

    @Test
    public void testIsFalse() {
        boolean isAnagram = StringManipulation.CheckIfAnagram("qwe", "cba");
        Assert.assertFalse(isAnagram);

    }
   @Test
    public void testReversedMethod() {
        String myString = "John";
        String reversed = StringManipulation.reverseMethod(myString);
        assertEquals("nhoJ", reversed);

    }
}