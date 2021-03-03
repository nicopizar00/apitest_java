package api_test.endpoint;

import retrofit2.Call;
import retrofit2.http.*;

public interface PokemonEndpoint {
    @GET("{option}/{param}")
    public Call<String> get(
            @Path("option") String option,
            @Path("param") String param);
}
