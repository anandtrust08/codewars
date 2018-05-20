package io.pello.codewars.simplifypath;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class SimplifyPath {
    public String simplify(String path) {
        
        Stack<String> stack = new Stack<String>();
        Set<String> skip = new HashSet<String>(Arrays.asList("..",".",""));
        
        for (String dir : path.split("/")) {
          if (dir.equals("..") && !stack.isEmpty()) {
              stack.pop();
          } else if (!skip.contains(dir)) { 
              stack.push(dir);
          }
        }
        
        String res = "";
        for (String dir : stack) {
            res = "/" + dir + res;
        }
        
        return res.isEmpty() ? "/" : res;
      }
}
