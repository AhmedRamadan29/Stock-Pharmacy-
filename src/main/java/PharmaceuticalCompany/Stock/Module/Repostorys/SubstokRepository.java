package PharmaceuticalCompany.Stock.Module.Repostorys;

import PharmaceuticalCompany.Stock.Module.Entitys.SubstokEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing SubstokE entities.
 */
@Repository
public interface SubstokRepository extends JpaRepository<SubstokEntity, Integer> {

}
