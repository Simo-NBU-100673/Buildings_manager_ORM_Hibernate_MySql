package entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Owners {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idOwners", nullable = false)
    private int idOwners;
    @Basic
    @Column(name = "first_name", nullable = false, length = 255)
    private String firstName;
    @Basic
    @Column(name = "last_name", nullable = false, length = 255)
    private String lastName;
    @OneToMany(mappedBy = "ownersByOwnerId")
    private Collection<Apartments> apartmentsByIdOwners;

    public int getIdOwners() {
        return idOwners;
    }

    public void setIdOwners(int idOwners) {
        this.idOwners = idOwners;
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
        Owners owners = (Owners) o;
        return idOwners == owners.idOwners && Objects.equals(firstName, owners.firstName) && Objects.equals(lastName, owners.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOwners, firstName, lastName);
    }

    public Collection<Apartments> getApartmentsByIdOwners() {
        return apartmentsByIdOwners;
    }

    public void setApartmentsByIdOwners(Collection<Apartments> apartmentsByIdOwners) {
        this.apartmentsByIdOwners = apartmentsByIdOwners;
    }
}
