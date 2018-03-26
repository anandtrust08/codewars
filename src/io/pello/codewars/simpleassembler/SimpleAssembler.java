package io.pello.codewars.simpleassembler;

import java.util.Map;
import java.util.HashMap;

public class SimpleAssembler {
    public static Map<String, Integer> interpret(String[] program) {
        Map<String, Integer> result = new HashMap<String, Integer>();
        Integer value = 0;
        
        for (int i = 0; i < program.length; i++) {

            String[] params = program[i].split(" ");
            switch (program[i].substring(0, 3)) {
            case "mov":
                System.out.println("Mov");
                value = (result.get(params[2]) == null) ? Integer.valueOf(params[2]) : result.get(params[2]);
                result.put(params[1], value);
                break;
            case "inc":
                System.out.println("Inc");
                result.put(params[1], result.get(params[1]) + 1);
                break;
            case "dec":
                System.out.println("Dec");
                result.put(params[1], result.get(params[1]) - 1);
                break;

            case "jnz":
                System.out.println("jnz");
                value = (result.get(params[1]) == null) ? Integer.valueOf(params[1]) : result.get(params[1]);
                
                if (value != 0) {
                    i += (Integer.valueOf(params[2]) - 1);
                }
                break;
            default:
                System.out.println("Unknown command: " + program[i]);
                break;
            }
        }

        System.out.println(result);

        return result;
    }
}
