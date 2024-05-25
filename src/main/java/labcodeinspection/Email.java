package labcodeinspection;

import java.util.Locale;

public class Email {

	private transient final String firstName;
	private transient final String lastName;
	private transient String department;
	private transient final int passwordLength = 8;
	private transient String email;
	private transient String password;

	/**
	 * Constructor para inicializar el nombre y apellido
	 * 
	 * @param firstName Nombre del usuario
	 * @param lastName Apellido del usuario
	 */
	public Email(final String firstName, final String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * Muestra la información del usuario
	 */
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + firstName + "\nLAST NAME= " + lastName);
		System.out.println("DEPARTMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}

	/**
	 * Establece el departamento basado en una elección
	 * 
	 * @param depChoice Elección del departamento
	 */
	public void setDepartment(final int depChoice) {
		switch (depChoice) {
			case 1:
				this.department = "sales";
				break;
			case 2:
				this.department = "dev";
				break;
			case 3:
				this.department = "acct";
				break;
			default:
				this.department = "";
				break;
		}
	}
	
	/**
	 * Genera una contraseña aleatoria
	 * 
	 * @param length Longitud de la contraseña
	 * @return Contraseña generada
	 */
	private String randomPassword(final int length) {
		final String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		final char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			final int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}

	/**
	 * Genera el correo electrónico del usuario
	 */
	public void generateEmail() {
		this.password = this.randomPassword(this.passwordLength);
		this.email = this.firstName.toLowerCase(Locale.ROOT) + this.lastName.toLowerCase(Locale.ROOT) + "@" + this.department
				+ ".espol.edu.ec";
	}
}
