package PharmaceuticalCompany.Stock.Module.DTOs;

import PharmaceuticalCompany.Stock.Module.Enums.UnitStok;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.Date;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class MainStokDTO {
    private Integer id;
    private String productName;
    private BigDecimal totalProduct;
    private String shelf;
    private UnitStok unitStok;
    private String litter;
    private String invoiceNumber;
    private String supplierName;
    private Date startDate;
    private Date endDate;
    private String expiryYet;
    private BigDecimal totalCost;

}
