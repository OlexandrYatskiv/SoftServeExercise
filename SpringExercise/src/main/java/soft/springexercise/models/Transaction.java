package soft.springexercise.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Transactions")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "transaction_id")
    private Long id;
    @Column(name = "name")
    private  String name;
    @Column(name = "type")
    private String type;
    @ManyToOne
    @JoinColumn(name = "categories_id")
    private Category category_id;
    @Column(name = "amount")
    private BigDecimal amount;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
}
