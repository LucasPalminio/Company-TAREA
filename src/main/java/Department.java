import java.util.ArrayList;

public class Department {
    private String name;
    private Employee managedBy;
    private ArrayList<Employee> employees;
    private ArrayList<Office> offices;

    public Department(String name) {
        this.name = name;
        employees = new ArrayList<Employee>();
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

    public void informacionDepartamento(){
        System.out.println("ManagedBy: "+this.managedBy.toString());
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("Empleadosweñpdfwsdjñpm");//Aqui perdi la paciencia
            employees.get(i);
        }
        System.out.println();
    }

}
