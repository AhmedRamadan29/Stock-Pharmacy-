package PharmaceuticalCompany.Stock.Module.Entitys;

import PharmaceuticalCompany.Stock.Module.Enums.Stok;
import PharmaceuticalCompany.Stock.Module.Enums.TypeDamage;
import PharmaceuticalCompany.Stock.Module.Enums.UnitStok;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Entity class representing discarded items in stock.
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "discarded_items_stok")
public class DiscardedItemsStokEntity {

    /**
     * The unique identifier for the product.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    /**
     * The name of the product.
     */
    @Column(name = "PRODUCT_NAME")
    private String productName;
    /**
     * The quantity of the product.
     */
    @Column(name = "`COUNT`")
    private BigDecimal count;

    /**
     * The unit type of the stock.
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "UNIT_TYPE")
    private UnitStok unitType;

    /**
     * The price of the product before discount.
     */
    @Column(name = "PRICE_BEFORE")
    private BigDecimal priceBefore;

    /**
     * The discount on the product.
     */
    @Column(name = "DISCOUNT")
    private BigDecimal discount;

    /**
     * The price of the product after discount.
     */
    @Column(name = "PRICE_AFTER")
    private BigDecimal priceAfter;

    /**
     * The litter associated with the product.
     */
    @Column(name = "LITTER")
    private String litter;

    /**
     * The type of store.
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "STORE_TYPE")
    private Stok storeType;

    /**
     * The name of the employee who handled the product.
     */
    @Column(name = "EMPLOYEE_NAME")
    private String employeeName;

    /**
     * The ID of the employee who handled the product.
     */
    @Column(name = "EMPLOYEE_ID")
    private Integer employeeId;

    /**
     * The department ID where the product was handled.
     */
    @Column(name = "DEPARTMENT_ID")
    private String departmentId;

    /**
     * The department name where the product was handled.
     */
    @Column(name = "DEPARTMENT_NAME")
    private String departmentName;

    /**
     * The position of the employee who handled the product.
     */
    @Column(name = "`POSITION`")
    private String position;

    /**
     * The type of damage to the product.
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "TYPE_DAMAGE")
    private TypeDamage typeDamage;
}
