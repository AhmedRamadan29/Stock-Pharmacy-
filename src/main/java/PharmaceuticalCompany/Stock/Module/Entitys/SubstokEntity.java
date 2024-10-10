package PharmaceuticalCompany.Stock.Module.Entitys;

import PharmaceuticalCompany.Stock.Module.Enums.Stok;
import PharmaceuticalCompany.Stock.Module.Enums.UnitStok;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Entity class representing a sub-stock item.
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "substok")
public class SubstokEntity {

    /**
     * The unique identifier for the sub-stock item.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer storeId;

    /**
     * The name of the product.
     */
    @Column(name = "PRODUCT_NAME")
    private String productName;

    /**
     * The total quantity of the product.
     */
    @Column(name = "TOTAL_PRODUCT")
    private BigDecimal totalProduct;

    /**
     * The start date of the sub-stock period.
     */
    @Column(name = "START_DATE")
    @Temporal(TemporalType.DATE)
    private Date startDate;

    /**
     * The end date of the sub-stock period.
     */
    @Column(name = "END_DATE")
    @Temporal(TemporalType.DATE)
    private Date endDate;

    /**
     * The unit type of the stock.
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "UNIT")
    private UnitStok unit;

    /**
     * The letter associated with the product.
     */
    @Column(name = "LETTER")
    private String letter;

    /**
     * The type of stock.
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "STOK")
    private Stok stok;

    /**
     * The name of the supplier.
     */
    @Column(name = "SUPPLIER_NAME")
    private String supplierName;

    /**
     * The total cost of the product.
     */
    @Column(name = "TOTAL_COST")
    private BigDecimal totalCost;
}
