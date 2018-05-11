package io.pello.codewars.pascaltriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generateTriangle(int numRows) {

        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();

        for (int i = 0; i < numRows; i++) {
            row.add(0, 1);

            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
            triangle.add(new ArrayList<Integer>(row));
        }

        return triangle;

    }

}
