package PharmaceuticalCompany.Stock.Module.Entitys;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entity class representing a letter.
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "letters")
public class LettersEntity {

    /**
     * The unique identifier for the letter.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * The content of the letter.
     */
    @Column(name = "LETTER")
    private String letter;

    /**
     * The stock location associated with the letter.
     */
    @Column(name = "SOTK_LOCATION")
    private String stockLocation;
}
