package PharmaceuticalCompany.Stock.Module.DTOs;

import PharmaceuticalCompany.Stock.Module.Enums.PaymentType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Component
public class SupplierDTO {
    private String phoneNumber;
    private String emailSupplier;
    private Integer id;
    private String supplierName;
    private String supplierAddress;
    private PaymentType paymentType;
}
