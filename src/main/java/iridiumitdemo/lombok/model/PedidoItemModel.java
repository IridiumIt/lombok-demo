package iridiumitdemo.lombok.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name = "pedidoItem")
@Data
public class PedidoItemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    private ProductModel produto;

    private BigDecimal valor;

}
