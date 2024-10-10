package PharmaceuticalCompany.Stock.Module.Repostorys;

import PharmaceuticalCompany.Stock.Module.Entitys.MainStokEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing MainStokE entities.
 */
@Repository
public interface MainStokRepository extends JpaRepository<MainStokEntity, Integer> {

}
