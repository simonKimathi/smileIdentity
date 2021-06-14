package selfie.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PartnerParams {

    @JsonProperty("job_id")
    private String jobId;
    @JsonProperty("job_type")
    private String jobType;
    @JsonProperty("more_optional_info")
    private String moreOptionalInfo;
    @JsonProperty("optional_info")
    private String optionalInfo;
    @JsonProperty("user_id")
    private String userId;
}