package parcial2_programacionestructurada;

/**
 * UNIVERSIDAD DE ORIENTE
 * PROGRAMACION ESTRUCTURADA || CICLO 02/2019
 * @author César Augusto Navarrete Romero
 * Carnet U20181587
 * PARCIAL 2 || EJERCICIO 1
 * 
 */

import java.util.*;

public class Parcial2_ProgramacionEstructurada {
    public static void main(String[] args) {
        
        //POR AHORRAR TIEMPO  A LA HORA DE INGRESAR DATOS
        //EL ARRAY TENDRA UN TAMAÑO DE 5 EN VEZ DE 30
        Scanner notas = new Scanner(System.in);
        int i;
        int num;
        double media;
        //COMPUTO 1
        double[] computo1 = new double[5];
        double suma1;
        
        
        //COMPUTO 2
        double[] computo2 = new double[5];
        double suma2;
        
        
        //COMPUTO 3
        double[] computo3 = new double[5];
        double suma3;
        
        
        // COMPUTO 1
        System.out.println("Notas de primer computo: ");
        for(i=0; i<computo1.length; i++){
            System.out.println("Ingrese las notas del estudiante "+i+": ");
            computo1[i]= notas.nextDouble();
            
        }
        System.out.println("------------------------------------------------");
        
        //COMPUTO 2
        
        System.out.println("Notas de segundo computo: ");
        for(i=0; i<computo2.length; i++){
            System.out.println("Ingrese las notas del estudiante "+i+": ");
            computo2[i]= notas.nextDouble();
        }
        System.out.println("------------------------------------------------");
        
        //COMPUTO 3
        
        System.out.println("Notas de tercer computo: ");
        for(i=0; i<computo3.length; i++){
            System.out.println("Ingrese las notas del estudiante "+i+": ");
            computo3[i]= notas.nextDouble(); 
        }
        System.out.println("------------------------------------------------");
        suma1=0;
        suma2=0;
        suma3=0;
        for(i=0; i<5;i++){
            suma1+=computo1[i];
            suma2+=computo2[i];
            suma3+=computo3[i];
        }
        System.out.println("Media del primer computo: "+suma1/5);
        System.out.println("Media del segundo computo: "+suma2/5);
        System.out.println("Media del tercer computo: "+suma3/5);
        System.out.println();
        
        System.out.println("------------------------------------------------");
        
        System.out.println("Introduzca posicion del alumno (de 0 a 4): ");
        num= notas.nextInt();
        
        media=(double)(computo1[num]+computo2[num]+computo3[num])/3;
        System.out.println("La media del alumno es: "+media);
    }
}