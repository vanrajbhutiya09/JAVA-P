import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        
        int[] arr = {5,1,4,8,9,10};
        int target = 9;
        // System.out.println(arr.length);

        
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        
    }
}
