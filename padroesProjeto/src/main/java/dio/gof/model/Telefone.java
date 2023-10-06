package dio.gof.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data  //Lombok para implementar  get e setter
@NoArgsConstructor //Lombok  - Construtor Vazio
@AllArgsConstructor //Lombok - Construtor com todos os atributos
@Entity
@Table(name = "telefones")
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String numeroTelefone;

}
