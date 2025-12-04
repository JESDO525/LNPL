# LearningNewProgrammingLanguages

I'm going to use this repository to save all my practices in a lot of programming languages like:

1. Python
2. Java
3. Kotlin
4. HTML
5. CSS
6. C
7. Rust

I want to review what I've learned.


# Good practices with Git/Github

### Conventional Commits
El mensaje tiene esta estructura:

tipo(Archivo):Descripción

Opcionalmente seguido por un cuerpo explicativo y notas al pie.

Los tipos comunes incluyen:

feat: para nuevas funcionalidades (relacionado con incremento MINOR).

fix: para corrección de errores (relacionado con incremento PATCH).

docs: cambios en documentación.

style: cambios que no afectan la lógica (formateo).

refactor: cambios en código que no añaden funcionalidad ni corrigen errores.

perf: mejoras de rendimiento.

test: añadir o corregir pruebas.

chore: tareas rutinarias o de mantenimiento.

Otros según necesidades.

Se puede indicar cambio mayor incompatible con BREAKING CHANGE en el pie del commit o añadiendo ! tras el tipo.

Permite que herramientas automáticas generen changelogs y gestionen versiones con base en el historial de commits.

Esta convención proviene de la comunidad Angular y es ampliamente adoptada para mejorar la claridad y automatización en proyectos de software.​

En conclusión, el estándar para tus mensajes de commit que mencionas es Conventional Commits.

## Good practices with branches

También hay buenas prácticas que ayudan a mantener un flujo de trabajo organizado, claro y eficiente, similares a las buenas prácticas en los commits.

Buenas prácticas para crear ramas
Nombres descriptivos y claros: Elige nombres que indiquen claramente el propósito de la rama. Por ejemplo:

feature/login-ui para una nueva funcionalidad de interfaz de usuario de login.

fix/auth-bug para corregir un error en la autenticación.

chore/update-dependencies para tareas de mantenimiento.

Usar un prefijo o convención: Muchas veces se usan prefijos para identificar el tipo de rama:

feature/ para nuevas funcionalidades.

fix/ para correcciones de errores.

hotfix/ para correcciones urgentes en producción.

release/ para preparaciones antes de un lanzamiento.

experiment/ para trabajo experimental o pruebas.

No usar nombres genéricos o ambiguos: Evita nombres como rama1, nuevo, cambios porque no indican el propósito.

Mantener ramas pequeñas y específicas: Igual que los commits, las ramas deben enfocarse en un cambio o tarea concreta para facilitar revisiones y merges.