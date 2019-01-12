package server.resources;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dal.MealActions;
import dal.UserActions;
import domain.Meal;
import domain.User;
import server.ApiResponseMessage;
import server.ResponseCode;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("meals")
public class Meals {

    MealActions mealActions = new MealActions();
    UserActions userActions = new UserActions();

    ObjectMapper mapper = new ObjectMapper();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response meals() {

        ResponseCode code = ResponseCode.OK;

        ArrayList<Meal> meals = mealActions.getAll();
        String message = null;
        try {
            message = mapper.writeValueAsString(meals);
        } catch (JsonProcessingException e) {
            code = ResponseCode.ERROR;
            e.printStackTrace();
        }

        return Response.ok().entity(new ApiResponseMessage(code, message)).build();
    }

    @Path("{id}/updateUsers")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateUser(Meal meal, @PathParam("id") long id) {

        ResponseCode code = ResponseCode.OK;

        for (User user : meal.getParticipants()) {
            if (user.id == null){
                user = userActions.addUser(user);
            }
        }

        Meal updatedMeal = mealActions.updateUsers(id, meal);

        String message = null;
        try {
            message = mapper.writeValueAsString("");
        } catch (JsonProcessingException e) {
            code = ResponseCode.ERROR;
            e.printStackTrace();
        }

        return Response.ok().entity(new ApiResponseMessage(code, message)).build();
    }
}
