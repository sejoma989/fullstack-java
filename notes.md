# Curso aplicacion conceptos de back para Java Spring Framework

## Indice

#### 1. ¿Cómo funciona una Webapp?
#### 2. ¿Cómo funciona un servidor? (Google Cloud)
#### 3. ¿Cómo registrar un dominio?
#### 4 . Instalación de IntelliJ Idea
#### 5. Crear un proyecto con Spring Framework
#### 6. ¿Qué es Maven y qué es Gradle?
#### 7. Instalación de Maven
#### 8. Instalación de JDK
#### 9. Estructura del Proyecto
#### 10. Hola Mundo
#### 11. Solución de errores típicos al compilar
#### 12. Creación de Controladores
#### 13. Template para el Panel de Administración
#### 14. ¿Qué es JSON y XML?
#### 15. Estructura de una URL
#### 16. ¿Qué son los Métodos HTTP?
#### 17. Arquitectura MVC
#### 18. ¿Qué es REST?
#### 19. ¿Qué es un Framework?
#### 20. Creación de Servicio REST
#### 21. Llamar a una API con AJAX
#### 22. Creación de una Base de Datos
#### 23. DAO Layer y conexión con Base de Datos
#### 24. Repository con Hibernate
#### 25. Lombock
#### 26. Inyección de Dependencias
#### 27. Listar Usuarios
#### 28. Eliminar Usuarios
#### 29. Registrar Usuarios
#### 30. Iniciar Sesión
#### 31. ¿Qué es HASH y cómo funcionan las Contraseñas?
#### 32. Implementación de Argon2
#### 33. ¿Cómo funciona una Sesión de Usuario?
#### 34. ¿Qué es JWT y cómo funciona?
#### 35. Implementación de JWT
#### 36. Repositorios de Código
#### 37. Creación de Repositorio en GitHub
#### 38. Resolver conflictos
#### 39. Despedida
#### 40. Bloopers


# Desarrollo 
## 1. ¿Cómo funciona una Webapp?
Al conectar una app a internet y se conecta a servidor, este devuelve la informacion solicitadda en formato HTML, CSS y JS para que el navegador la renderice.
Puede tener diferencias segun el header que trae, como SO, dispositivo, etc
Asi el servidor sabe si devuelve un sitio optimizado para smartphone o solo para desktop

## 2. ¿Cómo funciona un servidor? (Google Cloud)
Computadora para subir ap´licacion web, podriamos tenerla nosotros, pero habria que tenerla prendida siempre y darle mantenimiento.
Lo mejor es tercerizar el hosting con google, amazon, azure, IBM. Son los más famosos.

cloud.google.com da 300 USD gratios para gastar en un año, ahora 90 dias

https://console.cloud.google.com/

Se crea una cuenta en google cloud platform y se puede apreciar en el dashboard toda la infraestructura virtualizada para facilitar la configuracion.

https://console.cloud.google.com/home/dashboard

En el dashvboprd se tiene la info resumida del servidor. En el menu derecho esta toda la configuracion disponible para el servidor.
Desde network se puede configurar la red del servidopr de manera virtualizada.
Inicialmente en compute engine está la opcion para revisar las maquinas virtuales que es donde se despliegan los sitios.
Es posible conectar usando ssh a la computadora a través de una consola y configurarla como se desee.

## 3. ¿Cómo registrar un dominio?
La maquina virtual a la que estamos conectados tiene una IP, que es el identificador unico de esa maquina en la internet. Al dar clieck en la IP, lleva directamente a la pagina de domains.google.com

https://domains.google/?pli=1

Dentrom se puede buscar y registrar un dominio, con el cual se va a asociar a la ip de la maquina virtual, asi va a ser redireccionada.

La configuracion del servidor puede ser diferente para aplicaciones qeu escalan para usar miles de usuarios.

## 4. Instalación de IntelliJ 
Al buscar intellij idea en google, emn el link de descargas se llega al link para descargar la version community.

## 5. Crear un proyecto con Spring Framework
Para crear al proyecto se hace desde un inicializador en linea

https://start.spring.io/

## 6. ¿Qué es Maven y qué es Gradle?
Al crear un proyecto se usan librerias de 3ros. Una libreria es codigo reusable creado por otra persona, de lo contrario siempre habria que estar programando todo de 0. 
El problema es que suben bastante el peso del proyecto.
Al tener varias librerias, un proyecto puede tener decenas o centenas de librerias y cada una con su propio peso aumentando el total.

El problema era al querer transferir archivos entre maquinas, tya que antes la velocidad del internet era muy limitada. Para solucionar ese problema surgieron Maven y Gradle que son basicamente librerias para el manejo de otras librerias.

Ya no es necesario pasar el codigo con todas las librerias, simplemente indicando en un archivo de gradle o maven cualers son las librerias que se necesitan para compilar el propyecto, estilo package.json.

### Graven vs Maven
Maven fue el precursor de este modelo, es el mas antiguo, sin embargo, luego nacio Gradle que incorpora algunas funcionalidades adicionales. Sin embargo el funcionnamiento y configuracion de ambos es muy similar, por lo que se puede encontrar cualquier opcion en proyectos laborales y su uso es muy similar.

### Creacion de proyecto Maven
En este caso se va a usar Maven para crear el proyecto.
Se va a usar la version 2.7.10 que es la version de springboot que se va a manejar.

Se tiene informacion acerca del proyecto. 

grupo com.cursojava

artifact gestionusuarios

La version de Java disponible son 

8 - Integracion de funciones lambda
11 - Ultima version gratuita de Java
17 - version avanzada mantenible usando openJDK que es la version gratuita de Java

Packaging es el tipo de empaquetado, jar hace referencia a las librerias, war a las aplicaciones web.

Por ultimo se agrega en la parte derecha la dependencia de Spring Web que es el framework que se va a usar.

Se le da a generar el proyecto, descarga un zip que se descomprime en el directorio desde donde se quiere trabajar el proyecto.

Ahora se tiene intellij pero aun falta confirgurar algunos elementos del entorno, como el Maven y el JDK, primero se va a instalar el Maven

## 7. Instalación de Maven
En google se busca download Maven, esto direccionara a una pagina de apache.

https://maven.apache.org/download.cgi

Hay varias opciones disponibles como Binary tar.gz o .zip que es la version compilada, o el source tar.gz y .zip que es el codigo fuente.

En este caso se va a trabajar con la version compilada Binary zip archive, se descarga y se abre el archivo .zip.

En la ruta C: se descromprime esta carpeta y se renombra por /maven

### variables de entorno maven
Es necesario configurar la variable de entorno de maven, para lo cual se accede al explorador de windows, sobre la opcion de este equipo, se da click decercho y acceder a propiedades, en el panel que se abre en la parte izquierda presionar en advanced system settings, luego environments variable. Esto despliega un pop up de configuracion para las variables de entorno.

Se crea una nueva variable de entorno del sistema que son las que estan en la parte inferior. Al nombre se le da MAVEN_HOME y al value se le da C:\maven

Luego se busca la variable de sistema path y se modifica al agregar una nueva linea con %MAVEN_HOME%\bin para que reconozca la nueva variable creada y permita manejar las variables de java desde consola.

## 8. Instalación de JDK
El siguiente paso es instalar el JDK, en google se selecciona download JDK y se accede al link

https://www.oracle.com/co/java/technologies/downloads/#jdk17-windows

Una vez en el link sae busca la opcion de descargar el instalador X64 de windows.

Se ejecuta la instalacion y darle siguiente, es necesario guardar la ruta de instalacion porque se va ausar mas adelantee.

C:\Program Files\Java\jdk-17\

Se instala el JDK al darle click a siguiente. Se accede a la ruta copiada de la instalacion del JDK 

Se crea una nueva variable de entorno llamada JAVA_HOME que contiene la ruta salvada anteiormente

%JAVA_HOME%\bin

Se guarda y en este momento se tiene java instalado

## 9. Estructura del Proyecto 
En este punto se abre intellij idea y se abre el proyecto que se creo previamente gestionusuarios. Se puede abrir desde el directorio creado, o tambie4n desde el archivo pom.xml es lo mismo
Es necesario decir que se confia en el proyecto, luego puede aparecer un cartel que pregunte si quiere abrir el proyecto con maven.
La primer vez la inicializacion va a llevar un tiempo porque esta indexando todo el proyecto.
En la parte inferior se ven los mensajes auxiliares y en el izquierdo la estructura del proyecto.
Se le dice que siempre descargue los elementos por defecto.

Lo mas importante es el archivo pom.xml que describe la estructura del proyecto.

### archivo pom.xml

Inicialmente describe dentro de la etiqueta dependencies spring framework, tomcat y test inicialmente. Todas las nuevas dependencias se van a agregar aca para que la libreria se descargue automaticamente,

	<dependencies>

tambien es importante la etiqueta de packaging que fue configurada anteriormente y tambien la de properties que inclutye la version de java

	<packaging>war</packaging>
    ...
		<java.version>11</java.version>

Tiene optra informaion adicional sobre el proyecto como descripcion, versiones, etc.

Finalmente dentro de la etiqueta build tiene algunas referencias con respecto a la configuracion cuando se haga la compilacion.

### directorio /src

Dentro de la carpeta src se tiene todo el codigo de la aplicacion. En /test esta todo el testing y en /main todo el codigo del proyecto. Dentro de main esta el directorio /resources que contiene archivos de configuracion o html o de frontend que se quieran mosrtar. En java va el codigo fuente del propyecto. Automaticamente crea algunas clases dentro del proyecto para levatnarlo.

Lo primero a notar es ver que hay una archivo GestionusuariosApplication  anotacion @SpringBootApplication que empieza con simbolo arroba e indica que el proyecto v a a usar el framework spring.

En la estructura del proyecto se encuentra el directorio Resources que contiene los archivos de configuracion como application properties pero tambien en el directorio static todos los archovs a los que se quiere que el usuario tenga acceso.

## 10. Hola Mundo 
Dentro del directorio static se crea un nuevo archivo index.html con un tecto hola mundo para hacer una , esta parte seria el frontend.
Para ciorrer la aplicacion en la parte derecha del IDE hauy una pestaña maven, en caso que no se encuentr, en la pestaña view -> tool windows -> maven. Se despliega un menu con directorios. Dentro de plugins se elige springboot, y dentro hay comandos necesarios para levantar y tumbar el se4vidor. Se busca sppringboot y hay una opcion con run. Se le da doble click y jhay que esperar un tiempo y solucionar los errores que muestre.

Al ir a un navegadoren la direccion localhost:8080 esta corriendo la aplicacion esto se puede ver en los logs de run en el IDE luego de haber dado click en el script que levanta el servidor.

## 11. Solución de errores típicos al compilar 
El error mas tipico que se presenta al correr la aplicacion es qeu indique que no tiene una version seleccionada de JDK.
En ese caso se puede ir a la terminal en la parte inferior, al preguntar por 

    java --version

Indica la version instalada de java en la PC, se puede configurar en el archivo pom.xml para que conincida, en este caso aparece java 17.0.6, asi que se pondria en el pom solo el 

Tambien en file -> project structure se puede configurar la version del SDK y permite descargar la version de JDK tambien.

Otro problema comun es que encuentre otra aplicacion corriendio ya en el peurto 6060, cuando eso suceda se puede usar el siguiente comando para tumbar elservicio que esye en el puerto

    netstat -ano | findstr LISTENING | findstr 8080

En linux

    sudo netstat -anp | grep ':8080'

Luego de tener el PID del proecso corriendo en el puerto 8080, se inserta este nuevo 

    taskkill -PID $processId -F

El linux

    sudo kill -9 $processId

Una vez que se verifica que el servidor corre y que se puede parar el servidor de desarrollo, se procede con la programacion de los componentes

## 12. Creación de Controladores 
En la estructura de archivos del proyecto se tiene a /main/Java/com.cursojava.gestionusuarios se crea un nuevo package y se le llama controllers. Dentro se crea una nueva clase llamada UsuarioController.

Los controladores sirven para manejar las URLs. Al usuario entrar al dominio.com/empresa, se hace que con esa ruta empresa devuelva una cosa, si entra a /usuario devuelve otra cosa.

SptringBoot se maneja con anotaciones, para indicar que esta clase es un controlador, es necesario agregar una anotacion @RestController y lo importamos.

Dentro se crea una nueva funcion que devuelve un String que se llama prueba() que devuelve un string "prueba"

