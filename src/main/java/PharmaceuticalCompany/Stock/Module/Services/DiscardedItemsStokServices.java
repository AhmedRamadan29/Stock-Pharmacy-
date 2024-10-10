package PharmaceuticalCompany.Stock.Module.Services;

import PharmaceuticalCompany.Stock.Module.Entitys.DiscardedItemsStokEntity;
import PharmaceuticalCompany.Stock.Module.Lamadas.LamdaDiscardedItemsStok;
import PharmaceuticalCompany.Stock.Module.Mappers.MapperDiscardedItemsStok;
import PharmaceuticalCompany.Stock.Module.Repostorys.DiscardedItemsStokRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DiscardedItemsStokServices {

    @Autowired
    private DiscardedItemsStokRepository discardedItemsStokRepository;
    public LamdaDiscardedItemsStok.GetAllDiscardedItemsStok getAllDiscardedItemsStok = () -> {
        List<DiscardedItemsStokEntity> discardedItemsStokEntities = discardedItemsStokRepository.findAll();
        return discardedItemsStokEntities.parallelStream()
                .map(MapperDiscardedItemsStok::mapToDiscardedItemsStokDTO)
                .collect(Collectors.toList());
    };

    public LamdaDiscardedItemsStok.SaveDiscardedItemsStok saveDiscardedItemsStok = discardedItemsStokEntities -> {
        if (discardedItemsStokEntities == null || discardedItemsStokEntities.isEmpty()) {
            throw new IllegalArgumentException("The list of discarded items must be non-null and contain more than one item. The Table count saved := " + (0));
        } else {
            return discardedItemsStokRepository.saveAll(discardedItemsStokEntities);
        }
    };

//    public LamdaDiscardedItemsStok.FindByLetterDiscardedItemsStok findByLetterDiscardedItemsStok = letter ->
//            discardedItemsStokRepository.findByLetter(letter)
//                    .map(entity -> new DiscardedItemsStokDTO(entity.getLitters()));

    public LamdaDiscardedItemsStok.UpdateAllDiscardedItemsStok updateAllDiscardedItemsStok = discardedItemsStokEntities -> {
        if (discardedItemsStokEntities == null || discardedItemsStokEntities.isEmpty()) {
            throw new IllegalArgumentException("The list of discarded items must be non-null and contain more than one item. The Table count saved := " + (0));
        } else {
            discardedItemsStokRepository.saveAll(discardedItemsStokEntities);
        }
    };

    public LamdaDiscardedItemsStok.DeleteAllRowOnDiscardedItemsStok deleteAllRowOnDiscardedItemsStok = id -> discardedItemsStokRepository.deleteById(id);
}