# Clean Architecture en microservicios Spring Boot

## 1. ¿Cuál es el propósito principal de Clean Architecture en el desarrollo de software?

El propósito principal de **Clean Architecture** es **organizar el código de forma que sea independiente de frameworks, bases de datos, interfaces de usuario y detalles externos**, poniendo la lógica de negocio en el centro. Así se logra **alto desacoplamiento**, **testabilidad** y **facilidad para mantener y evolucionar el sistema**.

---

## 2. ¿Qué beneficios aporta Clean Architecture a un microservicio en Spring Boot?

- Desacopla la lógica de negocio de la infraestructura (Spring, DB, APIs)
- Facilita pruebas unitarias y de integración.
- Hace que cambiar tecnologías (base de datos, framework) sea menos costoso.
- Favorece la separación de responsabilidades.
- Mejora la mantenibilidad y la comprensión del código.
- Promueve una estructura coherente entre microservicios.

---

## 3. ¿Cuáles son las principales capas de Clean Architecture y qué responsabilidad tiene cada una?

| Capa | Responsabilidad |
|------|------------------|
| **Entidad / Dominio** | Modelos de negocio y reglas empresariales puras. |
| **Caso de uso (UseCases / Application)** | Coordina la lógica de aplicación; orquesta entidades para cumplir un objetivo. |
| **Interface Adapter (Adapters / Controllers / Presenters)** | Traduce datos entre el mundo externo (HTTP, DB) y la lógica interna. |
| **Framework & Drivers (Infrastructure)** | Implementación de detalles externos: frameworks, bases de datos, APIs, etc. |

---

## 4. ¿Por qué se recomienda desacoplar la lógica de negocio de la infraestructura en un microservicio?

Porque permite:
- Cambiar tecnología sin reescribir reglas de negocio.
- Probar la lógica sin depender de bases de datos o frameworks.
- Reutilizar la lógica en diferentes interfaces (API REST, gRPC, batch jobs).
- Mantener el código claro y centrado en resolver problemas de negocio.

---

## 5. ¿Cuál es el rol de la capa de aplicación y qué tipo de lógica debería contener?

La **capa de aplicación**:
- Orquesta el flujo de datos entre entidades y adaptadores externos.
- Contiene **casos de uso**: operaciones concretas del negocio (ej: registrar un usuario, procesar un pago).
- No implementa reglas de negocio detalladas ni lógica de infraestructura.

---

## 6. ¿Qué diferencia hay entre un UseCase y un Service en Clean Architecture?

- **UseCase**: define un **escenario específico** de negocio (ej. `RegisterUser`). Controla un flujo completo de operaciones.
- **Service**: en diseños tradicionales, es una clase genérica que mezcla lógica de negocio y detalles técnicos. En Clean Architecture, se recomienda que la capa de servicio se divida en **UseCases**, manteniendo su responsabilidad clara y específica.

---

## 7. ¿Por qué se recomienda definir Repositories como interfaces en la capa de dominio en lugar de usar directamente `JpaRepository`?

Porque:
- El dominio no debe depender de un framework específico como JPA.
- Permite sustituir la implementación de persistencia sin cambiar la lógica de negocio.
- Aumenta la flexibilidad para usar distintas fuentes de datos (DB SQL, NoSQL, archivos, APIs).

---

## 8. ¿Cómo se implementa un UseCase en un microservicio con Spring Boot y qué ventajas tiene?

**Implementación básica:**
1. **Definir la interfaz del UseCase** en la capa de dominio o aplicación.
2. **Implementar la clase del UseCase**, inyectando repositorios como interfaces.
3. **El controlador (Controller)** recibe la solicitud y delega al UseCase.
4. **La infraestructura (RepositoryImpl)** implementa la interfaz de repositorio usando JPA u otra tecnología.

**Ventajas:**
- Tests unitarios fáciles.
- Bajo acoplamiento con Spring Boot.
- Claridad en la lógica de negocio.
- Código más mantenible y adaptable.

---

## 9. ¿Qué problemas podrían surgir si no aplicamos Clean Architecture en un proyecto de microservicios?

- **Alto acoplamiento**: difícil cambiar frameworks o bases de datos.
- **Código espagueti**: mezclas de lógica de negocio con controladores y repositorios.
- **Difícil de testear**: las pruebas dependen de detalles externos.
- **Escalabilidad limitada**: dificultad para dividir responsabilidades o delegar tareas.
- **Costo alto de mantenimiento** a largo plazo.

---

## 10. ¿Cómo Clean Architecture facilita la escalabilidad y mantenibilidad en un entorno basado en microservicios?

- Cada microservicio sigue la misma estructura, lo que **estandariza el desarrollo**.
- Cada servicio puede evolucionar su tecnología de forma independiente.
- Los equipos pueden trabajar en capas separadas sin interferencias.
- La lógica de negocio es portable y reutilizable.
- Facilita agregar nuevas interfaces (APIs, colas de mensajes) sin reescribir reglas.

