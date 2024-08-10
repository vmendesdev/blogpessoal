<h1>🌟 Blog Pessoal 🌟</h1>
    <p>Este projeto foi desenvolvido durante o curso de <strong>Desenvolvimento Web Full Stack Jr</strong> na Ong <strong>Generation Brasil</strong>, com o objetivo de proporcionar <em>experiências reais</em> para o desenvolvimento de projetos. O blog pessoal foi implementado utilizando <strong>Spring Boot</strong> no <strong>Spring Tool Suite (STS)</strong>, seguindo a arquitetura <strong>MVC</strong> (Model-View-Controller) e organizado em pacotes específicos para cada camada.</p>
    
![image](https://github.com/user-attachments/assets/8777359c-f632-4b92-b3cd-1d2d333d4dec)

<h2>🛠 Tecnologias Utilizadas</h2>
    <ul>
        <li>☕ Java</li>
        <li>🚀 Spring Boot</li>
        <li>🔒 Spring Security</li>
        <li>🗄️ Spring Data JPA</li>
        <li>📦 H2 Database</li>
        <li>🐬 MySQL</li>
        <li>🧪 JUnit 5 (testes unitários)</li>
        <li>🧪 Insomnia (testes de API)</li>
        <li>🌍 Render (deploy)</li>
        <li>📜 Swagger (documentação)</li>
    </ul>
    <h2>📂 Estrutura do Projeto</h2>
    <ul>
        <li><strong>model:</strong> Classes de entidade que representam as tabelas do banco de dados.</li>
        <li><strong>repository:</strong> Interfaces que estendem <code>JpaRepository</code> para interação com o banco de dados.</li>
        <li><strong>controller:</strong> Controladores REST que lidam com as requisições HTTP.</li>
        <li><strong>service:</strong> Classes de serviço que implementam a lógica de negócios.</li>
        <li><strong>security:</strong> Configuração de segurança do Spring Security.</li>
        <li><strong>tests:</strong> Testes realizados com JUnit.</li>
    </ul>
    <h2>⚙️ Configuração</h2>
    <h3>Pré-requisitos</h3>
    <ul>
        <li>☕ Java 17</li>
        <li>🛠 Spring Tool Suite (STS) ou IDE de sua preferência</li>
        <li>🐬 MySQL</li>
    </ul>
   <h2>🚀 Executando a Aplicação</h2>
<ol>
    <li>Realize um fork do repositório: <code>Fork</code></li>
    <li>Clone o repositório: <code>git clone https://github.com/seu-usuario/blog-pessoal.git</code></li>
    <li>Navegue até o diretório do projeto: <code>cd blog-pessoal</code></li>
    <li>Importe o projeto no STS (ou IDE de sua preferência) e execute a classe principal <code>BlogPessoalApplication</code>.</li>
</ol>
    <h2>🔗 Endpoints</h2>
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
    <h2>🔒 Segurança</h2>
    <p>O projeto utiliza <strong>Spring Security</strong> para gerenciar autenticação e autorização. As rotas de autenticação (<code>/auth/login</code> e <code>/auth/register</code>) são públicas, enquanto as demais rotas são protegidas e requerem um token <strong>JWT</strong> para acesso.</p><br>
    <h2>🧪 Testes</h2>
    <h3>Testes de API com Insomnia</h3>
    <p>Os testes de API foram realizados utilizando o <strong>Insomnia</strong>. Para importar as configurações, siga os passos abaixo:</p>
    <ol>
        <li>Abra o Insomnia.</li>
        <li>Vá para <code>Application -> Preferences -> Data -> Import Data</code>.</li>
        <li>Selecione o arquivo <code>insomnia/insomnia.json</code> no repositório do projeto.</li>
    </ol>
    <h3>Testes Unitários</h3>
    <p>Os testes unitários foram realizados utilizando <strong>JUnit 5</strong>. Para executar os testes, utilize o comando:</p>
    <pre>
./mvnw test
    </pre>
    <h2>🚀 Deploy</h2>
    <h3>Deploy com Render</h3>
    <p>O projeto foi implantado utilizando a plataforma <strong>Render</strong>. Para mais detalhes, consulte o arquivo <code>deploy.md</code> no repositório.</p><br>
    <h2>📄 Documentação</h2>
    <h3>Documentação Swagger</h3>
    <p>A documentação da API foi gerada utilizando <strong>Swagger</strong>. Para acessá-la, inicie a aplicação e navegue até <a href="http://localhost:8080/swagger-ui.html">http://localhost:8080/swagger-ui.html</a>.</p>
    <h2>🤝 Contribuição</h2>
    <p>Contribuições são bem-vindas! Sinta-se à vontade para abrir <strong>issues</strong> e <strong>pull requests</strong>.</p><br>
    <h2>📝 Licença</h2>
    <p>Este projeto está licenciado sob a licença <strong>MIT</strong>. Veja o arquivo <code>LICENSE</code> para mais detalhes.</p>
