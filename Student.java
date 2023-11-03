
public class Student extends Person {
    private String classroom;

    // Constructor
    public Student(int id, String name, int age, boolean parent_permission, String classroom) {
        super(id, name, age, parent_permission);
        this.classroom = classroom;
    }

    // Getters for classroom
    public String getClassroom() {
        return classroom;
    }
}
