package io.pello.codewars.dirreduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        
        if (arr.length < 2) { return new String[] {}; }
        
        List<String> directions = new ArrayList<String>();
        for (int i = 0;i< arr.length;i++)
            directions.add(arr[i]);
        
        System.out.println(directions);
        for (int i=0;i<directions.size()-1;i++) {
            if ( (directions.get(i).equals("NORTH") && directions.get(i+1).equals("SOUTH")) ||
                (directions.get(i).equals("SOUTH") && directions.get(i+1).equals("NORTH")) || 
                (directions.get(i).equals("EAST") && directions.get(i+1).equals("WEST")) ||
                (directions.get(i).equals("WEST") && directions.get(i+1).equals("EAST"))) {
                System.out.println(directions);      
                System.out.println("OK, removing: "+i+": " + directions.get(i)+ ", "+directions.get(i+1));
                directions.remove(i);
                directions.remove(i);
                System.out.println(directions);
                i = (i>1)?i-2:-1;
            } 

        }
        System.out.println(directions);
        String[] result = new String[directions.size()];
        
        for (int i =0;i< result.length;i++)
            result[i] = directions.get(i);
        
        return result;
    }
}
