package tech.ada.solucao.banco.cliente.servico;

import org.springframework.stereotype.Service;
import tech.ada.solucao.banco.cliente.resposta.RespostaCliente;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ListarClienteServico {
    public List<RespostaCliente> executar() {
        List <RespostaCliente> respostaClientes = new ArrayList<>();
        for (int i=1;i<=5;i++){
            RespostaCliente respostaCliente = new RespostaCliente();
            respostaCliente.setIdentificador(UUID.randomUUID().toString());
            respostaClientes.add(respostaCliente);
        }
        return respostaClientes;
    }
}
