import java.util.*;
public class Matrices {
  public static void main(String a[]){
   int matrix[][] = new int[3][3];
    int n = 3, m = 3;

    int matrix2[][] = {
                       {1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9,10, 11,12},
                       {13,14,15,16}
                      };
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the elements: ");
    for(int i=0; i<n; i++){
     for(int j = 0; j<m ; j++){
      matrix[i][j] = sc.nextInt();
     }
    }
  
      // printSpiralMatrix(matrix2);
      diagonalSum(matrix2);
      // printMatrix(matrix);
      // searchInMatrix(matrix, 4);
}
  public static void printMatrix(int matrix[][]) {
    System.out.println("Matrix is: ");
    for(int i = 0; i<matrix.length; i++){
      for(int j = 0; j < matrix[0].length; j++){
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
  public static boolean searchInMatrix(int matrix[][],int item){
    for(int i = 0; i<matrix.length; i++){
      for(int j = 0; j<matrix[0].length; j++){
        if(matrix[i][j] == item){
          System.out.print(matrix[i][j] + " found at index ("+ i + ","+ j + ")" );
          return true;
        }
      }
    }
    System.out.println("Item not found");
    return false;
  }

  //Example problems

  // Spiral matrix 
  // Matrix should be printed in following manner

  /*         _ _ _ _ _ _ _        1  2  3  4     
   *          _ _ _ _ _  |        5  6  7  8    
   *         | _ _ _ _ | |        9  10 11 12 
   *         |_ _ _ _ _ _|        13 14 15 16    
   */

  // LOGIC PART-   print :  1.top   2.right   3.bottom  4.left   
  
  /*               1st   2nd
   *  startRow    | 0  |  1  
   *  endRow      | 3  |  2
   *  startCol    | 0  |  1
   *  endCol      | 3  |  2
   *  
   * i.e.
   * startRow++ and endRow--
   * startCol++ and endCol--
   */


  public static void printSpiralMatrix(int matrix2[][]){
    int startRow = 0;
    int endRow = matrix2.length-1;
    int startCol = 0;
    int endCol = matrix2[0].length-1;
    
    while (startRow <= endRow && startCol <= endCol) {  // condn. for odd row and cols
      //top
      for(int j = startCol; j <= endCol; j++){
        System.out.print(matrix2[startRow][j] + " ");
      }
      
      //right
      for(int i = startRow+1; i <= endRow; i++){
        System.out.print(matrix2[i][endCol] + " ");
      }
      //bottom
      for(int j=endCol - 1; j>=startCol; j--){
        if (startRow == endRow) {
          break;
        }
        System.out.print(matrix2[endRow][j] + " ");

      }
      //left
      for(int i = endRow - 1; i >= startRow + 1; i--){
        if(startCol == endCol){
          break;
        }
        System.out.print(matrix2[i][startCol] + " ");
      }
      
      startCol++;
      startRow++;
      endCol--;
      endRow--;
    }
    System.out.println();
  }

  //Diagonal sum 
  /*   
   *   \/
   *   /\ 
   */
    public static void diagonalSum(int matrix2[][]){
      int sum = 0;
      //Time complexity for below solution is O(n^2)
      // for(int i=0; i<matrix2.length; i++){
      //   for(int j=0; j<matrix2[0].length; j++){
      //     if(i==j){
      //       sum +=matrix2[i][j];
      //     }
      //     else if(i+j == matrix2.length-1){
      //       sum += matrix2[i][j];
      //     }
      //   }
      // }

      //Optimal solution : time complexity = O(n) 
      //Space complexity = O(1)
      for(int i=0; i<matrix2.length; i++){
      //pd
        sum += matrix2[i][i];
      
      //secondary diagonal
        if (i != matrix2.length-1-i){
          sum += matrix2[i][matrix2.length-i-1];
        }
      }
      System.out.println(sum);
    }
}
