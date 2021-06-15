package selfie.controller.impl;

import org.slf4j.Logger;
import selfie.Service.SelfieService;
import selfie.controller.Callback;

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
    public Response testRegister() {
        String jsonString = selfieService.registerSelfie();
        logger.info(jsonString);
        return null;
    }
}
