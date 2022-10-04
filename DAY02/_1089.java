import java.util.Arrays;

public class _1089 {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
    }

    public static void duplicateZeros(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] == 0) {
                k++;
                if (i + 1 > arr.length - k) break;
                int[] arr2 = Arrays.copyOfRange(arr, i + 1, arr.length - 1);
                System.out.println(Arrays.toString(arr2));
                if(i < arr.length - 1) arr[i + 1] = 0;
                
                for (int j = i + 2; j < arr.length - 1  ; j ++) {
                   
                    
                    arr[j] = arr2[j - i -2];
                }
               
                i++;
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
