#🚀 Sobre o Projeto
O ForumHub é uma solução de backend que permite aos utilizadores interagir através da criação, visualização, atualização e exclusão de tópicos. A aplicação utiliza autenticação via JWT (JSON Web Token) para garantir que apenas utilizadores autorizados possam realizar operações de escrita e leitura na base de dados.

##🛠️ Tecnologias Utilizadas
Java 21: Versão mais recente do Java com suporte a longo prazo.

Spring Boot 3 (v4.0.3): Framework principal para a construção da API.

Spring Data JPA: Para persistência de dados e integração com base de dados PostgreSQL.

Spring Security: Camada de segurança para autenticação e autorização.

JWT (Auth0): Geração e validação de tokens de acesso.

PostgreSQL: Base de dados relacional para armazenamento persistente.

Lombok: Redução de código boilerplate (Getters, Setters, etc.).

Jakarta Validation: Validação rigorosa dos dados de entrada.

##📋 Funcionalidades Principais
🔐 Autenticação e Segurança
Login: Autenticação de utilizadores com login e senha encriptada via BCrypt.

Proteção de Endpoints: Todos os endpoints de tópicos exigem um token JWT válido enviado no header Authorization.

Sessão Stateless: A API não mantém estado no servidor, utilizando o token para identificar o utilizador em cada requisição.

📝 Gestão de Tópicos (/topicos)
Cadastrar: Criação de novos tópicos com título, mensagem, autor e curso.

Listar: Consulta paginada e ordenada por título de todos os tópicos ativos no sistema.

Detalhar: Visualização detalhada de um tópico específico através do seu ID.

Atualizar: Modificação de informações de um tópico existente.

Excluir (Soft Delete): Desativação lógica de um tópico sem removê-lo fisicamente da base de dados.

##⚙️ Configuração do Ambiente
Variáveis de Ambiente Necessárias
Para rodar a aplicação, configure as seguintes variáveis no seu application.properties ou no ambiente do seu sistema:

DB_HOST: Endereço da base de dados PostgreSQL.

DB_USER: Utilizador da base de dados.

DB_PASSWORD: Senha da base de dados.

JWT_SECRET: Chave secreta para assinatura dos tokens (valor padrão: 12345678).

Como executar
Certifique-se de ter o Java 21 e o Maven instalados.

Clone o repositório.

Execute o comando:

Bash
./mvnw spring-boot:run
A API estará disponível em http://localhost:8080.

##📖 Exemplo de Requisição (Postman)
1. Login para obter o token:

Método: POST

URL: http://localhost:8080/login

Body (JSON):

JSON
{
  "login": "admin@forumhub.com",
  "senha": "123456"
}
2. Criar um tópico (Requer Token):

Método: POST

URL: http://localhost:8080/topicos

Header: Authorization: Bearer <seu_token_aqui>

Body (JSON):

JSON
{
  "titulo": "Dúvida sobre Spring Security",
  "mensagem": "Como configurar o filtro JWT?",
  "estado": "ABERTO",
  "autor": "Thalles",
  "curso": "Spring Boot"
}
##🏗️ Estrutura de Pacotes
controller: Endpoints da API.

domain: Entidades JPA e regras de negócio.

infra: Configurações de segurança, filtros e tratamento de erros.

Desenvolvido como parte do desafio ForumHub da Alura.
