package entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Buildings {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idBuilding", nullable = false)
    private int idBuilding;
    @Basic
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Basic
    @Column(name = "address", nullable = false, length = 255, unique = true)
    private String address;
    @OneToMany(mappedBy = "buildingsByBuildingsId")
    private Collection<Apartments> apartmentsByIdBuilding;
    @OneToMany(mappedBy = "buildingsByBuildingsId")
    private Collection<Contracts> contractsByIdBuilding;
    @OneToMany(mappedBy = "buildingsByBuildingsId")
    private Collection<Taxes> taxesByIdBuilding;

    public int getIdBuilding() {
        return idBuilding;
    }

    public void setIdBuilding(int idBuilding) {
        this.idBuilding = idBuilding;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Buildings buildings = (Buildings) o;
        return idBuilding == buildings.idBuilding && Objects.equals(name, buildings.name) && Objects.equals(address, buildings.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBuilding, name, address);
    }

    public Collection<Apartments> getApartmentsByIdBuilding() {
        return apartmentsByIdBuilding;
    }

    public void setApartmentsByIdBuilding(Collection<Apartments> apartmentsByIdBuilding) {
        this.apartmentsByIdBuilding = apartmentsByIdBuilding;
    }

    public Collection<Contracts> getContractsByIdBuilding() {
        return contractsByIdBuilding;
    }

    public void setContractsByIdBuilding(Collection<Contracts> contractsByIdBuilding) {
        this.contractsByIdBuilding = contractsByIdBuilding;
    }

    public Collection<Taxes> getTaxesByIdBuilding() {
        return taxesByIdBuilding;
    }

    public void setTaxesByIdBuilding(Collection<Taxes> taxesByIdBuilding) {
        this.taxesByIdBuilding = taxesByIdBuilding;
    }
}
