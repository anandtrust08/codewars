package io.pello.codewars.cartesian_neighbors;

public class CartesianNeighbors {
    public static int[][] cartesianNeighbor(int x, int y){
        int [][] result = new int[8][2];
        
        for (int i=0;i<3;i++)  {
           // result[i] = new int[] {x-1, y-1+i};
            result[i][0] = x-1;
            result[i][1] = y-1+i;
        }
        
        for (int i=3;i<6;i++) 
            result[i] = new int[] {x+1, y-1+i};

        
        result[6] = new int[] {x-1,y};
        result[7] = new int[] {x+1,y};
        
        return null;
    }
}
