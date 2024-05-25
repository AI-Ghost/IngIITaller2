package labcodeinspection;

import java.util.Scanner;

public class EmailApp {

    /**
     * Constructor privado para evitar instanciación
     */
    private EmailApp() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Método principal para ejecutar la aplicación de correo electrónico
     * 
     * @param args Argumentos de la línea de comandos
     */
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        final String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        final String lastName = scanner.nextLine();

        System.out.print("\nDEPARTMENT CODE\n1. for sales\n2. for Development\n3. for accounting\nEnter code: ");
        final int depChoice = scanner.nextInt();
        scanner.close();

        final Email email = new Email(firstName, lastName);
        email.setDepartment(depChoice);
        email.generateEmail();
        email.showInfo();
    }
}
