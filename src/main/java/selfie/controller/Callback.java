package selfie.controller;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import selfie.Service.ProcessSelfieDto;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/callback")
public interface Callback {

    @Operation(summary = "smile identity")
    @APIResponse(responseCode = "200", description = "Ok")
    @APIResponse(responseCode = "401", description = "Unauthorised")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/smileIdentityCallback")
    Response smileIdentityCallback(String json);

    @Operation(summary = "smile identity")
    @APIResponse(responseCode = "200", description = "Ok")
    @APIResponse(responseCode = "401", description = "Unauthorised")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/smileIdentityCallback")
    Response smileIdentityCallbackPost(String json);

    @Operation(summary = "test register")
    @APIResponse(responseCode = "200", description = "Ok")
    @APIResponse(responseCode = "401", description = "Unauthorised")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/testRegister/{userId}/{jobId}")
    Response testRegister(@PathParam("userId") String userId,@PathParam("jobId") String jobId );

    @Operation(summary = "test register")
    @APIResponse(responseCode = "200", description = "Ok")
    @APIResponse(responseCode = "401", description = "Unauthorised")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/processSelfie")
    Response processSelfie(@Valid ProcessSelfieDto processSelfieDto);

}
