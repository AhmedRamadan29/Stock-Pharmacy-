package PharmaceuticalCompany.Stock.Module.Lamadas;

import PharmaceuticalCompany.Stock.Module.DTOs.InvoiceDTO;

import java.util.List;

/**
 * This class contains functional interfaces for invoice-related operations.
 */
public class LamdaInvoice {

    /**
     * Functional interface for retrieving all invoices.
     */
    @FunctionalInterface
    public interface GetAllInvoice {
        /**
         * Retrieves a list of all InvoiceDTOs.
         *
         * @return a list of InvoiceDTOs.
         */
        List<InvoiceDTO> getAll();
    }

    /**
     * Functional interface for retrieving an invoice by its ID.
     */
    @FunctionalInterface
    public interface GetInvoiceById {
        /**
         * Retrieves an InvoiceDTO by its ID.
         *
         * @param id the ID of the invoice.
         * @return the InvoiceDTO associated with the given ID.
         */
        InvoiceDTO getInvoiceById(Integer id);
    }
}
