package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private final List<String> LIST_EXPECTED = List.of("Животные", "Птицы", "Рыба");
    @Mock
    Feline feline;
    Lion lion;

    @Test
    public void getKittensReturnsFelineKittensCount() throws Exception {
            lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(5);
        Assert.assertEquals("Ожидалось 5", 5, lion.getKittens());
    }

    @Test
    public void getFoodReturnsListOfPredatorFood() throws Exception {
            lion = new Lion("Самка", feline);
            Mockito.when(feline.getFood("Хищник")).thenReturn(LIST_EXPECTED);
            Assert.assertEquals("Ожидался рацион хищника", LIST_EXPECTED, lion.getFood());
    }

    @Test(expected = Exception.class)
    public void constructorWrongLionSexReturnsException() throws Exception {
            lion = new Lion("Undefined", feline);
    }
}
