package esercuzioDB.jurgenvrapi;


import esercuzioDB.jurgenvrapi.entities.Menu;
import esercuzioDB.jurgenvrapi.entities.OrdiniConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@Slf4j
public class JurgenvrapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JurgenvrapiApplication.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JurgenvrapiApplication.class, OrdiniConfig.class);


		Menu m = (Menu) ctx.getBean("menu");
		CommandLineRunner runner = (CommandLineRunner) ctx.getBean("orderRunner");
		try {
			runner.run(args);
		} catch (Exception e) {
			e.printStackTrace();
		}


		m.printMenu();
		ctx.close();
	}

}
