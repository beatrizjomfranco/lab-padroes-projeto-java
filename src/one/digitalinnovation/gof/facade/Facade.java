//1. Criação do pacote facade
// objetivo é criar uma interface mais simples para a 
// consulta das informações do cliente

package one.digitalinnovation.gof.facade;

//2. importar as classes CRM e CEPapi
import CRM.CRMService;
import CEP.CEPapi;

//3. criação de uma classe Facade onde poderá ser realizado
//operações dentro dela
public class Facade 
{
        //4. representa a interface de uso (interface mais simples)
        public void migrarCliente(String nome, String cep)
        {
                String cidade = CEPapi.getInstancia().recuperarCidade(cep);
                String estado = CEPapi.getInstancia().recuperarEstado(cep);

                CRMService.gravarCliente(nome, cep, cidade, estado);
        }
}