para indicar la url cuando se abre esta ruta se se agrega la anotacion @RequestMapping(value = "prueba" )

    /gestionusuarios/src/main/java/com/cursojava/gestionusuarios/controllers/UsuarioController.java

    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class UsuarioController {

        @RequestMapping(value="prueba")
        public String prueba() {
            return "prueba";
        }
    }

En este punto al acceder a la ruta http://localhost:8080/prueba se puede apreciar el retorno de la cadena prueba


## 13. Template para el Panel de Administración 
Para hacer mas visual el sistema se va a descargar una plantilla buscando en google sbadmin 2 y se descarga.

https://startbootstrap.com/theme/sb-admin-2

Este es un template en html puro, sin ningun libreria o framework front. Es compatible tambien con react o angular pero se hace un ejemplo basico.

Del zip descargado hay una carpeta con el contenido del template, se saca todo el contenido y dentro de la carpeta static se agrega. Dentro del editor no va a permitir insertar los archivos directamente del compresor, por lo que se abre en el explorador directamente desde el editor, haciendo click derecho en el directorio y click en "open in" explorer.

Se arrastra el contwenido de los archvios dentro de static para tener todo el template. Se tiene un login, un index.html. todos los directorios.
Se hace un refresh a los archivos del disco en caso que no se vean los nuevos archivos en el IDE.

Al resetear laaplicacion se puede ver que entrando a localhost:8080 sigue mostrando hola mundo, esta cacheado. En la parte de la derecha hay un lugar donde dice clean, se le da en clean para que se limpie y luego vuelve a springboot run para levantar el servicio nuevamente.

Se verifica que el servvidor este corriendo sin problemas y luego en la ruta se veriffica que se esta viendo el dashboard deseado.

Se esta jhaciendo un desarrollo FullStack porque por un lado en la carpeta static se esta creando el frontend, el template que se descargo es lo que el cliente ve.

Por el otro esta el Backend, que es el resto de la aplciacion y los controllers, los controllers manejan los recursos que se necesitan para trabajar, como el listado de usuarios, etc.

### Creacion de primer api que devuelve un json
Es posible devolver un json cuando se usa un objeto List y se retorna en el controller /prueba


    package com.cursojava.gestionusuarios.controllers;

    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    import java.util.List;

    @RestController
    public class UsuarioController {

        @RequestMapping(value="prueba")
        public List<String> prueba() {
            return List.of("Manzana", "Kiwi", "Banana");
        }
    }


## 14. ¿Qué es JSON y XML? 
Son herramientas usadas comunmente al trabajar con servicios web. Permiten la intercomunicacion entre diferentes servicios.

Por ejemplo en la PC hay un software de contabilidad que permite seguir la contabilidad del negocio.
En una parte del software se puede ver el precio de todas las divisas. El software hace la peticion al servidor del programa de contabilidad pero no tiene la info de las divisas que cambian constantemente para lo que le hace la peticion a otro servidor que le devuelve en formato XML o JSON.

Permite la interconexion entre diferentes servicios. La comunicacion XML jSON pudo haber sido usada tambien entre el cliente y el servidor de contabilidad.

### XML
Xtensible Markable Language, lenguaje de marcado extensible que es una forma de organizar la informacion con un estilo de etiquetas, similar a HTML, pero para ordenar la informacion.

Para el siguiente ejemplo hay un cine que tiene peliculas y esas peliculas pueden tener atributos como el tag categoria de accion o animacion. Tambien la pelicula tiene otra informacion como titulo indicando en español y otro podria estar en ingles, tambien el director, estreno, reparto. Toda la informacion se organiza similar a HTML

    <?xml version="1.0" encoding="UTF-8"?>
    <cine>
        <pelicula categoria="accion">
            <titulo idioma="ingles">Mad Max</titulo>
            <director>George Miller</director>
            <estreno>1S mayo 2015</estreno>
            <reparto>Tom Hardy</reparto>
            <reparto>Charlize Theron</reparto>
            <reparto>oNicholas Hoult</reperto>
        </pelicula>

        <pelicula categoria="animacion™>
            <titulo idioma="ingles">Inside Out</titulo>
            <director>Pete Docter</director>
            <estreno>17 junio 2015</estreno>
            <reparto>Amy Poehler</reparto>
            <reparto>Phyllis Smith</reparto>            
            <reparto>Bill Hader</reperto>
        </pelicula>
    </cine>

### JSON
En el proximo ejempo esta el mismo ejemplo anterior modificado para json.
Un json comienza con un corchete que se abre cuando va a contener varios elementos, y no tiene etiquetyas como cine o pelicula, dentro de los corchetes hay objetos, que se delimitan por llaves, en este caso las peliculas. 

Es muy similar a javascript porque son objetos de javascript y por cada elemento se separa por coma. para agregar mas informacion sobre algo, por ejemplo el titulo, se debe abrir otra llave porque es como si tuviera otro objeto con varios atributos como titulo e idioma. Luego se tiene director, estreno y reparto que al tener varias personas se abre varios corchetes separados por coma

    [        
        {
            "categoria": "accion",
            "titulo": {
                "idioma": "ingles",
                "titulo": "Mad Max"        
            },
            "director": "George Miller",
            "estreno": "1S mayo 2015",
            "reparto": [
                "Tom Hardy",
                "Charlize Theron",
                "Nicholas Hoult"
            ]
        },
        {
            "categoria": "animacion™",
            "titulo": {
                "idioma": "ingles",
                "titulo": "Inside Out"        
            },
            "director": "Pete Docter",
            "estreno": "17 junio 2015",
            "reparto": [
                "Amy Poehler",
                "Phyllis Smith",
                "Bill Hader"
            ]
        }
    ]

### XML vs JSON
A simple vista parece mas descriptivo XML, sin embargo en este momento JSON es el estandar de la industria. Esto depende del espacio, ya que el SJON se puede comprimir y reducir el tamaño de los archivos al quitar caracteres quitando espacios y enter. Queda en una forma reducida donde puede optimizar el peso de los XML hasta en un 30%. Al llevbar a gran cantidad de archivos y mensajes de informacion el peso es signiificativo cuando se descarga la aplicacion. Lo que prima es la velocidad.

Otra ventaja de JSOn es que al consumirla en javascript, entiende muy facil JSON porque es su lenguaje de objeto y mas aun si en el servidor se usa un lenguaje como nodejs y aun si en la BD se usa mnongoDB se haria muy transparente.

## 15. Estructura de una URL 

Al trabajar con aplicaciones web se escuchan muchos terminos como link, URL, URI y cada uno tiene sus diferencias. Por ejemplo para el siguiente link:

    Metodo                                           Recurso
    |____|                  |___path-Localizacion__||___|
       ^                                   ^          ^
    https://waytolearnx.com/author/amine-kouis.html#posts


    |_________________ Link o URI ______________________|

    |__________________ URL ______________________|
          |_____________________ URN ___________________|

    
    Metodo: metodo definido para acceder a los recursos
    https

    Localizacion: Donde reside el recurso
    amine-kouis.html

    Recurso: Elemento especifico consumido de la pagina
    posts

    URI: Abarca absolutamente todo, el URL y recurso.
    https://waytolearnx.com/author/amine-kouis.html#posts

    URL: No incluye el recurso, abarca toda la duireccion 
    https://waytolearnx.com/author/amine-kouis.html

    URN: Abarca toda la direccion, incluye el recurso pero sin el esquema de conexion.
    waytolearnx.com/author/amine-kouis.html#posts

El link tiene diferentes partes, en matematicas se separa la formula entre + y - u operadores. En el link hay que separar tambien los terminos, rapidamente el dominio de la pagina es waytolearnx.com.
Https es el metodo que va a usar para conectar, con el s indica modo seguro usando un certificado se seguridad.

Por otro lado la ruta o path seria /author que representa categorias o subcategorias, en la derecha esta el elemtno que se esta consumiendo.
El simbolo # separa el recurso a su dereha y a la izquierda la locacion. Este es un link bastante simple.

Es facil confundirse entre estos temas incluso para los programadores.
URL es uniform resources locator, es localizador uniforme de recursos que es una cadena de caracteres que indica un recurso en internet para poder localizarlo.

Un recurso es un archivo html, texto, una foto o video. Pero puede que esa URL sea valida o no y puede que exista el archivo o no, en caso que no devuelve un error 404

URN es uniform resources name, indica un nombre de un recurso que debe ser unico en internet independiente de su localizacion, no tiene el esquema y ademas tiene algo de informacion adicion

URI es identificador uniforme de recursos que es la suma del URL y URN

Una URI mas complicada seria la siguiente
                           
            ___________________________________                       ____________________
           |                Autority          |                      |       Query        |
    http:// usuario:contrasenia@jarroba.com:80 /articulos/unarticulo/ ?id=123&busqueda=java #comment-12345
    |___|                                      |________path________|                      |___fragment___|
    Scheme

    Inicialmente se tiene el scheme que es el metodo http que en este caso no tiene s de seguridad
    Autority tiene la informaciopn de usuario y contraseña tambien incluyendo el host y el puerto
    path son las categorias y subcategorias con seccion y subsecciones
    Query, en formato clave=valor, separado por &, 
    fragment, se divide por # y hace referencia al fragmentyo o recurso puntual

Despues del nombre de la pagina web se tiene un puerto, en este caso es 80, este seria el puerto al que entra el servidor. Normalmente por fdefecto si no se ve va a usar el puerto 80, por ejemplo google.com:80 es el mismo google.com.
En la parte de la autentuicacion se agregan usuario y contraseñas de autenticacion, si no se pone seria un visitante.

En caso de entrar a un panel de administracion, sin agregar esta informacion debe aparecer un cartel que ingrese usuario y contraseña. Al ingresar la informacvion solicitada no aparece ningun cartel sino que accede automaticamente.
el simbolo de ? permite separar e indicar que ingresa informacion extra al servidor en el query de busqueda. En el servidor va a llegar dos parametros, uno con id=123 y otro con busqueda=java, se puede ver que estan separados por el amperstand &.

Esta es la informacion que se envia en una URL, se puede apreciar que se envia bastante informacion a traves de la URL, sin embargo no es la unica manera de enviar informacion al servidor, cuando se esta llenando un formulario y se recarga y se pierde la informacion se puede entender que esta informacion se envia de otra manera, aunque se tenga el mismo link. Este otro metodo es a traves de los metodos HTTP para transmitir informacion.

## 16. ¿Qué son los Métodos HTTP? 

Para el ejemplo pasado, se esta llamando a una URL y para recibirla hay que consultarla a traves de un tipo de dato get, esto se nota porque tiene informacion luego del signo de prgunta que se llama get (?) para estos casos. En el resto de los metodos http la informacion no va en la URl sino oculta. Al crear un recurso nuevo se pasa toda la informacion oculta en un request POST, asi como PUT, PATCH y DELETE. la diferencia entre todos estos es el nombre, se usa cada uno por convencion.

POST: enviar form, guardar, eliminar, etc

Luego aparecieron diferentes verbos para usos especificos.
    
    GET: toda la informacion que se envia por URL luego de ?
    POST - creacion de recursos
    PUT - actualizacion de recursos
    PATCH - actualizacion de recurso sin cambiarla
    DELETE - borrar recurso


## 17. Arquitectura MVC 
Modelo Vista Controlador es un patron de arquitectura de software que sirve para organizar mejor el codigo y comunicar informacion al cliente.

Una tiopica comunicaion entre cliente y servidor tiene a diferentes dispositivos como celular, macbook, portatil que sirven como clientes y usando algun navegador web hace una peticion al servidor. Este servidor procesa la peticion haciendo una llamada a BD para devolverlos, y devuelve el codigo html, js o css dependiendo de la peticion.

El problema es cuando en un proyecto esta creciendo demasiado y modificar alguna funcionalidad es un problema,lo que lo hace dificil de sostener. Se hace muy complejo para hacermopdificaciones. 
La idea de manejar un lenguaje del lado del servidor es hacer dinamico el codigo HTML. Por ejemplo en una tabla lo que se quiere es obtner resultados diferentes segun la pagina que se visita, sin necesdad de hacer un HTML para cada pagina. Por eso se usa lenguaje del lado de servidor. la idea de mvc es que el HTML cambie dinamicamente renderizado listo para ser usado por el browser.

Modelo vista controlador puede tener arquitecturas muy complejas, sin embargo, lo mas basico deberia tener los siguientes elementos. La idea es dividir el proyecto en diferentes capas. Esta la capa de controlador, la capa de modelo y la capa de vista, la BD es un elemento externo y el cliente al otro lado.

