
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
                positionNumber = checkPositionInput(scanner,numbersArray,userNumber) - 1;
            if(positionNumber==-1){
                break;
            }
                System.out.println("Il nuovo array è : " + changeArrayNumber(numbersArray));
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
                    break;
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
    private static int checkPositionInput(Scanner scanner,int [] array,int number) {
        int positionInput;
        while (true) {
            try {
                positionInput = scanner.nextInt();
                array[positionInput-1]=number;
               return  positionInput;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Input non valido.Inserisci un numero tra 1 e 5.");
                System.out.println("Riprova:");
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Inserisci un numero da 1 a 5");
            }
        }
    }
    public static String changeArrayNumber(int[] array) {
                   return Arrays.toString(array);
    }
}
