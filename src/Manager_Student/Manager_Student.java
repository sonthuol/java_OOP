package Manager_Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager_Student {
    public static Scanner sc = new Scanner(System.in);

    private List<Student> studentList;

    public Manager_Student() {
        studentList = new ArrayList<Student>();
    }

    public void add_Student(){
        int id = (studentList.size() > 0 ) ? (studentList.size() + 1) : 1;
        System.out.println("ID student: " + id);
        String name = input_name();
        float mark_theoretical = input_mark();
        float mark_practice = input_mark();
        Student student = new Student(id, name, mark_theoretical, mark_practice);
        studentList.add(student);
    }

    public void show(){
        for (Student student : studentList){
            System.out.format("%5d | ", student.getId());
            System.out.format("%20s | ", student.getName());
            System.out.format("%10.2f|", student.getMark_theoretical());
            System.out.format("%10.2f|", student.getMark_theoretical());
            System.out.format("%10.1f\n", student.Average_Mark());
        }
    }

    private int input_id(){
        System.out.print("Input id student: ");
        while (true){
            try {
                int id  = Integer.parseInt(sc.nextLine());
                return id;
            }catch (NumberFormatException ex){
                System.out.println("Invalid! input id again");
            }
        }
    }

    private String input_name(){
        System.out.print("Input name student: ");
        return sc.nextLine();
    }

    private float input_mark(){
        System.out.print("Input mark student: ");
        while (true){
            try {
                float mark  = Float.parseFloat(sc.nextLine());
                if(mark < 0.0 && mark > 10.0){
                    throw new NumberFormatException();
                }
                return mark;
            }catch (NumberFormatException ex){
                System.out.println("Invalid! input mark again");
            }
        }
    }


}
