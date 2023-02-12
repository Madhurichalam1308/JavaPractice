package Test;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {

    public static void main(String[] args) {

        Employees E1 = new Employees("tom",1,5000,45);
        Employees E2 = new Employees("Harry",2,10000,55);
        Employees E3 =  new Employees("Satya",3,55000,35);
        Employees E4 =  new Employees("Satya",4,75000,36);
        Employees E5 =  new Employees("Satya",5,95000,37);

        List<Employees> employeeList = new ArrayList<Employees>();

        employeeList.add(E1);
        employeeList.add(E2);
        employeeList.add(E3);
        employeeList.add(E4);
        employeeList.add(E5);

        for (Employees e : employeeList) {

            System.out.println(e);
        }
        employeeList.stream().forEach(employees -> System.out.println(employees));

       int hs = employeeList.stream().map(employees -> employees.getSalary()).max(Integer::compare).get();
        System.out.println(hs);

        employeeList.stream().filter(employees -> employees.getSalary()==hs).forEach(employees -> System.out.println(employees));

    }
}
