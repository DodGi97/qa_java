package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

   @Mock
   Feline feline;
   Cat cat;

   @Before
   public void init(){
       cat = new Cat(feline);
   }

    @Test
    public void shouldReturnMeow() {
        assertEquals("Кошка не говорит 'Мяу'", cat.getSound(), "Мяу");
    }

    @Test
    public void getReturnsListOfPredatorFood() throws Exception {
            Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            Assert.assertEquals("Ожидался рацион хищника", List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}