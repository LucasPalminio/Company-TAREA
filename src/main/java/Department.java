import java.util.ArrayList;

public class Department {
    private String name;
    private Employee managedBy;
    private ArrayList<Employee> employees;
    private ArrayList<Office> offices;

    public Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
        offices = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addOffice(Office office){
        this.offices.add(office);
    }

    public ArrayList<Office> getOffices() {
        return offices;
    }

    public void setOffices(ArrayList<Office> offices) {
        this.offices = offices;
    }

    public Employee getManagedBy() {
        return managedBy;
    }

    public void setManagedBy(Employee managedBy) {
        this.managedBy = managedBy;
    }
    public  void addEmployee(Employee empleado){
        employees.add(empleado);
    }
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void imprimirDepartamento(){
        System.out.println("\nDepartment: "+getName());
        System.out.println("    ManagedBy: "+this.managedBy.toString());
        System.out.println("    Empleados: ");
        for (Employee employee : employees) {

            System.out.println("        " + employee.toString());
        }
        System.out.println("    Oficinas: ");
        for (Office office : offices) {
            System.out.println("        " + office.toString());

        }

    }

}
