import smile.identity.core.*;

public class Main {
    final String partnerId="1126";
    final String callback="./";
    final String decodedApiKey="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQD6cCno3fv+ZrRCQ1bvJL8AnQFd" +
            "i577RyvxJrvxQ6zM5UR2HoU4Fnm6/VAjZaSrI6EYR+PQDz1qtH/qrtcXzhJIAlYB" +
            "uZpKnQFPUlqjmPEHlo0pankFycZpgDR8cSZxV1kT9Hx/3osdMb8XhW27ayBRwXLK" +
            "dmIBImpZkRah6LERTQIDAQAB";
    final String EncodedApiKey="LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUlHZk1BMEdDU3FHU0liM0RRRUJBUVVBQTRHTkFEQ0JpUUtCZ1FENmNDbm8zZnYrWnJSQ1ExYnZKTDhBblFGZAppNTc3Unl2eEpydnhRNnpNNVVSMkhvVTRGbm02L1ZBalphU3JJNkVZUitQUUR6MXF0SC9xcnRjWHpoSklBbFlCCnVacEtuUUZQVWxxam1QRUhsbzBwYW5rRnljWnBnRFI4Y1NaeFYxa1Q5SHgvM29zZE1iOFhoVzI3YXlCUndYTEsKZG1JQkltcFprUmFoNkxFUlRRSURBUUFCCi0tLS0tRU5EIFBVQkxJQyBLRVktLS0tLQo=";
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

            Options options = new Options(callback, true, true, true);

            WebApi connection = new WebApi(partnerId, callback, decodedApiKey, 0); //0-test, 1--development

            String response = connection.submit_job(partnerParameters.get(), imageParameters.get(), idInfo.get(), options.get());
            System.out.println("\n Response" + response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
