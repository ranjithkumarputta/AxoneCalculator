package com.axone.devintest.tests;

import com.axone.devintest.calc.Addition;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdditionTest2 {

    @Test
    public void add(){
        Addition a = new Addition();
        int expectedValue = a.addition(30,40);
        Assert.assertEquals(70,expectedValue);
    }
}
