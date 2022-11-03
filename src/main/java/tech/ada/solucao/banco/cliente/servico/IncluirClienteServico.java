package tech.ada.solucao.banco.cliente.servico;

import org.springframework.stereotype.Service;
import tech.ada.solucao.banco.cliente.requisicao.EnderecoRequisicao;
import tech.ada.solucao.banco.cliente.requisicao.RequisicaoCliente;
import tech.ada.solucao.banco.cliente.resposta.RespostaCliente;

import java.util.UUID;

@Service
public class IncluirClienteServico {

    public RespostaCliente executar (RequisicaoCliente requisicaoCliente){
        RespostaCliente respostaCliente = new RespostaCliente();
        respostaCliente.setIdentificador(UUID.randomUUID().toString());
        respostaCliente.setNome(requisicaoCliente.getNome());
        respostaCliente.setCpf(requisicaoCliente.getCpf());
        EnderecoRequisicao enderecoRequisicao = new EnderecoRequisicao();
        enderecoRequisicao.setLogradouro(requisicaoCliente.getEnderecoRequisicao().getLogradouro());
        enderecoRequisicao.setNumero(requisicaoCliente.getEnderecoRequisicao().getNumero());
        enderecoRequisicao.setCidade(requisicaoCliente.getEnderecoRequisicao().getCidade());
        return respostaCliente;
    }

}
