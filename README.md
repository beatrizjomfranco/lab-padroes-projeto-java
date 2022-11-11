# Desafio de Projeto: Explorando Padrões de Projetos na Prática com Java

Para esse desafio, reproduzi as soluções guiadas pelo especialista Venilton Falvo Jr - Tech Lead na DIO 

Para tanto, optei desenvolver esse desafio na IDE VSCode, por estar mais familiarizada com essa ferramenta de trabalho


## 1.0 Conceito de Singleton
Singleton especifica que apenas uma instância da classe pode existir, e esta será utilizada por toda a aplicação. Dessa forma temos apenas um ponto de acesso central a esta instância da classe (Fonte: https://www.opus-software.com.br/singleton-design-pattern/#).

### 1.1. Onde usar o padrão Singleton?
O melhor exemplo para a utilização do padrão singleton é na conexão com o banco de dados.
Ao invés de termos vários pontos no nosso projeto que geram conexões com o banco de dados, podemos ter apenas uma classe singleton que realiza esta conexão, otimizando a performance da aplicação.

Desta forma, apenas a própria classe poderá instanciar um objeto de conexão, impedindo a duplicidade de um objeto do tipo. Ao realizar a chamada do método getInstance(), o mesmo irá retornar a instância única existente. Caso ela ainda não exista, será criada sem problema algum. (Fonte: https://medium.com/@christianmellolima/padr%C3%A3o-singleton-como-funcionam-onde-vivem-do-que-se-alimentam-6291fb72b22d)

### 1.2 Reprodução das soluções guiadas Singleton em Java Puro atráves do VSCode
Arquivos gerandos:
SingletonLazy
SingletonEager

Os comentários de cada linha de comando encontra-se em cada arquivo, a saber:
SingletonLazy.java
SingletonEager.java

Para Testar o padrão singleton, foi criado a classe Teste.java

## 2.0 Conceito de Strategy
O Strategy é um padrão de projeto comportamental que permite que você defina uma família de algoritmos, coloque-os em classes separadas, e faça os objetos deles intercambiáveis. (Fonte: https://refactoring.guru/pt-br/design-patterns/strategy#:~:text=Aplicabilidade,para%20outro%20durante%20a%20execu%C3%A7%C3%A3o.)

É uma interface comum para todas as subclasses, ou para todos os algoritmos que são suportados. O Contexto usa essa interface para chamar uma das subclasses ConcreteStrategy ou um dos algoritmos definidos.
(Fonte: https://www.devmedia.com.br/estudo-e-aplicacao-do-padrao-de-projeto-strategy/25856)

## 2.1 Reprodução da solução guiada pelo especialista

Para esta prática criou-se uma aplicação que simula o comportamento de um robo, a saber:
Comportamento normal;
Comportamento agressivo;
Comportamento defensivo;

Para testar o padrão estrategy criou-se a classe TesteEstrategica.java


## 3.0 Conceito de Facade

O Padrão de Projeto Facade oculta toda a complexidade de uma ou mais classes através de uma Facade (Fachada). A intenção desse Padrão de Projeto é simplificar uma interface.
É importante ressaltar que o padrão Facade não “encapsula” as interfaces do sistema, o padrão Facade apenas fornece uma interface simplificada para acessar as suas funcionalidades. 
A definição oficial do padrão Facade é: “O Padrão Facade fornece uma interface unificada para um conjunto de interfaces em um subsistema. O Facade define uma interface de nível mais alto que facilita a utilização do subsistema”.
O Padrão Facade é utilizado quando precisamos simplificar e unificar uma interface grande ou um conjunto complexo de interfaces. Uma das vantagens do padrão Facade é desconectar o cliente de um subsistema complexo, conforme pode ser visto no diagrama de classes. Um sistema pode ter diversos Facades simplificando diversos pontos do programa.
Fonte: https://www.devmedia.com.br/padrao-de-projeto-facade-em-java/26476#:~:text=Conclus%C3%A3o,visto%20no%20diagrama%20de%20classes.

## 3.1 Reprodução da Solução guiada pelo especialista

Para esta solução, foram criados os seguintes arquivos:

pacote CEP e Classe CEPapi.java
pacote CRM e CRMService.java
pacote facade e as classes Facade.java e TesteFacade.java


# lab-padroes-projeto-java
# lab-padroes-projeto-java
