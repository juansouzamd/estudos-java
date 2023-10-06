package dio.gof.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data  //Lombok para implementar  get e setter
@NoArgsConstructor //Lombok  - Construtor Vazio
@AllArgsConstructor //Lombok - Construtor com todos os atributos
@Entity
@Table(name = "clientes")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @ManyToOne
    private Endereco endereco;

}
