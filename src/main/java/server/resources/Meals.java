package server.resources;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dal.context.MealMemoryContext;
import dal.repo.MealRepo;
import domain.Meal;
import server.ApiResponseMessage;
import server.ResponseCode;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("/meals")
public class Meals {

    MealRepo repo = new MealRepo(new MealMemoryContext());

    ObjectMapper mapper = new ObjectMapper();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response meals() {

        ResponseCode code = ResponseCode.OK;

        ArrayList<Meal> meals = repo.getAll();
        String message = null;
        try {
            message = mapper.writeValueAsString(meals);
        } catch (JsonProcessingException e) {
            code = ResponseCode.ERROR;
            e.printStackTrace();
        }

        return Response.ok().entity(new ApiResponseMessage(code, message)).build();
    }
}
