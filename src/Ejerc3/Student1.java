package Ejerc3;

public class Student1{
    private String name;
    private int age;
    private String course;

    public Student1(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }
    public String getInfo(){
        return "Student name"+ this.name +"\n"+ "age"+ this.age +"\n"+ "course"+ this.course;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }
}
