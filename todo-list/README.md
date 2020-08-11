# Spring boot. Быстрый старт веб-разработки на Java
Вольная реализация todo-сайта в рамках обучающего [вебинара от GeekBrains](https://www.youtube.com/watch?v=GhTM039JAVw)

[git-репозиторий с реализацией автора](https://github.com/usharik/geek-todolist/tree/webinar-1)

Стек инструментов использованный при разработке:
* Git
* IntelliJ IDEA
* Maven
* Java Stream API
* HTML
* CSS
* PostgreSQL
* Spring Boot
* Spring Sequrity
* JPA(Hibernate)

##### Локальный запуск с помощью IDE:
1) Создаем и запускаем локальную БД Postgre SQL(или через Docker)
2) Запускаем точку входа через IDE, сайт по дефолту находится на http://localhost:8082

_При необходимости конфигурацию прописываем в application.properties_ 
_Пример: 
server.port=8082
server.servlet.context-path=/
spring.datasource.url=${JDBC_DATABASE_URL:jdbc:postgresql://localhost:5432/<YOUR_DB_NAME>}
spring.datasource.username=${JDBC_DATABASE_USERNAME:postgres} 
spring.datasource.password=${JDBC_DATABASE_PASSWORD:postgres}_


### Сайт:
* Страница логина

![loginImg](C:\Users\deds\IdeaProjects\todo-list\todo-list\img\1.PNG)
* Страница регистрации

![RegisterImg](C:\Users\deds\IdeaProjects\todo-list\todo-list\img\2.PNG)
* Таблица пользователей

![UserListImg](C:\Users\deds\IdeaProjects\todo-list\todo-list\img\3.PNG)




