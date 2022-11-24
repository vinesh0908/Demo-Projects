package com.swapi.swapiproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Represents a Starship
 *
 * @author Vinesh Kumar
 */
@Entity(name = "STARSHIP")
@Data
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(
        value = {"createdAt", "updatedAt"},
        allowGetters = true
)
public class Starship implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "STARSHIPSEQGEN")
    @SequenceGenerator(name = "STARSHIPSEQGEN", sequenceName = "STARSHIP_SEQUENCE")
    private Long id;

    @Column(name = "CREW", length = 20)
    private String crew;

    @Column(name = "MGLT", length = 20)
    private String mglt;

    @Column(name = "MAX_ATMOSPHERING_SPEED", length = 20)
    private String max_Atmosphering_Speed;

    @Column(name = "LENGTH", length = 20)
    private String length;

    @Column(name = "COST_IN_CREDITS", length = 20)
    private String cost_In_Credits;

    @Column(name = "MODEL", length = 20)
    private String model;

    @Column(name = "ACL", length = 20)
    private String acl;

    @Column(name = "STARSHIP_CLASS", length = 20)
    private String starship_Class;

    @Column(name = "NAME", length = 20)
    private String name;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATED_AT", nullable = false)
    @LastModifiedDate
    private Date updatedAt;

    @Column(name = "FILMS", length = 20)
    private String films;

    @Column(name = "CONSUMABLES", length = 20)
    private String consumables;

    @Column(name = "MANUFACTURER", length = 20)
    private String manufacturer;

    @Column(name = "CARGO_CAPACITY", length = 20)
    private String cargo_Capacity;

    @Column(name = "PASSENGERS", length = 20)
    private String passengers;

    @Column(name = "PILOTS", length = 20)
    private String pilots;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_AT", nullable = false, updatable = false)
    @CreatedDate
    private Date createdAt;

    @Column(name = "HYPER_DRIVE_RATING", length = 20)
    private int hyperdrive_Rating;
}
