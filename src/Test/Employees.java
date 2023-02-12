package Test;

public class Employees {

    private String name;
    private int empId;
    private int salary;
    private int age;

    public Employees(String name, int empId, int salary, int age) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
