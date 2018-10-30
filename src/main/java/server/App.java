package server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;
import server.filters.CorsFilter;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static final int SERVER_PORT = 9050;
    public static final String RESOURCE_DIR = "server.resources";

    public static void main(String[] args) {

        Server server = configuredServer(SERVER_PORT);

        try {
            server.start();
            server.join();
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            server.destroy();
        }
    }

    public static Server configuredServer(int port) {
        ResourceConfig config = createResourceConfig();

        ServletHolder servlet = new ServletHolder(new ServletContainer(config));

        Server server = new Server(port);

        ServletContextHandler context = new ServletContextHandler(server, "/*");
        context.addServlet(servlet, "/*");

        return server;
    }

    protected static ResourceConfig createResourceConfig() {
        final ResourceConfig rc = new ResourceConfig();
        rc.packages(RESOURCE_DIR);
        rc.register(new CorsFilter());
        return rc;
    }
}
