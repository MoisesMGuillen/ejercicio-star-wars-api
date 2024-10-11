# ejercicio-star-wars-api
Un programa para obtener datos de las películas de Star Wars, utilizando una API para obtener datos básicos de estas. Para mejor consulta, el Json obtenido por la API se escribe en un archivo de texto.

## Funcionalidades

- Menú interactivo en el que el usuario puede ingresar el capítulo que se desea consultar.
- Consultas en tiempo real a una API para obtener los datos de las películas.
- Un escritor de archivos de los datos obtenidos por la API.

## Estructura del Proyecto

- `Menu.java`: Una interfaz sencilla para recibir el dato del capítulo de Star Wars deseado.
- `ConsultasHTTP.java`: Encargada de hacer una consulta a la API y el retornar el Json obtenido .
- `Pelicula.java`: Clase que obtiene los datos de la película deseada, obteniendo su nombre, capítulo y sus créditos iniciales.
- `EscritorDeArchivos.java`: Clase escritora de archivos que contienen los capítulos que son consultados.
- `Principal.java`: Clase principal en la cual se inicializa y se llama al menu.
  
## Uso

1. Al ejecutar el programa, se preguntará el capítulo que se quiere consultar.

2. El programa captura los datos y los muestra en la salida. Los datos mostrados son:
  - Nombre del capítulo
  - Número del capítulo
  - Créditos iniciales

3. Los datos obtenidos por la clase serán mostrados en pantalla

4. El archivo Json obtenido por la consulta se escribirá en un archivo de texto, de modo que la película pueda ser consultada de mejor forma.

## Requisitos

- Java 11 o superior.
- Biblioteca `Gson` para manejar el formato JSON.
- Conexión a Internet para realizar las consultas a la API.

## Instalación

1. Clona este repositorio:

    ```bash
    git clone https://github.com/MoisesMGuillen/ejercicio-star-wars-api.git
    ```

2. Compila y ejecuta el proyecto en tu entorno de desarrollo preferido.

3. Asegúrate de tener la biblioteca Gson en el classpath de tu proyecto.

## API utilizada

Este proyecto utiliza [SWAPI - The Star Wars API](https://swapi.dev/) para obtener las tasas de cambio.

## Ejemplo
Si consultas el capítulo 1 de Star Wars, la salida será:

Nombre: A New Hope
Nro de Episodio: 4
Creditos iniciales: It is a period of civil war.
Rebel spaceships, striking
from a hidden base, have won
their first victory against
the evil Galactic Empire.

During the battle, Rebel
spies managed to steal secret
plans to the Empire's
ultimate weapon, the DEATH
STAR, an armored space
station with enough power
to destroy an entire planet.

Pursued by the Empire's
sinister agents, Princess
Leia races home aboard her
starship, custodian of the
stolen plans that can save her
people and restore
freedom to the galaxy....
