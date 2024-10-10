package PharmaceuticalCompany.Stock.Module.Mappers;

import PharmaceuticalCompany.Stock.Module.DTOs.DrugDTO;
import PharmaceuticalCompany.Stock.Module.Entitys.DrugEntity;
import lombok.Builder;
import lombok.NonNull;

/**
 * Mapper class for converting between DrugE entity and DrugDTO.
 */
@Builder
public class MapperDrug {

    /**
     * Maps a DrugE entity to a DrugDTO.
     *
     * @param drug the DrugE entity to map from.
     * @return the mapped DrugDTO.
     */
    public static DrugDTO mapToDTODrugDTO(@NonNull DrugEntity drug) {
        return DrugDTO.builder()
                .id(drug.getId())
                .productName(drug.getProductName())
                .startDate(drug.getStartDate())
                .endDate(drug.getEndDate())
                .expiryYet(drug.getExpiryYet())
                .productCount(drug.getProductCount())
                .unitStok(drug.getUnitStok())
                .supplierName(drug.getSupplierName())
                .priceAfter(drug.getPriceAfter())
                .discount(drug.getDiscount())
                .priceBefore(drug.getPriceBefore())
                .letter(drug.getLetter())
                .entryDate(drug.getEntryDate())
                .stok(drug.getStok())
                .build();
    }

    //  Maps a DrugDTO to a DrugE entity.
    //
    //  @param drugDTO the DrugDTO to map from.
    // * @return the mapped DrugE entity.
    /*
    public static DrugE mapToEntityDrugE( @NonNull DrugDTO drugDTO) {

        return DrugE.builder()
                .id(drugDTO.getId())
                .productName(drugDTO.getProductName())
                .startDate(drugDTO.getStartDate())
                .endDate(drugDTO.getEndDate())
                .expiryYet(drugDTO.getExpiryYet())
                .productCount(drugDTO.getProductCount())
                .unitStok(drugDTO.getUnitStok())
                .supplierName(drugDTO.getSupplierName())
                .priceAfter(drugDTO.getPriceAfter())
                .discount(drugDTO.getDiscount())
                .priceBefore(drugDTO.getPriceBefore())
                .letter(drugDTO.getLetter())
                .entryDate(drugDTO.getEntryDate())
                .stok(drugDTO.getStok())
                .build();
    }
    */
}
