/****************** Padrão de Projeto Singleton********************
O Singleton é um padrão de projeto criacional, 
que garante que apenas um objeto desse tipo exista e 
forneça um único ponto de acesso a ele para qualquer outro código.
********************************************************************/

/*******************************************************************
Step 1. No VSCode, criamos um projeto java 
com o nome lab-padrões-projeto-java
********************************************************************/

/*******************************************************************
Step 2: Em JAVA PROJECTS --> lab-padroes-projeto-java --> src -->
criamos um pacote java (New Java Package) com o nome de 
one.digitalinnovation.gof (gang of four = gangue dos quatros)
********************************************************************/

package one.digitalinnovation.gof.singleton;

/*******************************************************************
Step 3: Em one.digitalinnovation.gof criamos uma classe chamada 
de SingletonLazy (public class SingletonLazy) que será 
nosso padrão de projeto Singleton
********************************************************************/

public class SingletonLazy 
{
  
/**********************************************************************
Step 4: Com isso, criamos uma instancia do próprio SingletonLazy
com o private static SingletonLazy instancia
**********************************************************************/
        
        private static SingletonLazy instancia;
        
/****************************************************************
Step 5: Para garantir que ninguém externamente irá instanciar 
o SingletonLazy, criamos um construtor privado (private SingletonLazy())
para restringir a instanciação da classe por outras classes.
******************************************************************/
        private SingletonLazy() 
        {

/* super() em Java é uma variável de referência 
usada para invocar construtores de classe pai.
*/
                super();
        }

/*******************************************************************
Step 6: Como a instancia será exposta para quem a está chamando
criamos um método publico estático com source action --> generate getter
************************************************************************/
        public static SingletonLazy getInstancia() 
        {
//usamos o if para fazer com que a instancia seja instaciado (SingletonLazy) criamos um if        
                if(instancia == null) 
                {
                        instancia = new SingletonLazy();
                }
//caso contrário retorna instancia
                return instancia;
        }
      
}
