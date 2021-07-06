package trainingbooking.trainer;

import jdk.jfr.Name;
import trainingbooking.place.Place;
import trainingbooking.user.User;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trainer_id")
    private Integer id;
    private String name;
    @Size(min = 6, message = "Hasło musi mieć conajmniej {min} znaki.")
    private String password;
    private String email;
    @ManyToMany(mappedBy = "trainers")
    Set<User> proteges;

    public Trainer(String name, String password, String email, Set<User> proteges) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.proteges = proteges;
    }
    @ManyToOne
    private Place place;

    public Trainer() {
    }

    public Trainer(String name, String password, String email, Set<User> proteges, Place place) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.proteges = proteges;
        this.place = place;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<User> getProteges() {
        return proteges;
    }

    public void setProteges(Set<User> proteges) {
        this.proteges = proteges;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", proteges=" + proteges +
                ", place=" + place +
                '}';
    }
}
