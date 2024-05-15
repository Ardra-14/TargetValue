import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = s.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size ; i++){
            arr[i] = s.nextInt();
        }

        System.out.println("Enter the target value: ");
        int target = s.nextInt();

        System.out.println("Pairs that sum upto target: ");
        for (int i = 0; i < size ; i++){
            for (int j = i + 1 ; j < size ; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println( arr[i] + " , " + arr[j] );
                }
            }
        }
    }
}