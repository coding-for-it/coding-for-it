import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityID;
    private String name;
    private String category;
    private Date purchaseDate;
    private double purchasePrice;
    private int quantity;
    // ... other attributes, getters, setters, and constructor

    @ManyToOne
    private Portfolio portfolio;

    // Constructor
    public Security(String name, String category, Date purchaseDate, double purchasePrice, int quantity, Portfolio portfolio) {
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }

    // Getters and setters for other attributes
}