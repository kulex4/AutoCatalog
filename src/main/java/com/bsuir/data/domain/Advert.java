package com.bsuir.data.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "advert")
public class Advert {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private Long id;

    @Column (name = "date_of_publication")
    private Date dateOfPublication;

    @OneToOne
    @JoinColumn(name = "id_auto")
    private Auto auto;

    @ManyToOne
    @JoinColumn(name = "id_seller")
    private Seller seller;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(Date dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Advert advert = (Advert) o;

        if (getId() != null ? !getId().equals(advert.getId()) : advert.getId() != null) return false;
        if (getDateOfPublication() != null ? !getDateOfPublication().equals(advert.getDateOfPublication()) : advert.getDateOfPublication() != null)
            return false;
        if (getAuto() != null ? !getAuto().equals(advert.getAuto()) : advert.getAuto() != null) return false;
        return getSeller() != null ? getSeller().equals(advert.getSeller()) : advert.getSeller() == null;

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getDateOfPublication() != null ? getDateOfPublication().hashCode() : 0);
        result = 31 * result + (getAuto() != null ? getAuto().hashCode() : 0);
        result = 31 * result + (getSeller() != null ? getSeller().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Advert{" +
                "id=" + id +
                ", dateOfPublication=" + dateOfPublication +
                ", auto=" + auto +
                ", seller=" + seller +
                '}';
    }
}
