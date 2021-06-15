package selfie.controller.impl;

import com.google.gson.Gson;
import org.slf4j.Logger;
import selfie.DTO.SmileIdentityResponseDTO;
import selfie.Service.ProcessSelfieDto;
import selfie.Service.SelfieService;
import selfie.controller.Callback;
import selfie.controller.vm.SuccessVm;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.core.Response;

public class CallbackImpl implements Callback {

    @Inject
    SelfieService selfieService;

    @Inject
    public Logger logger;

    @Override
    public Response smileIdentityCallback(String json) {
        logger.info("callback called");
        Gson gson = new Gson();
        SmileIdentityResponseDTO smileIdentityResponseDTO = gson.fromJson(json, SmileIdentityResponseDTO.class);
        return null;
    }

    @Override
    public Response testRegister(String userId, String jobId) {
        String jsonString = selfieService.registerSelfie(userId,jobId);
        Gson gson = new Gson();
        SmileIdentityResponseDTO smileIdentityResponseDTO = gson.fromJson(jsonString, SmileIdentityResponseDTO.class);
        return Response.status(Response.Status.OK)
                .entity(SuccessVm.builder().success(true).data(smileIdentityResponseDTO).msg("Done").build())
                .build();
    }

    @Override
    public Response processSelfie(@Valid ProcessSelfieDto processSelfieDto) {
        String message = "";
        boolean success = false;
        String jsonString = selfieService.processSelfie(processSelfieDto);
        Gson gson = new Gson();
        SmileIdentityResponseDTO smileIdentityResponseDTO = gson.fromJson(jsonString, SmileIdentityResponseDTO.class);
        if(smileIdentityResponseDTO.isJob_complete() && smileIdentityResponseDTO.isJob_success()) {
            if (processSelfieDto.getJobType() == 4 || processSelfieDto.getJobType() == 1) { //registration
                return Response.status(Response.Status.OK)
                        .entity(SuccessVm.builder().success(true).data(smileIdentityResponseDTO).msg("Registered Successfully").build())
                        .build();
            }
            else { //authentication
                switch (smileIdentityResponseDTO.getResult().getResultCode()){
                    case "0921":
                        message="FAIL - No Face Found";
                        success=false;
                        break;
                    case "0922":
                        message="FAIL - Image Quality Judged Too Poor";
                        success=false;
                        break;
                    case "0820":
                        message="Machine Judgement - PASS";
                        success=true;
                        break;
                    case "0821":
                        message="Machine Judgement - FAIL - COMPARISON";
                        success=false;
                        break;
                    case "0822":
                        message="Machine Judgement - PURE PROVISIONAL, Awaiting Human Judgement";
                        success=true;
                        break;
                    case "0823":
                        message="Machine Judgement - FAIL - Possible Spoof";
                        success=false;
                        break;
                    case "0824":
                        message="Machine Judgement - PROVISIONAL - Possible Spoof, Awaiting Human Judgement";
                        success=true;
                        break;
                    case "0825":
                        message="Machine Judgement - PROVISIONAL - Machine Compare Unsure, Awaiting Human Judgement";
                        success=true;
                        break;
                    default:

                }
                return Response.status(Response.Status.OK)
                        .entity(SuccessVm.builder().success(success).data(smileIdentityResponseDTO).msg(message).build())
                        .build();

            }
        }
        return Response.status(Response.Status.OK)
                .entity(SuccessVm.builder().success(true).data(smileIdentityResponseDTO).msg("Waiting for Callback").build())
                .build();
    }
}
