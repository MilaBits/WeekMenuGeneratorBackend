package server.resources;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dal.context.UserContext;
import dal.repo.UserRepo;
import domain.User;
import server.ApiResponseMessage;
import server.ResponseCode;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("users")
public class Users {

    UserRepo repo = new UserRepo(new UserContext());

    ObjectMapper mapper = new ObjectMapper();

    @Path("{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUser(@PathParam("id") int id) {

        ResponseCode code = ResponseCode.OK;

        User user = repo.get(id);
        String message = null;
        try {
            message = mapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            code = ResponseCode.ERROR;
            e.printStackTrace();
        }

        return Response.ok().entity(new ApiResponseMessage(code, message)).build();
    }
}
