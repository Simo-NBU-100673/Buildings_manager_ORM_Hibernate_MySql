package entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Companies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCompanies", nullable = false)
    private int idCompanies;


    @Column(name = "name", nullable = false, length = 255, unique = true)
    private String name;

    @OneToMany(mappedBy = "companiesByCompanyId")
    private Collection<Contracts> contractsByIdCompanies;

    public Companies() {
    }

    public Companies(String name) {
        this.name = name;
    }

    public Companies(int idCompanies, String name) {
        this.idCompanies = idCompanies;
        this.name = name;
    }

    public int getIdCompanies() {
        return idCompanies;
    }

    public void setIdCompanies(int idCompanies) {
        this.idCompanies = idCompanies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Collection<Contracts> getContractsByIdCompanies() {
        return contractsByIdCompanies;
    }

    public void setContractsByIdCompanies(Collection<Contracts> contractsByIdCompanies) {
        this.contractsByIdCompanies = contractsByIdCompanies;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Companies companies = (Companies) o;
        return idCompanies == companies.idCompanies && Objects.equals(name, companies.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCompanies, name);
    }

    @Override
    public String toString() {
        return "Companies{" +
                "idCompanies=" + idCompanies +
                ", name='" + name + '\'' +
                '}';
    }
}
