


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

<h2>Descrição ENDPOINTS</h2>
<div>
<p>O programa é divide entre os endpoints das 3 entidades, cliente, conta e ...
<p>Cliente, os campos para criação de um novo cliente são:</p>
<p>nome, cpf, email, telefonde</p>

#### Retornar todos os clientes

```http
  GET /client
```
#### Cadastrar cliente

```http
  POST /clients
```

#### Atualizar cliente
  
```http
  PUT /clients/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `int` | **Obrigatório passar no rota o id do cliente que precisa atualizar**. |
  
#### Deletar cliente

```http
  DELETE /clients/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `int` | **Obrigatório passar na rota o id do cliente que precisa deletar**.  |

<p>conta</p>
<p>id_cliente</p>
 <ul>
 <li>POST: http://localhost:8080/</li>
 <li>GET: http://localhost:8080/</li>
 </ul>
 
<p>, os campos para criação de um novo  são:</p>
<p>id_, nome, desc_produto, preco_produto, generico_produto</p>
<ul>
<li>POST: http://localhost:8080/p</li>
<li>GET: http://localhost:8080/p</li>
</ul>
</div>
<h3>Tecnologias utilizadas</h3>
<div style="display: inline_block"><br>
  <img align="center" alt="kath-Java" height="50" width="70" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg">
  <img align="center" alt="kath-Java" height="50" width="70"  src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original-wordmark.svg" />
  <img align="center" alt="kath-Java" height="50" width="90" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original-wordmark.svg" />
 </div>
