package com.axone.devintest.tests;

import com.axone.devintest.calc.Addition;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdditionTest3 {
    Addition a = new Addition();

    @Test
    public void add(){
        int expectedValue = a.addition(30,40);
        Assert.assertEquals(701234,expectedValue);
    }
}
