package Utilities;
import java.util.Scanner;
public class InputUtility {
    public static String requireText(String text){
        Scanner input = new Scanner(System.in);
        System.out.println(text);
        String Text = input.nextLine();
        return Text;
    }
    public static int requireNumber(String text){
        Scanner input = new Scanner(System.in);
        System.out.println(text);
        int res = input.nextInt();
        return res;
    }
    public static String require_name(){
        return InputUtility.requireText("Please Enter the Name of the Student:");
    }

    public static String require_surname(){
        return InputUtility.requireText("Please Enter the Surname of the Student:");
    }

    public static String require_classname(){
        return InputUtility.requireText("Please Enter the Class Name of the Student:");
    }

    public static int require_age(){
        return InputUtility.requireNumber("Please Enter the age of the Student");
    }
}
