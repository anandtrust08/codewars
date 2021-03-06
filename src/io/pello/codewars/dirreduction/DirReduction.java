package io.pello.codewars.dirreduction;


import java.util.ArrayList;
import java.util.List;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        
        if (arr.length < 2) { return new String[] {}; }
        
        List<String> directions = new ArrayList<String>();
        for (int i = 0;i< arr.length;i++)
            directions.add(arr[i]);
        
        for (int i=0;i<directions.size()-1;i++) {
            if ( (directions.get(i).equals("NORTH") && directions.get(i+1).equals("SOUTH")) ||
                (directions.get(i).equals("SOUTH") && directions.get(i+1).equals("NORTH")) || 
                (directions.get(i).equals("EAST") && directions.get(i+1).equals("WEST")) ||
                (directions.get(i).equals("WEST") && directions.get(i+1).equals("EAST"))) {

                directions.remove(i);
                directions.remove(i);

                i = (i>1)?i-2:-1;
            } 

        }
  
        String[] result = new String[directions.size()];
        
        for (int i =0;i< result.length;i++)
            result[i] = directions.get(i);
        
        return result;
    }
}

