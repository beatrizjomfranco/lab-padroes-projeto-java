package CEP;
public class CEPapi 
{
//criar um singleton chamado CEPapi que instancia ele mesmo
private static CEPapi instancia = new CEPapi();
        private CEPapi()
        {
                super();
        }
        public static CEPapi getInstancia() 
        {
                return instancia;
        }
   public String recuperarCidade(String cep)
        {
                return "Campinas";
        }
        public String recuperarEstado(String cep)
        {
                return "São Paulo";
        }
        
}
