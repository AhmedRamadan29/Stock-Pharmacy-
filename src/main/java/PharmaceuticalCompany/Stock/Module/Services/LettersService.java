package PharmaceuticalCompany.Stock.Module.Services;

import PharmaceuticalCompany.Stock.Module.DTOs.LettersDTO;
import PharmaceuticalCompany.Stock.Module.Lamadas.LamdaLetters;
import PharmaceuticalCompany.Stock.Module.Repostorys.LettersRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

/**
 * Service class for managing operations related to letters.
 */
@Service
@Data
public class LettersService {

    // Autowire the LettersRepo to inject its dependency
    @Autowired
    private LettersRepository lettersRepository;

    // Lambda function to get all letters
    public LamdaLetters.ResponseGETAllLetter getAllLetters = () ->
            // Fetch all letters from the repository, map them to DTOs, and collect as a list
            lettersRepository.findAll().stream()
                    .map(l -> new LettersDTO(l.getId(), l.getStockLocation(), l.getLetter()))
                    .collect(Collectors.toList());

    // Lambda function to save all letters
    public LamdaLetters.ResponseSaveAllLetter saveAllLetters = saveLetter ->
            // Save all provided letters to the repository
            lettersRepository.saveAll(saveLetter);

    // Lambda function to find location by letter
    public LamdaLetters.FindByLetter findLocationByLetter = letter ->
            // Find a letter by its content and map it to a DTO containing only the location
            lettersRepository.findByLetter(letter).map(l -> new LettersDTO(l.getStockLocation()));

    // Lambda function to update a letter's information
    public LamdaLetters.updateAllLetter updateAllLetter = (letter, stockLocation, id) ->
            // Update the letter's information in the repository
            lettersRepository.updateLetter(letter, stockLocation, id);
}
