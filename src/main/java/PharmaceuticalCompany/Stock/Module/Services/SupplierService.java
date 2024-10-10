package PharmaceuticalCompany.Stock.Module.Services;

import PharmaceuticalCompany.Stock.Module.Lamadas.LamdaSupplier;
import PharmaceuticalCompany.Stock.Module.Repostorys.SupplierRepo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service class for managing supplier operations.
 */
@Service
@Data
public class SupplierService {

    // Autowire the SupplierRepo to inject its dependency
    @Autowired
    private SupplierRepo supplierRepo;

    // Lambda function to get all suppliers
    public LamdaSupplier.ResponseSupplier getAllSuppliers = () ->
            // Fetch all suppliers from the repository
            supplierRepo.findAll();
}
