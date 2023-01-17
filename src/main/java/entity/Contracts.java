package entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Contracts {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idContracts", nullable = false)
    private int idContracts;
    @ManyToOne
    @JoinColumn(name = "Company_id", referencedColumnName = "idCompanies", nullable = false)
    private Companies companiesByCompanyId;
    @ManyToOne
    @JoinColumn(name = "Employee_id", referencedColumnName = "idEmployees", nullable = false)
    private Employees employeesByEmployeeId;
    @ManyToOne
    @JoinColumn(name = "Buildings_id", referencedColumnName = "idBuilding", nullable = false)
    private Buildings buildingsByBuildingsId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contracts contracts = (Contracts) o;
        return idContracts == contracts.idContracts;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idContracts);
    }

    public int getIdContracts() {
        return idContracts;
    }

    public void setIdContracts(int idContracts) {
        this.idContracts = idContracts;
    }

    public Buildings getBuildingsByBuildingsId() {
        return buildingsByBuildingsId;
    }

    public void setBuildingsByBuildingsId(Buildings buildingsByBuildingsId) {
        this.buildingsByBuildingsId = buildingsByBuildingsId;
    }

    public Companies getCompaniesByCompanyId() {
        return companiesByCompanyId;
    }

    public void setCompaniesByCompanyId(Companies companiesByCompanyId) {
        this.companiesByCompanyId = companiesByCompanyId;
    }

    public Employees getEmployeesByEmployeeId() {
        return employeesByEmployeeId;
    }

    public void setEmployeesByEmployeeId(Employees employeesByEmployeeId) {
        this.employeesByEmployeeId = employeesByEmployeeId;
    }


}
