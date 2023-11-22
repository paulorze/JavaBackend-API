
# Desafio 5

Ejercicio realizado para el BootCamp de JAVA de EducaciónIT.


#### Consigna
Crear una aplicación Maven en la cual se consuman las siguientes APIs:
- [Covid Tracking](https://api.covidtracking.com/)
- [Pokemon API](https://pokeapi.co/)
- [JSON Placeholder](http://jsonplaceholder.typicode.com/)

Cada estructura deberá contar con una tabla. Deben tener un campo ID y uno que soporte el JSON obtenido.

Para solidificar los conceptos trabajados en clase, solamente la tabla para Covid Tracker respeta esta estructura. Las otras dos cuentan con una estructura mucho más detallada, conteniendo referencias a otras tablas y a tablas MTM.

En el index.html se debe contar con un menú que apunte a un controlador por cada API, con los siguientes nombres:
- /api/covid
- /api/pokemon
- /api/placeholder

Al hacer click en los botones correspondientes, la aplicación devolverá, en forma de JSON:
- Todos los registros de la base de datos correspondiente.
- Buscará en la base de datos por el ID que ingrese el usuario. Si existe el registro lo devuelve. De no existir, se invocará a la API-Rest correspondiente y, tras obtener la respuesta, se persistirá en la Base de Datos.

## Autor

- [@paulorze](https://github.com/paulorze)


## Agradecimientos

 - [EducationIT](https://www.educacionit.com/)
 - [Carlos Lopez](https://github.com/krloss86)


## Estructura del Proyecto

El proyecto cuenta con una estructura por capas en la cual:
- Console permite probar los servicios sin necesidad de levantar el Servidor.
- Domain se encarga de las estructuras de los objetos que serán almacenados en la Base de Datos.
- Repository se encarga de establecer las funciones relacionadas al CRUD en la base de Datos.
- Service se encarga de manejar el flujo de acciones provenientes de Web hacia sus respectivas funciones en Repository.
- Web construye los WebServlets respectivos a cada uno de los controladores, así como el manejo de los archivos subidos.
- Rest-Api-Connector nos conecta a las APIs correspondientes, con los respectivos DTOs para recibir correctamente los JSONs.



## Set Up
Recordar crear un proyecto de Maven y agregar los módulos correspondientes a cada capa yendo a 'Right-Click' --> 'Maven' --> 'New Maven Module Project'. 'App-Web' deberá ser WAR y no JAR.

Luego, crear el Server yendo a 'Right-Click' --> 'New' --> 'Others...' --> 'Server'. En este caso, se encuentra creado con Tomcat v10.1 Server. Agregar app-web a los recursos configurados en el servidor.

### Base de Datos
La base de datos está almacenada en un servidor local hecho con Docker. Recordar cambiar la dirección correspondiente dentro de "ConnectionAdministrator" en el módulo Repository.

La Base de Datos está construida utilizando MySQL. Para crear las tablas correspondientes al proyecto, por favor dirigirse a 'app-parent/resources/TableCreator'. Copiar la consulta en su administrador de base de datos y ejecútela.

### Variables de Entorno

Para correr este proyecto, deberás utilizar las siguientes variables de Entorno:

`DB_PASSWORD`
`DB_USERNAME`

Éstas se configuran haciendo click derecho sobre las carpetas del proyecto y yendo a 'Run As...' --> 'Run Configurations' --> 'Enviroment'.
```
Recordar configurarlas tambien en el Servidor, haciendo Doble Click en el mismo y yendo a 'Open Launch Configurations' --> 'Enviroment'.
``` 
