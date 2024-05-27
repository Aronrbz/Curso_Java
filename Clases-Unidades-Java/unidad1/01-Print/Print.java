/*
Primer Tema: print

En Java, la función print se utiliza para mostrar texto en la consola. Hay dos métodos principales para imprimir
en la consola:

        System.out.print(): Imprime texto sin agregar una nueva línea al final.
        System.out.println(): Imprime texto y agrega una nueva línea al final.


Ejemplos:

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola, Mundo!");  // Esto imprime "Hola, Mundo!" seguido de una nueva línea
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.print("Hola, ");          // Esto imprime "Hola, " sin una nueva línea
        System.out.println("Mundo!");        // Esto imprime "Mundo!" seguido de una nueva línea
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.print("Hola, ");          // Esto imprime "Hola, " sin una nueva línea
        System.out.println("Mundo!");        // Esto imprime "Mundo!" seguido de una nueva línea
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Línea 1");
        System.out.print("Línea 2 - Parte 1");
        System.out.print(" - Parte 2");
        System.out.println();
        System.out.println("Línea 3");
    }
}

Explicación: Aquí, combinamos print y println para controlar exactamente dónde terminan las líneas.



**** Ejercicios a desarrollar ****

Fácil:
Imprime "Bienvenido al curso de Java!".


Medio:
Imprime "Java" en una línea y "es interesante" en la siguiente línea.


Medio:
Usa print para imprimir "Aprender" y luego "Java" en la misma línea, seguido de "es útil" en la siguiente línea.


Difícil:
Imprime un pequeño párrafo sobre ti mismo en múltiples líneas, usando una combinación de print y println.

*/


// Respuestas


// Facil
/*public class Print {
    public static void main(String[] args) {
        System.out.println("Bienvenido al curso de java");
    }
}*/

//Medio
/*public class Print {
    public static void main(String[] args) {
        System.out.println("Java");
        System.out.print("es interesante");
    }
}*/

//Medio
/*public class Print {
    public static void main(String[] args) {
        System.out.print("Aprender");
        System.out.println(" Java");
        System.out.print("es util");
    }
}*/

//Dificil
public class Print {
    public static void main(String[] args) {
        System.out.print("Mi nombre es");
        System.out.println(" Aron");
        System.out.print("y tengo 35 años.");
        System.out.println(" Estoy aprendiendo java");
        System.out.print("Porque quiero ser un");
        System.out.println(" desarrollador en spring y angular");
    }
}