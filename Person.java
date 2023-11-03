
public class Person {
    private int id;
    private String name;
    private int age;
    private boolean parent_permission;

    // Constructors
    public Person(int id, String name, int age, boolean parent_permission) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.parent_permission = parent_permission;
    }

    public Person(int id, int age) {
        this(id, "Unknown", age, true);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Private method
    private boolean ofAge() {
        return age >= 18;
    }

    // Public method
    public boolean canUseServices() {
        return ofAge() || parent_permission;
    }
}
