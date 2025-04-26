import java.util.Scanner;

public class ValidadorCpf {

    public static boolean validarCpf(String cpf) {
        return cpf != null && cpf.length() == 11;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu CPF: ");
        String cpf = scanner.nextLine();

        if (validarCpf(cpf)) {
            System.out.println("Bem vindo(a)!");
        } else {
            System.out.println("Tente novamente mais tarde.");
        }
        scanner.close();
    }
}
