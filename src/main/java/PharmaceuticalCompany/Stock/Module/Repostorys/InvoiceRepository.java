package PharmaceuticalCompany.Stock.Module.Repostorys;

import PharmaceuticalCompany.Stock.Module.Entitys.InvoiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing InvoiceE entities.
 */
@Repository
public interface InvoiceRepository extends JpaRepository<InvoiceEntity, Integer> {

}
