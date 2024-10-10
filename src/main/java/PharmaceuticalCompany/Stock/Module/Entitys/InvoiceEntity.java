package PharmaceuticalCompany.Stock.Module.Entitys;

import PharmaceuticalCompany.Stock.Module.Enums.PaymentType;
import PharmaceuticalCompany.Stock.Module.Enums.Stok;
import PharmaceuticalCompany.Stock.Module.Enums.UnitStok;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Entity class representing an invoice.
 */
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "invoices")
public class InvoiceEntity {

    /**
     * The unique identifier for the invoice.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer invoiceId;

    /**
     * The invoice number.
     */
    @Column(name = "INVOICE_NUMBER")
    private String invoiceNumber;

    /**
     * The name of the product associated with the invoice.
     */
    @Column(name = "PRODUCT_NAME")
    private String productName;

    /**
     * The total quantity of the product.
     */
    @Column(name = "TOTAL_PRODUCT")
    private BigDecimal totalProduct;

    /**
     * The unit type of the product.
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "UNIT")
    private UnitStok unit;

    /**
     * The start date of the invoice period.
     */
    @Column(name = "START_DATE")
    @Temporal(TemporalType.DATE)
    private Date startDate;

    /**
     * The end date of the invoice period.
     */
    @Column(name = "END_DATE")
    @Temporal(TemporalType.DATE)
    private Date endDate;

    /**
     * The total cost of the product.
     */
    @Column(name = "TOTAL_COST")
    private BigDecimal totalCost;

    /**
     * The name of the supplier.
     */
    @Column(name = "SUPPLIER_NAME")
    private String supplierName;

    /**
     * The price before any discounts.
     */
    @Column(name = "PRE_PRICE")
    private BigDecimal prePrice;

    /**
     * The discount applied to the product.
     */
    @Column(name = "DISCOUNT")
    private BigDecimal discount;

    /**
     * The price after applying the discount.
     */
    @Column(name = "POST_PRICE")
    private BigDecimal postPrice;

    /**
     * The payment type for the invoice.
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "PAYMENT_TYPE")
    private PaymentType paymentType;

    /**
     * The litter associated with the product.
     */
    @Column(name = "LITTER")
    private String litter;

    /**
     * The type of stock.
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "STOK")
    private Stok stok;
}
