package Beans;
public class Student {
    private String name;
    private String surname;
    private int age;
    private String ClassName;

    public Student(String name, String surname, int age, String ClassName){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.ClassName = ClassName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setClassName(String className){
        this.ClassName = className;
    }

    public String GetFullInfo(){
        return this.getName() + " " + this.getSurname() + " " + this.getAge() + " " + this.getClassName();
    }
}
