package Main;
import Utilities.InputUtility;
import Utilities.MenuUtility;

public class Main {
    public static void main(String[] args) {
        int option;
        while (true) {
            option = InputUtility.requireNumber("What do you want to do?" + "\n1. Register Student" + "\n2. Show All Students" + "\n3. Find a Student" + "\n4. Update Student" + "\n5. Exit from the System");
            MenuUtility.Main_Menu(option);
            System.out.println();
        }
    }
}
