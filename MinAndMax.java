import java.util.*;
public class MinAndMax {
    public int max(int [] array) {
       int max = 0;
      
       for(int i=0; i<array.length; i++ ) {
          if(array[i]>max) {
             max = array[i];
          }
       }
       return max;
    }
    public int min(int [] array) {
       int min = array[0];
      
       for(int i=0; i<array.length; i++ ) {
          if(array[i]<min) {
             min = array[i];
          }
       }
       return min;
    }
    public static void main(String args[]) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("Enter the elements");
        int arr[]=new int[size];
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
       MinAndMax m = new MinAndMax();
       System.out.println("Maximum value in the array is::"+m.max(arr));
       System.out.println("Minimum value in the array is::"+m.min(arr));
    }
 }