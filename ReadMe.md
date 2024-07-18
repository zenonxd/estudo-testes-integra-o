# Estudo Testes de Unidade

## Referência: Testes automatizados na prática com Spring Boot
[Compre aqui](https://www.udemy.com/course/testes-automatizados-na-pratica-com-spring-boot/)
<hr>

## Dica para leitura:
Durante o estudo, os códigos mudam pois geralmente é ensinado algo básico onde depois iremos implementar o que de fato
é utilizado no mercado de trabalho. Tome cuidado ao considerar códigos do início do estudo, se atente ao código final.

## Tópicos

- [Exercícios sobre Testes de Integração](#exercícios)
  - [Exercício 1 - ]()
  - [Exercício 2 - ]()
  - [Exercício 3 - ]()
  - [Exercício 4 - ]()
- [Resumo Sobre o Estudo](#resumo)
<hr>

![img.png](img.png)


Testar bordas da aplicação, quando excedemos a sua fronteira. Isso vai ocorrer quando há alguma integração com banco de dado, camada web...

Existem dois tipos de teste te ingração e eles dependem do escopo onde trabalham:

Restrito - Quando o teste trabalha somente com uma integração, uma camada (repositorio e dado por exemplo).

Amplos - Testes que cruzam outras camadas (teste de componente, por exemplo).

E para que seja possível conversar com essas camadas? Usamos dublês de teste. Se a aplicação usar um banco Oracle, por exemplo, não é necessário levantar um banco desse toda vez para testar a aplicação. Além de ser pesado, seria muito caro.

A ideia então, é criar um duble de teste! Duplar esse banco, um quebra galho. Tipo um banco H2.

<hr>






<hr>

## Fim
<<<<<<< HEAD
=======
E aqui finalizemos os cenários de erro a nivel de serviço. Mas... não temos a garantia ainda de que o sistema está
tratando dados invalidos. De fato isso é verdade, a gente precisa testar as camadas que fazem essa validação,
Controller e Repositories.

Mas essas camadas possuem integração (controller com web) e (repositorie com banco de dados). Por isso agora,
utilizaremos [Testes de Integração]().
>>>>>>> parent of dbf366a (Update ReadMe.md)
