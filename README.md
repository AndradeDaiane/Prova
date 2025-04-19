# Projeto Spring Boot #

## Descrição: ##
Implementar uma aplicação Spring Boot que utiliza MariaDB, Lombok, Web, DevTools e JPA para gerenciar um
relacionamento entre duas entidades distintas, utilizando conceitos de persistência de dados e mapeamento.

## Tecnologias Utilizadas ##
**Spring Boot:** Framework para simplificar o desenvolvimento de aplicações Java.

- **Spring Web:** Para criação de APIs REST.

- **Spring Data JPA:** Para integração com banco de dados utilizando o padrão JPA.

- **Lombok:** Para reduzir a verbosidade do código, gerando automaticamente getters, setters, construtores, etc.

- **Spring DevTools:** Para facilitar o desenvolvimento com recarregamento automático.

- **MariaDB:** Banco de dados relacional utilizado no projeto.


## Estrutura do Projeto ##
O projeto segue a estrutura padrão do Spring Boot:

- **Controllers:** Contém os controladores responsáveis por expor as APIs REST.

- **Models:** Contém as classes que representam as entidades do banco de dados.

- **Repositories:** Contém as interfaces para acesso ao banco de dados.

- **Services:** Contém a lógica de negócio da aplicação.

## Entidades

## Produto
Representa um Produto dentro da organização.

- **Atributos:** id, nome,quantidade, descrição.

## Categoria
Representa uma Categoria dentro do organização do Produto.

- **Atributos:** id, nome, descrição.

## Relacionamento Empregado-Departamento ##
O relacionamento entre as entidades Produto e Categoria é representado na imagem abaixo. Este relacionamento é do tipo muitos-para-um (Many-to-One), onde:

- Um **Categoria** pode ter vários Produtos associados a ele.
  
- Cada **Produto** pertence a um única Categoria.

Essa estrutura reflete uma organização típica, onde os Produtos são vinculados em categoria específicos.

![Pronduto](https://github.com/user-attachments/assets/b881b02e-d036-43af-9465-ebe5c8a64221)

## Configuração do Banco de Dados ##
O projeto utiliza o MariaDB como banco de dados. Para facilitar a configuração e execução do MariaDB, 
recomendamos o uso do XAMPP, que fornece um ambiente integrado com MariaDB, Apache e outras ferramentas úteis.

## Configurando o XAMPP ##
1 .  Baixe e instale o XAMPP a partir do site oficial: https://www.apachefriends.org/pt_br/index.html.

2. Após a instalação, inicie o painel de controle do XAMPP.

3. Inicie o serviço do MariaDB clicando em "Start" ao lado de "MySQL".

4. Configure as credenciais do banco de dados no arquivo application.properties ou application.yaml do projeto:

     spring.datasource.url=jdbc:mariadb://localhost:3306/"seu_banco"

     spring.datasource.username=seu_usuario

     spring.datasource.password=sua_senha

     spring.jpa.hibernate.ddl-auto=update


## Executando o Projeto ##

1. Certifique-se de que o MariaDB está em execução no XAMPP.

2. Abra o projeto no Visual Studio Code.

3. Certifique-se de que a extensão Spring Boot Extension Pack está instalada no VS Code.

4. No painel do Spring Boot Dashboard, localize o projeto e clique no botão de "play" para iniciar a aplicação.

5. Acesse a aplicação no navegador ou via ferramentas como Postman em: http://localhost:8080.


## Endpoints Principais

## Produto 

- **GET** /Produto
  
Lista todos os Produtos.

- **POST** /Produto
  
Cria um novo Produto.

## Categoria

- **GET** /Categoria
  
Lista todas as Categoria.

- **POST** /Categoria

Cria uma nova Categoria.

# Conclusão
Este projeto serve como base para entender os conceitos fundamentais do Spring Boot e como criar uma aplicação CRUD simples com integração a banco de dados. 
Ele pode ser expandido para incluir mais funcionalidades e entidades conforme necessário.