Cuando el cliente lloama a una URL a traves del navegador, el controlador recibe la peticion. El controlador es un archivo que recibe la peticion y la procesa por medio de una verificacion de lo que tiene que hacer rl servidor segun la peticion HTTP, crear un recurso, actualizarlo, etc. No hace toda la funcinoalidad, sino que esta repartida. Para la base de datos como agregar elmiminar consultar, esa funcionalidad es derivada a la capa de modelo que hace la consulta trae loos datosy los devuelve al controlador.

Una vez el controlador recibe los datos, genera un HTML a traves de una vista que es un archivo con la estructura del html y pone las partes en onde tiene que modificar los datos. Renderiza la vista y la devuelve al cliente.

                                            Base de Datos

                                               | ^
                                               v |
                                    ------->              
                                   / ------    Model
                                  / /
                                 / v 
            llama la URL
    client ------------>     Controller 
           <------------             
            HTML, JS, CSS       \ ^
                                 \ \
                                  \ ------   View
                                   ------->

### MVC vs REST

Al comparar MVC con REST se van a ver algunas diferencias, en primer lugar lo que devuelve REST no es un html sino un JSON.
Ademas la peticion no es directa por URL sino que es a través de ajax o fetch. En el XHR de la pestaña de network se pueden ver todas las peticiones que se hacen por debajo.

Al tener separada la estructura del proyecto se tiene la ventaja de ser mas flexible, por ejemplo se tiene una aplicacion para desktop y se crea una nueva para celular. 
Si se tiene separada la logica y el server no renderiza html sino que devuelve json y el cliente las interpreta, no hay que hacer nada en el back para la app, simplemente la aplicacion recibe la informacion a traves de JSON.

MVC no ha quedado obsoleto. Ambos son buenos para ciertas cosas. 
Si se quiere enviar emails nos e peude hacer con REST porque cuando se lee un email no se puede ejecutar JS no se peude ejecutar ajax o fetch, javascript asincronico sino que se usa MVC para generar el email renderizar con los datos y enviar al cliente.

MVC goberno la industria y hay miles de proyectos por lo que es necesario conocer este estandar.

## 18. ¿Qué es REST? 
La diferencia con la arquitectura REST es que se agrega una capa de servicioy repository, ademas de que el modelo cam,bia de rol.

Por un lado esta el cliente que hace una peticion fetch o ajax,fetch desde ES8 primero entra a la capa del controlador, donde si se llama con ciertos datos entra a una ruta definida. 
Luego una vez recibida esa informacion no la procesa sino que la deriva al servicio. en est6a capa esta toda la logica relacionada como sumas o modificaciones estan en servicio. 

La logica relacionada con la BD se deriva a la capa repository que maneja la lopgica rtelacionada con la DB, la capa modelo permite definir la estructura y nomrbes de las entidades, repositorio usa la entidad por ejemplo usuario, se conecta a la BD y de los datos que devuelbe, busca el modelo usuario y convertir los datos recibidos al modelo o entidad usuario. Una vez recibidos los datos se devuelve al servicio que procesa y hace algun tipo de logica, a veces no se procesa ninguna logica. Devuelve al controlador que convirte todo el resultado a codigo JSON y se lo devuelve al cliente.
                                               
                                                 
                                      Model      BD  
                                        \ ^      | ^
                                         v \     v |
                                                   
                                         Repository
                                             ^ |
           AJAX / Fetch                      | |
    client ------------>  Controller         | |
           <------------                     | |                   
              JSON             \ ^           | |
                                \ \          | v
                                 \ ------  Service
                                  ------->

Es importante tener la logica separada para simplificar el uso y lectura de codigo para facilitar su entendimiento. Rpimero hay que tener unidad con el patron de arquitectura de software para usar en los proyectos.

## 19. ¿Qué es un Framework? 
Estos patrones se repiten una y otra vez, para no estar reinventandio la rueda se inventaron los frameworks que aplican estos patrones. Son marcos de trabajos que aplican estos patrones para estandarizar la manera de programar, cada lenguaje usa su propio frmamework. Para java se usa mucho Spring, pero pueden haber muchos frameworks que compiten entre si.

Al final de los años solo quiedan algunos.Es importante verificar que tenga una comunidad grande. Finalmente los frameworks son creados pro empresas independientes a los creadores del lenguaje pero hay casos espciales como .net de microsoft.

para llegar a un nivel mas adelante en programacion es necesario conocer algun framework.

## 20. Creación de Servicio REST 
Para dalr mas forma al proyecto se va acontinuar el desarrollo, se va a crear el directorio de los modelos y el modelo de usuarios.

### Modelo usuarios
Se crea un nuevo directorio o package dentro del directorio del proyecto gestionusuarios. El directorio es /models dentro se crea una nueva clase, esta clase es Usuario la cual va a representar el modelo de la misma entidad.

Se crean los atributos nombre, apellido, email, telefono y password private String. Posteriormente se accede a estos atributos a traves de metodos accesores para tener un mejhor control de los datos que tienen las variables.

