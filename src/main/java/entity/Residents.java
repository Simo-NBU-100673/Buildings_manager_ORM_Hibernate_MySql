package entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
public class Residents {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idResidents", nullable = false)
    private int idResidents;
    @ManyToOne
    @JoinColumn(name = "Apartments_id", referencedColumnName = "idApartment", nullable = false)
    private Apartments apartmentsByApartmentsId;
    @Basic
    @Column(name = "first_name", nullable = false, length = 255)
    private String firstName;
    @Basic
    @Column(name = "last_name", nullable = false, length = 255)
    private String lastName;
    @Basic
    @Column(name = "dateOfBirth", nullable = false)
    private Date dateOfBirth;
    @Basic
    @Column(name = "isUsingElevator", nullable = false)
    private byte isUsingElevator;

    public int getIdResidents() {
        return idResidents;
    }

    public void setIdResidents(int idResidents) {
        this.idResidents = idResidents;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public byte getIsUsingElevator() {
        return isUsingElevator;
    }

    public void setIsUsingElevator(byte isUsingElevator) {
        this.isUsingElevator = isUsingElevator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Residents residents = (Residents) o;
        return idResidents == residents.idResidents;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idResidents);
    }

    public Apartments getApartmentsByApartmentsId() {
        return apartmentsByApartmentsId;
    }

    public void setApartmentsByApartmentsId(Apartments apartmentsByApartmentsId) {
        this.apartmentsByApartmentsId = apartmentsByApartmentsId;
    }
}
