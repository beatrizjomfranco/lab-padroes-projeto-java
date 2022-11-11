package one.digitalinnovation.gof.singleton;

public class SingletonEager 
{
//Criamos uma instancia do proprio SingletonEager 
//Logo após a variável estática é definida, singletonEager já atribui a instancia

private static SingletonEager instancia = new SingletonEager();
        private SingletonEager() 
                {
                super();
                }
//Não é necessario o uso da lógica condicional if,
//uma vez que ele já instancia, para que na hora de retornar
//já esteja tudo certo
                public static SingletonEager getInstancia() 
                {
                return instancia;
                }
           
}