Esto es una convencion pero no una regla, tambien hay otra que es la del metodo constructor que es mas avanzada y se va a ver mas adelante.
Luego de crear los atributos para la entidad usuarios, dentro de la misma clase se da click derecho **Generate** dentro de generate se selecciona getters and Setters y se seleccionan todos los atributos con shift para que genere los metodos para todos los 


    public class Usuario {

        private String nombre;
        private String apellido;
        private String email;
        private String telefono;
        private String password;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

Ahora dentro del controlador se va a crear una funcion que permita devolver el json.

### Modificacion de controlador para modelo usuario
Dentro del controlador de usuarioController, en la clase se cambia el nombre de prueba a getusuario, el tipo de dato que va a devolver la funcion tambien cambia a Usuario, se da click en la sugerencia del IDE para que importe automaticamente el modelo.

Luego se crea una nueva entidad de usuario con new Usuario().
posteriormente con los metodos accesores de cada una de las variables se insertan datos por primera vez.
Tambien se cambia la ruta, de prueba a usuario.

    @RestController
    public class UsuarioController {

        @RequestMapping(value="usuario")
        public Usuario getUsuario() {
            Usuario usuario = new Usuario();
            usuario.setNombre("Joselo");
            usuario.setApellido("Valencia");
            usuario.setEmail("joselo@gmail.com");
            usuario.setTelefono("354435");
            return usuario;
        }
    }

De esta manera se tiene la primer respuesta tipo json del servidor. Se para el servidor y se reinicia para ver los cambios. Se depura en caso que haya que hacer alguna modificacion.
Al entrar al navegador en la ruta localhost:8080/usuario se puede ver el nuevo JSON con todos los datos del usuario creado.la idea es que el fronted acceda a la informacion y segun eso renderice y muestre acotrde como el perfil, o un listado para mostarlos y agregar uno unevo.

En este mopmento necesitamos que el servicio permita crear usuarios, modificar, elimnarlos ademas buscarlos y listarlo. Asi como dar funcionalidad de inicio de sesion con los usuarios.

### Controladores restantes para el usuario

Dentro del codigo se debe crear un metodo por cada accion, para ejecutar las operaciones sobre los usuarios.

Para buscar informacion sobre un usuario especifico por convencion lo que se hace es agregar un id luego de la ruta, por ejemplo 

    usuario/1254

En este caso el id = 1245 y se va a buscar el usuario con ese id. En el caso anterior si la ruta fuera esa especificamente no seria optimo porque habria que poner una ruta por cada usuario, para agregar dinamismo se abren unas llaves en la ruta y dentro el id, tambien la funcion debe ahora recibir un parametro en la funcion String id con notacion @PathVariable.


    @RequestMapping(value="usuario/{id}")
    public Usuario getUsuario(@PathVariable("id") int id) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Joselo");
        usuario.setApellido("Valencia");
        usuario.setEmail("..)}

Tambien es necesario modificar el modelo para que ahora acepte el id como un atributo mas. Se le pone de limite long par que no haya limite de numeros.Tambien se generan sus getters y setters.

    
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

Finalmente se agrega un nuevo setter en la construccion de la respuesta json en el controller y se cambia el tipo de dato que recibe el parametro por Long.

    @RequestMapping(value="usuario/{id}")
    public Usuario getUsuario( @PathVariable Long id ) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Joselo");

Se detiene y levanta el servicio nuevamente para probarlo. En este moemnto da un error ya que todos los metodos aunque se llaman diferente, estan haciendo relacion con el mismo verbo HTTP GET a la misma ruta /usuario, para esto se modifica momentaneamente las rutas de cada controlador.

    @RestController
    public class UsuarioController {

        @RequestMapping(value="usuario/{id}")
        public Usuario getUsuario( @PathVariable Long id ) {
            Usuario usuario = new Usuario();
            usuario.setId(id);
            usuario.setNombre("Joselo");
            usuario.setApellido("Valencia");
            usuario.setEmail("joselo@gmail.com");
            usuario.setTelefono("354435");
            return usuario;
        }

        @RequestMapping(value="usuariomod")
        public Usuario modifyUsuario() {
            Usuario usuario = new Usuario();
            usuario.setNombre("Joselo");
            usuario.setApellido("Valencia");
            usuario.setEmail("joselo@gmail.com");
            usuario.setTelefono("354435");
            return usuario;
        }

        @RequestMapping(value="usuariodel")
        public Usuario deleteUsuario() {
            Usuario usuario = new Usuario();
            usuario.setNombre("Joselo");
            usuario.setApellido("Valencia");
            usuario.setEmail("joselo@gmail.com");
            usuario.setTelefono("354435");
            return usuario;
        }

        @RequestMapping(value="usuariosea")
        public Usuario searchUsuario() {
            Usuario usuario = new Usuario();
            usuario.setNombre("Joselo");
            usuario.setApellido("Valencia");
            usuario.setEmail("joselo@gmail.com");
            usuario.setTelefono("354435");
            return usuario;
        }

En este momento al reiniciar el servidor y acceder a la ruta http://localhost:8080/usuario/5464

se obtiene la siguiente  ya que esta recibiendo el id y lo esta agregando automaticamente.

    // http://localhost:8080/usuario/5464

    {
      "id": 5464,
      "nombre": "Joselo",
      "apellido": "Valencia",
      "email": "joselo@gmail.com",
      "telefono": "354435",
      "password": null
    }

Todos estos valores estan hardcodeados, ahora es necesario usar una BD para darle dinamizacion

## 21. Llamar a una API con AJAX 
Dentro de static en la estructura del proyecto hay un html tables. Se explora con google chrome para ver que contiene.

http://localhost:8080/tables.html

Esta pagina tiene una tabla con varios registros y paginacion. No consulta BD sino que toxdos los datos estan cargados y con JS cambia automaticamente. Esto es un componente ya armado con informacion quemada. La idea es crear la tabla con la informacion de los usuarios que se tiene disponible de los usarios que se van creando.

En este punto se esta haciendo con vanilla JS, pero es compatible con algun otro frameworkcopmo react o angular.

### Creacion de tabla para consumo de usuarios en frontend

El archivo tables.html es bastante grande, por lo que se explora en el programa donde estan los datos quemados usando lainformacion de los usuarios mostrados en la tabla actualmente.

La idea es modificar este archivo por lo que se crea una copia para mantener el original. A esta copia se le llama usuarios.html. Inicialmente se quiere dejar solamente un usuario, por lo que en el nuevo html se eliminan todos los registros menos el primero.

Esto es todos los elementos que hay en el tbody. Al recargar el servidor y acceder a la nueva ruta /usuarios.html se púede ver que solo hay un registro. Se modifica la tabla para que no muestre footer.Solo queda la cabecera y una fila.

Se modifica el nombre de las columnas a ID, Nombre completo, Email, telefono, AAcciones. La columna de acciones va a permitir agregar iconos para ampliar la funcionalidad. Se modifica la fila para que tenga los datos modificados.

Tambnien en la pagina de los componentes se usa uno de los botones para eliminar, se trae al copiar inspeccionando todo el elemento html y copiandolo para evitar buscar el codigo html en lña pagina.

    <thead>
        <tr>
            <th>ID</th>
            <th>Nombre Completo</th>
            <th>Email</th>
            <th>Teléfono</th>
            <th>Acciones</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>12351</td>
            <td>Jose Valencia</td>
            <td>sejoma989@gmail.com</td>
            <td>15618132</td>
            <td>
                <a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i</a>
            </td>
    </tbody>

Al actualizar se puede apreciar el boton. 

El proximo paso es que cuando se entre a esta pagina haga un llamado de datos al servifdor para traer los usuarios automaticamente liostando los usuarios y los cargue en la tabla para que los muestre.
Luego ampliar la funcionalidad con JS y darle la paginacion automatica.

### Funcionalidad de paginacion automatica.
Al volver a explorar el codigo HTML se puede apreciar que la tabla que carga estos datos tiene un id="datatable" este id debe estar siendo usado para incializar la tabla y dar la logica de la paginacion,al buscar ctr + shft + F para buscar el id en todo el proyecto y encontrar donde se le da la fincionalidad JS e inicializa la tabla.

Al buscar dataTable se encuentra en la carpeta /js/demo que esta ubicado elarchivo databases-demo. Se crea una copia y se saca de la carpeta demo, quedaria /js/usuarios.js

Se modifica por el nuevo id de la tabla. En este caso se esta seleccionando la tablapor id y luego le agrega funcinoalidad con .DataTable para dinamismo.

Una vez se cargue la pagina se ejecuta la funcionalidad que esta en la funcion ready. Si se agrega un alert, se va a visualizar una vez se carga la pagina, al terminar de cargarla.

    $(document).ready(function() {

        alert(459648684654);
      $('#userTable').DataTable();
    });

### Fetch al endpoint /usuarios/id
Se va a crear una funcion cargarUsuarios que permita que cuando se cargue la pagina lame esta funcion.
Luego se crea la funcion cargarUsuarios que va a tener una peticion fetch al endpoint.

    (async () => {
      const rawResponse = await fetch('https://httpbin.org/post', {
        method: 'POST',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        body: JSON.stringify({a: 1, b: 'Textual content'})
      });
      const content = await rawResponse.json();

      console.log(content);
    })();

Se modifica para que sea a la url usuarios/id y tambien para que sea una peticino GET. Se dejan los headers que indican que se va a transmitir JSON y tambien se elimina el body porque no se necesita en este caso. 

la constante que trae los datos se renombra a request y el resultado de la request convertyido a JSON se llama usuarios.

Finalmente un console.log para entender que es lo que está haciendo.

    $(document).ready(function() {
        cargarUsuarios();
      $('#userTable').DataTable();
    });


    async function cargarUsuarios() {

          const request = await fetch('usuario/12351', {
            method: 'GET',
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
            },
          });
          const usuarios = await request.json();

          console.log(usuarios);

    }



Finalmente esta funcion debve ser asincrona para garantizar que se obtienen los datos, se reuinicia el servidor.

Al dar cliock en la poestaña de network del inspector de chrome se aprecia que para las peticiones XHR de fetch muestran la informacion del  header. Tiene un metodo, un url un status code.

En la pestaña Response se puede ver la respuesta que devuelve el servidor y en preview es similar a la respuesta que se ve en la consola. Un elemento muy interesante es en el initiator que permite ver el camino que sigue el llamado de la funcion permitiendo ver exactamente desde que lado se llama en el servidor.

En este punto esta peticion devuelve un solo valor,asi que en este momento se crea lo necesario para que devuelva varios.

### Nuevo controlador para busqueda de todos los usuarios
Dentro del controlador se crea una nueva funcion que controle las peticiones cuando recibe la ruta usuarios sin un id.

Tambien lo que devuelve va a ser una Lista. Se crean otros dos usuarios y se les cambia el nombre a la variable.
Se crea una variable llamada usuarios de tipo lista de usuarios y se iguala a un new ArrayList<>() que es el resultado final. Al final se devuelve la lista usuarios. A esta lista hay que agregar los usuarios con el metodo add.

    @RequestMapping(value = "usuario")
    public List<Usuario> getUsuarios(@PathVariable Long id) {

        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Joselo");
        usuario.setApellido("Valencia");
        usuario.setEmail("joselo@gmail.com");
        usuario.setTelefono("354435");

        Usuario usuario2 = new Usuario();
        usuario2.setId(id);
        usuario2.setNombre("Mario");
        usuario2.setApellido("Henao");
        usuario2.setEmail("mario@gmail.com");
        usuario2.setTelefono("75196435");

        Usuario usuario3 = new Usuario();
        usuario3.setId(id);
        usuario3.setNombre("Juan");
        usuario3.setApellido("Chumbo");
        usuario3.setEmail("jcd@gail.com");
        usuario3.setTelefono("699835");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
    }

Se tienen alfgunos errores de ejecucion ya que no se elimino el parametro que recibe la ruta. Se elimina y tambien se agrega un id a cada uno de los usuarios.
Los id deben ser casteados a Long agregando una L al final. Finalmente se modifica la ruta de /usuario a /usuarios y tambien la funcion a getusuarios. Finalmente este controlador quedaria de la siguiente manera

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios() {

        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Joselo");
        usuario.setApellido("Valencia");
        usuario.setEmail("joselo@gmail.com");
        usuario.setTelefono("354435");

        Usuario usuario2 = new Usuario();
        usuario2.setId(2L);
        usuario2.setNombre("Mario");
        usuario2.setApellido("Henao");
        usuario2.setEmail("mario@gmail.com");
        usuario2.setTelefono("75196435");

        Usuario usuario3 = new Usuario();
        usuario3.setId(3L);
        usuario3.setNombre("Juan");
        usuario3.setApellido("Chumbo");
        usuario3.setEmail("jcd@gail.com");
        usuario3.setTelefono("699835");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
    }

Se puyede formatear el json con un formateador online para revisar como seria el estado final en caso de notner ninguna extension.

### Mostrar usuarios en el html
En el html se tiene una tabla con ID userTabley se tiene el theader y el tbody. Dentro del tbody se debe generar una fila por cada uno d los usuarios recibidos dentro del json. Dentro de js se llama a la tabla y el contenido de tbody.

Para moduficar loss electores desde el google chrome se puede hacer una prueba preliminar. Se abre la consola de google chrome y se puede apreciar que al ingresar esta linea en la consola.

    document.querySelector('#userTable tbody').outerHTML = 'care chimba';

Se modifica el codigo en la tabla directamente en el codigo javascript que maneja la tabla usuarios.js
la idea es guardarlo en una variable y que se repita para cada valor recibido del json que cree una linea de la tabla. Se trae el codigo html de la tabla y se pega entre comillas en el outerHTML, tener en cuenta crear copmillas simples


    let usuario = '<tr><td>12351</td><td>Jose Valencia</td><td>sejoma989@gmail.com</td><td>15618132</td><td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>'

    document.querySelector('#userTable tbody').outerHTML = usuario ;

Para este caso se revisa reiniciando el servidor para ver el resultado, recordar actualziar sin cache con ctrl + R para que elimine la cache.

#### Agregar todos los usuarios en el JSON
Se usa un for each para que recorra todos los elementos usuario dentro de usuarios. Se renombra la variable que se esta devolviendo al html como usuarioHtml. Para este foreach se deben reemplaxzar los valores de cada cambpo por lo que tiene el usuario. Si el usuario.nombre permite acceder al jnombre del usuario se debe traer todos los valores. para concatejnar en la cadena que se devuelve se agrega dentro de todo el string como '+usuario.nombre+'

El inicial es nombre completo, por lo que debe concatenarse el nombre y el apellido en la respuesta. para el email tambien se reemplaza el valor como el telefono

    for ( let usuario of usuarios ) {
      let usuarioHtml = '<tr><td>'
                          +usuario.id+'</td><td>'
                          +usuario.nombre+' '+usuario.apellido+'</td><td>'
                          +usuario.email+'</td><td>'
                          +usuario.telefono+'</td><td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>'
                          ;
    }
    document.querySelector('#userTable tbody').outerHTML = usuarioHtml ;

Se tiene el HTML de cada usuario pero todos deben ser concatenado en un string que es el listado final. En una variable auxiliar llamada listadoHtml antes del for que se inicializa vacia. por cada recorrido del for se agrega esta variable dentro de liostadoHtml con += listadoHtml, que es el que se devuelve al final

     let listadoHtml = '';
     for ( let usuario of usuarios ) {
       let usuarioHtml = '<tr><td>'
                           +usuario.id+'</td><td>'
                           +usuario.nombre+' '+usuario.apellido+'</td><td>'
                           +usuario.email+'</td><td>'
                           +usuario.telefono+'</td><td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>';
       listadoHtml += usuarioHtml;
     }
     document.querySelector('#userTable tbody').outerHTML = listadoHtml ;

De esta manera se crea una linea de la tabla para cada iteracion del usuario

## 22. Creación de una Base de Datos 
Para que los datos sean persistentes y sea un listado real hay que crear una BD. La base de datos se va a usar XAMPP. Se instala, se puede apreciar que detecta tomcat lanzado.

Se levbanta apache y MySql desde el XAMPP para crear la base de datos. En caso de que de problemas lo mas comun es que el puerto este ocupado.

Para crear la base de datos en phpmyadmin se nombra como gestionusuariosjava_bd y se crea como utf8_bin porque es el que menos probelmas trae.

Se crea una tabla usuarios que tiene 5 columbnas.
id es BIGINT y es la llave primaria y se selecciona la casilla de autoincremental.
nombre, apellido, telefono e email son varchar y el email tiene 255 telefono 40 y apellido y nombre 40 asi como contraseña.

    CREATE TABLE `gestionusuariosjava_bd`.`usuarios` (`id` BIGINT NOT NULL AUTO_INCREMENT , `nombre` VARCHAR(40) NOT NULL , `apellido` VARCHAR(40) NOT NULL , `telefono` VARCHAR(40) NOT NULL , `email` VARCHAR(255) NOT NULL , `password` VARCHAR(40) NOT NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB;

Se crea la tabla que en el momento no tiene datos, pero se pueden agregar varios de ejemplo desde el insert, dejando el id vacio porque es automatico.

En este momento se tienen datos de prueba y resta la conexion desde el srvidor a la base de datos

## 23. DAO Layer y conexión con Base de Datos 
En el codigo se tienen dos package, controllers y models, se agrega un tercero que es el DAO, Data Access Object y dentro se ponen todas las clases que van a hacer conexion a la base de datos y cada clase representa una tabla.

### Creacion de interface usuarioDao

Se crea el paquete y una nueva clase que no va a ser java.class sino java.interface y se va a llamar UsuarioDao. 

En los controllers se tienen varias funciones donde cada una maneja una peticion segun la ruta y el verbo con el que se consume. 
En nuetro caso son getUsuario y getUsuarios, modificar, etc. Una interface es un archivo que determina que funciones deberia tener esa clase. En esa interface se puede decir getUsuario,getUsuarios, modificar, etc, si la clase implementa esa interface esta obligada a usar estas funciones y si no las usa no se puede compilar.
Inicialmente dicta el esqueleto de cada clase. Pero tiene muchas otras funcionalidades mas complejas que se revisan mas adelante.

En la interface se declaran las funciones obligatorias. la primera seria getusuarios. la diferencia con las clases es que al declarar la funcion el cuerpo de la funcion en las llaves no tiene nada, es vacio, solo indica como debe ser la funcion.

La clase que usa esa interface esta obligada a crear la funcion. Si en la interface se tuviera una clase patito, esta clase patito deberia estar implementada en la clase al implementar la clase UsuarioDao. Se puede ver que el IDE da como solucion al error implementar la funcion patito.

Inicialmente se define el metodo getUsuarios en la interface unicamente.

    // UsuarioDao
    package com.cursojava.gestionusuarios.dao;

    import com.cursojava.gestionusuarios.models.Usuario;

    import java.util.List;

    public interface UsuarioDao {

        List<Usuario> getUsuarios();

    }


Se crea otra clase para implementar en /dao pero si va a ser una clase de implementacion, que va a permitir implementar la interface creada. Al implementar el metodo genera un error, al solucionarlo genera una pantalla nueva que permite definir los metodos a implementar en la interface

    // UsuarioDaoimp
    package com.cursojava.gestionusuarios.dao;

    import com.cursojava.gestionusuarios.models.Usuario;

    import java.util.List;

    public class UsuarioDaoimp implements UsuarioDao{
        @Override
        public List<Usuario> getUsuarios() {
            return null;
        }
    }

Si se quitara el override y el implements funcinoaria pero no de la manera mas optima ya que se quiere implementar el comportamientode un patron de diseño.

## 24. Repository con Hibernate 
La clase UsuarioDaoimp tiene algunas anotaciones particulares.
@Reposityory y @Transactional, en caso que no aparezca se agrega como una dependencia de maven.

Para agregar @Transactional es necesario agregar las siguientes lineas en el pom.xml

    <dependency>

           <groupId>org.springframework.boot</groupId>
    	<artifactId>spring-boot-starter-data-jdbc</artifactId>
    </dependency>

    <dependency>
    	<groupId>com.h2database</groupId>
    	<artifactId>h2</artifactId>
    	<scope>runtime</scope>
    </dependency>

Posteriormente se refresca maven desde el boton de refrescar en el menu maven, una vez que termine y reconozca las nuevas dependencias, se reinicia el servidor y seprocede a solucionar el error agregando Transactional como unad ependencia maven.

    public class UsuarioDaoimp implements UsuarioDao{
        @Repository
        @Transactional
        @Override


Repository hace referencia a que tiene la funcionalidad de acceder al repositorio de la base de datos. Transactional a la forma en como va a armar las consulatas SQl en dfragmentos de transaccion. Repository es la conexion a la BD y Transactional como se va a comunicar con la BD la manera de hacer las query

### creacion del entitymanager
Se crea una variable provada entityManager de ese mismo tipo. Para agregar esta clase es neesario hacer una modificacion al pom y agregar una dependencia particular.
Antes de que finaliza el tag dependencias se pega el siguiente codigo. Por un lado la dependencia de mysql y por otro lado la que permite cargar el entityManager

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>8.0.19</version>
			<scope>runtime</scope>
		</dependency>

Finalmente al iniciar la clase UsuarioDaoimp se agrega la nueva variable de tipo EntityManager y se le da a importar la clase.

    private EntityManager entityManager;

Esta variable tiene una notacion especial y es @PersistanceContext. Hace referencia al contexto del lugar de la BD que va a usar.

EntityManager permite la conexion con la BD, asi que se hace la consulta creando un string query que contiene una consulta en un formato muy parecido a SQL, esta consulta se crea dentro de la funcion. Se usa el nombre de las clases de java, no el nombre de las clases. En este caso es una sentencia basica pues solo trae toda la informacion de los usuarios.Se crea la query con createQuery(query) que es un metodo de entityManager y recibe el query y se concatena con getResultList para crear una respuesta tipo lista. 

        String query = "FROM Usuario";
        entityManager.createQuery(query).getResultList();

Como es una lista de usuarios se crea una lista de usuarios llamada resultado y se retorna.

    @Override
    @Transactional
    public List<Usuario> getUsuarios() {
        String query = "FROM Usuario";
        List<Usuario> response = entityManager.createQuery(query).getResultList();
        return response;        
    }

Sin embargo al guardar una variable y devolver el resultado lo mehor es que quede en una sola linea

        return entityManager.createQuery(query).getResultList();

De esta manera se hace la consulta de la base de datos. En este momento solo se le da una referencia a la clase Usuario, y la clase usuario deberia indicar la tabla a la que quiere ir. Para esto se crean algunas anotaciones para indicarle a Usuario las tablas a usar.

Con la notacion @Table que lleva ( name="usuarios") al inicio de la clase sabe que debe4 ir a la tabla usuarios. Y tambien se le da la notacion de @Entity. verificar que estas dos notaciones vengan desde java.persistance

    // models/Usuario.java
    import javax.persistence.Entity;
    import javax.persistence.Table;

    @Entity
    @Table( name = "usuarios" )
    public class Usuario {

De esta manera se le indica al modelo como proceder cuando se le indique una busqueda

## 25. Lombock 
En este modelo se puede apreciar que los getters and setters son un desorden y repetitivo, para optimizar esto se busca Maven lombok para encontrar la seccion pom correspondiente a esta funcinoalidad, el cual almomento de la buisqueda esta en la siguiente version.

    <dependencies>
    	<dependency>
    		<groupId>org.projectlombok</groupId>
    		<artifactId>lombok</artifactId>
    		<version>1.18.26</version>
    		<scope>provided</scope>
    	</dependency>
    </dependencies>

Una vez agregada al pom.xml al gfinal de las dependencias, hay que actualizar el Maven y luego de vuelta a usuario.java, se van a borrar todos los metodos accesores y se van a agregar por anotaciones, la clase usuarios quedaria de esta manera.

    @Entity
    @Table( name = "usuarios" )
    public class Usuario {

        @Getter @Setter
        private Long id;

        @Getter @Setter
        private String nombre;

        ...




Sele esta indicando que tabla se esta usando pero hibernate no encuentra automaticamente el nombre de las comlumnas, por loo uqe hay que agregar la notacion column antes de cada variable para indicar el nombre de la columna en la BD. El modelop completo seria

    @Entity
    @Table( name = "usuarios" )
    public class Usuario {

        @Getter @Setter @Column( name = "id" )
        private Long id;

        @Getter @Setter @Column( name = "nombre" )
        private String nombre;

        @Getter @Setter @Column( name = "apellido" )
        private String apellido;

        @Getter @Setter @Column( name = "email" )
        private String email;

        @Getter @Setter @Column( name = "telefono" )
        private String telefono;

        @Getter @Setter @Column( name = "password" )
        private String password;

    }

Lombok permite generar cualquiera de las funciones como toString el equals and hash code todas las hace lombok directamente agregando notaciones que generan la funcionalidad para toda la clase

    @Entity
    @Table( name = "usuarios" )
    @ToString @EqualsAndHashCode
    public class Usuario {

Para algunos casos puntuales de lombok puede haber algunas complicaciones, es necesario revisarlos en detalle.
Finalmente es necesario agregar una notacion a la columna id para indicar que esta es la llave primaria.

    @Id
    @Getter @Setter @Column( name = "id" )
    private Long id;


## 26. Inyección de Dependencias 
Es un concepto que ha tomado mucha importancia en el desarrollo backend y frontend. Es un patron usado en el diseño orientado a objetos de un appa. Es parte de los principios SOLID. Tiene como finalidad solucionar un problema comun encontrado por los programadores en la construccion de aplicaciones que es mantener los componentes o capas de una aplicacion lo mas desacopladas posible.

Para esto la ID permite inyectar comportamiento a componentes haciendo que las piezas de software sean independientes, comunicandose a travez de una ibnterfaz extrayendo responsabilidades de un componente para delegarlas en otro y estableciendo un mecanismo para que el nuevo componente sea cambiado en tiempo de ejecucion. Se basa en otro patron de diseño mas general llamado inversion de control.

Un uso indebido seria pensar que soluciobnqa cualquier problema haciendo la arquitectura muy compleja e innecesaria. Un ejemplo practico seria una aplicacion que implementa una funcionalidad de comunicacion por tres metodos, email, SMS y whatsapp.  Se tienen tres clases, cada una con una funcion de enviar para cada caso particular pra enviar un elemento adecuado. La funcion es bastante parecida en los 3, se puede crear una interface quye sea implementada por cada clase y que tenga obligatorio la funcion enviar. Hasta ahora se tienen 3 cklases y la interfaz de comunicacion.

La idea es que en otra parte del codigo donde se necesite hacer la comunicacion, se crea una variable tipo comunicacion y se le pasa el objeto cuando vba a usar la clase, no se crea el objeto directamente en la fguncionalidad, sino queda separado en caso de que cambie la comunicacion se le pasa un nuevo objeto. Cuando se tiene que iomplementar la comunicacion, emn vez de usar una clase directamente se usa la clase comunicacion, y en vez de crear el objeto duirectamente se asigna desde otro lugar de esta manera queda completamente desacoplado

## 27. Listar Usuarios 
En este momento los usuarios que se estan mostrando son quemados desde el mismo controlador UsuarioController. Se borran porqaue ahora se vba a incvoacr la BD, se crea una nueva variable usuarioDao que tiene notacion @Autowired y hace que la clase usuarioDaoimp cree un objeto y la guarde dentro de la variable UsuarioDao. Al usar @Autowired en otras partes ese objetio va a estar compartido y ligado en memoria opor lo que se debe usar con cuidado. Esta es la inyeccion de deopendencias.

    @RestController
    public class UsuarioController {

        @Autowired
        private UsuarioDao usuarioDao;

Se tiene el objeto cargado y se puede usar, en el controlador getusuarios se retorna la invocacion de este usuarioDao con el query getusuarios

        @RequestMapping(value = "usuarios")
        public List<Usuario> getUsuarios() {
            return usuarioDao.getUsuarios();
        }

### Configuracion de BD en proyecto

Para la configuracion de la base de datos hay que ir direct5amente al directorio resources dentro de src/main donde se guardan los properties de configuracion de proyecto y es donde se debe configurar la BD. En application.properties

    # GENERAL
    server.port=8080
    # DATABASE
    spring.datasource.url=jdbc:mysql://localhost/gestionusuariosjava_bd?useSSL=false
    spring.datasource.dbname=gestionusuariosjava_bd
    spring.datasource.username=root
    spring.datasource.password=
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

Inicialmente se define el puerto que va a estar levantado en el servicio, opor defecto es 8080 pero para las paginas web lo ideal es que sea el puerto 80. Al entrar en cualquier URL entra por el puerto 80, asique google.com:80 es lo mismo que google.com.

En la configuracion de la url de la BD debe configurarse como mysql e indicarse que se va a usar desde localhost. En caso de tener un servidor hay que indicar el numero de ip. En la url tambien se agrega el nombre de la base de datos, finalmente una bandera para que no use SSL en desarrollo.

Luego se le indica el nombre de la BD. Posteriormente el usuario y contraseña de la base de datos. Finalemnte el driver de mysql indicandole a spring que va a usar de driver mysql en el datasource. Se reinicia el servidor y se hace la prueba. 

Deberia mostrar los regisrtos que se encuentran en la BD en formato API al acceder a http://localhost:8080/usuarios. Para acceder al frontend actualizado se cohncatena .html para indicar que es la vista. Esto deberia estar organizado y en los controllers, en vez de que la ruta sea directamente usuario, se agrege primero api/ para que se acceda en formato api

    // UsuarioController.java
    @RequestMapping(value = "api/usuarios/{id}")

Tambein se moedifica en el consumo desde el frontend.

    // usuario.js
    const request = await fetch('api/usuarios', {

Con esto se completa la funcionalidad de listado.

## 28. Eliminar Usuarios 
Para eliminar usuarios se usa el mismo endpoint pero se consume con un metodo http diferente al get que es el que se tiene por defecto.

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)

Este seria el mismo ejemplo que se tenia antes, ya que este es el valor por defecto. Es importante tener en cuenta que la funcionalidad de los verbos o metodos HTTP es de direccionar funcionalidad, no exactamente ejecutar la operacion mencionada. En ese caso, la funcionalidad del metodo la define el codigo que se ejecuta al acceder al método. Lo que se hace es que el metodo le de sntido a la funcionalidad.

Para el metodo delete se modifica lo que devuelve la funcion ya que no quiere traer nada, es solo una accion ejecutada, su tpo es void. Dentro del controlador de eliminar se llama a usuarioDao.eliminar() esta funcion no existe aun, asi que al terminar de definir la funcion se le da dar click para resolver error y el IDE la crea.

Se le pasa el id porque se necesita apra saber que usuario debe eliminarse asi que se debe recibir en la funcion como Long id agregando una notacion @PathVariable. Este valor se pasa al id

    // Usuario.Controller

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void deleteUsuario( @PathVariable Long id ) {
        usuarioDao.deleteUsuario(id);
    }

Se soluciona el problema para que cree directamente el metodo en la interfaz

    // UsuarioDao

    void deleteUsuario(Long id);

Se puede apreciar que levanta un error en UsuarioDaoimp asi que dentro de ese archivo se implementa el metodo que contiene la funcionalidaddel controlador. Dentro de la funcion de eliminar en la implementacion de usuario se llama al entityManager.remove() que permite ejecutar una accion de eliminar, se le pasa un usuario que es elñ objetivo a eliminar.

    // UsuarioDaoimp

    @Override
    public void deleteUsuario(Long id) {
        entityManager.remove(usuario);
    }

Paera obtener el usuario una manera es consultar a la base de datos usando el entitymanager.find(usuario.class, id) para pedir que busque por el usuario

### Funcionalidad del boton en el frontend para eliminar
Para da r la funcionalidad al boton de eliminar en el front es necesario recordar que el borton esta siendo renderizado por el JS, asi que se corta el pedazo de codigo en una variable botonEliminar separada que tiene el contenido html dentro de ''. Esta variable debe ubicarse donde se cortó el codigo usando la notacion ' + botonEliminar + '.

    let botonEliminar = '<a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>'

Se crea una nueva funcion al final del codigo llamada deleteUsuario que va a recibir el id que se le envia. Se despliega una alerta para ver lavariable que se esta recibiendo. Esta funcion se deberia ejecutar al hacer click en el boton, asi que dentro de la nueva variable recortada se agrega un eventlistener onclick=deleteUsuario(id).

    let botonEliminar = '<a href="#" onclick=deleteUsuario(5464) class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>'


                    +usuario.telefono+'</td><td>' + botonEliminar + '</td></tr>';


    function deleteUsuario(id) {
        alert('hola prro, sos un crack!!: ' + id)
    }

Esta variable botonEliminar debe estar dentro del for para que capture la informacion del usuario.id para cada iteración. Se hace una prueba reiniciando el servidor para verificar que se recibe el alert limpiando la cache del navegador.

    let botonEliminar = '<a href="#" onclick=deleteUsuario(' + usuario.id + ') class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>'


La prueba es exitosa ya que al dar click en el icono de eliminar muestra el id. Ahora debe hacer el llamado al servidor con esa informacion.

### Llamado al servidor con informacion de id para eliminar usuario
Dnetro de la nueva duncion deleteUsuario donde estaba el alert se agrega la misma request que se tiene para cargarUsuario. Se cambia el metodo para que sea 'DELETE' y en la URL se concatena  'api/usuarios' +id

    function deleteUsuario(id) {
      const request = await fetch('api/usuarios' + id, {
        method: 'DELETE',

No es necesario transformar nada en json porque no se tiene respuestas de ese tipo. Verificar que la funcion es asincrona. Al hacer la prueba en el navegador se abre la consola para verificar en network/XHR que pasa cuando se de click en el icono. Paraece que todo funciona bien y al revisar en la BD se tiene un usuario menos, en el bnavegador aun se muestra porque solo esta enviando la peticion de borrar.

Se agrega un alert que despliegue un cartel para confirmar si se quiere eliminar el usuario con el metodo confirm() que despliega las opciones por defecto si=true, no=true para un texto que se despliega. Lo que se ejecuta dentro de las llaves es lo que se dispara cuando la opcion sea true, si se niega el confirm se dispara si es false, se cambia la logica del la funcion y dentro simplemente tiene un return; para que corte el flujo.

    if( !confirm('¿Desea eliminar este usuario?: ' + id) ) {
      return;
    }

Al final de la funcion se agrega un location.reload() para que recargue la pagina y los registros que se muestran en la tabla cuando se dispara el boton.

    location.reload();

Al hacer laprueba en el navegador se aprecia el comportamiento esperado.

Hay algunos textos que se podrian cambiar, la manera mas facil es copiar el texto y buscarlo directamente en el archivo ques e esta visualizando en el front, en este caso usuarios.html.

## 29. Registrar Usuarios 
Primero se creó la funcinoalidad de listar usauarios y quemando datos, posteriormente borrar usuarios y al final crearlos, porque al crear los usuarios es necesario listarlos.

Hay un archivo register.html que en el frontend lleva a una pagina de registro

    http://localhost:8080/register.html

Permite crear una cuenta con algunoas campos basicos. Se renombra el archivo desde el directorio para que sea registrar.html. Dentro del archivo se puede ver que la estructura esta en ingles, por lo que se van a cambiar algunos textos para que coincida con la estructura de la aplicacion que se tiene ahora. Se Cambian los textos en ingles y los placeholders tambien asi como la eliminacion de los botones de login con fb o google que son inecesarios, solo queda el de registrarse o el boton de login.

Luego de revisar el formto del documento html y hacer que coincida la estructura con nuestro proyecto, es necesario verificar si hay algun archivo .js para este registrar.html



### creacion de script para registro
Se crea un nuevo script para el archivo registrar.html que apunta a un nuevo archivo /js/registrar.js que debe ser importado en el html.
Del codigo de usuarios.js se trae el cabecerio que carga el plugin jquery pero ya no debe ejecutar la funcionalidad de cargarUsuarios al cargar la pagina puesto que se llama a esta funcion solo cuando se de click en el boton reguistrar, no cuando se carga la pagina. Tambien se elimina el llamado a la datatable en on ready.

Para las peticiones http se deja solo el primer llamado ala request con fetch, el resto de codigo se elimina por ahora.
El nuevo metodo se llama registrarUsuario() que se llama desde la misma url pero con el metodo POST.

    $(document).ready(function () {
      // on ready
    });

    async function registrarUsuario() {
      const request = await fetch("api/usuarios", {
        method: "POST",
        headers: {
          Accept: "application/json",
          "Content-Type": "application/json",
        },
      });
    }


En el UsuarioController es necesario agregar el usuario por lo que se crea un controlador que desde la misma ruta pero con un RequestMethod = POST llamado registrarUsuario. Este controlador no devuelve nada por lo que es de tipo void.
Dentro de la funcion lo que se hace es llamar a una funcion nueva llamada registrarUsuario que recibe un usuario, ambos aun no han sido creados, primero se describe como deberia usarse y despues como usa los datos.

En los parametros de esa funcion recibe un usuario de tipo Usuario que tiene notacion @RequestBody. De esta manera convierte el JSON que recibe a un usuario automaticamente.

    // usuarioController

    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario) {
        usuarioDao.registrarUsuario(usuario);
    }

Se crea el metodo registrarUsuario solucionando el error para que lo cree en la interfaz UsuarioDao. Muestra un error por un return asi que se quita el return de la funcion crear usuario.

    // UsuarioDao

    void registrarUsuario(Usuario usuario);


Hay otro error desde la clase que lleva a la clase de imlpementacion del metodo, al solucionar el error implementando el metodo genera la funcion que se usa al final. 
Para guardar en BD se llama a entityManager.merge(usuario) y de esta manera deberia funcionar.

    // UsuarioDaoimp

    @Override
    public void registrarUsuario(Usuario usuario) {
        entityManager.merge(usuario);
    }

### Captura de datos desde el front
En este punto ya se tiene la conexion a la base de datos y el controlador para manejar la ruta, sin embargop es necesario caputar los datos que ingresa en el formulario del front el usuario que se va a registrar. Al dar click en registrar cuenta, hay que capturar datos de nombre apellido email y password y enviar todo al servidor. Esta es una request que si tiene body, popr lo que es necesario agregar a la peticion que se envia desde el front la linea que permite enviar el body.

    // registrar.js

    body: JSON.stringify({a: 1, b: 'textual content})

Al agregar esta linea llama la funcion JSON.stringifgy que toma cualquier objeto JS y lo convierte a un string JSON. Lo que se quiere enviar en el body es un arreglo datos. Se crea una nueva variable datos que es un objeto inicializado al inicio de la peticion.

    let datos = {};


Es necesario tener en cuenta que los datos que se envian deben ser exactamente igual a los que se reciben. La pantilla se puede ver en UsuarioController que recibe un @RequestBody desde la clase Usuario. En el modelo usuario este tiene nombre, apellido, email, telefono, password. En este momento el modelo tiene tambien el campo telefono, que no se tiene en el front. Se va a agergar en el front pero se va a modificar la BD para que reciba valores nulos en este campo, osea el campo telefono es opcional. El id se genera automaticamente por lo que no se envia. El formato debe ser igual al nombhre que se le da a las columnas.

    ALTER TABLE `usuarios` CHANGE `telefono` `telefono` VARCHAR(40) CHARACTER SET utf8 COLLATE utf8_bin NULL;

En registrar.js es necesario extraer el nombre del input nombre. Dentro del html se busca la caja de texto nombre, esta caja tiene un id, se modifica el nombre de id por txtNombre para que sea mas representativo, se repite el proceso par todos los input. Dentro de registrar.js es necesario capturar todos los valores del body para enviarlos a la BD.

    <div class="container">

        <div class="card o-hidden border-0 shadow-lg my-5">
            <div class="card-body p-0">
                <!-- Nested Row within Card Body -->
                <div class="row">
                    <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
                    <div class="col-lg-7">
                        <div class="p-5">
                            <div class="text-center">
                                <h1 class="h4 text-gray-900 mb-4">Registrate ya</h1>
                            </div>
                            <form class="user">
                                <div class="form-group row">
                                    <div class="col-sm-6 mb-3 mb-sm-0">
                                        <input type="text" class="form-control form-control-user" id="txtNombre"
                                            placeholder="Nombre">
                                    </div>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control form-control-user" id="txtApellido"
                                            placeholder="Apellido">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <input type="email" class="form-control form-control-user" id="txtEmail"
                                        placeholder="Email">
                                </div>
                                <div class="form-group">
                                    <input type="text" class="form-control form-control-user" id="txtTelefono"
                                           placeholder="Teléfono">
                                </div>
                                <div class="form-group row">
                                    <div class="col-sm-6 mb-3 mb-sm-0">
                                        <input type="password" class="form-control form-control-user"
                                            id="txtPassword" placeholder="Contraseña">
                                    </div>
                                    <div class="col-sm-6">
                                        <input type="password" class="form-control form-control-user"
                                            id="txtRepetirPassword" placeholder="Repita Contraseña">
                                    </div>
                                </div>
                                <a href="login.html" class="btn btn-primary btn-user btn-block">
                                    Registrarse
                                </a>
                                <hr>
                            </form>
                            <div class="text-center">
                                <a class="small" href="login.html">¿Ya tienes una cuenta? ¡Inicia sesión!</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

Estando en el navegador se abre la consola de google para ejecutar sentencias JS que permitan capturar los datos del formulario verificando que esta levantado el servicio. Para haer la prueba se emite un alert que es una alerta y se puede ver emitida rapidamente para verificar que corre codigo javascript.

Con el objeto document.getElementById('txtNombre) se obtiene acceso a todo el elemento html, solo se quiere obtener el texto que se obtiene con .value

    document.getElementById('txtNombre).value

Al ejecutar la sentencia en la consola del navegador se aprecia que captura el campo nombre del formulario de registro ingresado. En este caso el elemento 'txtNombre' se esta obteniendo sin el simbolo # como se habia hecho anteriormente, es porque eso funciona cuando es querySelector porque el selector que recibe en el medio es el mismo de css con # . clases, etc. Se puede hacer de ambas maneras.

En la parte del codigo javascript luego de la creacion del objeto datos se crea una propiedad con el mismo nombre de columna para cada campo agregando la sentencia para obtener el value del textfield

    datos.nombre = document.getElementById('txtNombre').value;

Se ejecuta esta operacion para cada una de las variables que se van a asignar a la columna

    // registrar.js

    let datos = {};
    datos.nombre = document.getElementById('txtNombre').value;
    datos.apellido = document.getElementById('txtApellido').value;
    datos.email = document.getElementById('txtEmail').value;
    datos.telefono = document.getElementById('txtTelefono').value;
    datos.password = document.getElementById('txtPassword').value;

### Comprobacion de contraseña
Ademas se debe hacer la comprobacion de que los dos vaklores introducidos en los campos de contraseña sean iguales. Se crea una nueva variable repetirPassword que almacena tambien el valor del campo txtRepetirPassowrd. Se hace la verificacion, en caso que las dos variables sean diferentes se emite una alerta indicando que son diferentes las contraseñas. Se ejecuta un return para que se corte la ejecucion y no haga el request.

    let repetirPassword = document.getElementById('txtRepetirPassword').value;
    if ( repetirPassword != datos.password ) {
      alert('Las contraseñas no coinciden');
      return;
    }
    

### Uso de la funcionalidad de registrar
Finalmente cuando haga click en el boton registrar deberia llamar a esta funcion. Esta creada pero no se esta usando. En el html se toma el nombre de la funcion y dentro de la etiqueta a boton se agrega un onclick=registrarUsuario(). De esta manera se llama la funcion registrar usuario.

    <a onclick="registrarUsuario()" href="#" class="btn btn-primary btn-user btn-block">


Se crea el objeto, se verifica la contraseña y se envia la request al servidor. Desde el body se envian los datos armados. Se hace la prueba con el servidor para ver como se comporta. Se verifica el comportamiento en la pestaña network para ver como funciona todo.

En este momento se esta recibiendo un error 500 de parte del servidor. Se exploran los headers y el payload para verificar los datos que se estan enviando. Parece que esta recibiendo los datos, al enviar un error 500 indica que es problema del servidor quien responde. Este error muestra que hay un error con el campo id al momento de guardar. La funcion en UsuarioDaoim se usa .merge que sirve para crear nuevas entidades y actualizar pero no autocompleta el id.

En google indica que a la hora de declarar el id en la calse hay unas anotaciones.

    @GeneratedValue(strategy=GenerationType.IDENTITY)

Se agrega esta anotacion al modelo Usuario en el campo id. Se solucionan los errores al importar la clase y se ejecuta nuevamente el servidor. Se verifica que el servidor se levanta sin problemas y ademas al ejecutar una peticion desde el formulario de registro se recibe el alert que informa sobre guardado exitoso en BD.

Debido a que el campo telefono es opcional, cuando no se reciban datos, en la tabla nop deberia mostrar null o vacio, sdeberia mostrar un - para indicar que no hay numero.

Par hacer esto se procede directamente a usuarios.js en la parte donde se construye el elemnto html a devolver. donde se esta capturando usuario.telefono se recorta y se lleva a una nueva variable, luego de crear la variable telefono la evalua, en caso de que no tenga ningun valor y sea nula deberia mostrar un -, en caso que el campo contenga valores, los deberia mostrar, se usa un operador ternario para efectuar esta opertacion.

    for ( let usuario of usuarios ) {
      let botonEliminar = '<a href="#" onclick=deleteUsuario(' + usuario.id + ') class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>'
      let telefono = usuario.telefono == null || usuario.telefono == ''? '--' : usuario.telefono;
      
      let usuarioHtml = '<tr><td>'
                          +usuario.id+'</td><td>'
                          +usuario.nombre+' '+usuario.apellido+'</td><td>'
                          +usuario.email+'</td><td>'
                          + telefono +'</td><td>' + botonEliminar + '</td></tr>';
      listadoHtml += usuarioHtml;
    }

En este punto se listan usuarios, eliminan, registran, para las otras opestañas como proveedores debe ser similar a lo que se hizo, solo cambian los campos y los modelos.

## 30. Iniciar Sesión 
Se toma la plantilla en static/login.html y se modifica para crear un formulario de login simple con dos campos para emial y passoword y un solo boton para el login.

### Generacion de request login desde el cliente

Luego se verifica si el html ya tiene un archivo js, en este momento tienen varias referencias pero no tiene un archivo js para esta vista html. Se crea la linea del script para que referencie a la arpeta js/login.js. Este archivo no existe por lo que se crea dentro de la carpeta js.

    <script src="js/login.js"></script>

Dentro del archivo login.js se copia y pega el contenido del archivo registrar.html. La funcion se llama iniciarSesion y contiene un arreglo de datos que se traen del body, pero solo agrega datos.email y datos.password. Tambien se verifica que los id que tienen los elementos que se capturan desde el body sean los mismos id de los campos en el html. Se cambia tambien la ruyta de la que consume esta peticion, seria /api/login.

    $(document).ready(function () {
      // on ready
    });

    async iniciarSesion function () {

      let datos = {};
      datos.email = document.getElementById('txtEmail').value;
      datos.password = document.getElementById('txtPassword').value;

      const request = await fetch("api/login", {
        method: "POST",
        headers: {
          Accept: "application/json",
          "Content-Type": "application/json",
        },
        body: JSON.stringify(datos)
      });
      const response = await request.json()
    }


Esta peticion si necesita una variable respuesta que reciba la respuesta del request en formato json.

Lo que continua es que al dar click en el boton login, inicie sesion, osea que mande la peticion al ejecutar iniciarSesion(). Se redirecciona href a # para que no redireccione a ningun lugar. Se levabnta el servidor y se hace una prueba en la ruta login.html para ver que sucede.

    <a onclick="iniciarSesion()" href="#" class="btn btn-primary btn-user btn-block">

Al acceder a la consola del navegador en la pesta;a network accediendo solo a las peticiones al server Fetch/XHR. Se ingresan datos al azar y se da click en iniciar sesion, se puede ver que genera la request pero recibe un 404 ya que no esta implementada la pagina /api/login pero se ve bien el request ya que salio. Al gfinal en los headers se encuentra el payload que muestra los datos que se estan ingresando.

### Procesamiento de request de inicio de sesion en server
Dentro del usuario controller se deberia agregar una funcino para manejar la reque3st de inicio de sesion. Deberia crearse un nuevo controlador de tipo AuthController de autenticacion para separar los usuarios de la autenticacion y control de sesion. 
Se crea un nuevo controlador /AuthController para manejar toda la logica de los controladores de autenticacion e ionicio de sesion. Se copia el request POST a usuarios que se hace en UsuarioController dentro de AuthController.

Cambia la ruta para ser api/login, sigue siendo una péticion post. En usuarioController se tenia una anotacion para el controladore de @RestController. Se renombra la funcion a login y devbe verificarse que usuario y contraseña son correctos.

    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    public void login(@RequestBody Usuario usuario) {
        usuarioDao.verificarEmailPassword(usuario);
    }

Se cra una nueva funcion en usuarioDao que se va a disparar desde el controlador que es usuarioDao.verificarCredenciales.

    boolean verificarCredenciales(Usuario usuario);

Dentro de Daoimp tambien se crea una nueva funcion verificarCredenciales que va a hacer la busqueda en BD. Tener en cuenta que si se pasan los valores directamente se puede dar una inyeccion SQL.
Para evitar esto se cambia la manera que se hace la peticion, donde van los campos se agrega :email y :password y posteriormente se setean los parametros con setParameter("email", usuario.getEmail()) y lo mismo para el password. Esta busqeuda se almacena en una lista, al final se evalua si la lista esta vacia y debe cambairse el tyipo de la funcion para que devuelva un booleano. La condicional se puede arreglar para que devuelva en una sola linea. Debe verificarse que la funcion verificarCredenciales esta en la interfaz con el mismo tipo de dato bool.

    @Override
    public boolean verificarCredenciales(Usuario usuario) {
        String query = "FROM Usuario WHERE email = :email AND password = :password";
        List <Usuario> lista = entityManager.createQuery(query)
                .setParameter("email", usuario.getEmail())
                .setParameter("password", usuario.getPassword())
                .getResultList();

            if (lista.isEmpty()) {
                return false;
            } else {
                return true;
            }

        return !lista.isEmpty();

Dentro de authController se llama la verificarCredenciales y se envia el usuario, se vberifica si es correcta. La funcion verificarCredencialñes devuelve un booleano, por ahora esta funcion va a devolver un string OK en caso que sea true verificarCredenciales y FAIL en caso que sea false.


    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    public String login(@RequestBody Usuario usuario) {
        if (usuarioDao.verificarCredenciales(usuario)) {
            return "OK";
        }
        return "FAIL";
    }

Posteriormente dentro del js de la pagina loghin, se hace la comprobacion de lo que viene en el request. Si en elñ request viene un OK, redirecciona a usuarios.html, pero si viene otra cosa inddica que las credenciales son incorrectas

      body: JSON.stringify(datos)
    });

    const response = await request.text()
    if (response == 'OK') {
    window.location.href = 'usuarios.html'
    } else {
      alert("Las credenciales son incorrectas, intente nuevamente")
    }

## 31. ¿Qué es HASH y cómo funcionan las Contraseñas? 
En los sistemas que guardan la contraseña en su propia base de datos, el servidor convierte la contraseña a un HASH hexadecimal. Al registrar la contrazseña el servidor la encripta con una llave privada para cada cliente, con el fin que ningun otro cliente pueda desencruiptar la contraseña. Cuando se ingresa para logearse, el servidor conoce la llave de cada cliente y permite desencriptar para obtener acceso.

## 32. Implementación de Argon2 
Lo que se quiere hacer es procesar la contraseña copn un HASH para no guardarla en BD. En UsuarioController se busca la funcion de registrar usuario. Se recibe un objeto usuario que tiene contraseña. Se objetiene con el metodo accesor, pero antes de guyardarla hay que pasarla por un HASH. La libreria Argon2 permite crear hashes de contraseñas de manera segura, un estandar en la industria. La dependecy para esta libreria es la siguiente:

		<dependency>
			<groupId>de.mkammerer</groupId>
			<artifactId>argon2-jvm</artifactId>
			<version>2.5</version>
		</dependency>


Dentro de UsuarioController se llama Argon2 con nombre argon2 que llama a Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id) que permite crear el hash para una copntraseña.
Luego se llama la funcion hash de argon2. Este hash recibe el primer argumento para el numero de iteraciones, a mayor numero de iteraciones es mas lento pero seguro, lo recomendado es 1. El segundo parametro recibe el uso de memoria que tiene en este caso es 1024. el tercer argumento indica el paralelismo qye indica que se van a crear varios hilos del proceso para que ande mas rapido, finalmente como 4 argumento el password a hashear. Estyo devuelve un String al que se renombra hash, cambiandop finalmente usando setPassword(hash)

    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario) {
        
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hash = argon2.hash(1, 1024, 1,usuario.getPassword());
        usuario.setPassword(hash);

        usuarioDao.registrarUsuario(usuario);
    }

Al crear este hash estamos excediendo el limite de caracteres que se tiene seteado para la contraseña que inicialmente fue de 40, para esto se modifica lña BD

    ALTER TABLE `usuarios` CHANGE `password` `password` VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL;

De esta manera al hacer la prueba se puede verificar que cuando se regustra un usuario esta contrase;a queda guardada hasheada en base de datos

### Modificacion de inicio de sesion para verificar hash
Para modificar el inicio de sesion y que quede bien, en la funcion verificarCredenciales de Dao implement lo que se hace es obtener el usuario solo por email, la contrase;a no se verifica por base de datos. 

    @Override
    public boolean verificarCredenciales(Usuario usuario) {
        String query = "FROM Usuario WHERE email = :email";
        List <Usuario> lista = entityManager.createQuery(query)
                .setParameter("email", usuario.getEmail())
                .getResultList();

Luego se verifica la contraseña del email capturado con argon. Para capturar el usuariok se modifica el query actual para que solo reciba resultados por email. Posteriormente se crea un nuevo objeto argon2. A ese objeto se le pasa la funcion verify que recibe como parametro el passwordhashed que es el que recibe en el request con el usuario.getPassword() que esta guardado en BD.

        String passwordHashed = lista.get(0).getPassword();

        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        argon2.verify(passwordHashed, usuario.getPassword());

La verificacion que devuelve se puede guardar en una variable bool que luego es retornada

        boolean laPasswordEsLaMisma = argon2.verify(passwordHashed, usuario.getPassword());

        return laPasswordEsLaMisma;

Por buenas practicas de programacion cuando se crea una variable solo para retornar un valor, se puede ahorrar la declaraciomn de la variabley devolver directamente el resultado de la verificacion.

Para evitar el error null pointer exception que se puede dar cuando no encuentre el email y quiera buscar la contraseña de un email que no existe lo que se puede hacer es verificar que la lista este vacia, y en caso que este vacia devuelve false


        // si no hay email registrado
        if ( lista.isEmpty() ) {
            return false;
        }

        // hasheo de verificacion
        String passwordHashed = lista.get(0).getPassword();
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);

        return argon2.verify(passwordHashed, usuario.getPassword());

Lo que se puede hacer es que al registrar un nuevo usuario esto redireccione a la pagina de login, para esto se pone una linea que relocalice la ventan dentro del js de registrar para que al terminar de registrar un usuario redireccione a la pagina de login

    window.location.href = 'login.html'

## 33. ¿Cómo funciona una Sesión de Usuario? 
Para hacer control de sesion de usuario en un sistema se puede ver el diagrama de flujo que se guarda como imagen. ERn la parte de arriba estan los servicios del sistema luego el pasoa paso en el proceso.
para el flujo:

1. Navegador: Usuario llena form de inicio de sesion en navegador y hace click
2. llamada a servidor: El servidor verifica que el inicio de sesion es correcto, si es correcto, crea una sesion.
3. La creacion de la sesion se puede manejar de muchas maneras, con numeros en BD, en memoria o con JWT que es uno de los mas modernos de todos.
4. Respuesta de servidor con ID token: el servidor devuelve un token al navegador
5. Navegador: Almacena el token en cookies, localstorage, etc para enviar la informacion en las cabeceras asi el servidor verifica que la sesion esta bien y todo correcto para devolver una respuesta.

Para cada transaccion que se quiera hacer desde el navegador el usuario esta autenticado con el token en la cabecera.

6. Llamado a servidor: El servidor toma el id o token y verifica que la sesion es corecta, si esta todo bien entonces ejecuta funcionalidades como crear recurtsos

## 34. ¿Qué es JWT y cómo funciona? 

La parte mas importante de todas es donde se crea la sesion. En la forma antigua se guardaba la sesion en memoruia del serivodr. Ahora se crea y envia directamente al usuario. Esto surge porque en el caso que el sistema tenga miles de usuarios los requerimientos del servidor devben ser muy exigentes y si se quiere escalar debe aumentar la capacidad. 
Se puede escalar verticalmente agregando memoria, procesamiento y espacio de almacenamienot,. la segunda se llama escalar horiozontalmente, en vez de mas ram y procesamiento, crea y conecta mas servidores de nuestro ser5vicio.

La primer manera puede ser limitante y mas cara, en caso de tener usuarios de latinoamertica y españa no puede tener un mismo servidor por condiciones geograficas. 
Al tener todo centralizado en un servidor af3ecta al 100% de los usuarios. Por eso es mejor tener varios servidores pequeños en caso de que uno falñle no afecte al resto y puedemn ser distribuidos alrededor del mundo.

De la manera antigua al tener varios servidores es algo complejo compartir las sesiones entre servidores en la memoria ram, es mejor la manera moderna para mantener lo mas simple posible.

Con JWT se tienen muchas ventajas, puede escalar horizontalmente sin problema ya que no almacena sesion en servidor, y el proceso de inicio de sesion con JWT e sigual a lo que se vio antes, pero en el servidor no guarda sesion sino que crea el HWT que envia al navegador y el navegador lo guarda. A diferencia que el servidor no guarda nada

la estructura de JWT es una cadena codificada que esta separada por puntos en 3 partes. Esto lo recibe el usuario en el browser. La primer parte es el cabecero que indica el tipo de algoritmo de encruiptacion,. la segunda parte es el payload que es la informacion que nosotros queremos qye tenga el token. Se puede enviar informacion de usuario como nombre, apellido, avatar, rol de usuario, permisos, todo lo que se quiera. Lo mas importante es la parte final que es la firma.
Esta firma genera un hash tomando el header payload y ademas suima uyna palabra secreta que esta del lado del servidor, con esto genera el hash. Si el usuario no tiene la palabra secreta no va a poder generar el hash y hackear servidor. Hay que evitar que pueda hacer fuerza bruta con miles de intentos usando una firma equivocada.
El servuidor genera un JWT de manera segura que manda al usuario, este lo almacena en localstorage y lo envia cada que quiere hacer un requerimiento al servidor.


## 35. Implementación de JWT 
Se crea un nuevo paquete llamado /utils dentro del servidor, En este packete se crea una nueva clase JWTUtil.java. Esta clase esta copiada desde otro proyecto.

Tambien hay que agregar una dependencia en el pom

		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt</artifactId>
			<version>0.9.1</version>
		</dependency>


Se actualiza el proyecto en maven.

Al revisar la clase JWTUtil se aprecia que se usa una anotacion @value para que al string que tiene seguido, lo cargue en application.properties o en el lugar donde se manejan las variables de entorno

Luego hay 3 funciones, create permite crear el JWT, getvalue y getKey devuelven informacion que fue agregada al token como nombre de usuario, nombre, email, roles,permisos, etc.

### Creacion de las variables en application.properties
Dentro del archivo de application.properties se agregan las 3 variables correspondientes al entorno del JWT. Inicialmente esta la palabra secreta, que debe ser unico y nadie puede tener acceso a ella. Esta el ttlMillis quue representa el tiempo de caducidad de la sesion dado por millisegundos, por lo que hay que transformar todas las horas, dias, semanas a millisegundos. Una semana equivale a :

    1000*60*60*24*7 = 604,800,000

    1000 ms = 1 segundo
    60 segundos = 1 minuto
    60 minutos = 1 hora
    24 horas = 1 dia
    7 dias = 1 semana

Issuer indica quien fue el servicio que reo la sesion, en este caso no resulta tan iomportante.

Para la creacion del JWT hay que ir al AuthController y ver donde se hace el inicio de sesion luego de verificar las credenciales, deberia devolver el JWT donde se responde el "OK".

### Creacion de JWT

Se crea el JWTUtil con un @Autowired, la cual es una clase que tiene la notacion de @Component que permite que sea usado en otros lugares y cargar la anotacion de @Value para traer la informacion de las properties.

    @Autowired
    private JWTUtil jwtUtil;

Usando el objeto JWTUtil.create() se va a crear el JWT. Sin embargo hay que modificar la estructura actual de la aplicacion ya que es necesario que la funcionalidad de verificarCredenciales devuelva informacion util como id del usuario, no solo un bool. 

En la interfaz UsuarioDao se moedifica el nombre de la funcino para que sea mas acorde y ya no devuelve bool sino un Usuario

    obtenerUsuarioPorCredenciales(Usuario usuario)

En la implementacion tambien se cambia el tipo de dato que retorna la funcion que es Usuario. Luego en la comprobacion en UsuarioDaoimp que no haya email reguistrado debe devolver un null cuando esta vacio.
En casoq ue encuetnre alguno, en vez de retornar la verificacion, se devuelve el usuario luego de hacer la comparacion entre las contraseñas en caso que sea exitosa. Se devuelve solo el primer lugar de la lista, pero deberia tener solo un elemento.

    @Override
    public Usuario obtenerUsuarioPorCredenciales(Usuario usuario) {
        String query = "FROM Usuario WHERE email = :email";
        List <Usuario> lista = entityManager.createQuery(query)
                .setParameter("email", usuario.getEmail())
                .getResultList();

        // si no hay email registrado
        if ( lista.isEmpty() ) {
            return null;
        }

        // hasheo de verificacion
        String passwordHashed = lista.get(0).getPassword();
        
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        if (argon2.verify(passwordHashed, usuario.getPassword())) {
            return lista.get(0);
        };
        return null;
    }

### Creacion del token

De vuelta en el AuthController en vez de comparar en el if se separa la sentencia quye esta dentro delñ if y se almacena a una variable nueva usuarioLogueado, que puede ser null o no. Por lo que el nuevo if compara si el usuario logueado != null todo salio bien, por lo que debe crear el JWT pasandole el id y el email usando los metodos accesores del usuarioLogueado.

El id debe ser un string por lo que debe castearse a String usando Strin.valueOf() y debe almacenarse en una nueva variable de tipo String token. En este caso devuelve solo OK pero puede hacer que devuelva mas informacion, por ahora solo se retorna el token.

    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    public String login(@RequestBody Usuario usuario) {
        Usuario usuarioLogueado = usuarioDao.obtenerUsuarioPorCredenciales(usuario);
        if (usuarioLogueado != null) {
            String tokenJWT = jwtUtil.create( String.valueOf(usuarioLogueado.getId()), usuarioLogueado.getEmail());
            return tokenJWT;
        }
        return "FAIL";
    }

### almacenar token en lado de cliente
En login.js se esta verificando la respuesta, ya no va ser OK lo que rcibe si se puede logear, se hace una comparacion inversa, se revisa que si no es "FAIL" entonces debe guardar en: 

    localStorage.token = response ;
    localStorage.email = datos.email;
    
para luego redireccionar a usuarios.html

Se aprecia en la consola de navegador de chrome que permite iniciar sesion sin problema, al revisar en la pestaña de aplicaciones se puede ver que localStorage tiene dos propuiedades, token y email que fueron los que se agregaron.

### Envio de token en cada request
Para enviar el token cuando se esta eliminando un usuario, hay que revisar el archivo usuarios.js se agrega un header mas con la informacino del token en la funcion de eliminarUsuario, es el header de autorizacion.

    'Autorization': localStorage.token

Debido a que esta funcionalidad se debe agregar en las otras rutas, es necesario revisar la refactorizacion del codigo. Para este caso se va a crear una nueva funcion que almacena los parametros del header.

    function getHeaders(){
        return {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
          'Autorization': localStorage.token
        }
    }

### verificacion del token en el servidor
Para ejecutqr las funcionalidades cuyas request contienen el header, y verifique que la sesion dsea correcta, dentro del controlador de usuarios UsuarioControler, dentro de getUsuarios se crea una notacion @RequestHeader con valor de autorization. para guardar el token que viene desde la cabecera en token.

    public List<Usuario> getUsuarios(@RequestHeader(value = "Autorization") String token ) {


Para verificar que el token es correcto se usa nuevamente el JWTUtil como inyeccion de dependencia.
Se toma la funcino jwtUtil.getKey o getValue y se elige si se pasa el key o el value. Cuando se crea el token, primero se pasa el id y luego el value en la funcion create. Basicamente se crea el token con 2 valores y se define que valor se quiere obtener.
Al usar getKey devuelve el id del usuario, por lo que se guarda como String usuarioId y se extrae el token.

        String usuarioId = jwtUtil.getKey(token);

Al extraer el id del usuario en el token, si realiza la operacion correctamente el usuarioId debe ser diferente de null, por lo que se hace la condicional para este tipo de casos, en caso que usuarioId sea nulo, devuelve una lista vacia en este momento para hacer una prueba

    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios(@RequestHeader(value = "Autorization") String token ) {

        String usuarioId = jwtUtil.getKey(token);
        if ( usuarioId == null ) {
            return new ArrayList<>();
        }

        return usuarioDao.getUsuarios();
    }

Al hacer la prueba y limpiar la cache, se puede apreciar que cuando se llega a la vista usuarios.html revisando headers en la pesta;a network se puede ver que en la request se esta pasando Autorization dentro del token. En caso que el token esté vacio, se puede apreciar que sucede con la peticion, ingrtesando a la consola del navegador se modifica el payload que se tiene en 

    localStorage.token = 'dsfsdfsd'

De esta manera se puede ver el comportamiento cuando no hay un token valido. Cuando se recarga la pagina no muestra ningun resultado traido desde BD. Al revisar el localStorage actualizo el token. En Network se puede ver que la ultyima request de usuarios entrego un codigo 500.

En este momento la seguridad es muy precaria, hay que agregar Spring Security y tambien tener un mejor manejo de control de errores

### Implementacion en el resto de los request
Se crea una nueva funcuion dentro de UsuarioController validarToken que va a almacenar toda la funcionalidad registrada para validar el token. Esta funcion devuelve un boolean como resultado de evaluar si el usuario está vacio. En caso de estar vacio, retorna falso, y si tiene propiedad en usuarioId, es porque recibio token y devuelve true

    private boolean validarToken(String token) {
        String usuarioId = jwtUtil.getKey(token);
        return usuarioId != null;
    }

Finalmente se evalua dentro de los request que sean adecuados para la validacion del token. Dentro del UsuarioController esta el request GET getUsuarios donde se listan los usuarios. En registrar usuario no porque apenas esta creando el usuario para el token.

Para eliminar usuario si es neecsario agregar la verificacion

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void deleteUsuario(
                            @RequestHeader(value = "Autorization") String token,
                            @PathVariable Long id ) {
        if (!validarToken(token)) { return; }
        usuarioDao.deleteUsuario(id);
    }

De esta manera verifica que para e,lininar este con una sesion iniciada. Luego se puede expandir con permisos y accesos personalizados

### Pulir el sitio de front
La idea es hacer que la vista sea funcional y que todas las opciones mostradas enriq2uezcan la experiencia de usuario. Dentro del archivo usuarios.html se eliminan los codigos html de la barra de busqueda superior y los iconos. Top-bar search, alert-messages

Para agregar el correo del usuario en la parte derecha superior, se le da un id de clase al span donde se esta mostrando el texto, dentro del archivo usuarios.js

    // Call the dataTables jQuery plugin
    $(document).ready(function() {
        cargarUsuarios();
      $('#userTable').DataTable();
      actualizarEmail();
    });

    function actualizarEmail() {
        document.getElementById('txt-email-usuario').outerHTML = localStorage.email;
    }

Para organizar el menu lateral, se dejha solo el elemento tables y se renombra a usuarios

            <!-- Nav Item - Tables -->
            <li class="nav-item active">
                <a class="nav-link" href="tables.html">
                    <i class="fas fa-fw fa-table"></i>
                    <span>Usuarios</span></a>
            </li>

Se deja solo el logo, el nombre del sistema y el icono para las tablas - usuarios.

En este punto se tienen todas las funcionalidades planeadas. Lo que sigue es repetir mas de lo mismo, teniendo en cuenta de agregar relaciones en base de datos donde se necesiten

## 36. Repositorios de Código 
Sirven para guardar el codigo de manera segura y ordenada. Git es un sistema de versiones distribuido a diferencia de SVN que tenia un unico espacio pqara el historial de versionaes. En git cada programador puede tener su copia, albergando los cambios en tiempo real.
GitLab no deja mmas de 10GB y github 1GB. En realidad son muy similares.

Git esta construido por branch y un branch o rama es el estado del codigo en un momento. En un punto del tiempo se tioma una fotografia del codigo. La rama principal se llama master, de la cual en varios puntos del tiempo se pueden crear ramas auxiliares, ramificaciones del proyectos. Un programador copia el codigo del proyecto en una nueva rama haciendo algun tipo de modificacion.
Al terminar los cambios vuelve a llevar el codigo a la rama principal.


## 37. Creación de Repositorio en GitHub 
Se recomienda la descarga de github desktop para el manejo de los repositorios.


## 38. Resolver conflictos 
## 39. Despedida 
## 40. Bloopers 