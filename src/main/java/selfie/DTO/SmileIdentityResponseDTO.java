
package selfie.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SmileIdentityResponseDTO {


   
    private String code;


    private List<History> history;

    @JsonProperty("image_links")
    private ImageLinks imageLinks;

   
    @JsonProperty("job_complete")
    private Boolean jobComplete;

   
    @JsonProperty("job_success")
    private Boolean jobSuccess;

    private Result result;

   
    private String signature;
   
    private String timestamp;

}
