package fechavalida;

import java.util.Scanner;

/**
 *
 * @author dam
 */
public class FechaValida {
//Hola
    public static boolean validadorFecha(int day, int month, int year) {
        if (month < 1 || month > 12) {
            return false;
        } else {
            if (month != 2 && month != 4 && month != 6 && month != 9 && month != 11) {
                return !(day < 1 || day > 31);
            } else if (month != 2) {
                return !(day < 1 || day > 30);
            } else {
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    return !(day < 1 || day > 29); // return 1
                } else {
                    return !(day < 1 || day > 28); //return 2
                }
                
                // FIN 1
            }
            
             // FIN 2
            
        }
        
        // FIN 3
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	Scanner teclado = new Scanner(System.in);
        int dia;
        int mes;
        int anno;
        System.out.println("Que fecha quieres validar");
        System.out.println("Que dia");
        dia = teclado.nextInt();
        System.out.println("Que mes");
        mes = teclado.nextInt();
        System.out.println("Que año");
        anno = teclado.nextInt();
        if (validadorFecha(dia, mes, anno)) {
            System.out.println("La fecha es valida");
        } else {
            System.out.println("La fecha no es valida");
        }
        teclado.close();
    }
    

}
