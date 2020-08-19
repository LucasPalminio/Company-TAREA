import java.util.ArrayList;

public class Department {
    private String name;
    private Employee managedBy;
    private ArrayList<Employee> employees;
    private ArrayList<Office> offices;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
