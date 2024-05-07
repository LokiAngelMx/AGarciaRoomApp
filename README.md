# Heroes Room App

## Descripción
Heroes Room App es una aplicación Android desarrollada utilizando Kotlin. Esta aplicación sirve como un ejemplo práctico de cómo implementar Room para manejar operaciones de base de datos y Dagger Hilt para la inyección de dependencias. La arquitectura del proyecto está basada en el patrón de arquitectura limpia, separando la lógica en capas de dominio, presentación y datos.

## Características
- Lista y almacena héroes en una base de datos local utilizando Room.
- Utiliza Dagger Hilt para gestionar las dependencias.
- Implementa una arquitectura limpia.

## Tecnologías Utilizadas
- Kotlin
- Room Database
- Dagger Hilt
- Android SDK

## Estructura del Proyecto
- `domain/`: Contiene las entidades y los casos de uso.
- `data/`: Incluye los DAOs, la base de datos de Room, y el repositorio.
- `presentation/`: Maneja los ViewModel y la UI.
