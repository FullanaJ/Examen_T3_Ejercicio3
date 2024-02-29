API de Generación de Números Aleatorios

Esta API proporciona endpoints para generar números aleatorios y realizar operaciones con ellos.
Endpoints Disponibles
Obtener Lista de Números Aleatorios

    URL: /random/numbers
    Método HTTP: GET
    Descripción: Devuelve una lista de 100 números aleatorios.
    Respuesta: Lista de números enteros.

Obtener Número Aleatorio del Mismo Tamaño

    URL: /random/numbers/{d}
    Método HTTP: GET
    Parámetro de Ruta: d - Número entero que indica el tamaño del número deseado.
    Descripción: Devuelve un número aleatorio del mismo tamaño de dígitos que el valor de d.
    Respuesta: Número aleatorio como cadena de texto.

Generar Número Aleatorio del Mismo Tamaño (Formato JSON)

    URL: /random/numbers
    Método HTTP: POST
    Datos de Solicitud: Objeto JSON con la clave "random" que contiene el número entero.
    Descripción: Recibe un JSON con un número y devuelve un JSON con un número aleatorio del mismo tamaño.
    Respuesta: Objeto JSON con la clave "random" que contiene el número aleatorio como cadena de texto.

Implementación de Servicios

El comportamiento de los endpoints está definido en la capa de servicio mediante las siguientes interfaces y clases:

    ClientService: Interfaz que define los métodos para obtener números aleatorios y realizar operaciones con ellos.
    ClientServiceImpl: Implementación de ClientService que proporciona la lógica para generar números aleatorios.

Generación de Números Aleatorios

La generación de números aleatorios se realiza en la clase Numeros, que contiene métodos para generar números aleatorios con diferentes características.
Ejecución de la Aplicación

La aplicación puede ser ejecutada como una aplicación Spring Boot estándar. Simplemente ejecuta la clase WebApplication para iniciar el servidor.