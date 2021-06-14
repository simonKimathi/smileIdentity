
package selfie.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
public class Actions {

    @Column
    @JsonProperty("Human_Review_Compare")
    private String humanReviewCompare;
    @Column
    @JsonProperty("Human_Review_Liveness_Check")
    private String humanReviewLivenessCheck;
    @Column
    @JsonProperty("Human_Review_Update_Selfie")
    private String humanReviewUpdateSelfie;
    @Column
    @JsonProperty("Liveness_Check")
    private String livenessCheck;
    @Column
    @JsonProperty("Register_Selfie")
    private String registerSelfie;
    @Column
    @JsonProperty("Return_Personal_Info")
    private String returnPersonalInfo;
    @Column
    @JsonProperty("Selfie_To_ID_Authority_Compare")
    private String selfieToIDAuthorityCompare;
    @Column
    @JsonProperty("Selfie_To_ID_Card_Compare")
    private String selfieToIDCardCompare;
    @Column
    @JsonProperty("Selfie_To_Registered_Selfie_Compare")
    private String selfieToRegisteredSelfieCompare;
    @Column
    @JsonProperty("Update_Registered_Selfie_On_File")
    private String updateRegisteredSelfieOnFile;
    @Column
    @JsonProperty("Verify_ID_Number")
    private String verifyIDNumber;


}
