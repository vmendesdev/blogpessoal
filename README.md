<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   
</head>

  
  <body>
    <h1>Blog Pessoal</h1>
    <p>Este projeto foi desenvolvido durante o curso de Desenvolvimento Web Full Stack Jr na Ong Generation Brasil, com o intuito de proporcionar vivências reais para o desenvolvimento de projetos. O blog pessoal foi implementado utilizando Spring Boot no Spring Tool Suite (STS), seguindo a arquitetura MVC (Model-View-Controller) e organizado em pacotes específicos para cada camada.</p>

  <h2>Tecnologias Utilizadas</h2>
    <ul>
        <li>Java</li>
        <li>Spring Boot</li>
        <li>Spring Security</li>
        <li>Spring Data JPA</li>
        <li>H2 Database (para ambiente de desenvolvimento)</li>
        <li>MySQL (para ambiente de produção)</li>
        <li>JUnit 5 (para testes unitários)</li>
        <li>Insomnia (para testes de API)</li>
        <li>Render (para deploy)</li>
        <li>Swagger (para documentação)</li>
    </ul>

  <h2>Estrutura do Projeto</h2>
    <ul>
        <li><strong>model:</strong> Contém as classes de entidade que representam as tabelas do banco de dados.</li>
        <li><strong>repository:</strong> Contém as interfaces que estendem JpaRepository para interação com o banco de dados.</li>
        <li><strong>controller:</strong> Contém os controladores REST que lidam com as requisições HTTP.</li>
        <li><strong>service:</strong> Contém as classes de serviço que implementam a lógica de negócios.</li>
        <li><strong>security:</strong> Contém as classes relacionadas à configuração de segurança do Spring Security.</li>
        <li><strong>tests:</strong> Contém os testes realizados utilizando JUnit.</li>
    </ul>

  <h2>Configuração</h2>
    <h3>Pré-requisitos</h3>
    <ul>
        <li>Java 17</li>
        <li>Spring Tool Suite (STS) ou qualquer IDE de sua preferência</li>
        <li>MySQL (para ambiente de produção)</li>
    </ul>

  <h3>Configuração do Banco de Dados</h3>
    <h4>Ambiente de Desenvolvimento</h4>
    <p>Por padrão, o projeto está configurado para utilizar o H2 Database no ambiente de desenvolvimento. Você pode acessar o console do H2 Database em <a href="http://localhost:8080/h2-console">http://localhost:8080/h2-console</a> com as seguintes credenciais:</p>
    <ul>
        <li><strong>JDBC URL:</strong> jdbc:h2:mem:testdb</li>
        <li><strong>User Name:</strong> sa</li>
        <li><strong>Password:</strong> password</li>
    </ul>

  <h4>Ambiente de Produção</h4>
    <p>Para configurar o MySQL no ambiente de produção, atualize o arquivo <code>application.properties</code> com as informações do seu banco de dados:</p>
    <pre>
spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco_de_dados
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    </pre>

  <h2>Executando a Aplicação</h2>
    <ol>
        <li>Clone o repositório: <code>git clone https://github.com/seu-usuario/blog-pessoal.git</code></li>
        <li>Navegue até o diretório do projeto: <code>cd blog-pessoal</code></li>
        <li>Importe o projeto no STS (ou IDE de sua preferência) e execute a classe principal <code>BlogPessoalApplication</code>.</li>
    </ol>

  <h2>Endpoints</h2>
    <h3>Autenticação</h3>
    <ul>
        <li>POST /auth/login: Autenticação de usuário.</li>
        <li>POST /auth/register: Registro de novo usuário.</li>
    </ul>

  <h3>Posts</h3>
    <ul>
        <li>GET /posts: Lista todos os posts.</li>
        <li>GET /posts/{id}: Detalha um post específico.</li>
        <li>POST /posts: Cria um novo post.</li>
        <li>PUT /posts/{id}: Atualiza um post existente.</li>
        <li>DELETE /posts/{id}: Deleta um post.</li>
    </ul>

  <h2>Segurança</h2>
    <p>O projeto utiliza Spring Security para gerenciar a autenticação e autorização. As rotas de autenticação (<code>/auth/login</code> e <code>/auth/register</code>) são públicas, enquanto as demais rotas são protegidas e requerem um token JWT para acesso.</p>

<h2>Testes</h2>
    <h3>Testes de API com Insomnia</h3>
    <p>Os testes de API foram realizados utilizando o Insomnia. Para importar as configurações, siga os passos abaixo:</p>
    <ol>
        <li>Abra o Insomnia.</li>
        <li>Vá para <code>Application -> Preferences -> Data -> Import Data</code>.</li>
        <li>Selecione o arquivo <code>insomnia/insomnia.json</code> localizado no repositório do projeto.</li>
    </ol>

   <h3>Testes Unitários</h3>
    <p>Os testes unitários foram realizados utilizando JUnit 5. Para executar os testes, utilize o seguinte comando:</p>
    <pre>
./mvnw test
    </pre>

  <h2>Deploy</h2>
    <h3>Deploy com Render</h3>
    <p>O projeto foi implantado utilizando a plataforma Render. Para mais detalhes sobre o processo de deploy, acesse o arquivo <code>deploy.md</code> no repositório.</p>

   <h2>Documentação</h2>
    <h3>Documentação Swagger</h3>
    <p>A documentação da API foi gerada utilizando Swagger. Para acessar a documentação, inicie a aplicação e navegue até <a href="http://localhost:8080/swagger-ui.html">http://localhost:8080/swagger-ui.html</a>.</p>

   <h2>Contribuição</h2>
    <p>Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.</p>

  <h2>Licença</h2>
    <p>Este projeto está licenciado sob a licença MIT. Veja o arquivo <code>LICENSE</code> para mais detalhes.</p>
</body>
</html>
