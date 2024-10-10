package PharmaceuticalCompany.Stock.Module.Mappers;

import PharmaceuticalCompany.Stock.Module.DTOs.DiscardedItemsStokDTO;
import PharmaceuticalCompany.Stock.Module.Entitys.DiscardedItemsStokEntity;
import org.springframework.stereotype.Component;


@Component
public class MapperDiscardedItemsStok {


    public static DiscardedItemsStokDTO mapToDiscardedItemsStokDTO(DiscardedItemsStokEntity discardedItemsStokEntity) {
        return DiscardedItemsStokDTO.builder()
                .productId(discardedItemsStokEntity.getProductId())
                .productName(discardedItemsStokEntity.getProductName())
                .count(discardedItemsStokEntity.getCount())
                .unitType(discardedItemsStokEntity.getUnitType())
                .priceBefore(discardedItemsStokEntity.getPriceBefore())
                .discount(discardedItemsStokEntity.getDiscount())
                .priceAfter(discardedItemsStokEntity.getPriceAfter())
                .litter(discardedItemsStokEntity.getLitter())
                .storeType(discardedItemsStokEntity.getStoreType())
                .employeeName(discardedItemsStokEntity.getEmployeeName())
                .employeeId(discardedItemsStokEntity.getEmployeeId())
                .departmentId(discardedItemsStokEntity.getDepartmentId())
                .departmentName(discardedItemsStokEntity.getDepartmentName())
                .position(discardedItemsStokEntity.getPosition())
                .typeDamage(discardedItemsStokEntity.getTypeDamage())
                .build();
    }


}
