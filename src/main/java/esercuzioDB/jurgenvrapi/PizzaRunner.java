package esercuzioDB.jurgenvrapi;

import esercuzioDB.jurgenvrapi.DAO.PizzaDAO;
import esercuzioDB.jurgenvrapi.DAO.ToppingDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import esercuzioDB.jurgenvrapi.entities.*;
import java.util.Arrays;

@Component
public class PizzaRunner implements CommandLineRunner {

    private final PizzaDAO pizzaRepository;
    private final ToppingDAO toppingRepository;

    public PizzaRunner(PizzaDAO pizzaRepository, ToppingDAO toppingRepository) {
        this.pizzaRepository = pizzaRepository;
        this.toppingRepository = toppingRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Topping cheese = new Topping("Cheese", 100, 0.5);
        Topping tomato = new Topping("Tomato", 50, 0.3);


        toppingRepository.saveAll(Arrays.asList(cheese, tomato));


        Pizza pizza = new Pizza("Cheese Tomato Pizza", Arrays.asList(cheese, tomato), false);


        pizzaRepository.save(pizza);


        System.out.println("Pizze nel database:");
        for (Pizza p : pizzaRepository.findAll()) {
            System.out.println(p);
        }
    }
}
