
package selfie.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import selfie.util.Ignore;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class History {

    @Id
    @Ignore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @JsonProperty("Actions")
    private Actions actions;

    @Column
    @JsonProperty("ConfidenceValue")
    private String confidenceValue;
    @Column
    @JsonProperty("IsFinalResult")
    private String isFinalResult;
    @Column
    @JsonProperty("IsMachineResult")
    private String isMachineResult;
    @Column
    @JsonProperty("JSONVersion")
    private String jSONVersion;
    @Column
    @JsonProperty("PartnerParams")
    private PartnerParams partnerParams;
    @Column
    @JsonProperty("ResultCode")
    private String resultCode;
    @Column
    @JsonProperty("ResultText")
    private String resultText;
    @Column
    @JsonProperty("ResultType")
    private String resultType;
    @Column
    @JsonProperty("SmileJobID")
    private String smileJobID;
    @Column
    @JsonProperty("Source")
    private String source;

}
