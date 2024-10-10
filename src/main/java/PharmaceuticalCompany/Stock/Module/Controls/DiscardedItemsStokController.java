package PharmaceuticalCompany.Stock.Module.Controls;

import PharmaceuticalCompany.Stock.Module.DTOs.DiscardedItemsStokDTO;
import PharmaceuticalCompany.Stock.Module.Entitys.DiscardedItemsStokEntity;
import PharmaceuticalCompany.Stock.Module.Services.DiscardedItemsStokServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/DiscardedItemsStok")
public class DiscardedItemsStokController {
    @Autowired
    private DiscardedItemsStokServices discardedItemsStokServices;

    @GetMapping("/Get-All")
    public ResponseEntity<List<DiscardedItemsStokDTO>> GetAllDiscardedItemsStok() {
        return ResponseEntity.ok(discardedItemsStokServices.getAllDiscardedItemsStok.getAllDiscardedItemsStok());

    }

    @PostMapping("/Save-Discarded-ItemsStok")
    public ResponseEntity<List<DiscardedItemsStokEntity>> saveDiscardedItemsStok(@RequestBody List<DiscardedItemsStokEntity> discardedItemsStokEntities) {
        List<DiscardedItemsStokEntity> itemsStokEntities =
                discardedItemsStokServices.saveDiscardedItemsStok.saveDiscardedItemsStok(discardedItemsStokEntities);
        return ResponseEntity.ok(itemsStokEntities);
    }


}
