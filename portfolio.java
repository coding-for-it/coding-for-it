import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioID;

    @ManyToOne
    private Client client;
    // ... other attributes, getters, setters, and constructor

    // Constructor
    public Portfolio(Client client) {
        this.client = client;
    }

    // Getters and setters for other attributes
}