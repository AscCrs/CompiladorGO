# CompiladorGO — Instrucciones de ejecución

## Requisitos
- JDK 21 instalado y variable de entorno JAVA_HOME configurada.
- El archivo `javacc.jar` se encuentra en la carpeta `lib` del proyecto: `CompiladorGO\lib\javacc.jar`.
- JavaCC se usará desde la línea de comandos con el classpath apuntando a ese JAR.

## Estructura relevante
- Código fuente: `src`
- Gramática JavaCC: `src\AnalizadorSintactico\Grammar.jj`
- Dependencias: `lib\javacc.jar`

## Generar analizadores con JavaCC
1. Abrir una consola (cmd/PowerShell) y posicionarse en el directorio donde está la gramática:
   cd `CompiladorGO\src\AnalizadorSintactico`

2. Ejecutar JavaCC indicando el jar en lib (comando a ejecutar dentro del directorio anterior):
   `java -cp ..\..\lib\javacc.jar javacc Grammar.jj`

   - Este mismo comando se utiliza para generar tanto el analizador léxico como el sintáctico si ambos están definidos en la gramática.
   - Tras la ejecución se generarán los archivos .java correspondientes (parser, tokens, etc.) en el mismo directorio.

## Compilar el proyecto Java
1. Una vez generados los .java por JavaCC, compilar la clase principal del análisis:
   - Desde el directorio donde está tu código fuente (p. ej. `src` o el directorio raíz del proyecto según organización):
     javac analisis_.java

   - Asegúrate de que el compilador (`javac`) vea todos los .java generados por JavaCC (puedes compilar todos los .java del directorio si es necesario, p. ej. `javac *.java`).

2. Ejecutar la aplicación (ejemplo si la clase principal es `analisis_`):
   java analisis_

   - Ejecuta desde el directorio donde estén las clases compiladas o ajusta el classpath según corresponda.

## Notas y recomendaciones
- Si aparecen errores de paquete/paquete no encontrado, verifica los paquetes en los archivos .java generados y compila respetando la estructura de carpetas (usar el flag `-d` de `javac` si es necesario).
- Para regenerar el parser tras modificar la gramática, repetir el paso de JavaCC y volver a compilar los .java.
- Considera compilar todos los .java en lotes: `javac src\**\*.java` (ajustar según shell) para evitar problemas de dependencias entre archivos.
- Además de revisar si alguno de los errores presentados se debe a un bloque de código inalcanzable, dado que a veces la grámatica génera un `break` que puede ser eliminado.
