package Utilities;
public class MenuUtility {
        public static void Main_Menu(int option) {
        switch (option) {
            case 1:
                StudentUtility.RegisterStudents();
                break;
            case 2:
                StudentUtility.Print_Registered_Students();
                break;
            case 3:
                StudentUtility.Search_For_Students_and_Print();
                break;
            case 4:
                StudentUtility.Update_Students();
                break;
            case 5:
                System.exit(0);
        }
    }

    public static void Success_Message(){
        System.out.println("Operation Completed Successfully");
    }
}
