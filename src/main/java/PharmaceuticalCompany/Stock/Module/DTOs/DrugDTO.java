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
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DrugDTO {
    private Integer id;
    private String productName;
    private Date startDate;
    private Date endDate;
    private String expiryYet;
    private BigDecimal productCount;
    private UnitStok unitStok;
    private String supplierName;
    private BigDecimal priceAfter;
    private BigDecimal discount;
    private BigDecimal priceBefore;
    private String letter;
    private Date entryDate;
    private Stok stok;


}
