package by.itstep.zmeyka.lesson22.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayLogicTest {

    @Test
    public void  testCountNonZeroElementsBasic(){
        int[] array={2,3,-4,5,0,6,0,-2};
        int expected=6;

        int actual=ArrayLogic.countNonZeroElements(array);
        assertEquals(expected,actual);

    }

    @Test
    public void  testCountNonZeroElementsWithoutZeroElements(){
        int[] array={2,3,-4,5,6,-2};
        int expected=array.length;

        int actual=ArrayLogic.countNonZeroElements(array);
        assertEquals(expected,actual);

    }
    @Test
    public void  testCountNonZeroElementsWithAllZeroElements(){
        int[] array={0,0,0,0,0};
        int expected=0;

        int actual=ArrayLogic.countNonZeroElements(array);
        assertEquals(expected,actual);

    }


    @Test
    public void  testCountNonZeroElementsWithNull(){
        int expected=-1;

        int actual=ArrayLogic.countNonZeroElements(null);
        assertEquals(expected,actual);

    }

    @Test
    public void  testCountNonZeroElementsEmtyLogic (){

        int expected=-1;

        int actual=ArrayLogic.countNonZeroElements(new int[0]);
        assertEquals(expected,actual);

    }

    @Test
    public void  testCountNonZeroElementsWithOneElementZero(){
        int[] array={0};
        int expected=0;

        int actual=ArrayLogic.countNonZeroElements(array);
        assertEquals(expected,actual);

    }

    @Test
    public void  testCountNonZeroElementsWithNoneZero(){
        int[] array={5};
        int expected=1;

        int actual=ArrayLogic.countNonZeroElements(array);
        assertEquals(expected,actual);

    }

}
