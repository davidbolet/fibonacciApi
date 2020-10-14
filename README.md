# fibonacciApi

Esta es aplicación es un sencillo servicio rest para calcular el n-esimo valor de la serie de fibonacci

Uso:
Compilar con gradle: `./gradlew build`
Ejecutar el servicio rest: `./gradlew bootRun`

Se puede probar mediante el navegador en la url: http://localhost:8080/?value=5000

También con la herramienta curl:

curl --location --request GET 'http://localhost:8080/?value=50' 

el resultado es un json estilo {"result" : <valor resultado> }

El algoritmo para el cálculo de la función de fibonacci es ampliamente conocido, 
para esta solución se ha utilizado la versión de https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/, 
que ofrece una complejidad de O(log n), pero se ha mejorado cambiando el tipo del resultado a BigInteger, 
para permitir un número mayor de resultados.