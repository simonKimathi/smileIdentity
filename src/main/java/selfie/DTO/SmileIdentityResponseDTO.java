
package selfie.DTO;

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

    private ImageLinks image_links;


    private boolean job_complete;

    private boolean job_success;

    private Result result;

   
    private String signature;
   
    private String timestamp;

}
