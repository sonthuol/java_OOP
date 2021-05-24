package Manager_Student;

public class Student {
    private int id;
    private String name;
    private float mark_theoretical;
    private float mark_practice;

    public Student() {
    }

    public Student(int id, String name, float mark_theoretical, float mark_practice) {
        this.id = id;
        this.name = name;
        this.mark_theoretical = mark_theoretical;
        this.mark_practice = mark_practice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMark_theoretical() {
        return mark_theoretical;
    }

    public void setMark_theoretical(float mark_theoretical) {
        this.mark_theoretical = mark_theoretical;
    }

    public float getMark_practice() {
        return mark_practice;
    }

    public void setMark_practice(float mark_practice) {
        this.mark_practice = mark_practice;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mark_theoretical=" + mark_theoretical +
                ", mark_practice=" + mark_practice +
                '}';
    }

    public float Average_Mark(){
        return (mark_theoretical+mark_practice)/2;
    }
}
