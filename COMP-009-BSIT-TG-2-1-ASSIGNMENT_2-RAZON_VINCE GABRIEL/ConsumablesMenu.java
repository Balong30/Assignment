package secondsemassignment;

import java.util.Scanner;

public class ConsumablesMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Consumables consumables = new Consumables(); // Creating an instance of Consumables class
        
        //Main Menu
        System.out.println("How would you like the consumables to be presented?\n");
        System.out.println("1 - Tree Form");
        System.out.println("2 - Bullet Form");
        System.out.println("3 - Exit\n");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();
        
        switch(choice) {
        
        case 1:
            System.out.println();
            consumables.printTreeForm();
            break;
        case 2:
            System.out.println();
            consumables.printBulletForm();
            break;
        }
    }
}

