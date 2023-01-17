package entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Employees {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idEmployees", nullable = false)
    private int idEmployees;
    @Basic
    @Column(name = "first_name", nullable = false, length = 255)
    private String firstName;
    @Basic
    @Column(name = "last_name", nullable = false, length = 255)
    private String lastName;
    @OneToMany(mappedBy = "employeesByEmployeeId")
    private Collection<Contracts> contractsByIdEmployees;

    public int getIdEmployees() {
        return idEmployees;
    }

    public void setIdEmployees(int idEmployees) {
        this.idEmployees = idEmployees;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return idEmployees == employees.idEmployees && Objects.equals(firstName, employees.firstName) && Objects.equals(lastName, employees.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmployees, firstName, lastName);
    }

    public Collection<Contracts> getContractsByIdEmployees() {
        return contractsByIdEmployees;
    }

    public void setContractsByIdEmployees(Collection<Contracts> contractsByIdEmployees) {
        this.contractsByIdEmployees = contractsByIdEmployees;
    }
}
