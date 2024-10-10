package PharmaceuticalCompany.Stock.Module.Entitys;

import PharmaceuticalCompany.Stock.Module.Enums.Stok;
import PharmaceuticalCompany.Stock.Module.Enums.UnitStok;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;

@Entity

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "drugs")
public class DrugEntity {
    /**
     * The unique identifier for the drug.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * The name of the product.
     */
    @Column(name = "PRODUCT_NAME", nullable = false)
    private String productName;

    /**
     * The start date of the drug's availability.
     */
    @Column(name = "START_DATE")
    @Temporal(TemporalType.DATE)
    private Date startDate;

    /**
     * The end date of the drug's availability.
     */
    @Column(name = "END_DATE")
    @Temporal(TemporalType.DATE)
    private Date endDate;

    /**
     * Indicator of whether the drug is expired.
     */
    @Column(name = "EXPIRY_YET")
    private String expiryYet;

    /**
     * The count of the product.
     */
    @Column(name = "PRODUCT_COUNT", precision = 19, scale = 2)
    private BigDecimal productCount;

    /**
     * The unit stock type of the drug.
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "UNIT_STOK")
    private UnitStok unitStok;

    /**
     * The name of the supplier.
     */
    @Column(name = "SUPPLIER_NAME")
    private String supplierName;

    /**
     * The price after discount.
     */
    @Column(name = "PRICE_AFTER", precision = 19, scale = 2)
    private BigDecimal priceAfter;

    /**
     * The discount applied to the product.
     */
    @Column(name = "DISCOUNT", precision = 19, scale = 2)
    private BigDecimal discount;

    /**
     * The price before discount.
     */
    @Column(name = "PRICE_BEFORE", precision = 19, scale = 2)
    private BigDecimal priceBefore;

    /**
     * Additional letter or code associated with the product.
     */
    @Column(name = "LETTER")
    private String letter;

    /**
     * The date of entry into the stock.
     */
    @Column(name = "ENTRY_DATE")
    @Temporal(TemporalType.DATE)
    private Date entryDate;

    /**
     * The type of stock.
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "STOK")
    private Stok stok;

}
