package io.pello.codewars.matrixspiral;

import java.util.ArrayList;
import java.util.List;

public class MatrixSpiral {
    public List<Integer> spiral(int[][] matrix) {

        List<Integer> result = new ArrayList<Integer>();

        if (matrix.length == 0) {
          return result;
        }

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
          for (int i = colBegin; i <= colEnd; i++) {  // right
            result.add(matrix[rowBegin][i]);
          }
          rowBegin++;

          for (int i = rowBegin; i <= rowEnd; i++) { // down
            result.add(matrix[i][colEnd]);
          }
          colEnd--;

          if (rowBegin <= rowEnd) {
            for (int i = colEnd; i >= colBegin; i--) {  // left
              result.add(matrix[rowEnd][i]);
            }
          }
          rowEnd--;

          if (colBegin <= colEnd) {     // up
            for (int i = rowEnd; i >= rowBegin; i--) {
              result.add(matrix[i][colBegin]);
            }
          }
          colBegin++;
        }

        return result;
      }
}
