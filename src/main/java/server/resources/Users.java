package server.resources;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dal.UserActions;
import domain.User;
import server.ApiResponseMessage;
import server.ResponseCode;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("users")
public class Users {

    UserActions userActions = new UserActions();

    ObjectMapper mapper = new ObjectMapper();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response users() {

        ResponseCode code = ResponseCode.OK;

        ArrayList<User> users = userActions.getAll();
        String message = null;
        try {
            message = mapper.writeValueAsString(users);
        } catch (JsonProcessingException e) {
            code = ResponseCode.ERROR;
            e.printStackTrace();
        }

        return Response.ok().entity(new ApiResponseMessage(code, message)).build();
    }

    @Path("{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUser(@PathParam("id") int id) {

        ResponseCode code = ResponseCode.OK;

        User user = userActions.get(id);
        String message = null;
        try {
            message = mapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            code = ResponseCode.ERROR;
            e.printStackTrace();
        }

        return Response.ok().entity(new ApiResponseMessage(code, message)).build();
    }

    @Path("{id}/updateFoodPrefs")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateUser(User user, @PathParam("id") long id) {

        ResponseCode code = ResponseCode.OK;

        User updatedUser = userActions.updateFoodPrefs(id, user);

        String message = null;
        try {
            message = mapper.writeValueAsString(updatedUser);
        } catch (JsonProcessingException e) {
            code = ResponseCode.ERROR;
            e.printStackTrace();
        }

        return Response.ok().entity(new ApiResponseMessage(code, message)).build();
    }

    @Path("/add")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response addUser(User user) {

        ResponseCode code = ResponseCode.OK;

        User newUser = userActions.addUser(user);

        String message = null;
        try {
            message = mapper.writeValueAsString(newUser);
        } catch (JsonProcessingException e) {
            code = ResponseCode.ERROR;
            e.printStackTrace();
        }

        return Response.ok().entity(new ApiResponseMessage(code, message)).build();
    }
}
