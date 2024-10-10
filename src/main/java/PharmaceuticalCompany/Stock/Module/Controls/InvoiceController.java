package PharmaceuticalCompany.Stock.Module.Controls;

import PharmaceuticalCompany.Stock.Module.DTOs.InvoiceDTO;
import PharmaceuticalCompany.Stock.Module.Services.InvoiceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing invoices.
 */
@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    // Autowire the InvoiceServices to inject its dependency
    @Autowired
    private InvoiceServices invoiceServices;

    /**
     * GET /invoices : Get all invoices.
     *
     * @return ResponseEntity containing a list of InvoiceDTO objects.
     */
    @GetMapping("/all")
    public ResponseEntity<List<InvoiceDTO>> getAllInvoices() {
        List<InvoiceDTO> invoices = invoiceServices.getAllInvoice.getAll();
        return ResponseEntity.ok(invoices);
    }

    /**
     * GET /invoices/{id} : Get an invoice by its ID.
     *
     * @param id the ID of the invoice to retrieve.
     * @return ResponseEntity containing the InvoiceDTO object, or a 404 Not Found status if the invoice is not found.
     */
    @GetMapping("/{id}")
    public ResponseEntity<InvoiceDTO> getInvoiceById(@PathVariable Integer id) {
        InvoiceDTO invoiceDTO = invoiceServices.getInvoiceById.getInvoiceById(id);
        return Optional.ofNullable(invoiceDTO)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
