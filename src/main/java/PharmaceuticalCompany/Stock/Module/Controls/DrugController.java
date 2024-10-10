package PharmaceuticalCompany.Stock.Module.Controls;

import PharmaceuticalCompany.Stock.Module.DTOs.DrugDTO;
import PharmaceuticalCompany.Stock.Module.Services.DrugServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Drug")
public class DrugController {
    @Autowired
    private DrugServices drugServices;

    /**
     * Endpoint to get all drugs.
     *
     * @return ResponseEntity containing a list of DrugDTO objects.
     */
    @GetMapping("/GetAllDrugs")
    public ResponseEntity<List<DrugDTO>> getAllDrugs() {
        // Call the getAllDrugs method from drugServices to retrieve the list of drugs
        List<DrugDTO> drugList = drugServices.getAllDrugs.getAllDrugs();

        // Return the list of drugs wrapped in a ResponseEntity with an OK status
        return ResponseEntity.ok(drugList);
    }

    @GetMapping("/DETBY{ID}")

    public ResponseEntity<DrugDTO> responseEntity(@PathVariable int ID) {
        return null;
    }


}



