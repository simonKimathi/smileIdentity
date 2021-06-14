
package selfie.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
public class PartnerParams {

    @Column
    @JsonProperty("job_id")
    private String jobId;
    @Column
    @JsonProperty("job_type")
    private String jobType;
    @Column
    @JsonProperty("optional_info")
    private String optionalInfo;
    @Column
    @JsonProperty("user_id")
    private String userId;

}
