package ExerciseN2;

import java.util.Scanner;

public class N2 {

    public static void main(String[] args) {
        System.out.println("Ciao! Facciamo un giochino, inserisci un numero.");
        Scanner scanner = new Scanner(System.in);
        int km ;
        int litri;
         km=getNextNumber(scanner);
         if(km>=0){
             System.out.println("Inserisci un altro numero.");
         }else{
             System.out.println("Non hai inserito un numero positivo.");
             scanner.close();
         }
        litri= getNextNumber(scanner);
        if(litri>=0){
            System.out.println(calculateKilometersPerLiters(km,litri));
        }else{
            System.out.println("Non hai inserito un numero positivo.");
            scanner.close();
        }
    }


    public static String calculateKilometersPerLiters(int kilometers,int liters){
        try {
            int result = kilometers / liters;
            return "Se i numeri fossero in ordine km percorsi e litri di benzina consumati, il risultato sarebbe " + result + "km al litro";
        } catch (ArithmeticException e) {
            return "Le divisioni per zero non sono concesse";
        }
    }

    private static int getNextNumber(Scanner scanner) {
        while (true) {
            try {
                    return scanner.nextInt();

            } catch (java.util.InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Input non valido. Assicurati di inserire un numero intero valido superiore allo 0.");
                System.out.print("Riprova: ");
            }
        }
    }
}
