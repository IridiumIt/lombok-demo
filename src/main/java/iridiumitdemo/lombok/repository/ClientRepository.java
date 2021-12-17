package iridiumitdemo.lombok.repository;

import iridiumitdemo.lombok.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientModel, Integer> {
}
