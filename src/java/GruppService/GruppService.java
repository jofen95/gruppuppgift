package GruppService;


import GruppServer.GruppServer;
import java.io.IOException;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import jordfuktighetsSensor.jordfuktighetssensor;


@Path("/GruppService")


public class GruppService {
    GruppServer GS = new GruppServer();
    
    @GET
    @Path("/test")
    @Produces (MediaType.APPLICATION_JSON)
    public List<jordfuktighetssensor> GetLuftfuktighet() throws ClassNotFoundException, IOException 
    {     
    return GS.Displayluftfuktighet();
    }    
}

