import java.util.ArrayList;

public class MenuCompany {
    public static void main(String[] args) {
    /* Creando los empleados */

    }
    public static Company createCompany(){
        Company PalCompany = new Company("PalCompany S.A.");

        ArrayList<Department> departmentos = new ArrayList<Department>();



        departmentos.add(new Department("Departamento de Programacion"));
        departmentos.add(new Department("Departamento de Testeo"));


        Office oficinaCentral = new Headquarter("Francisco Salazar 1145, Temuco"); //Oficina para el Dept. Central
        Office oficinaDisenoYMarketing = new Office("Avenida Siempre Viva 123, Temuco"); //Oficina para el Dept. de Diseño y Marketing
        Office oficinaProgramacionYTesto = new Office("Carlos Pinto 1782, Temuco"); //Oficina de Programacion y Testeo


        Department depCentral = new Department("Departamento Central");
        depCentral.setManagedBy(new Employee("Lucas Palminio", "Ing Civil Informatico",depCentral));
        depCentral.addEmployee(new Employee("Fernando Carmona","Director Ejecutivo",depCentral));
        depCentral.addEmployee(new Employee("Carla Rubilar","Relaciones Comerciales",depCentral));
        depCentral.addOffice(oficinaCentral);//Oficina para el Dept. Central
        PalCompany.addDepartament(depCentral);


        Department depDiseno = new Department("Departamento de Diseño");
        depDiseno.setManagedBy(new Employee("Luis Stabilo", "Jefe de Diseño",depDiseno));
        depDiseno.addEmployee(new Employee("Frida Carcamo","Diseñadora",depDiseno));
        depDiseno.addEmployee(new Employee("Trinidad Palminio", "Diseñadora Grafica", depDiseno));
        depDiseno.addOffice(oficinaDisenoYMarketing);
        PalCompany.addDepartament(depDiseno);

        Department depMarketing = new Department("Departamento de Marketing");
        depMarketing.setManagedBy(new Employee("Miguel Merino","Jefe Marketing",depMarketing));
        depMarketing.addEmployee(new Employee("Claudia Tiedemann", "Encargada de redes sociales",depMarketing));
        depMarketing.addEmployee(new Employee("Katharina Nielsen", "Publicidad",depMarketing));
        depMarketing.addOffice(oficinaDisenoYMarketing);
        PalCompany.addDepartament(depMarketing);

        Department depProgramacion = new Department("Departamento de Programacion");
        depProgramacion.setManagedBy(new Employee("Mikkel Nielsen","Jefe Programacion",depProgramacion));
        depProgramacion.addEmployee(new Employee("Martha Nielsen", "Senior Programmer",depProgramacion));
        depProgramacion.addEmployee(new Employee("Ulrich Nielsen", "Mid Programmer", depProgramacion));
        depProgramacion.addOffice(oficinaProgramacionYTesto);
        PalCompany.addDepartament(depProgramacion);

        Department depTesteo = new Department("Departamento de Testeo");
        depTesteo.setManagedBy(new Employee("Jonas Kahnwald","Jefe Testeo",depTesteo));
        depTesteo.addEmployee(new Employee("Hannah Kahnwald", "Tester",depTesteo));
        depTesteo.addEmployee(new Employee("Katarina Nielsen", "Tester", depTesteo));
        depTesteo.addOffice(oficinaProgramacionYTesto);
        PalCompany.addDepartament(depTesteo);

        return PalCompany;
    }
    public static void showCompany(Company company){
        ArrayList<Department> departments = company.getDepartments();
        System.out.println("Compañia: "+company.getName());
        for (int i = 0; i < departments.size(); i++) {
            Department departament = departments.get(i);
            System.out.println("Departamento de "+departament.getName());
            System.out.println("Dirigo por: "+departament.getManagedBy());
            ArrayList<Employee> employees = departament.getEmployees();
        }
    }
}
