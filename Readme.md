Nombre Alumno: Gerson Urrea


<img width="569" alt="Captura de pantalla 2023-10-16 003730" src="https://github.com/Gerson-art/Ayudantia_Receso_Viaje/assets/138271596/bcb126ba-0e3b-4042-9109-a07c32403ecf">

Análisis del diagrama

¿Cómo se llegó al diagrama?

Opté por crear cuatro clases, 3 relacionadas a los vehículos y una al usuario o persona. Las clases vehículos las pensé como las responsables de realizar cálculos relacionados con el tiempo de viaje y la clase persona como la responsable de mostrar en pantalla los mensajes con la estructura solicitada (Hola {usuario}! El tiempo de viaje en {vehículo} es...).

Razónes de la implementacion de las clases

Persona: La clase Persona fue implementada debido a que es necesario una clase que "pueda emplear" 3 tipos de vehiculos distintos para realizar un viaje a un destino especifico, en otras palabras esta clase tendrá métodos que harán uso de objetos de las clases destinadas a modelar los vehículos.

Automovil, Motocicleta y Bicicleta:

Estas clases fueron implementadas debido a que la responsabilidad del cálculo del tiempo relacionado a cada medio de transporte, podría ser encapsulado y reservado a cada clase destinada a modelar los vehículos. Además, estas clases tendrán como atributos las velocidades promedio a la cual se desplazan cada uno de estos vehículos.

Relaciones de dependencia existentes

Persona-Clases Vehículos: Existen relaciones de dependencia entre la clase Persona y las clases Vehículos, ya que los métodos de la clase Persona reciben como parametro objetos de las clases vehículos, respectivamente.
