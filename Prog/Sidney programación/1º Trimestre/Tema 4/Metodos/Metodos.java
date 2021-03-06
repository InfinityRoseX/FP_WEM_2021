import java.util.*;

public class Metodos {
 
    /**
     * Método que genera 20 nºs aleatorios comprendidos entre 1 y 50 y 
     * cuenta los pares e impares generados escribiendo al final 
     * esta cuenta .
     */
    public void contarParesImpares() {
        int n = 0;
        int pares = 0;
        int impares = 0;
        
        for (int i = 0; i < 20; i++) {
            n = (int)(Math.random()*50)+1;
            System.out.print(n+" ");
            
            if (n%2==0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println(" ");
        System.out.print("Hay "+pares+" números pares y "+impares+" números impares.");
    }
    
    /**
     * Método que calcula y devuelve el máximo de una secuencia de valores aleatorios  
     * comprendidos entre 1 y 100 .
     */
    public int maximo(int s) {
        int n = 0;
        int max = 0;
        
        for (int i = 0; i < s; i++) {
            n = (int)(Math.random()*100)+1;
            System.out.print(n+" ");
            
            if (n > max) max = n;
            
        }
        System.out.println(" ");
        System.out.print("El máximo es: "+max);
        return max;
    }
    
    /**
     * Método que genera  MAX notas aleatorias (comprendidas entre 1 y 10) y escribe la 
     * siguiente estadística:  media de las notas, nota máxima, nota mínima, 
     * cuántas veces ha aparecido la nota máxima y cuántas la nota mínima.  
     * MAX es una constante de valor 30. 
     */
    public void escribirEstadisticas() {
        final int MAX = 30;
        int n = 0;
        int suma = 0;
        double media = 0;
        int max = 1;
        int min = 10;
        int cmax = 0;
        int cmin = 0;
        
        for (int i = 0; i < MAX; i++) {
            n = (int)(Math.random()*10)+1;
            System.out.print(n+" ");
            suma += n;
            
            if (n > max) { 
                max = n;
                cmax = 1;
            } else {
                if (n == max) cmax++;
            }
            
            if (n < min) {
                min = n;
                cmin = 1;
            } else {
                if (n == min) cmin++;
            }
        }
        media = suma/30;
        System.out.println(" ");
        System.out.println("La media de notas es "+media);
        System.out.println("La nota máxima es "+max+" y aparece "+cmax+" veces.");
        System.out.println("La nota mínima es "+min+" y aparece "+cmin+" veces.");
    }
}
