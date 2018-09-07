import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="ADRESS")
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

    public String getPlz() {
        return plz;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }
}
