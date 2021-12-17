package iridiumitdemo.lombok.controller;

import iridiumitdemo.lombok.model.PedidoModel;
import iridiumitdemo.lombok.repository.PedidoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/pedido")
public class PedidoController {

    private final PedidoRepository repository;

    public PedidoController(PedidoRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/save")
    public ResponseEntity<PedidoModel> save(@RequestBody PedidoModel pedido){
        if(pedido.getId() == null || pedido.getId().isEmpty()){
            pedido.setId(UUID.randomUUID().toString());
        }
        return  ResponseEntity.ok(repository.save(pedido));
    }

    @GetMapping("/listAll")
    public ResponseEntity<List<PedidoModel>> ListAll(){
        return ResponseEntity.ok(repository.findAll());
    }
}
