# Teste To Do List API
## Descrição:
Criação de uma Api To Do List, solicitada pela Epiousion para teste de estágio
## Requisitos:
### Própria Maquina:
. <a href= "https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html">Java 17</a>

. <a href= "https://downloads.mysql.com/archives/installer/">MySql 3.0.39</a>

Para executar a aplicação em seu próprio computador precisa ser criado um banco de dados "todolist_db" para persistência dos dados.

Depois de configurado o banco de dados, execute o arquivo <a href = "toDoList.jar">toDoList.jar</a> usando o comando "java -jar toDoList.jar" na linha de comando do seu OS.
### Docker:
. <a href= "https://www.docker.com/products/docker-desktop/">Docker</a>

Para executar a api pelo docker utilize o arquivo <a href= "docker-compose.yml">docker-compose.yml</a> no repositório, para executa-lo use o camando "docker-compose up" na linha de comando do seu OS.
#### Observação:
**Antes de iniciar a aplicação pelo docker, deve-se verificar se as portas 8080 e 3308 não estão sendo usadas por outras aplicações.**

## Documentação:
A documentação pode ser acessada após a execução da api em <a href = "http://localhost:8080/swagger-ui.html"> http://localhost:8080/swagger-ui.html </a>. Também pode ser encontradas no log da api.

## Funcionalidade:
A aplicação permite cadastrar tarefas com sua descrição, recuperar as tarefas já cadastradas, atualizar os status das tarefas de "a fazer" para "feito" e vice-versa, e por fim permite uma tarefa selecionada.
