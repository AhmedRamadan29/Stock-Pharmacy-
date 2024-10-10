package PharmaceuticalCompany.Stock.Module.Entitys;

import PharmaceuticalCompany.Stock.Module.Enums.PaymentType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entity class representing a supplier.
 */
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "suppliers")
public class SupplierEntity {

    /**
     * The unique identifier for the supplier.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * The name of the supplier.
     */
    @Column(name = "SUPPLIER_NAME")
    private String supplierName;

    /**
     * The address of the supplier.
     */
    @Column(name = "SUPPLIER_ADDRESS")
    private String supplierAddress;

    /**
     * The phone number of the supplier.
     */
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    /**
     * The payment type accepted by the supplier.
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "PAYMENT_TYPE")
    private PaymentType paymentType;

    /**
     * The email address of the supplier.
     */
    @Column(name = "EMAIL_SUPPLIER")
    private String emailSupplier;
}
