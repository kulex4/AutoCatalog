package com.bsuir.data.domain.dto;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "auto")
public class AutoDto {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private Long id;

    @Column(name = "year")
    private int year;

    @Column(name = "price")
    private long price;

    @Column(name = "mileage")
    private int mileage;

    @Column(name = "idTransmission")
    private Long idTransmission;

    @Column(name = "idBodyType")
    private Long idBodyType;

    @Column(name = "idColor")
    private Long idColor;

    @Column(name = "idState")
    private Long idState;

    @Column(name = "idEngineType")
    private Long idEngineType;

    @Column(name = "idBrand")
    private Long idBrand;

    @Column(name = "idModel")
    private Long idModel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Long getIdTransmission() {
        return idTransmission;
    }

    public void setIdTransmission(Long idTransmission) {
        this.idTransmission = idTransmission;
    }

    public Long getIdBodyType() {
        return idBodyType;
    }

    public void setIdBodyType(Long idBodyType) {
        this.idBodyType = idBodyType;
    }

    public Long getIdColor() {
        return idColor;
    }

    public void setIdColor(Long idColor) {
        this.idColor = idColor;
    }

    public Long getIdState() {
        return idState;
    }

    public void setIdState(Long idState) {
        this.idState = idState;
    }

    public Long getIdEngineType() {
        return idEngineType;
    }

    public void setIdEngineType(Long idEngineType) {
        this.idEngineType = idEngineType;
    }

    public Long getIdBrand() {
        return idBrand;
    }

    public void setIdBrand(Long idBrand) {
        this.idBrand = idBrand;
    }

    public Long getIdModel() {
        return idModel;
    }

    public void setIdModel(Long idModel) {
        this.idModel = idModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AutoDto autoDto = (AutoDto) o;

        if (getYear() != autoDto.getYear()) return false;
        if (getPrice() != autoDto.getPrice()) return false;
        if (getMileage() != autoDto.getMileage()) return false;
        if (getId() != null ? !getId().equals(autoDto.getId()) : autoDto.getId() != null) return false;
        if (getIdTransmission() != null ? !getIdTransmission().equals(autoDto.getIdTransmission()) : autoDto.getIdTransmission() != null)
            return false;
        if (getIdBodyType() != null ? !getIdBodyType().equals(autoDto.getIdBodyType()) : autoDto.getIdBodyType() != null)
            return false;
        if (getIdColor() != null ? !getIdColor().equals(autoDto.getIdColor()) : autoDto.getIdColor() != null)
            return false;
        if (getIdState() != null ? !getIdState().equals(autoDto.getIdState()) : autoDto.getIdState() != null)
            return false;
        if (getIdEngineType() != null ? !getIdEngineType().equals(autoDto.getIdEngineType()) : autoDto.getIdEngineType() != null)
            return false;
        if (getIdBrand() != null ? !getIdBrand().equals(autoDto.getIdBrand()) : autoDto.getIdBrand() != null)
            return false;
        return getIdModel() != null ? getIdModel().equals(autoDto.getIdModel()) : autoDto.getIdModel() == null;

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + getYear();
        result = 31 * result + (int) (getPrice() ^ (getPrice() >>> 32));
        result = 31 * result + getMileage();
        result = 31 * result + (getIdTransmission() != null ? getIdTransmission().hashCode() : 0);
        result = 31 * result + (getIdBodyType() != null ? getIdBodyType().hashCode() : 0);
        result = 31 * result + (getIdColor() != null ? getIdColor().hashCode() : 0);
        result = 31 * result + (getIdState() != null ? getIdState().hashCode() : 0);
        result = 31 * result + (getIdEngineType() != null ? getIdEngineType().hashCode() : 0);
        result = 31 * result + (getIdBrand() != null ? getIdBrand().hashCode() : 0);
        result = 31 * result + (getIdModel() != null ? getIdModel().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AutoDto{" +
                "id=" + id +
                ", year=" + year +
                ", price=" + price +
                ", mileage=" + mileage +
                ", idTransmission=" + idTransmission +
                ", idBodyType=" + idBodyType +
                ", idColor=" + idColor +
                ", idState=" + idState +
                ", idEngineType=" + idEngineType +
                ", idBrand=" + idBrand +
                ", idModel=" + idModel +
                '}';
    }
}
