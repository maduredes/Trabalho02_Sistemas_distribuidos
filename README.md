Trabalho 2 – Parte 1
Implemente um sistema distribuído utilizando a arquitetura de microsserviços. O sistema distribuído deve
ser construído com os seguintes microsserviços:
• Microsserviço de “funcionários”: deve permitir a manipulação de um cadastro de funcionário. O
serviço devem manter um banco de dados com “código”, “nome” e “cargo do funcionario”. O
microsserviço deve expor APIs para realizar a manutenção do cadastro de funcionários.
• Microsserviço de “folha de pagamento” deve:
o implementar API para calcualr folha de pagamento para um determinado funcionário
o Registrar o cálculo de folha de pagamento no banco de dados.
o Consultar API para retornar o valor da folha de pagamento, tomando como base o código do
funcionário e a competência (data da folha de pagamento).
Trabalho em dupla