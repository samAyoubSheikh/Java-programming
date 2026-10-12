import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        //one way
//        int[] arr={2,4,1,3,45,7,5,4,3,43};
//
//
//        for (int i=0;i< arr.length;i++){
//            System.out.println("Elements in array are :"+arr[i]);
//        }
        //second way
        int[] arr;
        arr=new int[]{1,2,3,4,5,6,7,8,9};

        //accessing element
        System.out.println(arr[0]);//print element at index 1
        arr[0]=20;//updating value of index 1
        System.out.println(arr[0]);

        //now traverse array using for loop
        System.out.println("printing whole array...");
        for (int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("prints sorted array :");
        Arrays.sort(arr);//sorts the array
        for (int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
