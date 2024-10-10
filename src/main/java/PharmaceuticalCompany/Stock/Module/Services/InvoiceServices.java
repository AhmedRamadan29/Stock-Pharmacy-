package PharmaceuticalCompany.Stock.Module.Services;

import PharmaceuticalCompany.Stock.Module.Entitys.InvoiceEntity;
import PharmaceuticalCompany.Stock.Module.Lamadas.LamdaInvoice;
import PharmaceuticalCompany.Stock.Module.Mappers.MapperInvoice;
import PharmaceuticalCompany.Stock.Module.Repostorys.InvoiceRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Service class for managing invoice operations.
 */
@Data
@Service
public class InvoiceServices {

    // Autowire the InvoiceRepository to inject its dependency
    @Autowired
    private InvoiceRepository invoiceRepository;

    // Lambda to get all invoices from the repository
    public LamdaInvoice.GetAllInvoice getAllInvoice = () -> {
        // Retrieve all invoice entities from the repository
        List<InvoiceEntity> invoices = invoiceRepository.findAll();

        // Map the invoice entities to DTOs and collect them into a list
        return invoices.stream()
                .map(MapperInvoice::mapToInvoiceDTO)
                .collect(Collectors.toList());
    };

    // Lambda to get an invoice by its ID
    public LamdaInvoice.GetInvoiceById getInvoiceById = id -> {
        // Find the invoice entity by its ID
        Optional<InvoiceEntity> optional = invoiceRepository.findById(id);

        // Map the invoice entity to a DTO if it exists, otherwise return null
        return optional.map(MapperInvoice::mapToInvoiceDTO).orElse(null);
    };
}
