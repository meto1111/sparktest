package testspark.service;

import com.google.gson.JsonObject;

import static spark.Spark.*;
import static testspark.service.JsonUtil.*;

public class WindmolenService {
	
	WindmolenImp windmolen = new WindmolenImp();

	public static void main(String[] args) {
		get("/windmolen-energie", (request, response) -> {
			final JsonObject json = new JsonObject();
			try {
				int windsnelheid = Integer.parseInt(request.queryParams("windsnelheid"));
				int vermogen = Integer.parseInt(request.queryParams("vermogen"));
				json.addProperty("result", BerekenKrachtImp.INSTANCE.berekenKracht(windsnelheid, vermogen));
			} catch (Exception e) {
				json.addProperty("error", "An error has occurred.");
			}
			response.type("application/json");
			return json;
		});

		
		get("/windmolens/:code", (request, response) -> {
			 final JsonObject json = new JsonObject();

			String code = request.params(":code");
			
			WindmolenImp windmolen = new WindmolenImp();
			Windmolen wm = windmolen.getWindmolenByCode(code);
			json.addProperty("code", wm.getCode());
			json.addProperty("error", "An error has occurred.");
			if(windmolen != null){
				return wm;
			}
			response.status(400);
			
			return new ResponseError("code niet gevonden van windmolen");
		},json());
		
		get("/windmolens", (req, res) -> {
			WindmolenImp windmolen = new WindmolenImp();
			return windmolen.getMijnMolens();
		}, json());
	}

}
