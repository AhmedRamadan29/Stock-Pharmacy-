package PharmaceuticalCompany.Stock.Module.Repostorys;

import PharmaceuticalCompany.Stock.Module.Entitys.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing SupplierE entities.
 */
@Repository
public interface SupplierRepo extends JpaRepository<SupplierEntity, Integer> {

}
