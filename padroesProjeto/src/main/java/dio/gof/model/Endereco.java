package dio.gof.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data  //Lombok para implementar  get e setter
@NoArgsConstructor //Lombok  - Construtor Vazio
@AllArgsConstructor //Lombok - Construtor com todos os atributos
@Entity
@Table(name = "enderecos")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Endereco {

    @Id
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

}
