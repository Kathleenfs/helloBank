


<div align = "center">
  <img width="600" alt="Projetotudo de bom" src="https://user-images.githubusercontent.com/90014122/189726261-64d39d6e-4eb1-4c40-b493-fca23b9acc66.png">
  <br>
</div>


<h1>Objetivo</h1>
<p>Criar uma API utilizando a linguagem Java para Cadastrar clientes, contas e exibir histórico de transações.
O sistema deve permitir cadastro de novos clientes, incluindo dados pessoais e dados para contato. O cliente deve ser atrelado a uma conta bancária e registrar histórico de transações entre as contas.</p>
<h2>ENTREGAS MÍNIMAS</h2>

<h3>Metodologias Ágeis:</h3>
<ul>
<li>Kanban com todas as tarefas organizadas e responsáveis definidos.
</li>
<h3>Back-end:</h3>
<li>Listagem de clientes</li>
<li>Atualização de clientes</li>
<li>Deletar clientes</li>
<li>Histórico de transações entre contas</li>
<li>Cadastro de clientes</li>
</ul>
<h3>Banco de Dados:</h3>
<ul>
<li>Tabelas bem estruturadas e populadas com valores para testes.</li>
<li>O Banco deve ser entregue em script SQL junto ao repositório.
</li>
 </ul>
<h3>Gerais:</h3>
<ul>
<li>O código deve ser entregue em um repositório no Github.</li>
<li>A API deve conter todos os Métodos GET, PUT, POST, DELETE</li>
<li>Liste os endpoints no README.md</li>
<li>Testes automatizados, podem ser testes unitários ou testes de integração.</li>
 </ul>
<h3>CRITÉRIOS DE AVALIAÇÃO</h3>
 
<p>Documentação da Aplicação</p>

<h3>Descrição ENDPOINTS</h3>

<div>
  
## Cliente

#### Retornar todos os clientes

```http
  GET /cliente
```
#### Retornar cliente pelo id

```http
  GET /cliente/{idCliente}
```
  | Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `idCliente`      | `int` | **Obrigatório passar no rota o id do cliente que deseja buscar**. |
  
#### Cadastrar cliente

```http
  POST /clientes
```

#### Atualizar cliente
  
```http
  PUT /clientes/${idCliente}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `int` | **Obrigatório passar no rota o id do cliente que precisa atualizar**. |
  
#### Deletar cliente

```http
  DELETE /cliente/${idCliente}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `idCliente`      | `int` | **Obrigatório passar na rota o id do cliente que precisa deletar**.  |

## Conta

#### Retornar todas as contas

```http
  GET /contas
```
  
#### Retornar conta pelo id

```http
  GET /contas/{idConta}
```
  | Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `idConta`      | `int` | **Obrigatório passar no rota o id da conta que deseja buscar**. |
  
#### Cadastrar conta

```http
  POST /contas
```

#### Atualizar conta
  
```http
  PUT /conta
```

#### Depositar

```http
  PUT depositar/{valor}/{idConta}
```
| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `valor`      | `Double` | **Obrigatório passar na rota o valor referente ao depósito**.  |
| `id`      | `int` | **Obrigatório passar na rota o id da conta onde deseja realizar o depósito**.  |
  
#### Sacar

```http
  PUT sacar/{valor}/{idConta}
```
| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `valor`      | `Double` | **Obrigatório passar na rota o valor que deseja sacar**.  |
| `id`      | `int` | **Obrigatório passar na rota o id da conta de onde será realizado o saque**.  |
  
#### Deletar conta

```http
  DELETE /conta/{idConta}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `idConta`      | `int` | **Obrigatório passar na rota o id da conta que precisa deletar**.  |

## Transação

#### Retornar todas as transações

```http
  GET /transacao
```
  
#### Retornar transação pelo id

```http
  GET /transacao/{idTransacao}
```
  
| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `idTransacao`      | `int` | **Obrigatório passar no rota o id da transação que deseja buscar**. |
  
#### Cadastrar transação

```http
  POST /transacao
```
  
#### Deletar transação

```http
  DELETE /transacao/{idTransacao}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `idTransacao`      | `int` | **Obrigatório passar na rota o id da transação que precisa deletar**.  |


</div>

 [Swagger](http://localhost:8080/swagger-ui/index.html)
 
<h3>Tecnologias utilizadas</h3>


 
<div style="display: inline_block"><br>
  <img align="center" alt="kath-Java" height="50" width="70" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg">
  <img align="center" alt="kath-Java" height="50" width="70"  src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original-wordmark.svg" />
  <img align="center" alt="kath-Java" height="50" width="90" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original-wordmark.svg" />
   <img align="center" alt="kath-CSS" height="90" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/docker/docker-original-wordmark.svg" />
 </div>
