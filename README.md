# GranjaInteligente

Arquitectura modular multicapa

Modularidad: Cada patrón está aislado en su propio paquete, facilitando el mantenimiento y la colaboración.

Multicapa: Separación clara entre modelo, lógica, estructura y presentación.

Escalabilidad: Permite agregar nuevos animales, sensores o funcionalidades sin alterar las capas existentes.

Mantenibilidad: Cada clase tiene una sola responsabilidad, aplicando principios de diseño limpio.

Reusabilidad: Los módulos de patrones pueden reutilizarse en otros proyectos.


| **Capa**                          | **Qué contiene**                                                           | **Rol principal**                                                          |
| --------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| **Modelo (`model`)**              | Clases base del dominio: `Animal`, `Sensor`, `Corral`                      | Representa el mundo real de la granja (entidades y datos).                 |
| **Creacional (`creational`)**     | Patrones de creación: `Factory`, `AbstractFactory`, `Builder`, `Singleton` | Se encarga de crear y configurar los objetos del sistema.                  |
| **Estructural (`structural`)**    | Patrones de conexión: `Adapter`, `Decorator`, `Facade`                     | Define cómo los componentes del sistema se comunican y se amplían.         |
| **Comportamental (`behavioral`)** | Patrones de comportamiento: `Observer`, `Strategy`, `Command`, `State`     | Implementa la lógica inteligente y las decisiones automáticas del sistema. |
| **Presentación (`MainApp`)**      | Clase principal de ejecución                                               | Coordina todos los módulos y simula la interacción completa de la granja.  |


GranjaInteligente/
│
├── src/
│   └── com/granja/
│       ├── model/
│       │   ├── Animal.java
│       │   ├── Corral.java
│       │   └── Sensor.java
│       │
│       ├── creational/
│       │   ├── factory/
│       │   ├── builder/
│       │   ├── singleton/
│       │   └── abstractfactory/
│       │
│       ├── structural/
│       │   ├── adapter/
│       │   ├── decorator/
│       │   └── facade/
│       │
│       └── behavioral/
│           ├── observer/
│           ├── strategy/
│           ├── command/
│           └── state/
│
└── MainApp.java
