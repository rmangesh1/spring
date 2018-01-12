package mang.no.study;

import java.util.Objects;

/**
 * Created by mrana on 09.01.2018.
 */
public class Employee {

    String firstName;

    String lastName;

    Integer salary;

    public Employee(String firstName, String lastName, Integer salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, salary);
    }
}
