import Entity.Persona;

import java.util.Date;

public class HelloWorld {

    /**
     * principal class for run the first hello world
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World");

        Persona persona = new Persona();
        persona.setNombre("Paul");
        persona.setApellido("Cortes");
        persona.setEdad("32");

        System.out.println("Hola " + persona.getNombre());

        String array[] = new String[10];
        System.out.println(array[3]);

        System.out.println("fecha" + new Date());
    }

}
