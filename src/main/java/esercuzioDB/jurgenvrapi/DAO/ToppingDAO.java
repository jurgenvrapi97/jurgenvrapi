package esercuzioDB.jurgenvrapi.DAO;
import esercuzioDB.jurgenvrapi.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ToppingDAO extends JpaRepository<Topping, Long> {
}
