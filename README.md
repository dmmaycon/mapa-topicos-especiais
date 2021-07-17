Este MAPA pretende que você realize um processo de refatoração, não sobre um modelo mas sobre um código fonte (apresentado ao final deste enunciado). Suponha que você trabalha como um programador(s) em uma empresa. Para realizar esta atividade de refatoração, você deve realizar as seguintes etapas:

Etapa I) Note que o código não está identado e não possui um padrão para nomes de variáveis, classes, entre outros. Isto dificulta a compreensão pois não houve um cuidado de padronização. Portanto, deve procurar padronizar o código para, assim, facilitar a sua compreensão.

Etapa II) Faça uma refatoração cuidadosa sobre todo o código fonte, visando que o código fonte final fique mais simples e eficiente, evitando código duplicado. O objetivo deste código é criar um objeto do tipo Data, validando os valores dia, mês e ano inseridos.

Etapa III)  Após, você deve analisar o código e fazer as alterações necessárias para inserir um método que apresente o dia anterior (no formato DD/MM/ANO) a partir da data inserida. Atenção que você deve levar em conta o primeiro dia do mês ou o último dia do ano. Tenha atenção que  alguns meses terminam no dia 30, outros no dia 31 e que o mês de fevereiro termina no dia 28 (se for ano bissexto) ou no dia 29 (se não for ano bissexto).

Etapa IV) Realize a entrega deste mapa em um arquivo no formato .pdf, salientando as alterações feitas no código fonte, em cada uma das etapas. Não deve enviar código executável !
 
Respostas: 
O primeiro passo foi criar um projeto na IDE (Eclipse) onde foi criado uma Classe Data e então foi copiado o código fornecido no mapa, criei um repositório público no github para logar todas as alterações criadas ao longo do desenvolvimento utilizando tags, a primeira versão foi a 0.0.1 e pode ser acompanhado pelo professor(a) neste link: https://github.com/dmmaycon/mapa-topicos-especiais/tree/v0.0.1


A próxima atividade foi fazer as correções de sintaxe que havia no código e fazer toda a indentação seguindo os padrões da linguagem Java para facilitar a visualização, para facilitar o processo de refatoração eu criei um pacote para testar a classe utilizando o JUnit para fazer os testes unitários automatizados, após as primeiras alterações e foi executado a primeira bateria de teste, com quatro testes: 
Teste de dia invalido
Teste de mês invalido
Teste de ano invalido
Teste com data válida
Apenas o teste com ano invalido passou, o código fonte completo pode ser visto no repositório do github, na tag: v0.0.2
Data.java https://github.com/dmmaycon/mapa-topicos-especiais/blob/v0.0.2/src/dmmaycon/github/com/topicos/especiais/mapa/Data.java
DataTest.java https://github.com/dmmaycon/mapa-topicos-especiais/blob/v0.0.2/src/dmmaycon/github/com/topicos/especiais/mapa/tests/DataTest.java

Na terceira modificação no código, foi criado um método private chamado valid e um método acessor chamado “isValid” para retornar um boolean, assim quando uma data válida for criada, dentro do seu método construtor, vai setar o atributo valid para true, facilitando as tratativas. 


Depois dessas modificações, os quatro testes iniciais foram executados e todos eles passaram, ou seja, apesar do código não está seguindo as melhores práticas ele já está cumprindo com a proposta inicial. 
Os códigos em detalhes desta modificações estão neste link: https://github.com/dmmaycon/mapa-topicos-especiais/tree/v0.0.3





Agora o objetivo é implementar a funcionalidade solicitada na etapa 3 deste mapa, que é ter um método que seja capaz de retornar um dia anterior respeitando todas as regras válidas. Para isso a solução de refatoração do código encontrado para melhorar o mesmo e ao mesmo tempo cumprir com o objetivo de retornar o dia anterior foi de criar métodos privados responsáveis por validar partes da data e assim aproveitar os mesmos para o método original de “validarData” e também para o novo método que retorna o dia anterior. Agora os novos métodos além de serem privados, também assumem o princípio de responsabilidade única, mantendo o código mais coeso e simples.
Para validar o funcionamento foram criados testes responsáveis por chamar o método que retorna uma data com o dia anterior, validando os meses que poderiam dar problemas. 
E para facilitar a escrita da data no formato solicitado foi criado um método que faz a sobrescrita do toString para imprimir a data da maneira solicitada.
 O código fonte final pode ser visto no repositório do github na tag v0.0.4
https://github.com/dmmaycon/mapa-topicos-especiais/tree/v0.0.4
E o histórico completo do projeto do mapa pode ser visto no seguinte repositório: 
https://github.com/dmmaycon/mapa-topicos-especiais
