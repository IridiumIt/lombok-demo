package iridiumitdemo.lombok.controller;

import iridiumitdemo.lombok.model.ClientModel;
import iridiumitdemo.lombok.repository.ClientRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cliente")
public class ClientController {
    private final ClientRepository repository;

    public ClientController(ClientRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/save")
    public ResponseEntity<ClientModel> save(@RequestBody ClientModel client){
        return  ResponseEntity.ok(repository.save(client));
    }

    @GetMapping("/listAll")
    public ResponseEntity<List<ClientModel>> ListAll(){
        return ResponseEntity.ok(repository.findAll());
    }
}
