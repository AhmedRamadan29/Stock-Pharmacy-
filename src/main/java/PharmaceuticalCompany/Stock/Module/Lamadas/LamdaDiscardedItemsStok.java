package PharmaceuticalCompany.Stock.Module.Lamadas;

import PharmaceuticalCompany.Stock.Module.DTOs.DiscardedItemsStokDTO;
import PharmaceuticalCompany.Stock.Module.Entitys.DiscardedItemsStokEntity;

import java.util.List;
import java.util.Optional;

public class LamdaDiscardedItemsStok {

    @FunctionalInterface
    public interface GetAllDiscardedItemsStok {
        List<DiscardedItemsStokDTO> getAllDiscardedItemsStok();
    }

    @FunctionalInterface
    public interface SaveDiscardedItemsStok {
        List<DiscardedItemsStokEntity> saveDiscardedItemsStok(List<DiscardedItemsStokEntity> discardedItemsStokEntities);
    }

    @FunctionalInterface
    public interface FindByLetterDiscardedItemsStok {
        Optional<DiscardedItemsStokDTO> findByLetterDiscardedItemsStok(String letter);
    }

    @FunctionalInterface
    public interface UpdateAllDiscardedItemsStok {
        void updateAllDiscardedItemsStok(List<DiscardedItemsStokEntity> discardedItemsStokEntities);
    }

    @FunctionalInterface
    public interface DeleteAllRowOnDiscardedItemsStok {
        void deleteAllRowOnDiscardedItemsStok(int id);
    }
}
