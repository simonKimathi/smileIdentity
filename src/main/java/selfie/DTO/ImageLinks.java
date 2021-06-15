
package selfie.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImageLinks {

    @JsonProperty("selfie_image")
    private String selfieImage;

}
