package PharmaceuticalCompany.Stock.Module.Entitys;

import PharmaceuticalCompany.Stock.Module.Enums.UnitStok;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Entity class representing the main stock.
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "main_stok")
public class MainStokEntity {

    /**
     * The unique identifier for the stock item.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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
     * The shelf where the product is stored.
     */
    @Column(name = "SHELF")
    private String shelf;

    /**
     * The unit type of the stock.
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "UNIT_STOK")
    private UnitStok unitStok;

    /**
     * The litter associated with the product.
     */
    @Column(name = "LITTER")
    private String litter;

    /**
     * The invoice number associated with the product.
     */
    @Column(name = "INVOICE_NUMBER")
    private String invoiceNumber;

    /**
     * The name of the supplier.
     */
    @Column(name = "SUPPLIER_NAME")
    private String supplierName;

    /**
     * The start date of the stock period.
     */
    @Column(name = "START_DATE")
    @Temporal(TemporalType.DATE)
    private Date startDate;

    /**
     * The end date of the stock period.
     */
    @Column(name = "END_DATE")
    @Temporal(TemporalType.DATE)
    private Date endDate;

    /**
     * Indicates whether the product is expired.
     */
    @Column(name = "EXPIRY_YET")
    private String expiryYet;

    /**
     * The total cost of the product.
     */
    @Column(name = "TOTAL_COST")
    private BigDecimal totalCost;
}
