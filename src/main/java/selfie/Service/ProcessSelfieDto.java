package selfie.Service;

import lombok.Getter;
import lombok.Setter;
import selfie.util.Ignore;

@Getter
@Setter
public class ProcessSelfieDto {
    private String userId;
    private String jobId;
    private int jobType;
    private int imageType;
    private String image;
    @Ignore
    private String IdFirstName="";
    @Ignore
    private String IdMiddleName="";
    @Ignore
    private String IdLastName="";
    @Ignore
    private String IdCountry="KE";
    @Ignore
    private String IdType="NATIONAL_ID";
    @Ignore
    private String IdNumber="";
    @Ignore
    private String IdDob="";
    @Ignore
    private String IdPhoneNumber="";
    @Ignore
    private String IdConfirmed="true";

}
