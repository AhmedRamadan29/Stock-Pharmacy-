package PharmaceuticalCompany.Stock.Module.DTOs;

import PharmaceuticalCompany.Stock.Module.Enums.Stok;
import PharmaceuticalCompany.Stock.Module.Enums.UnitStok;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.Date;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SubstokDTO {
    private Integer storeId;
    private String productName;
    private BigDecimal totalProduct;
    private Date startDate;
    private Date endDate;
    private UnitStok unit;
    private String letter;
    private Stok stok;
    private String supplierName;
    private BigDecimal totalCost;
}
