import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        //Variáveis
        double SALARIO_HORA, SALARIO;
        int NUMERO, HORAS_TRABALHADAS;
        
        //Entrada
        NUMERO = leitor.nextInt();
        HORAS_TRABALHADAS = leitor.nextInt();
        SALARIO_HORA = leitor.nextDouble();
        
        //Processamento
        SALARIO = SALARIO_HORA * HORAS_TRABALHADAS;
        
        //Imprimir na tela
        System.out.println("NUMBER = " + NUMERO);
        System.out.printf("SALARY = U$ %.2f%n", SALARIO);
    }
}
