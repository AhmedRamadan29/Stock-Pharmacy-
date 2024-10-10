package PharmaceuticalCompany.Stock.Module.Services;


import PharmaceuticalCompany.Stock.Module.Entitys.DrugEntity;
import PharmaceuticalCompany.Stock.Module.Lamadas.LamdaDrug;
import PharmaceuticalCompany.Stock.Module.Mappers.MapperDrug;
import PharmaceuticalCompany.Stock.Module.Repostorys.DrugRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Service class for managing drug operations.
 */
@Service
@Data
public class DrugServices {

    // Autowire the DrugRepository to inject its dependency
    @Autowired
    private DrugRepository drugRepository;

    // Lambda to get all drugs from the repository
    public LamdaDrug.GetDrugs getAllDrugs = () -> {
        // Retrieve all drug entities from the repository
        List<DrugEntity> drugEntities = drugRepository.findAll();

        // Use parallel stream for better performance on large data sets
        return drugEntities.parallelStream()
                .map(MapperDrug::mapToDTODrugDTO)
                .collect(Collectors.toList());
    };

    // Lambda to get a drug by its ID
    public LamdaDrug.DrugById getDrugById = id -> {
        // Find the drug entity by its ID
        Optional<DrugEntity> drugEntity = drugRepository.findById(id);

        // Map the drug entity to a DTO if it exists, otherwise return null
        return drugEntity.map(MapperDrug::mapToDTODrugDTO)
                .orElse(null);
    };
}
