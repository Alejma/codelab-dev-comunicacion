# Preguntas

## 1️⃣ ¿Qué es Attribute-Driven Design (ADD) y cuál es su propósito en el diseño de software?

**Attribute-Driven Design (ADD)** es un método sistemático para diseñar la arquitectura de un sistema de software a partir de los **atributos de calidad** (por ejemplo: rendimiento, disponibilidad, mantenibilidad, seguridad) y los requisitos funcionales.  
Su propósito es guiar la definición de la estructura del sistema asegurando que las decisiones arquitectónicas permitan cumplir estos atributos de calidad.

## 2️⃣ ¿Cómo se relaciona ADD con Clean Architecture en el proceso de diseño de sistemas?

ADD se centra en definir la arquitectura **basándose en atributos de calidad y restricciones**, mientras que **Clean Architecture** ofrece una **organización estructurada de capas** para lograr separación de responsabilidades y mantener la independencia de frameworks, bases de datos y detalles externos.  
En conjunto, ADD define **qué requisitos arquitectónicos se necesitan** y Clean Architecture provee **cómo organizar el código** para cumplirlos de forma sostenible.

## 3️⃣ ¿Cuáles son los pasos principales del método ADD para definir una arquitectura de software?

Los pasos típicos del método **ADD** son:  
1. **Recolección de requisitos**: Identificar requisitos funcionales y atributos de calidad clave.  
2. **Seleccionar un módulo inicial**: Definir el componente principal del sistema a diseñar primero.  
3. **Elegir patrones arquitectónicos y tácticas**: Seleccionar patrones y estrategias para cumplir los atributos de calidad.  
4. **Decomponer el módulo en submódulos**: Dividir en componentes más pequeños y asignar responsabilidades.  
5. **Definir interfaces y relaciones**: Especificar interfaces, dependencias y contratos.  
6. **Validar decisiones**: Revisar si el diseño cubre los atributos de calidad y requisitos.  
7. **Iterar**: Repetir para cada módulo o componente.

## 4️⃣ ¿Cómo se identifican los atributos de calidad en ADD y por qué son importantes?

Los atributos de calidad se identifican mediante:  
- Reuniones con stakeholders.  
- Análisis de escenarios críticos.  
- Priorizar los atributos con mayor impacto en el negocio.

Son importantes porque determinan **qué decisiones arquitectónicas tomar** (por ejemplo, aplicar caching para mejorar rendimiento, o diseño de redundancia para disponibilidad). Guían el **trade-off** entre costo, complejidad y valor para el negocio.

## 5️⃣ ¿Por qué Clean Architecture complementa ADD en la implementación de una solución?

Porque Clean Architecture provee **una estructura concreta y reusable** para implementar las decisiones arquitectónicas tomadas con ADD. Mientras ADD define los **principios y requisitos**, Clean Architecture los traduce en **capas y reglas de dependencia** que hacen la solución mantenible, escalable y fácil de probar.

## 6️⃣ ¿Qué criterios se deben considerar al definir las capas en Clean Architecture dentro de un proceso ADD?

- **Separación de responsabilidades**: Cada capa debe tener un rol claro (entidades, casos de uso, interfaces).  
- **Independencia tecnológica**: Evitar que lógica de negocio dependa de frameworks o bases de datos.  
- **Cumplimiento de atributos de calidad**: Por ejemplo, capas bien definidas pueden facilitar pruebas unitarias (mantenibilidad) y escalabilidad.  
- **Control de dependencias**: Dependencias dirigidas hacia el centro de la arquitectura (regla de dependencias).

## 7️⃣ ¿Cómo ADD ayuda a tomar decisiones arquitectónicas basadas en necesidades del negocio?

ADD vincula cada decisión arquitectónica con un **atributo de calidad priorizado por el negocio**. Así, se seleccionan patrones y tácticas con base en **qué necesita el sistema para tener éxito** (por ejemplo, alta disponibilidad para un servicio crítico, escalabilidad para una aplicación con muchos usuarios concurrentes).

## 8️⃣ ¿Cuáles son los beneficios de combinar ADD con Clean Architecture en un sistema basado en microservicios?

- **Alineación con objetivos de negocio**: ADD asegura que cada microservicio tenga una arquitectura que cumpla los atributos de calidad clave.  
- **Modularidad y mantenibilidad**: Clean Architecture mantiene cada microservicio limpio, desacoplado y fácil de probar.  
- **Escalabilidad y flexibilidad**: El diseño enfocado en atributos y capas bien definidas permite evolucionar cada microservicio independientemente.  
- **Facilidad de integración y despliegue**: Se facilita la implementación de pipelines CI/CD y pruebas automatizadas.

## 9️⃣ ¿Cómo se asegura que la arquitectura resultante cumpla con los atributos de calidad definidos en ADD?

- **Validación continua**: Revisar escenarios de atributos de calidad contra el diseño.  
- **Prototipos y pruebas de concepto**: Probar tácticas clave (por ejemplo, balanceo de carga, failover).  
- **Revisión de arquitectura (ATAM)**: Usar métodos de evaluación arquitectónica como **ATAM (Architecture Tradeoff Analysis Method)** para confirmar que las decisiones cumplen los objetivos.  
- **Pruebas de rendimiento y seguridad**: Validar atributos críticos con métricas.

## 🔟 ¿Qué herramientas o metodologías pueden ayudar a validar una arquitectura diseñada con ADD y Clean Architecture?

- **ATAM (Architecture Tradeoff Analysis Method)**: Evaluación estructurada de trade-offs.  
- **Scenario-based reviews**: Revisar la arquitectura frente a escenarios reales de uso.  
- **Prototipos funcionales**: Implementar partes críticas para detectar problemas temprano.  
- **Herramientas de análisis estático**: SonarQube, ArchUnit (para verificar dependencias).  
- **Pruebas de carga y estrés**: JMeter, k6.  
- **Documentación y diagramas**: C4 Model, PlantUML.