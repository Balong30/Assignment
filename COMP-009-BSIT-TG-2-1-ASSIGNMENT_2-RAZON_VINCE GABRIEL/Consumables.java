package secondsemassignment;

import java.util.Map;
import java.util.TreeMap;

public class Consumables extends Method { // Inheriting from Method class

    // Method to print in tree form
    public void printTreeForm() {
        Map<String, String[]> consumablesMap = new TreeMap<>(); // Using TreeMap to automatically sort keys alphabetically
     
        consumablesMap.put("Beverage", new String[]{"Apple Juice", "Mango Shake"});
        consumablesMap.put("Condiments", new String[]{"Chocolate Syrup", "Hot Sauce", "Oyster Sauce", "Teriyaki Sauce"});
        consumablesMap.put("Dairy Product", new String[]{"Cream Cheese", "Feta Cheese", "Skim Milk", "Greek Yogurt"});
        consumablesMap.put("Fruit", new String[]{"Cherry", "Kiwi", "Pear", "Strawberry"});
        consumablesMap.put("Meat", new String[]{"Lamb", "Turkey", "Salmon", "Ham", "Tuna"});
        consumablesMap.put("Poultry", new String[]{"Duck"});
        consumablesMap.put("Vegetable", new String[]{"Broccoli", "Cucumber", "Eggplant", "Pepper", "Zucchini"});

        // Printing the food tree using the inherited method
        printTree(consumablesMap);
    }
    
    // Method to print in bullet form 
    public void printBulletForm() {
        Map<String, String[]> consumablesMap = new TreeMap<>(); // Using TreeMap to automatically sort keys alphabetically

        consumablesMap.put("Beverage", new String[]{"Apple Juice", "Mango Shake"});
        consumablesMap.put("Condiments", new String[]{"Chocolate Syrup", "Hot Sauce", "Oyster Sauce", "Teriyaki Sauce"});
        consumablesMap.put("Dairy Product", new String[]{"Cream Cheese", "Feta Cheese", "Skim Milk", "Greek Yogurt"});
        consumablesMap.put("Fruit", new String[]{"Cherry", "Kiwi", "Pear", "Strawberry"});
        consumablesMap.put("Meat", new String[]{"Lamb", "Turkey", "Salmon", "Ham", "Tuna"});
        consumablesMap.put("Poultry", new String[]{"Duck"});
        consumablesMap.put("Vegetable", new String[]{"Broccoli", "Cucumber", "Eggplant", "Pepper", "Zucchini"});

        // Printing the bullet list using the inherited method
        printBullet(consumablesMap);
    }
}

