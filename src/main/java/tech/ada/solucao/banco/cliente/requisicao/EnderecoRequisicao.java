package tech.ada.solucao.banco.cliente.requisicao;

import lombok.Data;

@Data
public class EnderecoRequisicao {

    private String logradouro;
    private Integer numero;
    private Integer cidade;

}
