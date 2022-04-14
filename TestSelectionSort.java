package cis285_lab10;
import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class TestSelectionSort {
	private SelectionSort temp;
	
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}
    public TestSelectionSort() {
    }
    @Test
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        temp = new SelectionSort();
        
        arr=temp.basicSelectionSort(arr);
        
        System.out.println("Positive: " + Arrays.toString(arr));
        
        assertArrayEquals(Sortedarr, arr);
    }
    @Test
    public void testNegative(){
    	int[] arr = new int[5];
        arr[0] = -12;
        arr[1] = -6;
        arr[2] = -12324;
        arr[3] = -1;
        arr[4] = -145;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -12324;
        Sortedarr[1] = -145;
        Sortedarr[2] = -12;
        Sortedarr[3] = -6;
        Sortedarr[4] = -1;
        
        temp = new SelectionSort();
        
        arr=temp.basicSelectionSort(arr);
        
        System.out.println();
        System.out.println("Negative: " + Arrays.toString(arr));
        
        assertArrayEquals(Sortedarr, arr);
    }
    @Test
    public void testMixed(){
    	int[] arr = new int[5];
        arr[0] = -888;
        arr[1] = 49;
        arr[2] = 9847;
        arr[3] = -1;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -888;
        Sortedarr[1] = -1;
        Sortedarr[2] = 2;
        Sortedarr[3] = 49;
        Sortedarr[4] = 9847;
        
        temp = new SelectionSort();
        
        arr=temp.basicSelectionSort(arr);
        
        System.out.println("Mixed: " + Arrays.toString(arr));
        System.out.println();
        
        assertArrayEquals(Sortedarr, arr);  
    }
    @Test
    public void testDuplicates(){
    	int[] arr = new int[5];
        arr[0] = 89;
        arr[1] = -27;
        arr[2] = 89;
        arr[3] = -27;
        arr[4] = 0;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -27;
        Sortedarr[1] = -27;
        Sortedarr[2] = 0;
        Sortedarr[3] = 89;
        Sortedarr[4] = 89;
        
        temp = new SelectionSort();
        
        arr=temp.basicSelectionSort(arr);
        
        System.out.println("Dublicates: " + Arrays.toString(arr));
        System.out.println();
        
        assertArrayEquals(Sortedarr, arr);
    }
}
