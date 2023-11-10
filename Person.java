
public class Person implements Nameable{
    int id;
    String name;
     int age;
     boolean parent_permission;

    // Constructors


    public Person(String name, int age,boolean parent_permission){
        this.name = name;
        this.age = age;
        this.parent_permission = parent_permission;

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

public String getCorrectName(){
    return name;
}
}