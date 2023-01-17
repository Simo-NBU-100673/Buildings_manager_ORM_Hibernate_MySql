package entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Pets {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idPet", nullable = false)
    private int idPet;
    @ManyToOne
    @JoinColumn(name = "Apartments_idApartment", referencedColumnName = "idApartment", nullable = false)
    private Apartments apartmentsByApartmentsIdApartment;
    @Basic
    @Column(name = "name", nullable = false, length = 255)
    private String name;

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(int idPet) {
        this.idPet = idPet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Apartments getApartmentsByApartmentsIdApartment() {
        return apartmentsByApartmentsIdApartment;
    }

    public void setApartmentsByApartmentsIdApartment(Apartments apartmentsByApartmentsIdApartment) {
        this.apartmentsByApartmentsIdApartment = apartmentsByApartmentsIdApartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pets pets = (Pets) o;
        return idPet == pets.idPet;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPet);
    }
}
