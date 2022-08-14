package algorithm.sort;

import org.junit.Test;
import java.util.Arrays;

public class SortTest {
    //冒泡排序
    @Test
    public void bubbleSort(){
        int[] arr = new int[]{43,32,76,-98,0,64,33,-21,32,99};
        for(int i = 0;i < arr.length - 1;i++){
            for(int j = 0;j < arr.length - 1 - i;j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }

    @Test
    public void test(){
        int[] arr = new int[]{43,32,76,-98,0,64,33,-21,32,99};

        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
            }
        }

        //Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test2(){
        int i=1;
        int a=i++;
        System.out.println(i);
        System.out.println(a);
    }
}
