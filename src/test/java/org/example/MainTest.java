package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main =new Main();
    @Test
    public void test1(){
        int []tab={0};
        int i = main.firstMissingPositive(tab);
        assertEquals(1,i);

    }
    @Test
    public void test2(){
        int []tab={1,2,0};
        int i = main.firstMissingPositive(tab);
        assertEquals(3,i);

    }
    @Test
    public void test3(){
        int []tab={3,4,-1,1};
        int i = main.firstMissingPositive(tab);
        assertEquals(2,i);

    }

}