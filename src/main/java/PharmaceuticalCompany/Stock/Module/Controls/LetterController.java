package PharmaceuticalCompany.Stock.Module.Controls;

import PharmaceuticalCompany.Stock.Module.DTOs.LettersDTO;
import PharmaceuticalCompany.Stock.Module.Entitys.LettersEntity;
import PharmaceuticalCompany.Stock.Module.Services.LettersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing letters.
 */
@RestController
@RequestMapping("/letters")
public class LetterController {

    // Autowire the LettersService to inject its dependency
    @Autowired
    private LettersService lettersService;

    /**
     * GET /letters : Get all letters.
     *
     * @return ResponseEntity containing a list of LettersDTO objects.
     */
    @GetMapping("/all")
    public ResponseEntity<List<LettersDTO>> getAllLetters() {
        List<LettersDTO> letters = lettersService.getAllLetters.getAllLetters();
        return ResponseEntity.ok(letters);
    }

    /**
     * POST /letters : Save all letters.
     *
     * @param letters the list of LettersE objects to save.
     * @return ResponseEntity containing the saved list of LettersE objects.
     */
    @PostMapping("/saveLetters")
    public ResponseEntity<List<LettersEntity>> saveLetters(@RequestBody List<LettersEntity> letters) {
        List<LettersEntity> savedLetters = lettersService.saveAllLetters.SaveAllLetter(letters);
        return ResponseEntity.ok(savedLetters);
    }

    /**
     * GET /letters/location/{name} : Get letter location by letter name.
     *
     * @param nameLetter the name of the letter to find.
     * @return ResponseEntity containing the LettersDTO object, or a 404 Not Found status if the letter is not found.
     */
    @GetMapping("/location/{nameLetter}")
    public ResponseEntity<LettersDTO> getLetterByName(@PathVariable String nameLetter) {
        Optional<LettersDTO> location = lettersService.findLocationByLetter.findLocationByLetter(nameLetter);
        return location.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * PUT /letters/update : Update a letter.
     *
     * @param letter        the letter to update.
     * @param stockLocation the new stock location of the letter.
     * @param id            the ID of the letter to update.
     * @return ResponseEntity with status 200 (OK) if the update was successful, or 404 (Not Found) if the update was not successful.
     */
    @PutMapping("/update")
    public ResponseEntity<Void> updateLetter(@RequestParam String letter, @RequestParam String stockLocation, @RequestParam Integer id) {
        int updateLetter = lettersService.updateAllLetter.updateLetter(letter, stockLocation, id);
        if (updateLetter > 0) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
