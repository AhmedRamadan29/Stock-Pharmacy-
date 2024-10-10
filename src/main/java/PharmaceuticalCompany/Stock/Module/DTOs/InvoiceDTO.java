package PharmaceuticalCompany.Stock.Module.DTOs;

import PharmaceuticalCompany.Stock.Module.Enums.PaymentType;
import PharmaceuticalCompany.Stock.Module.Enums.Stok;
import PharmaceuticalCompany.Stock.Module.Enums.UnitStok;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Component
public class InvoiceDTO {
    private Integer invoiceId;
    private String invoiceNumber;
    private String productName;
    private BigDecimal totalProduct;
    private UnitStok unit;
    private Date startDate;
    private Date endDate;
    private BigDecimal totalCost;
    private String supplierName;
    private BigDecimal prePrice;
    private BigDecimal discount;
    private BigDecimal postPrice;
    private PaymentType paymentType;
    private String litter;
    private Stok stok;


}
