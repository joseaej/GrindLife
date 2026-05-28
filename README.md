# 👾 GrindLife - Gamified Habit RPG

**GrindLife** es una aplicación completa (Fullstack) diseñada para transformar la gestión de hábitos diarios en un videojuego de rol (RPG) clásico. El objetivo del proyecto es demostrar el dominio en el desarrollo de microservicios robustos en el backend y la creación de interfaces móviles fluidas y atractivas en el frontend.

Este proyecto ha sido desarrollado con la premisa de **escribir código 100% propio**, priorizando las buenas prácticas de arquitectura, patrones de diseño y la resolución de problemas lógicos sin asistencia automatizada.

---

## 🚀 Arquitectura General

El proyecto está organizado como un **Monorepo** dividido en dos grandes bloques:

1. **Backend (`/backend`):** Una API REST construida con **Java 21** y **Spring Boot 3.4**, encargada de procesar toda la lógica transaccional del juego (fórmulas de experiencia, subidas de nivel, persistencia de datos y tareas programadas).
2. **Frontend (`/frontend`):** Una aplicación móvil multiplataforma desarrollada con **Flutter** y **Dart**, estructurada bajo el enfoque *Feature-First* para garantizar la escalabilidad y un código limpio.

---

## 🛠️ Tecnologías Utilizadas

### Backend
* **Lenguaje:** Java 21 (LTS)
* **Framework:** Spring Boot 3.4+ (Spring Web, Spring Data JPA)
* **Base de Datos:** PostgreSQL / MySQL
* **Herramienta de Construcción:** Maven

### Frontend
* **Lenguaje:** Dart
* **Framework:** Flutter
* **Gestión de Estado:** Bloc / Provider *(En desarrollo)*
* **Librerías Clave:** `http` (comunicación), `flutter_animate` (animaciones RPG), `google_fonts` (estética retro).

---

## 📋 Funcionalidades del Sistema (Backlog)

### ⚔️ Fase 1: El Despertar del Héroe (Core & CRUD)
- [x] Configuración del entorno multi-lenguaje e infraestructura base.
- [ ] Creación del modelo relacional 1:N entre `Usuario` y `Habito`.
- [ ] Endpoints REST para la gestión de hábitos (`GET`, `POST`, `DELETE`).
- [ ] Maquetación de la interfaz principal en Flutter (Tarjeta de personaje + Lista de tareas).

### 👾 Fase 2: Grind & Level Up (Lógica de Negocio RPG)
- [ ] Motor transaccional para completar hábitos (`POST /api/habitos/{id}/completar`).
- [ ] Algoritmo de recompensa: asignación de Oro y XP según la dificultad del hábito.
- [ ] Sistema de niveles automático basado en curvas de experiencia matemáticas.
- [ ] Historial detallado de actividades completadas.

### 🧪 Fase 3: El Boss Final (Automatización y Tienda)
- [ ] **Task Scheduler (Cron Job):** Tarea programada a medianoche para penalizar con pérdida de Vida (HP) las tareas diarias no realizadas.
- [ ] Implementación de la Tienda de Pociones para recuperar salud usando el Oro del juego.
- [ ] Pantalla de Game Over si la salud del personaje llega a 0.

---

## 📦 Configuración y Despliegue Local

### Requisitos Previos
* Java Development Kit (JDK) 21 instalado.
* Flutter SDK (versión estable) configurado.
* Una instancia local de base de datos relacional (PostgreSQL).

### Ejecución del Backend
1. Navega a la carpeta del servidor: `cd backend`
2. Configura tus credenciales de base de datos en `src/main/resources/application.properties`.
3. Arranca la aplicación desde tu IDE o mediante consola con Maven.

### Ejecución del Frontend
1. Navega a la carpeta de la app: `cd frontend`
2. Instala las dependencias: `flutter pub get`
3. Lanza la aplicación en tu emulador o dispositivo físico.