package entity;
import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Apartments {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idApartment", nullable = false)
    private int idApartment;
    @Basic
    @Column(name = "floor", nullable = false)
    private int floor;
    @ManyToOne
    @JoinColumn(name = "Owner_id", referencedColumnName = "idOwners", nullable = false)
    private Owners ownersByOwnerId;
    @ManyToOne
    @JoinColumn(name = "Buildings_id", referencedColumnName = "idBuilding", nullable = false)
    private Buildings buildingsByBuildingsId;
    @OneToMany(mappedBy = "apartmentsByApartmentsId")
    private Collection<Paymentshistory> paymentshistoriesByIdApartment;
    @OneToMany(mappedBy = "apartmentsByApartmentsIdApartment")
    private Collection<Pets> petsByIdApartment;
    @OneToMany(mappedBy = "apartmentsByApartmentsId")
    private Collection<Residents> residentsByIdApartment;

    public int getIdApartment() {
        return idApartment;
    }

    public void setIdApartment(int idApartment) {
        this.idApartment = idApartment;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartments that = (Apartments) o;
        return idApartment == that.idApartment;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idApartment);
    }

    public Owners getOwnersByOwnerId() {
        return ownersByOwnerId;
    }

    public void setOwnersByOwnerId(Owners ownersByOwnerId) {
        this.ownersByOwnerId = ownersByOwnerId;
    }

    public Buildings getBuildingsByBuildingsId() {
        return buildingsByBuildingsId;
    }

    public void setBuildingsByBuildingsId(Buildings buildingsByBuildingsId) {
        this.buildingsByBuildingsId = buildingsByBuildingsId;
    }

    public Collection<Paymentshistory> getPaymentshistoriesByIdApartment() {
        return paymentshistoriesByIdApartment;
    }

    public void setPaymentshistoriesByIdApartment(Collection<Paymentshistory> paymentshistoriesByIdApartment) {
        this.paymentshistoriesByIdApartment = paymentshistoriesByIdApartment;
    }

    public Collection<Pets> getPetsByIdApartment() {
        return petsByIdApartment;
    }

    public void setPetsByIdApartment(Collection<Pets> petsByIdApartment) {
        this.petsByIdApartment = petsByIdApartment;
    }

    public Collection<Residents> getResidentsByIdApartment() {
        return residentsByIdApartment;
    }

    public void setResidentsByIdApartment(Collection<Residents> residentsByIdApartment) {
        this.residentsByIdApartment = residentsByIdApartment;
    }
}
