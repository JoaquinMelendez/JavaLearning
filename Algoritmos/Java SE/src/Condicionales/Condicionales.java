package Condicionales;

/**
 *
 * @author joaquinmelendezhenriquez
 */
public class Condicionales {
    
    public static void main(String[] args) {
        // if - else
        int edad = 19;
        boolean mayorDeEdad;
        if (edad > 18) {
            mayorDeEdad = true;
        } else {
            mayorDeEdad = false;
        }
        
        //Condicional anidado
        int promedio = 6;
        String rendimiento;
        
        if(promedio >= 6){
            rendimiento = "Promocionado";
        } else if(promedio >= 4) {
            rendimiento = "Regular";
        } else {
            rendimiento = "Reprobado";
        }
        
        //Operador ternario
        edad = 20;
        String mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad";  
        
    }

   
}
