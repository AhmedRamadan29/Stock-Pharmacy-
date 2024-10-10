package PharmaceuticalCompany.Stock.Module.DTOs;


import lombok.*;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Component
public class LettersDTO {
    private Integer id;
    @Getter
    private String sockLocation;
    private String Location;

    public LettersDTO(String sockLocation) {

        this.sockLocation = sockLocation;
    }


}



