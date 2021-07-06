package trainingbooking.place;

import trainingbooking.trainer.Trainer;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name= "places")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Size(max = 255, message = "Maksymalnie {max} znaków")
    private String name;
    @Size(max= 255, message = "Maksymalnie {max} znaków")
    private String description;
    private String adress;


    public Place(String name, String description, String adress) {
        this.name = name;
        this.description = description;
        this.adress = adress;
    }

    public Place() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAdress() {
        return adress;
    }

    @Override
    public String toString() {
        return "Place{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
