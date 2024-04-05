package esercuzioDB.jurgenvrapi.DAO;

import esercuzioDB.jurgenvrapi.entities.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {
    private final PizzaDAO pizzaRepository;

    @Autowired
    public PizzaService(PizzaDAO pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public List<Pizza> getAllPizzas() {
        return pizzaRepository.findAll();
    }
}
