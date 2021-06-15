import smile.identity.core.*;

import static selfie.util.Constants.*;

public class Main {
    private void faceRecognition(){

        try {
            PartnerParameters partnerParameters = new PartnerParameters("user1", "registration", 1);
            //job types
            /*1
            Register with ID
            Verify an ID
            Take a Selfie
            Compare the Selfie with the ID Authority Photo
            2
            Authenticate
            Take a Selfie
            Compare the Selfie with the Selfie provided during a successful Registration
            4
            Register without ID
            Take a Selfie
            5
            ID Validation
            Verify an ID
            8
            Update Photo
            Take a Selfie
            Compare the Selfie with the Selfie provided during a successful Registration
            */

            partnerParameters.add("optional_info", "some optional info");

            // Note dob is only required for VOTER_ID, DRIVERS_LICENSE, NATIONAL_ID, TIN, and CAC. For the rest of the id types you can send through dob as null or empty.
            IDParameters idInfo = new IDParameters("simon", "mungiria", "mungiria", "KE", "NATIONAL_ID", "35848896", "<String dob>", "0741753780", "true");

            // Create image list
            // Set the imageTypeId as an Integer using the following table
            // 0 - Selfie image jpg or png
            // 1 - ID card image jpg or png
            // 2 - Selfie image jpg or png base64 encoded
            // 3 - ID card image jpg or png base 64 encoded
            ImageParameters imageParameters = new ImageParameters();
            imageParameters.add(2, "simon.jpeg");

            Options options = new Options(CALLBACK, true, true, true);

            WebApi connection = new WebApi(PARTNER_ID, CALLBACK, DECODED_API_KEY, TEST_SERVER_ID); //0-test, 1--development

            String response = connection.submit_job(partnerParameters.get(), imageParameters.get(), idInfo.get(), options.get());
            System.out.println("\n Response" + response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
