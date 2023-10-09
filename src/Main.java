import Exceptions.PersonalExeption;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] numbersArray = new int[5];
        for (int i = 0; i <= 4; i++) {
            int casualNumber = new Random().nextInt(11);
            numbersArray[i] = casualNumber;
        }
        System.out.println(Arrays.toString(numbersArray));
        Scanner scanner = new Scanner(System.in);
        int userNumber=-1;
        do{
                System.out.println("Inserisci un numero da 1 a 10 e premi invio! Oppure premi 0 per uscire.");
                userNumber = checkUserInput(scanner);
                if(userNumber==0){
                    break;
                }
             System.out.println("Perfetto! Adesso inserisci un numero da 1 a 5! Oppure premi 0 per uscire.");
                int positionNumber;
                positionNumber = checkPositionInput(scanner) - 1;
            if(positionNumber==-1){
                break;
            }
                System.out.println("Il nuovo array è : " + changeArrayNumber(numbersArray, userNumber, positionNumber));
        } while (userNumber!=0);
        scanner.close();
    }

    private static int checkUserInput(Scanner scanner) {
        int userInput;
        while (true) {
            try {
                userInput = scanner.nextInt();
                if (userInput >= 0 && userInput <= 10) {
                    break;
                }else if(userInput==0){
                    return 0;
                }else {
                    System.out.println("Input non valido.Inserisci un numero tra 1 e 10.");
                    System.out.println("Riprova:");
                }
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Input non valido.Inserisci un numero tra 1 e 10.");
                System.out.println("Riprova:");
            }
        }
        return userInput;
    }
    private static int checkPositionInput(Scanner scanner) {
        int positionInput;
        while (true) {
            try {
                positionInput = scanner.nextInt();
                if (positionInput >= 1 && positionInput <= 5) {
                    break;
                }else if(positionInput==0){
                    return 0;
                } else {
                    System.out.println("Input non valido.Inserisci un numero tra 0 e 4.");
                    System.out.println("Riprova:");
                }
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Input non valido.Inserisci un numero tra 0 e 4.");
                System.out.println("Riprova:");
            }
        }
        return positionInput;
    }
    public static String changeArrayNumber(int[] array, int number, int position) {
       while(true){
           try {
               if (position >= 0 && position < 5) {
                   array[position] = number;
                   return Arrays.toString(array);
               }else {
                  return "Non è possibile inserire quel numero in quella posizione.";
               }
           }catch(ArrayIndexOutOfBoundsException e){
               return (e.toString());
           }
       }

    }
}
