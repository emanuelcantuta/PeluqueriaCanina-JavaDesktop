# 🐾 Sistema de Gestión - Peluquería Canina

Este es un proyecto de escritorio desarrollado en **Java** para gestionar los clientes y mascotas de una peluquería canina. Permite registrar, visualizar, editar y eliminar datos (CRUD completo) utilizando una base de datos relacional y una interfaz gráfica amigable.

Es la **Versión 1.0** del sistema, totalmente funcional, con planes de agregar nuevas características.

## 🛠️ Tecnologías Utilizadas

* **Lenguaje:** Java (JDK 17)
* **Interfaz Gráfica:** Java Swing (IGU)
* **Persistencia de Datos:** JPA (Java Persistence API) con EclipseLink
* **Base de Datos:** MySQL
* **Gestor de Dependencias:** Maven
* **IDE Recomendado:** Apache NetBeans

## 📂 Arquitectura del Proyecto

El proyecto está estructurado utilizando el **Patrón de Arquitectura por Capas IGU** para separar responsabilidades y hacer el código más mantenible. La estructura exacta de paquetes es la siguiente:

* `com.mycompany.peluqueriacanina`: Contiene la clase principal (`PeluqueriaCanina.java`) que inicia la aplicación.
* `com.mycompany.peluqueriacanina.logica`: Contiene las entidades (`Mascota`, `Duenio`), un `Enum` (`EstadoOpcional`) y la clase `Controladora` que maneja la lógica de negocio.
* `com.mycompany.peluqueriacanina.igu`: Contiene todas las ventanas de la Interfaz Gráfica de Usuario (JFrames como `Principal`, `CargarDatos`, `VerDatos`, `ModificarDatos`).
* `com.mycompany.peluqueriacanina.persistencia`: Contiene los Controladores JPA generados automáticamente (`MascotaJpaController`, `DuenioJpaController`) y la clase `ControladoraPersistencia` que actúa como fachada.
* `com.mycompany.peluqueriacanina.persistencia.exceptions`: Paquete generado por el IDE para el manejo seguro de excepciones de base de datos.

## 🚀 Instalación y Uso

### Prerrequisitos
* Tener instalado **Java JDK 17** o superior.
* Tener instalado y en ejecución un servidor **MySQL**.
* Un IDE compatible con proyectos Maven (como Apache NetBeans).

### Pasos para ejecutar
1. **Clonar el repositorio:**
    ```bash
   git clone https://github.com/emanuelcantuta/PeluqueriaCanina-JavaDesktop.git
    ```

2. **Preparar la Base de Datos:**
   Abre tu gestor de MySQL (por ejemplo, phpMyAdmin o MySQL Workbench) y ejecuta el siguiente comando para crear la base de datos vacía. (Las tablas se crearán automáticamente al ejecutar el programa gracias a JPA).
   ```sql
   CREATE DATABASE peluqueria_canina;
   ```
3. **Configurar Credenciales:**
   Ve al archivo `src/main/resources/META-INF/persistence.xml`.
   Busca las propiedades de conexión y coloca tu usuario y contraseña local de MySQL:
   
   ```xml
   <property name="javax.persistence.jdbc.user" value="TU_USUARIO_AQUI"/>
   <property name="javax.persistence.jdbc.password" value="TU_CONTRASEÑA_AQUI"/>

4. **Ejecutar el proyecto:**
   Abre el proyecto en tu IDE (Apache NetBeans), deja que Maven descargue las dependencias y ejecuta la clase principal (`PeluqueriaCanina.java`).

## 💡 Origen del Proyecto y Créditos

Este es un proyecto del curso de [TodoCode Academy](https://todocodeacademy.com/).

A partir de esa base, se agregaron algunos detalles y configuraciones para seguir practicando:
* **Uso de Enums:** Implementación de enumeraciones (`EstadoOpcional`) para manejar los estados de forma más segura.
* **Anotaciones de JPA:** Uso de anotaciones como `@Table(name="...")`, `@Column(name, length, nullable)` y `@Lob` para detallar un poco más la estructura de las tablas en la base de datos.

## 🗺️ Próximas Mejoras (Roadmap)

El proyecto es una primera versión y soy consciente de que hay mucho margen de mejora. Estas son algunas de las actualizaciones planificadas:
* [ ] **Refactorizar la base de datos:** Cambiar la relación actual `@OneToOne` por una relación `@OneToMany` (Uno a Muchos), para que un mismo dueño pueda tener varias mascotas registradas.
* [ ] **Navegabilidad:** Agregar un botón de "Volver atrás" en las pantallas para regresar a la vista anterior fácilmente.
* [ ] Otras funcionalidades y refactorizaciones a pensar en el futuro para seguir aprendiendo y mejorando el sistema.