package PharmaceuticalCompany.Stock.Module.Repostorys;

import PharmaceuticalCompany.Stock.Module.Entitys.LettersEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repository interface for managing LettersE entities.
 */
@Repository
public interface LettersRepository extends JpaRepository<LettersEntity, Integer> {

    /**
     * Update a letter and its stock location by its ID.
     *
     * @param letter       the new letter content.
     * @param sotkLocation the new stock location.
     * @param id           the ID of the letter to update.
     * @return the number of rows affected.
     */
    @Modifying
    @Transactional
    @Query(value = "UPDATE letters SET LETTER = ?1, sotk_location = ?2 WHERE id = ?3", nativeQuery = true)
    int updateLetter(String letter, String sotkLocation, Integer id);

    /**
     * Find a letter by its content.
     *
     * @param letter the content of the letter to find.
     * @return an Optional containing the found LettersE entity, or empty if not found.
     */
    Optional<LettersEntity> findByLetter(String letter);
}
