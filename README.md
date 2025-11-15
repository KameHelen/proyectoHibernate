🚀 Objetivos del proyecto

Este proyecto permite gestionar un pequeño refugio de animales con funcionalidades completas:

🐶 Gestión de animales

Registrar nuevos animales desde consola

Buscar animales por especie

Actualizar el estado del animal

Listar todos los animales guardados

Cada animal incluye:

Nombre

Especie

Descripción

Estado (ej: recién abandonado)

Tipo de alimento (enum)

Tipo de animal (enum)

Clasificación automática mediante ManyToMany

🧱 Modelo de datos (resumen sencillo)

El proyecto utiliza Hibernate + anotaciones para crear las tablas automáticamente.

Animal  <-- ManyToMany -->  Persona
Animal  <-- ManyToMany -->  Clasificacion


Hibernate genera automáticamente las tablas intermedias:

persona_animal

animal_clasificacion

🐾 Entidades principales
🐶 Animal

Incluye datos generales y se relaciona con:

Persona (dueños)

Clasificación (mamífero, reptil, pez…)

🧑 Persona

DNI (PK)

Nombre

Email
Una persona puede estar asociada a varios animales.

🏷 Clasificación

Incluye el TipoAnimal y su nombre descriptivo.
Se genera automáticamente al registrar un animal si no existe.

🌈 Enums utilizados
🍖 TipoAlimento
CARNIVORO
HERBIVORO
OMNIVORO

🐾 TipoAnimal
MAMIFERO
REPTIL
PEZ
AVE
ANFIBIO


Ambos se guardan en base de datos en formato texto gracias a:

@Enumerated(EnumType.STRING)

🧩 Estructura del proyecto
src/
 └── main/java/org/example/
      ├── entities/
      │   ├── Animal.java
      │   ├── Persona.java
      │   ├── Clasificacion.java
      │   ├── TipoAlimento.java
      │   └── TipoAnimal.java
      │
      ├── DAO/
      │   ├── AnimalDAO.java
      │   ├── AnimalDAOImpl.java
      │   ├── ClasificacionDAO.java
      │   └── ClasificacionDAOImpl.java
      │
      ├── Util/
      │   └── HibernateUtil.java
      │
      └── Main.java

🛠 Tecnologías usadas

🧡 Java 17

🐉 Hibernate ORM

🐬 MySQL

📦 Maven

📊 Patrón DAO

🧪 Cómo ejecutar el proyecto
1️⃣ Crear la base de datos

En MySQL ejecuta:

CREATE DATABASE IF NOT EXISTS refugio_animales;
USE refugio_animales;

2️⃣ Configurar hibernate.cfg.xml

Asegurar datos de conexión:

<property name="connection.url">jdbc:mysql://localhost:3306/refugio_animales</property>
<property name="connection.username">root</property>
<property name="hbm2ddl.auto">update</property>

3️⃣ Ejecutar desde IntelliJ

Simplemente ejecuta:

Main.java


Verás un menú interactivo para registrar animales y hacer consultas.

📝 Cosas aprendidas

Con este proyecto aprendí a:

Configurar Hibernate desde cero

Trabajar con enums dentro de entidades

Crear relaciones ManyToMany y entender las tablas intermedias

Hacer CRUD usando DAOs

Enlazar Java ↔ MySQL sin escribir SQL manualmente

Diseñar un pequeño menú interactivo en consola

💬 Notas finales

Este proyecto reproduce un entorno sencillo de gestión como los que se usan en refugios reales.
Aunque es de consola, la estructura está pensada para poder ampliar el proyecto a una API o interfaz gráfica más adelante.
