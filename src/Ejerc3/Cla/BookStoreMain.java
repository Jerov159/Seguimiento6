package Ejerc3.Cla;

import Ejerc3.Book;
import Ejerc3.Student1;
import Ejerc3.Teacher;
import java.util.ArrayList;
import java.util.Scanner;

public class BookStoreMain {
    public static void main(String[] args) {
        ArrayList<Object> elements = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int option;
        do {
            System.out.println("Select an option:");
            System.out.println("1. Add book");
            System.out.println("2. Add student");
            System.out.println("3. Add professor");
            System.out.println("4. Display elements");
            System.out.println("5. Exit");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the title:");
                    scanner.nextLine();
                    String title = scanner.nextLine();
                    System.out.println("Enter the author:");
                    String author = scanner.nextLine();
                    System.out.println("Enter the number of pages:");
                    int pages = scanner.nextInt();

                    Book book = new Book(title, author, pages);
                    elements.add(new Book(title, author, pages));
                    break;
                case 2:
                    System.out.println("Enter the name:");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.println("Enter the age:");
                    int age = scanner.nextInt();
                    System.out.println("Enter the course:");
                    scanner.nextLine();
                    String course = scanner.nextLine();

                    Student1 student1 = new Student1(name, age, course);
                    elements.add(new Student1(name, age, course));
                    break;
                case 3:
                System.out.println("Enter teacher's name:");
                String TeacherName = scanner.nextLine();
                System.out.println("Enter teacher's age:");
                 int TeacherAge = scanner.nextInt();
                System.out.println("Enter teacher's subject:");
                    String TeacherSubject = scanner.nextLine();

                Teacher teacher = new Teacher(TeacherName, TeacherAge, TeacherSubject);
                elements.add(teacher);
                break;
                case 4:
                    for (Object element : elements) {
                        System.out.println(element);
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (option != 5);

        scanner.close();
    }
    }
