import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FinancialAdvisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorID;
    private String name;
    // ... other attributes, getters, setters, and constructor

    // Constructor
    public FinancialAdvisor(String name) {
        this.name = name;
    }
}
