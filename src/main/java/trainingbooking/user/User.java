package trainingbooking.user;

import jdk.jfr.Name;
import trainingbooking.trainer.Trainer;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;
    private String name;
    @Size(min = 6, message = "Hasło musi mieć conajmniej {min} znaki.")
    private String password;
    private String email;
    @ManyToMany
    @JoinTable(
            name = "user_trainer",
            joinColumns = @JoinColumn(name = "useer_id"),
            inverseJoinColumns = @JoinColumn(name = "trainer_id"))
    Set<Trainer> trainers;

    public User() {
    }

    public User(String name, String password, String email, Set<Trainer> trainers) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.trainers = trainers;
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

    public Set<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(Set<Trainer> trainers) {
        this.trainers = trainers;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", trainers=" + trainers +
                '}';
    }
}
