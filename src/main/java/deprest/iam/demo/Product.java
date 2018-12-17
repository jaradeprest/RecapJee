package deprest.iam.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Size(min = 2, max = 20, message = "Gebruik 2-20 karakters!")
    private String naam;
    private String omschrijving;
    @Size(min = 2,max = 20, message = "Gebruik 2-20 karakters!")
    private String username;
    @NotBlank
    private String emailadres;
    @NotNull
    private double vraagprijs;
    private LocalDateTime publicatieDatum;



    public Product() {
        publicatieDatum=LocalDateTime.now();
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailadres() {
        return emailadres;
    }

    public void setEmailadres(String emailadres) {
        this.emailadres = emailadres;
    }

    public double getVraagprijs() {
        return vraagprijs;
    }

    public void setVraagprijs(double vraagprijs) {
        this.vraagprijs = vraagprijs;
    }

    public LocalDateTime getPublicatieDatum() {
        return publicatieDatum;
    }

    public void setPublicatieDatum(LocalDateTime publicatieDatum) {
        this.publicatieDatum = publicatieDatum;
    }
}
