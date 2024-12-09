# Gestión de Biblioteca Oliveria

**Descripción**: Aplicación para la gestión de la Biblioteca Oliveria de Gijón.

## Índice

- [Descripción](#descripción)
- [Características](#características)
- [Instalación](#instalación)

## Descripción

Esta aplicación permite gestionar los diferentes procesos de la biblioteca, como por ejemplo la reserva de ejemplares, la creación de eventos culturales o la creación de nuevos socios. Se han utilizado JAVA y MySQL.

## Características

- **Gestión de libros**: Agrega, elimina y actualiza los libros de la biblioteca.
- **Gestión de socios**: Registra, actualiza y elimina socios.
- **Persistencia en base de datos**: Guarda y carga todos los datos en una base de datos para facilitar la manipulación y el almacenamiento estructurado.
- **Interfaz amigable**: Aplicación gráfica que permite a los usuarios interactuar fácilmente con las funciones de gestión.

## Instalación

Asegúrate de tener [Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) instalado. Luego, clona el repositorio y compila el proyecto.

```bash
# Clona este repositorio
git clone https://github.com/fveracoding/bibliotecamvc.git

# Entra en el directorio del proyecto
cd bibliotecamvc

# Compila el proyecto
javac -d bin -sourcepath src src/LoginVista.java

# Ejecuta la aplicación
java -cp bin LoginVista
