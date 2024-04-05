package esercuzioDB.jurgenvrapi.DAO;
import org.springframework.data.jpa.repository.JpaRepository;
import esercuzioDB.jurgenvrapi.entities.Pizza;
public interface PizzaDAO extends JpaRepository<Pizza, Long> {
}
