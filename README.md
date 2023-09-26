# projeto_teste_unitarios

:dart:Com relação ao curso realizado e ao projeto feito no decorrer tem como objetivo o entendimento do que são testes automatizados e como aplicar eles.

---
## Oque é um teste automatizado ?

:information_source:Um teste automatizado de forma resumida é a validação das funcionalidades de uma classe de forma automática com o objetivo de verificar se os processos estão sendo realizados de forma correta. Para nos auxiliar na realização desses testes utilizaremos o JUnit nesse projeto, para facilitar a criação deles.

---

## TDD

**TDD →** Test Driven Development onde primeiro realizamos a criação dos testes para depois realizar a implementação. A qual podemos tem um tercei etapa que é a da refatoração, ou seja, melhorar um código existente. Caso você precisa ajustar os códigos criados.

Estrutura do TDD → Testes → Implantação → Refatoração

## Vantagens do TDD

**1.** O código já sai testado antes mesmo de você realizar a implementação.


**2.** Além disso como começamos com o testes já evitamos “testes viciados”, ou seja, criar um testes especifico para uma implementação em especifico e não para o comportamento esperado. Assim evitamos esses “Testes Viciados” pois começamos por eles e não temos nenhuma base da implementação para nos influenciar.


**3.** A Refatoração faz parte do fluxo do TDD, como é parte desse ciclo isso nos influencia a melhorar nosso código, deixar mais legível e de fácil compreensão.


**4.** Ajuda a manter o foco, pois como você foca em cenários para criar os testes, conseguimos focar de cenário em cenário , não pendendo o foco com outras possibilidades existentes dentro da funcionalidade.

## Quando Usar o TDD?

Quando você for aplicar um código complexo, com regras especificas como por exemplo validações e processos complexos e interligados, vale a pena utilizar o TDD para ajudar na realização dessa tarefa.

## Devemos testar todas as classes/métodos?

Não devemos testar todas as classes e métodos. O foco dos teste devem estar voltados para locais que contenham regras de negócios e que tem altas chances de alterações, pois assim é valido os testes, para uma maior segurança de validação referente as possíveis mudanças realizadas.
