# 🐾✨ Refugio de Animales – Proyecto Hibernate

Bienvenido/a a mi proyecto del **Refugio de Animales**, desarrollado para la asignatura de *Desarrollo de Interfaces* utilizando **Java**, **Hibernate** y **MySQL**.  
El objetivo es aprender a modelar entidades, relaciones, enums y realizar CRUD desde una aplicación de consola.

---

## 🚀 Objetivos del proyecto

Este proyecto permite gestionar un pequeño refugio de animales con funcionalidades completas:

### 🐶 Gestión de animales
- Registrar nuevos animales desde consola  
- Buscar animales por especie  
- Actualizar el estado del animal  
- Listar todos los animales guardados  

Cada animal incluye:
- Nombre  
- Especie  
- Descripción  
- Estado (ej: recién abandonado)  
- Tipo de alimento (**enum**)  
- Tipo de animal (**enum**)  
- Clasificación automática mediante ManyToMany  

---

## 🧱 Modelo de datos

El proyecto utiliza **Hibernate** para mapear las entidades y generar las tablas automáticamente.

Relaciones principales:

