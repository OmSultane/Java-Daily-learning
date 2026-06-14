package DSA;
import java.util.*;
public class rotateArray {

    public static void main(String[] args) {
        
        int arr[] = {10, 20, 30, 40, 50};
        int n = arr.length;
        int d = 2;
        rotate(arr, n, d);
        System.out.println(Arrays.toString(arr));
    }

    private static void rotate(int []arr, int n, int d){
        rev(arr, 0, d-1);   
        rev(arr, d, n-1);
        rev(arr, 0, n-1);  
    }

    private static void rev(int []arr, int i , int j){
        while (i <= j) {     //rotate the passed arrays using two pointers 
            int temp; 
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

/*
Que: to rotate the array items according to given no(d)
    for ex, 
    Input : arr = {10, 20, 30, 40, 50} & d = 2 
    Output : {30, 40, 50, 10, 20}

    Logic :
    (i)  First rotate the array upto d-1 from 0  so the o/p will be {20, 10, 30, 40, 50}
    (ii) Then rotate the array from d to n-1 so the o/p will be {20, 10, 50, 40, 30}
    (iii) Now rotate the whole array from 0 to n-1 so the o/p will bw {30, 40, 50, 10, 20}

*/