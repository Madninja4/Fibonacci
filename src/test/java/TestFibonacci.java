import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFibonacci {
    @Test
    void testGetFibonacci(){
        ArrayList<Integer> correctList = new ArrayList(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34));
        Fibonacci fibonacci = new Fibonacci();
        ArrayList<Integer> resultList = fibonacci.getFibonacci(10);
        assertEquals(resultList,correctList);


    }
    @Test
    void testGetFibonacci2(){
        ArrayList<Integer> correctList = new ArrayList(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144));
        Fibonacci fibonacci = new Fibonacci();
        ArrayList<Integer> resultList = fibonacci.getFibonacci(13);
        assertEquals(resultList,correctList);


    }
}
