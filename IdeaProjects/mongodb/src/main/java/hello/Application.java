package hello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Dinesh on 2/27/17.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        System.setProperty("server.port","8000");
        SpringApplication.run(Application.class, args);
    }
}