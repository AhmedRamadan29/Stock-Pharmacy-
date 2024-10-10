package PharmaceuticalCompany.Stock.Module.Lamadas;

import PharmaceuticalCompany.Stock.Module.DTOs.LettersDTO;
import PharmaceuticalCompany.Stock.Module.Entitys.LettersEntity;

import java.util.List;
import java.util.Optional;

public class LamdaLetters {

    // Functional interface for getting all letters
    @FunctionalInterface
    public interface ResponseGETAllLetter {
        // Method to get all letters as a list of LettersDTO
        List<LettersDTO> getAllLetters();
    }

    // Functional interface for saving all letters
    @FunctionalInterface
    public interface ResponseSaveAllLetter {
        // Method to save a list of LettersE and return the saved list
        List<LettersEntity> SaveAllLetter(List<LettersEntity> letters);
    }

    // Functional interface for finding a letter by its content
    @FunctionalInterface
    public interface FindByLetter {
        // Method to find a letter by its content and return an Optional of LettersDTO
        Optional<LettersDTO> findLocationByLetter(String letter);
    }

    // Functional interface for updating a letter
    @FunctionalInterface
    public interface updateAllLetter {
        // Method to update a letter's content, location, and id, returning the number of rows affected
        int updateLetter(String letter, String sotkLocation, Integer id);
    }
}



