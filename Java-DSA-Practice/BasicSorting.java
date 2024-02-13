import java.util.*;

import java.util.Collection;
public class BasicSorting{

  public static void bubbleSort(int arr[]){
    for(int turn=0; turn<arr.length-1; turn++){
      for(int j=0;j<arr.length-1-turn; j++){
        if(arr[j] > arr[j+1]){
          //swap
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }

  public static void printArr(Integer arr[]){
    for(int i=0; i <arr.length; i++){
      System.out.println(arr[i]);
    }
    System.out.println();
  }

  public static void insertionSort(int arr[]){
    for(int i=1; i<arr.length; i++){
      int curr = i;
      int prev = i-1;
      while (prev >=0 && arr[prev]>arr[curr]) {
        arr[prev+1] = arr[prev];
        prev--;
      }
      //insertion
      arr[prev+1] = curr;
    }
  }

  public static void selectionSort(int arr[]){
    for(int i=0; i<arr.length-1; i++){
      int minPos = i;
      for(int j=i+1; j<arr.length;j++){
        if(arr[minPos] > arr[j]){
          minPos = j;
        }
        int temp = arr[minPos];
        arr[minPos] = arr[i];
        arr[i] = temp;
      }
    }
  }
//comparator fn
  // public static int compare(int a, int b){
  //   // a < b -ve
  //   // a == b 0
  //   // a > b  +ve
  //   return b-a;
  // }

    public static void countingSort(int arr[]){
      
    }

  public static void main(String args[]){
    Integer arr[] = {5,4,1,3,2};
    //bubbleSort(arr);
    //insertionSort(arr);
    //selectionSort(arr);  //camelcase
    //Arrays.sort(arr,0,5);  //In-built method
    // Arrays.sort(arr, Collections.reverseOrder());
    Arrays.sort(arr,0,5, Collections.reverseOrder());
    printArr(arr);

    //time complexity = O(n^2); in both cases best and worst cases
  }

}