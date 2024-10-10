package PharmaceuticalCompany.Stock.Module.Lamadas;

import PharmaceuticalCompany.Stock.Module.Entitys.SupplierEntity;

import java.util.List;

/**
 * This class contains functional interfaces for supplier-related operations.
 */
public class LamdaSupplier {

    /**
     * Functional interface for retrieving all suppliers.
     */
    @FunctionalInterface
    public interface ResponseSupplier {
        /**
         * Retrieves a list of all SupplierE entities.
         *
         * @return a list of SupplierE entities.
         */
        List<SupplierEntity> getAllSuppliers();
    }
}
