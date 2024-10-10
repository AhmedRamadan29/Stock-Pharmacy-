package PharmaceuticalCompany.Stock.Module.Repostorys;

import PharmaceuticalCompany.Stock.Module.Entitys.DiscardedItemsStokEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Repository interface for managing DiscardedItemsStokE entities.
 */
@Repository
public interface DiscardedItemsStokRepository extends JpaRepository<DiscardedItemsStokEntity, Integer> {


}