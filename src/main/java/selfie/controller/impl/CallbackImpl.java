package selfie.controller.impl;

import com.google.gson.Gson;
import org.slf4j.Logger;
import selfie.DTO.SmileIdentityResponseDTO;
import selfie.Service.SelfieService;
import selfie.controller.Callback;
import selfie.controller.vm.SuccessVm;

import javax.inject.Inject;
import javax.ws.rs.core.Response;

public class CallbackImpl implements Callback {

    @Inject
    SelfieService selfieService;

    @Inject
    public Logger logger;

    @Override
    public Response smileIdentityCallback() {
        return null;
    }

    @Override
    public Response testRegister(String userId, String jobId) {
        String jsonString = selfieService.registerSelfie(userId,jobId);
        logger.info(jsonString);
        Gson gson = new Gson();
        SmileIdentityResponseDTO smileIdentityResponseDTO = gson.fromJson(jsonString, SmileIdentityResponseDTO.class);
        return Response.status(Response.Status.OK)
                .entity(SuccessVm.builder().success(true).data(smileIdentityResponseDTO).msg("Done").build())
                .build();
    }
}
