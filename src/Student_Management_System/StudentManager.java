package Student_Management_System;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    public static Scanner scanner = new Scanner(System.in);

    private List<Student> studentList;
    private StudentDao studentDao;

    public StudentManager(){
        studentDao = new StudentDao();
        studentList = studentDao.read();
    }

    public void add(){
        int id = (studentList.size() > 0) ? (studentList.size() + 1 ) : 1;
        System.out.println("Student id = " + id);
        String name = inputName();
        byte age = inputAge();
        String address = inputAddress();
        float gpa = inputGpa();
        Student student = new Student(id, name, age, address, gpa);
        studentList.add(student);
        studentDao.write(studentList);
    }

    public void edit(int id){
        boolean isExisted = false;
        int size = studentList.size();
        for (int i = 0; i < size ; i++){
            if(studentList.get(i).getId() == id){
                isExisted = true;
                studentList.get(i).setName(inputName());
                studentList.get(i).setAge(inputAge());
                studentList.get(i).setAddress(inputAddress());
                studentList.get(i).setGpa(inputGpa());
                break;
            }
        }
        if (!isExisted){
            System.out.printf("id = %d not existed. \n",id);
        }else{
            studentDao.write(studentList);
        }
    }

    public void delete(int id){
        Student student = null;
        int size = studentList.size();
        for (int i = 0; i < size; i++){
            if(studentList.get(i).getId() == id){
                student = studentList.get(i);
                break;
            }
            if (student != null){
                studentList.remove(student);
                studentDao.write(studentList);
            }else{
                System.out.printf("id = %d not existed. \n",id);
            }
        }
    }


    public void sortStudentByName(){
        Collections.sort(studentList, new SortStudentByName());
    }

    public void sortStudentByGPA(){
        Collections.sort(studentList, new SortStudentByGPA());
    }

    public void show(){
        for (Student student : studentList){
            System.out.format("%5d | ", student.getId());
            System.out.format("%20s | ", student.getName());
            System.out.format("%5d | ", student.getAge());
            System.out.format("%20s | ", student.getAddress());
            System.out.format("%10.1f%n", student.getGpa());
        }
    }

    int inputId(){
        System.out.println("Input student id:");
        while (true){
            try {
                int id = Integer.parseInt((scanner.nextLine()));
                return id;
            }catch (NumberFormatException ex){
                System.out.println("invalid! Input student id again !!!");
            }
        }
    }

    private String inputName(){
        System.out.println("Input student name: ");
        return scanner.nextLine();
    }

    public String inputAddress(){
        System.out.println("Input student address: ");
        return scanner.nextLine();
    }

    public byte inputAge(){
        System.out.println("Input student age: ");
        while (true){
            try {
                byte age = Byte.parseByte((scanner.nextLine()));
                if(age < 0 && age > 100){
                    throw new NumberFormatException();
                }
                return age;
            }catch (NumberFormatException ex){
                System.out.println("invalid! Input student age again!!");
            }
        }
    }

    private float inputGpa(){
        System.out.println("Input student gpa: ");
        while (true){
            try {
                float gpa = Float.parseFloat((scanner.nextLine()));
                if(gpa < 0.0 && gpa > 10.0){
                    throw new NumberFormatException();
                }
                return gpa;
            }catch (NumberFormatException ex){
                System.out.println("invalid! Input student gpa again");
            }
        }
    }

    //Getter Setter
    public List<Student> getStudentList(){
        return studentList;
    }

    public void setStudentList(List<Student> studentList){
        this.studentList = studentList;
    }
}
