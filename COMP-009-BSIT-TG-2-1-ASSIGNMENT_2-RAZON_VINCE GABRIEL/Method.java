package secondsemassignment;

import java.util.Map;

public class Method {
	
    // Print in tree structure
	
    public static void printTree(Map<String, String[]> consumablesMap) {
        System.out.print("Food");
        for (Map.Entry<String, String[]> entry : consumablesMap.entrySet()) {
            System.out.println("|");
            System.out.println("|******* " + entry.getKey());
            for (String item : entry.getValue()) {
                System.out.println("|        --- " + item);
            }
        }
    }
    
    // Print in bullet form
    
    public static void printBullet(Map<String, String[]> consumablesMap) {
    	
        System.out.print("Food");
        for (Map.Entry<String, String[]> entry : consumablesMap.entrySet()) {
            System.out.println(" ");
            System.out.println("[]" + entry.getKey());
            for (String item : entry.getValue()) {
                System.out.println("   •" + item);
            }
        }
    }
}



