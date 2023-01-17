package entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
public class Paymentshistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPayment", nullable = false)
    private int idPayment;
    @ManyToOne
    @JoinColumn(name = "Apartments_id", referencedColumnName = "idApartment", nullable = false)
    private Apartments apartmentsByApartmentsId;
    @Basic
    @Column(name = "dateOfPayment", nullable = false)
    private Date dateOfPayment;

    public int getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(int idPayment) {
        this.idPayment = idPayment;
    }

    public Date getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(Date dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public Apartments getApartmentsByApartmentsId() {
        return apartmentsByApartmentsId;
    }

    public void setApartmentsByApartmentsId(Apartments apartmentsByApartmentsId) {
        this.apartmentsByApartmentsId = apartmentsByApartmentsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paymentshistory that = (Paymentshistory) o;
        return idPayment == that.idPayment;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPayment);
    }
}
