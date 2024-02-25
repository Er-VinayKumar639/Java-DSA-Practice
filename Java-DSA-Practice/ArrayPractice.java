public class ArrayPractice {
  public static void main(String[] args) {
    int a[] = {5,0,34,9,32,0};
    ArrayPractice arrayPractice = new ArrayPractice();
    //arrayPractice.moveZeros(a,5);
    //arrayPractice.printArray(a);
   // arrayPractice.arrayDemo();
    int arr[arrayPractice.removeEven.oddCount] = arrayPractice.removeEven(a);
    arrayPractice.printArray(arr);
  }

  public void arrayDemo(){
    // array declaration and initialisation
    int[] myArray = new int[5]; //default values
    myArray[0] = 31;
    myArray[1] = 32;
    myArray[2] = 33;
    myArray[3] = 31;
    myArray[4] = 13;
    printArray(myArray);
  }

  public int[] removeEven(int[] myArray){
    public static final oddCount = 0;
    for(int i=0; i<myArray.length;i++){
      if(myArray[i] % 2 == 0){
        oddCount++;
      }
    }
    int[] result = new int[oddCount];
    int idx = 0;
    for(int i=0; i<oddCount; i++){
      if (myArray[i] % 2 != 0) {
        result[idx] = myArray[i];
        idx++;
      }
    }
    return result;
  }

  // public void moveZeros(int []a, int n){
  //   int j = 0;
  //   for(int i = 0; i<n; i++){
  //     if(a[i] != 0 && a[j] == 0){
  //       //swap
  //       int temp = a[i];
  //       a[i] = a[j];
  //       a[j] = temp;
  //     }
  //     if(a[j] != 0){
  //       j++;
  //     }
  //   }
  // }

  public void printArray(int[] a){
    for(int x: a){
      System.out.print(x + " ");
    }
  System.out.println();
  }
}
