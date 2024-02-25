import java.util.Scanner;

public class Sorting {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.err.print("Enter the number of elements: ");
    int size = sc.nextInt();
    int[] A = new int[size];
    System.err.print("Enter maximum "+ size + " elements: ");
    for(int i = 0; i < size; i++){
      A[i] = sc.nextInt();
    }


    selectionSort(A,size);
    printArray(A, size);
  }

  public static void selectionSort(int[] A, int n){
    int i, j ,temp, min_index;
    for(i = 0; i < n-1; i++){
      min_index = i;
      for(j = i+1; j < n; j++){
        if(A[j] < A[min_index]){
          min_index = j;
        }
      // swap the values
      temp = A[min_index];
      A[min_index] = A[i];
      A[i] = temp;
      }
    }
  }
  public static void printArray(int []A, int n) {
    System.out.print("Sorted list items: \t");
    for(int i = 0; i<n; i++){
      System.out.print(A[i] + "\t");
    }
  }
}
