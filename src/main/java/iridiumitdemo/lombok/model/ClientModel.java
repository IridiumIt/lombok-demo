package iridiumitdemo.lombok.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ClientModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100, nullable = false)
    private String nome;
    private String endereco;

}
