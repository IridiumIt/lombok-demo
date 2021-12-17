package iridiumitdemo.lombok.repository;

import iridiumitdemo.lombok.model.PedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<PedidoModel, String> {
}
