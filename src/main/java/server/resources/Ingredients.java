package server.resources;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dal.IngredientActions;
import domain.Ingredient;
import server.ApiResponseMessage;
import server.ResponseCode;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("/ingredients")
public class Ingredients {

    IngredientActions ingredientActions = new IngredientActions();

    ObjectMapper mapper = new ObjectMapper();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getIngredients() {

        ResponseCode code = ResponseCode.OK;

        ArrayList<Ingredient> ingredients = ingredientActions.getAll();

        String message = null;
        try {
            message = mapper.writeValueAsString(ingredients);
        } catch (JsonProcessingException e) {
            code = ResponseCode.ERROR;
            e.printStackTrace();
        }

        return Response.ok().entity(new ApiResponseMessage(code, message)).build();
    }
}
