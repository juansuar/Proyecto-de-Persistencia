# Proyecto-de-Persistencia
# Task Manager – Persistencia (JPA)

Este módulo gestiona la persistencia de datos mediante entidades JPA y repositorios conectados a una base de datos MariaDB.

## 🗃️ Entidades

- 👤 `User` – Representa al usuario del sistema.
- ✅ `Task` – Tareas asignadas a usuarios.
- 🕓 `TaskHistory` – Historial de acciones sobre las tareas.

## 🔌 Tecnologías utilizadas

- Java 22
- Spring Boot
- Spring Data JPA
- Hibernate
- MariaDB
- Maven

## ⚙️ Configuración recomendada en application.properties 

```properties
spring.datasource.url=jdbc:mariadb://localhost:3306/task_manager_db
spring.datasource.username=root
spring.datasource.password=

spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MariaDBDialect





