<h1 align="center">Challenge BackEnd - API REST con Spring-Boot 3</h1>
<p align="center">¡Bienvenido al desarrollo del desafío Back End! En esta ocasión, el reto es la creación de una API REST utilizando Spring para un foro en línea.</p>

<h1>Indice</h1>

  

>➜[Funcionalidades](#Funcionalidades)
### Tópicos
- [Crear un nuevo Tópico](#crear-un-nuevo-Tópico)
- [Mostrar todos los Tópicos creados](#mostrar-todos-los-Tópicos-creados)
- [Mostrar un Tópico específico](#mostrar-un-Tópico-específico)
- [Actualizar un Tópico](#actualizar-un-Tópico)
- [Eliminar un Tópico](#eliminar-un-Tópico)
### Usuarios
- [Registrar un nuevo Usuario](#Registrar-un-nuevo-Usuario)
- [Mostrar todos los Usuarios registrados](#mostrar-todos-los-Usuarios-creados)
- [Mostrar un Usuario específico](#mostrar-un-Usuario-específico)
- [Actualizar un Usuario](#actualizar-un-Usuario)
- [Eliminar un Usuario](#eliminar-un-Usuraio)
### Cursos
- [Crear Cursos](#crear-Cursos)
- [Listar Cursos](#listar-Cursos)
- [Obtener un Curso específico](#obtener-un-Curso-específico)
- [Actualizar datos de un Curso](#actualizar-datos-de-un-Curso)
### Respuestas
- [Registrar una Respuesta](#registrar-una-Respuesta)
- [Obtener Respuestas](#obtener-Respuestas)
- [Actualizar Respuestas](#actualizar-Respuestas)
- [Eliminar Respuestas](#eliminar-Respuestas)

>➜[Tecnologías utilizadas](#tecnologías-utilizadas)
    

<h2>Funcionalidades</h2>
La API se centrará en la gestión de tópicos, usuarios, cursos y respuestas en el foro. Los usuarios podrán realizar las siguientes acciones:

<h2>Tópicos</h2>
<h3>Crear un nuevo Tópico</h3>
Para registrar un nuevo tópico, nuestra API proporciona un endpoint que acepta solicitudes POST en la siguiente URL: "/topicos".

Debes enviar los detalles del tópico, como el titulo, el mensaje, el autor y el curso, en el cuerpo de la solicitud en formato JSON.

<h4>Reglas del negocio</h4>
<ul>
  <li>Todos los campos son obligatorios.</li>
  <li>No se permiten tópicos duplicados, es decir, tópicos con el mismo título y mensaje.</li>
</ul>

<h3>Mostrar todos los Tópicos creados</h3>
Para ver la lista de todos los tópicos disponibles, nuestra API ofrece un endpoint que acepta solicitudes GET en la URL: "/topicos".

La respuesta incluirá los detalles de cada tópico, como el título, el mensaje, la fecha de creación, el estatus, el autor y el curso, en formato JSON.

<h3>Mostrar un Tópico específico</h3>
Si deseas ver un tópico en particular, puedes utilizar el endpoint que acepta solicitudes GET en la URL: /topicos/{id}. Reemplaza {id} con el identificador único del tópico que deseas ver.

La respuesta proporcionará los detalles del tópico seleccionado en formato JSON, incluyendo el título, el mensaje, la fecha de creación, el estado, el autor y el curso.

<h3>Actualizar un Tópico</h3>
Si necesitas realizar cambios en un tópico existente, nuestra API tiene un endpoint que acepta solicitudes PUT en la URL: /topicos/{id}. Nuevamente, {id} se refiere al identificador único del tópico que deseas actualizar.

Es importante destacar que las mismas reglas que aplicamos para el registro de nuevos tópicos también se aplican en la actualización de tópicos existentes.

<h3>Eliminar un Tópico</h3>
Si deseas eliminar un tópico, nuestra API ofrece un endpoint que acepta solicitudes DELETE en la URL: /topicos/{id}. Reemplaza {id} por el identificador único del tópico que deseas eliminar.

<h2>Usuarios</h2>
La API también permite gestionar usuarios.

<h2>Registrar un nuevo Usuario</h2>
La API proporciona un endpoint para registrar nuevos usuarios y acepta solicitudes POST en la siguiente URL: "/usuarios".

Los datos del usuario (nombre, email y contraseña) deben enviarse en el cuerpo de la solicitud en formato JSON.

<h3>Mostrar todos los Usuarios registrados</h3>
La API ofrece un endpoint para listar todos los usuarios activos y acepta solicitudes GET en la siguiente URL: "/usuarios".

Los datos de los usuarios (nombre, email, fecha de creación, estatus) se devuelven en el cuerpo de la respuesta en formato JSON.

<h3>Mostrar un Usuario específico</h3>
La API proporciona un endpoint para obtener un usuario específico y acepta solicitudes GET en la siguiente URL: "/usuarios/{id}".

Los datos del usuario (nombre, email, fecha de creación, estatus) se devuelven en el cuerpo de la respuesta en formato JSON.

<h3>Actualizar un Usuario</h3>
La API ofrece un endpoint para actualizar los datos de un usuario y acepta solicitudes PUT en la siguiente URL: "/usuarios".

<h3>Eliminar un Usuario</h3>
La API proporciona un endpoint para desactivar usuarios y acepta solicitudes DELETE en la siguiente URL: "/usuarios/{id}".

<h2>Cursos</h2>
Además, la API permite gestionar cursos:

<h3>Crear Cursos</h3>
La API proporciona un endpoint para crear cursos y acepta solicitudes POST en la siguiente URL: "/cursos".

Los datos de los cursos (nombre y categoría) deben enviarse en el cuerpo de la solicitud en formato JSON.

<h3>Listar Cursos</h3>
La API ofrece un endpoint para listar todos los cursos y acepta solicitudes GET en la siguiente URL:"/cursos".

Los datos de los cursos (nombre y categoría) se devuelven en el cuerpo de la respuesta en formato JSON.

<h3>Obtener un Curso específico</h3>
La API proporciona un endpoint para obtener un curso específico y acepta solicitudes GET en la siguiente URL: "/cursos/{id}".

Los datos del curso (nombre y categoría) se devuelven en el cuerpo de la respuesta en formato JSON.

<h3>Actualizar datos de un curso</h3>
La API ofrece un endpoint para actualizar los datos de un curso y acepta solicitudes PUT en la siguiente URL: "/cursos".

<h2>Respuestas</h2>
Por último la API permite gestionar respuestas a tópicos.

<h3>Registrar una Respuesta</h3>
La API proporciona un endpoint para registrar nuevas respuestas y acepta solicitudes POST en la siguiente URL: "/respuestas".

Los datos del curso (nombre y categoría) se devuelven en el cuerpo de la respuesta en formato JSON.

<h3>Obtener Respuestas</h3>
La API ofrece un endpoint para listar todas las respuestas y acepta solicitudes GET en la siguiente URL: "/respuestas".

<h3>Actualizar Respuestas</h3>
La API ofrece un endpoint para actualizar respuestas y acepta solicitudes PUT en la siguiente URL: "/respuestas".

<h3>Eliminar Respuestas</h3>
La API ofrece un endpoint para eliminar respuestas y acepta solicitudes DELETE en la siguiente URL: "/respuestas/{id}".

<h2>Tecnologías Utilizadas</h2>

Para llevar a cabo este desafío, hemos empleado las siguientes tecnologías:

<li>Java 17</li>
<li>Spring Boot 3</li>
<li>Base de datos para la persistencia de la información</li>
<li>Flyway para la migración de Base de Datos</li>
