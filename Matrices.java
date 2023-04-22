
import java.util.*;

public class Matrices {
    public static void main(String[] args) {
      
      // aij ; where i = row; j = column;
      
     int[][] matrixA = {
      {3, 10, 12, 6, 5},
      {6, 11, 15, 6, 2},
      {5, 3, 9, 4, 8},
      {1, 2, 4, 2, 7}
    };
    
    int[][] matrixB = {
      {8, 12, 4, 6, 9},
      {2, 3, 5, 3, 6},
      {4, 3, 6, 8, 2},
      {6, 7, 4, 5, 2}
    };
      
    
    int[][] sumResult = addTwoMatrices(matrixA, matrixB);
    
    System.out.println(Arrays.deepToString(sumResult));
    
    for (int k = 0; k < sumResult.length; k++){
      System.out.println(Arrays.toString(sumResult[k]));
    }
    
  }
  
  
  public static int[][] addTwoMatrices(int[][] matrixA, int[][] matrixB){
    int rowLength = matrixA.length;
    int colLength = matrixA[0].length;
    
    int[][] result = new int[rowLength][colLength];
    
    for (int i = 0; i < rowLength; i++){
      for (int j = 0; j < colLength; j++){
        result[i][j] = matrixA[i][j] + matrixB[i][j];
      }
    }
    
    return result;
  }
}
