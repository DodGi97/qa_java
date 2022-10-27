package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    Feline feline;

    @Before
    public void init() {
        feline = new Feline();
    }

    @Test
    public void eatMeatReturnsListOfPredatorFood() throws Exception {
            Assert.assertEquals("Ожидался рацион хищника", List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getKittensWithNoArgumentReturns1() {
        Assert.assertEquals( 1, feline.getKittens());
    }

    @Test
    public void getKittens1Returns1() {
        Assert.assertEquals( 1, feline.getKittens(1));
    }

    @Test
    public void getFamilyReturnsFeline() {
        Assert.assertEquals("Ожидалось \"Кошачьи\"", "Кошачьи", feline.getFamily());
    }

}