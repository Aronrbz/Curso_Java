/*
--Variables :

Las variables son contenedores que almacenan datos que pueden cambiar durante la ejecución de un programa.
En Java, antes de usar una variable, debes declararla. La declaración de una variable incluye su tipo y su
nombre.


1.- Declaración y Asignación:


Declaración: Aquí es donde defines el tipo de la variable y su nombre.

int edad;


2.- Asignación: Aquí es donde le das un valor a la variable.

edad = 25;


3.- Declaración y Asignación en una sola línea:

int edad = 25;


Tipos de Datos
Por ahora, solo mencionaremos que las variables pueden ser de diferentes tipos de datos
(que veremos en detalle en el próximo tema).

Ejemplos:

//Facil
public class Main {
    public static void main(String[] args) {
        int edad = 30;                       // Declaración y asignación
        System.out.println(edad);            // Imprime 30
    }
}

//Medio
public class Main {
    public static void main(String[] args) {
        int edad = 30;
        System.out.print("Tengo ");
        System.out.println(edad + " años."); // Imprime "Tengo 30 años."
    }
}

//Medio
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int suma = a + b;                    // Declaración y asignación de la suma
        System.out.println(suma);            // Imprime 15
    }
}

//Dificil
public class Main {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 12;
        int resultado = num1 * num2;         // Multiplicación
        System.out.print("El resultado de ");
        System.out.print(num1);
        System.out.print(" multiplicado por ");
        System.out.print(num2);
        System.out.print(" es ");
        System.out.println(resultado);       // Imprime el resultado
    }
}


Ejercicios:

Fácil:
Declara una variable llamada nombre y asígnale tu nombre. Luego, imprime la variable.


Medio:
Declara dos variables a y b, asígnales valores y luego imprime la suma de a y b.


Medio:
Declara una variable llamada edad, asígnale un valor, y luego imprime "Yo tengo [edad] años."


Difícil:
Declara tres variables x, y, y z, asígnales valores, y luego imprime la suma de x, y, y z en una frase completa.
Ejemplo: "La suma de x, y, y z es [resultado]."


 */

//Respuestas

/*
//Declara una variable llamada nombre y asígnale tu nombre. Luego, imprime la variable.
public class Variables {
    public static void main(String[] args) {

        String nombre = "Aron";
        System.out.println(nombre);

    }
}


//Declara dos variables a y b, asígnales valores y luego imprime la suma de a y b.
public class Variables {
    public static void main(String[] args) {

        int a = 6;
        int b = 5;
        System.out.println(a + b);

    }
}


//Declara una variable llamada edad, asígnale un valor, y luego imprime "Yo tengo [edad] años."
public class Variables {
    public static void main(String[] args) {

        int edad = 35;
        System.out.println("Yo tengo " + edad + " años");

    }
}
*/

//Declara tres variables x, y, y z, asígnales valores, y luego imprime la suma de x, y, y z en una frase completa.
//Ejemplo: "La suma de x, y, y z es [resultado]."

public class Variables {
    public static void main(String[] args) {

        int x = 35;
        int y = 11;
        int z = 4;
        int total = x+y+z;

        System.out.println("La suma de " + x + " " + y + " "+ "y " + z + " es: " + total);

    }
}