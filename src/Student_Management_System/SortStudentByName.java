package Student_Management_System;

import java.util.Comparator;

public class SortStudentByName implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2){
        return student1.getName().compareTo(student2.getName());
    }
}
