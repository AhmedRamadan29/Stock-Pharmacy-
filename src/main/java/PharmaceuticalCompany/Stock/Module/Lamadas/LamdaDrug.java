package PharmaceuticalCompany.Stock.Module.Lamadas;

import PharmaceuticalCompany.Stock.Module.DTOs.DrugDTO;

import java.util.List;

/**
 * This class contains functional interfaces for drug-related operations.
 */
public class LamdaDrug {

    /**
     * Functional interface for retrieving all drugs.
     */
    @FunctionalInterface
    public interface GetDrugs {
        /**
         * Retrieves a list of all DrugDTOs.
         *
         * @return a list of DrugDTOs.
         */
        List<DrugDTO> getAllDrugs();
    }

    /**
     * Functional interface for retrieving a drug by its ID.
     */
    @FunctionalInterface
    public interface DrugById {
        /**
         * Retrieves a DrugDTO by its ID.
         *
         * @param id the ID of the drug.
         * @return the DrugDTO associated with the given ID.
         */
        DrugDTO getDrugById(Integer id);
    }

    /**
     * Functional interface for deleting a drug by its ID.
     */
    @FunctionalInterface
    public interface DeleteDrugById {
        /**
         * Deletes a drug by its ID.
         *
         * @param id the ID of the drug to delete.
         */
        void deleteDrug(Integer id);
    }

    /**
     * Functional interface for updating a drug record.
     */
    @FunctionalInterface
    public interface UpdateDrugRow {
        /**
         * Updates the information of a drug.
         *
         * @param drugDTO the DrugDTO containing updated information.
         * @return the updated DrugDTO.
         */
        DrugDTO updateDrug(DrugDTO drugDTO);
    }

    /**
     * Functional interface for inserting a new drug record.
     */
    @FunctionalInterface
    public interface InsertRowDrug {
        /**
         * Inserts a new drug record.
         *
         * @param drugDTO the DrugDTO containing the information of the new drug.
         * @return the inserted DrugDTO.
         */
        DrugDTO insertRowDrug(DrugDTO drugDTO);
    }
}
