package Utilities;
import Beans.Student;
import Main.Config;
import static Main.Config.students;

public class StudentUtility {
    public static Student EnterStudents() {
        String name = InputUtility.require_name();
        String surname = InputUtility.require_surname();
        int age = InputUtility.require_age();
        String ClassName = InputUtility.require_classname();

        Student registered_students = new Student(name, surname, age, ClassName);
        return registered_students;
    }

    public static void Print_Registered_Students() {
        if (Config.students == null) {
            return;
        }
        for (int i = 0; i < Config.students.length; i++) {
            Student st = students[i];
            System.out.println((i + 1) + "." + st.GetFullInfo());
        }
    }

    public static void RegisterStudents() {
        int count = InputUtility.requireNumber("How Many Students Will You Register?");
        students = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Please Register Student Number " + (i + 1));
            Config.students[i] = StudentUtility.EnterStudents();
        }
        MenuUtility.Success_Message();
        StudentUtility.Print_Registered_Students();
    }

    public static void Search_For_Students_and_Print() {
        String text = InputUtility.requireText("Please Type Name,Surname or ClassName of the Student you Want to Search");
        Student[] FoundedStudents = SearchForStudent(text);
        for (int i = 0; i < students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                System.out.println(FoundedStudents[i].GetFullInfo());
            }
        }
    }

    public static Student[] SearchForStudent(String text) {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                count++;
            }
        }
        Student[] result = new Student[count];
        int found = 0;
        for (int i = 0; i < students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                result[found] = st;
                found++;
            }
        }
        return result;
    }

    public static void Update_Students() {
        StudentUtility.Print_Registered_Students();
        int index = InputUtility.requireNumber("Please Enter the Index of the Student Which You Want to Update");
        System.out.println("Please Enter the new Information of the Selected Student:");
        Student SelectedStudent = Config.students[index - 1];
        String ChangeInfo = InputUtility.requireText("Which Field do You Want to Change? Ex: name,surname,age,classname");
        String[] Parameters = ChangeInfo.split(",");
        for (int i = 0; i < Parameters.length; i++) {
            String parameters = Parameters[i];
            if (parameters.equalsIgnoreCase("name")) {
                SelectedStudent.setName(InputUtility.require_name());
            } else if (parameters.equalsIgnoreCase("surname")) {
                SelectedStudent.setSurname(InputUtility.require_surname());
            } else if (parameters.equalsIgnoreCase("age")) {
                SelectedStudent.setAge(InputUtility.require_age());
            } else if (parameters.equalsIgnoreCase("classname")) {
                SelectedStudent.setClassName(InputUtility.require_classname());
            }
        }
    }
}
