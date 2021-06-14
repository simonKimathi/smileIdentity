package selfie.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Setter
@Getter
public class CallbackJSONDto {

    @JsonProperty("selfie.DTO.Actions")
    private Actions actions;
    @JsonProperty("ConfidenceValue")
    private String confidenceValue;
    @JsonProperty("selfie.DTO.PartnerParams")
    private PartnerParams partnerParams;
    @JsonProperty("ResultCode")
    private String resultCode;
    @JsonProperty("ResultText")
    private String resultText;
    @JsonProperty("sec_key")
    private String secKey;
    @JsonProperty("SmileJobID")
    private String smileJobID;
    @JsonProperty("Source")
    private String source;

    @JsonProperty("timestamp")
    private Instant timestamp;


}
