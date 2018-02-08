package tree.companyhierarchy;

import java.util.*;

public class Company {
    private final Employee head;

    private Set<Employee> employeeSet = new TreeSet<>();

    public Company(String email, String name) {
        this.head = new Employee(email, name);
        this.employeeSet.add(new Employee(email, name));
    }

    public void addEmployee(String email, String name, String referenceEmail){
        employeeSet.add(new Employee(email, name, referenceEmail));
    }

    public Employee findByEmail(String email){
        Employee result = null;
        Iterator iterator;
        iterator = employeeSet.iterator();

        while (iterator.hasNext()) {
            Employee currentEmployee = (Employee) iterator.next();
            if(currentEmployee.getEmail().equals(email)){
                result = currentEmployee;
            }
        }
        return result;
    }

    public Employee findBossOf(String email){
        Employee result = null;
        Iterator iterator;
        iterator = employeeSet.iterator();

        while (iterator.hasNext()) {
            Employee currentEmployee = (Employee) iterator.next();
            if(currentEmployee.getEmail().equals(email)){
                result = findByEmail(currentEmployee.getReferenceEmail());
            }
        }
        return result;
    }

    public List<Employee> employeesOf(String email){
        List<Employee> result = new ArrayList<>();
        Iterator iterator;
        iterator = employeeSet.iterator();

        while (iterator.hasNext()) {
            Employee currentEmployee = (Employee) iterator.next();
            if(currentEmployee.getReferenceEmail() != null && currentEmployee.getReferenceEmail().equals(email)){
                result.add(currentEmployee);
            }
        }
        return result;
    }
}

