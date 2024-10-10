package PharmaceuticalCompany.Stock.Module.Mappers;

import PharmaceuticalCompany.Stock.Module.DTOs.InvoiceDTO;
import PharmaceuticalCompany.Stock.Module.Entitys.InvoiceEntity;
import org.jetbrains.annotations.NotNull;

/**
 * Mapper class for converting between InvoiceE entity and InvoiceDTO.
 */
public class MapperInvoice {

    /**
     * Maps an InvoiceE entity to an InvoiceDTO.
     *
     * @param invoiceEntity the InvoiceE entity to map from.
     * @return the mapped InvoiceDTO.
     */
    public static InvoiceDTO mapToInvoiceDTO(@NotNull InvoiceEntity invoiceEntity) {
        return InvoiceDTO.builder()
                .invoiceId(invoiceEntity.getInvoiceId())
                .invoiceNumber(invoiceEntity.getInvoiceNumber())
                .productName(invoiceEntity.getProductName())
                .totalProduct(invoiceEntity.getTotalProduct())
                .unit(invoiceEntity.getUnit())
                .startDate(invoiceEntity.getStartDate())
                .endDate(invoiceEntity.getEndDate())
                .totalCost(invoiceEntity.getTotalCost())
                .supplierName(invoiceEntity.getSupplierName())
                .prePrice(invoiceEntity.getPrePrice())
                .discount(invoiceEntity.getDiscount())
                .postPrice(invoiceEntity.getPostPrice())
                .paymentType(invoiceEntity.getPaymentType())
                .litter(invoiceEntity.getLitter())
                .stok(invoiceEntity.getStok())
                .build();
    }
}
