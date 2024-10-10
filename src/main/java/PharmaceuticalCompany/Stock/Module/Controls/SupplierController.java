package PharmaceuticalCompany.Stock.Module.Controls;

import PharmaceuticalCompany.Stock.Module.Entitys.SupplierEntity;
import PharmaceuticalCompany.Stock.Module.Services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST controller for managing suppliers.
 */
@RestController
@RequestMapping("/suppliers")
public class SupplierController {

    // Autowire the SupplierService to inject its dependency
    @Autowired
    private SupplierService supplierService;

    /**
     * GET /suppliers : Get all suppliers.
     *
     * @return ResponseEntity containing a list of SupplierE objects.
     */
    @GetMapping("/getAllSuppliers")
    public ResponseEntity<List<SupplierEntity>> getAllSuppliers() {
        List<SupplierEntity> suppliers = supplierService.getAllSuppliers.getAllSuppliers();

        return ResponseEntity.ok(suppliers);
    }
}
