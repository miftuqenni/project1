
public class Teacher extends Person {
    private String specialization;

    // Constructor
    public Teacher(int id, String name, int age, boolean parent_permission, String specialization) {
        super( name, age, parent_permission);
        this.specialization = specialization;
    }

    

    // Override canUseServices to always return true for teachers
    @Override
    public boolean canUseServices() {
        return true;
    }
}
