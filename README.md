Introdução sobre a construção dessa api
-
Pacotes controller foram feitos para pôr nossas requisições (acessos) ao http(servidor) no browser
o controller é a classe Java com os métodos que tratam essas requisições

Pacotes model são os modelos de cada topico feito durante a aplicação

O controller passa os dados para o model, que por sua vez executa todas as regras de negócio, como cálculos, validações e acesso ao banco de dados.
Os método dentro do controller atende a requisição para /

@Controller. Essa anotação fará com que o Spring reconheça a classe como um controlador.
@RequestMapping, configura qual o path inicial para todas as ações do nosso controlador.