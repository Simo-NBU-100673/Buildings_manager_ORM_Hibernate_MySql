package entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Taxes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idTax", nullable = false)
    private int idTax;
    @ManyToOne
    @JoinColumn(name = "Buildings_id", referencedColumnName = "idBuilding", nullable = false)
    private Buildings buildingsByBuildingsId;
    @Basic
    @Column(name = "type", nullable = false, length = 255)
    private String type;
    @Basic
    @Column(name = "fee", nullable = false, length = 255)
    private String fee;

    public int getIdTax() {
        return idTax;
    }

    public void setIdTax(int idTax) {
        this.idTax = idTax;
    }

    public Buildings getBuildingsByBuildingsId() {
        return buildingsByBuildingsId;
    }

    public void setBuildingsByBuildingsId(Buildings buildingsByBuildingsId) {
        this.buildingsByBuildingsId = buildingsByBuildingsId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }
}
