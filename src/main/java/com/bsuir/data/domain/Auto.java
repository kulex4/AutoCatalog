package com.bsuir.data.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "auto")
public class Auto {

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

    @OneToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name = "idTransmission")
    private Transmission transmission;

    @OneToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name = "idBodyType")
    private BodyType bodyType;

    @OneToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name = "idColor")
    private Color color;

    @OneToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name = "idState")
    private State state;

    @OneToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name = "idEngineType")
    private EngineType engineType;

    @OneToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name = "brand")
    private Brand brand;

    @OneToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name = "idModel")
    private Model model;

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

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Auto auto = (Auto) o;

        if (getYear() != auto.getYear()) return false;
        if (getPrice() != auto.getPrice()) return false;
        if (getMileage() != auto.getMileage()) return false;
        if (getId() != null ? !getId().equals(auto.getId()) : auto.getId() != null) return false;
        if (getTransmission() != null ? !getTransmission().equals(auto.getTransmission()) : auto.getTransmission() != null)
            return false;
        if (getBodyType() != null ? !getBodyType().equals(auto.getBodyType()) : auto.getBodyType() != null)
            return false;
        if (getColor() != null ? !getColor().equals(auto.getColor()) : auto.getColor() != null) return false;
        if (getState() != null ? !getState().equals(auto.getState()) : auto.getState() != null) return false;
        if (getEngineType() != null ? !getEngineType().equals(auto.getEngineType()) : auto.getEngineType() != null)
            return false;
        if (getBrand() != null ? !getBrand().equals(auto.getBrand()) : auto.getBrand() != null) return false;
        return getModel() != null ? getModel().equals(auto.getModel()) : auto.getModel() == null;

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + getYear();
        result = 31 * result + (int) (getPrice() ^ (getPrice() >>> 32));
        result = 31 * result + getMileage();
        result = 31 * result + (getTransmission() != null ? getTransmission().hashCode() : 0);
        result = 31 * result + (getBodyType() != null ? getBodyType().hashCode() : 0);
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        result = 31 * result + (getState() != null ? getState().hashCode() : 0);
        result = 31 * result + (getEngineType() != null ? getEngineType().hashCode() : 0);
        result = 31 * result + (getBrand() != null ? getBrand().hashCode() : 0);
        result = 31 * result + (getModel() != null ? getModel().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", year=" + year +
                ", price=" + price +
                ", mileage=" + mileage +
                ", transmission=" + transmission +
                ", bodyType=" + bodyType +
                ", color=" + color +
                ", state=" + state +
                ", engineType=" + engineType +
                ", brand=" + brand +
                ", model=" + model +
                '}';
    }
}
