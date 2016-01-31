package com.bsuir.data.domain.dto;

import com.bsuir.data.domain.Seller;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "advert")
public class AdvertDto {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private Long id;

    @Column (name = "date_of_publication")
    private Date dateOfPublication;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_auto")
    private AutoDto autoDto;

    @ManyToOne(cascade = {CascadeType.REFRESH})
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

    public AutoDto getAutoDto() {
        return autoDto;
    }

    public void setAutoDto(AutoDto autoDto) {
        this.autoDto = autoDto;
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

        AdvertDto advertDto = (AdvertDto) o;

        if (getId() != null ? !getId().equals(advertDto.getId()) : advertDto.getId() != null) return false;
        if (getDateOfPublication() != null ? !getDateOfPublication().equals(advertDto.getDateOfPublication()) : advertDto.getDateOfPublication() != null)
            return false;
        if (getAutoDto() != null ? !getAutoDto().equals(advertDto.getAutoDto()) : advertDto.getAutoDto() != null)
            return false;
        return getSeller() != null ? getSeller().equals(advertDto.getSeller()) : advertDto.getSeller() == null;

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getDateOfPublication() != null ? getDateOfPublication().hashCode() : 0);
        result = 31 * result + (getAutoDto() != null ? getAutoDto().hashCode() : 0);
        result = 31 * result + (getSeller() != null ? getSeller().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AdvertDto{" +
                "id=" + id +
                ", dateOfPublication=" + dateOfPublication +
                ", autoDto=" + autoDto +
                ", seller=" + seller +
                '}';
    }
}
