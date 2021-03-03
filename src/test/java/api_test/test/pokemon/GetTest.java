package api_test.test.pokemon;

import api_test.baseconfig.BaseConfig;
import api_test.endpoint.PokemonEndpoint;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import retrofit2.Response;

public class GetTest extends BaseConfig {
    @Test(description = "Get request with correct format")
    public void getHappy() throws Exception {
        PokemonEndpoint pokemonEndpoint = retrofit.create(PokemonEndpoint.class);
        Response<String> response = pokemonEndpoint.get("pokemon", "ditto").execute();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.code(), 200);
        softAssert.assertAll();
    }
}
