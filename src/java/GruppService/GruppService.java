package GruppService;


import GruppServer.GruppServer;
import java.io.IOException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/GruppService")


public class GruppService {
    GruppServer GS = new GruppServer();
    
    @GET
    @Path("/test")
    @Produces (MediaType.TEXT_PLAIN)
    public int GetLuftfuktighet() throws ClassNotFoundException, IOException 
    {     
    return GS.Displayluftfuktighet();
    }    
}

