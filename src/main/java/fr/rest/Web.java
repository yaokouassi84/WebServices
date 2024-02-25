package fr.rest;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Produces("application/json")
@Consumes("application/json")
@Path("/Web")
public class Web {

	@GET
	public String message() {
		
		return "Bonjour";
	}
}