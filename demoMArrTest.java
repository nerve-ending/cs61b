import org.junit.Test;
import static org.junit.Assert.*;

public class demoMArrTest {
    @Test
    public void testMaxValue() {
        int[][] arr = {{1,2,3}, {2,4,7}, {3,9,8}};
        int[][] arr1 = {{3,2,1}, {5,3,6}, {4,0,1}};
        assertEquals(9, MultiArr.maxValue(arr));
        assertEquals(6, MultiArr.maxValue(arr1));
    }

    @Test
    public void testAllRowSum() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {76, 8, 9}};
        assertArrayEquals(new int[]{6, 15, 24}, demoMArr.allRowSum(arr));
        assertArrayEquals(new int[]{6, 15, 93}, demoMArr.allRowSum(arr2));
    }

}
