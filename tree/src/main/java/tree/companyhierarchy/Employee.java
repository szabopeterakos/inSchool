package tree.companyhierarchy;


public class Employee implements Comparable<Employee> {
    private String email;
    private String name;
    private String referenceEmail;

    public Employee(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public Employee(String email, String name, String referenceEmail) {
        this.email = email;
        this.name = name;
        this.referenceEmail = referenceEmail;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getReferenceEmail() {
        return referenceEmail;
    }

    @Override
    public int compareTo(Employee o) {
        return this.email.compareTo(o.email);
    }

    @Override
    public boolean equals(Object o) {
        Employee employee = (Employee) o;

        if (email != null ? !email.equals(employee.email) : employee.email != null) return false;
        return name != null ? name.equals(employee.name) : employee.name == null;
    }

    @Override
    public int hashCode() {
        int result = email != null ? email.hashCode() : 0;
        result = 13 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
