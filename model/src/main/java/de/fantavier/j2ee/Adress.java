package de.fantavier.j2ee;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="ADRESS")
@Data
public class Adress implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name="PLZ")
    @Basic(optional = false)
    String plz;

    @Column(name="STREET")
    @Basic(optional = false)
    String Street;

    @Column(name="CITY")
    @Basic(optional = false)
    String city;


}
