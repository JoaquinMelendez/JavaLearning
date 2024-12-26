# Condicionales

- **Condicional `if-else`**

El `if-else` es una estructura de control fundamental de un lenguaje, el cual permite ejecutar diferentes bloques de código en función de si se cumple o no ciertas condiciones. En primera instancia, se puede establecer una condición para el primer bloque de código y si es verdadera, se ejecuta tal bloque de código. Se puede establecer un `else` para el caso en que no se cumple la condición y se ejecute ese bloque de código. También se puede crear un `else if`, donde no se cumple la primera condición, pero si se puede añadir otra condición para ejecutar otro código.

- **Condicional anidado (`if` dentro de otro `if`)**

El condicional anidado se utiliza para evaluar múltiples condiciones de forma secuencial, tal como un if dentro de otro if.

![Fuente: t[utorialesprogramacionya.com](http://utorialesprogramacionya.com/)](Condicionales%2016374836a7b180b08bbdd857c1b84ff6/image.png)

Fuente: t[utorialesprogramacionya.com](http://utorialesprogramacionya.com/)

- **Operador ternario (`condición ? expresión1 : expresión2`)**

El operador ternario es una estructura de control que permite elegir entre una expresión u otra dependiendo si la condición es verdadera o falsa.

```java
String mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad";  
```

- **Sentencia `switch`**
    
    Switch es una condicional que se utiliza para aceptar una condición en específico, tal como la selección de una opción. Se rige en función del denominado **patrón de caso**. En caso de que no se genere ninguna coincidencia con el patrón de caso, se recurrirá al **default** que se haya establecido. Es importante entender que no se puede saltar de un caso a otro, por lo que cada caso termina en un `break`
    
    ![image.png](Condicionales%2016374836a7b180b08bbdd857c1b84ff6/image%201.png)
    
    En java tiene la siguiente sintaxis:
    
    ```java
    switch (key) {
    	case value: action;
    	break;
    	
    	case value: action;
    	break;
    	...
    	default = action; /*Todo lo que no esté definido llega acá*/
    }
    ```
    
    - **Expresiones lógicas combinadas con operadores (`&&`, `||`, `!`)**
