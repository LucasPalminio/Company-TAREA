public class Employee {
    private String name;
    private String title;
    private Department manage;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", manage=" + manage.getName() +
                '}';
    }

    public Employee(String name, String title, Department manage) {
        this.name = name;
        this.title = title;
        this.manage = manage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Department getManage() {
        return manage;
    }

    public void setManage(Department manage) {
        this.manage = manage;
    }
}
