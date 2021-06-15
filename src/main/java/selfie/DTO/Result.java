
package selfie.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result {

   
    @JsonProperty("Actions")
    private Actions actions;
   
    @JsonProperty("ConfidenceValue")
    private String confidenceValue;
   
    @JsonProperty("IsFinalResult")
    private String isFinalResult;
   
    @JsonProperty("IsMachineResult")
    private String isMachineResult;
   
    @JsonProperty("JSONVersion")
    private String jSONVersion;
   
    @JsonProperty("PartnerParams")
    private PartnerParams partnerParams;
   
    @JsonProperty("ResultCode")
    private String resultCode;
   
    @JsonProperty("ResultText")
    private String resultText;
   
    @JsonProperty("ResultType")
    private String resultType;
   
    @JsonProperty("SmileJobID")
    private String smileJobID;
   
    @JsonProperty("Source")
    private String source;

}
