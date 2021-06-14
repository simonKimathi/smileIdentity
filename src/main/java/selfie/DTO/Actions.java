package selfie.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Actions {
    @JsonProperty("Human_Review_Compare")
    private String humanReviewCompare;
    @JsonProperty("Human_Review_Liveness_Check")
    private String humanReviewLivenessCheck;
    @JsonProperty("Human_Review_Update_Selfie")
    private String humanReviewUpdateSelfie;
    @JsonProperty("Liveness_Check")
    private String livenessCheck;
    @JsonProperty("Register_Selfie")
    private String registerSelfie;
    @JsonProperty("Return_Personal_Info")
    private String returnPersonalInfo;
    @JsonProperty("Selfie_Provided")
    private String selfieProvided;
    @JsonProperty("Selfie_To_ID_Authority_Compare")
    private String selfieToIDAuthorityCompare;
    @JsonProperty("Selfie_To_ID_Card_Compare")
    private String selfieToIDCardCompare;
    @JsonProperty("Selfie_To_Registered_Selfie_Compare")
    private String selfieToRegisteredSelfieCompare;
    @JsonProperty("Update_Registered_Selfie_On_File")
    private String updateRegisteredSelfieOnFile;
    @JsonProperty("Verify_ID_Number")
    private String verifyIDNumber;

}
