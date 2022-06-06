import java.util.Scanner;
public class Exercicio7 {
    public static void main (String [] args){
        Scanner leitor = new Scanner(System.in);

        //Declaração de variáveis
        int anos;
        int meses;
        int dias;
        int resultado;

        //Entrada

        System.out.println("Digite a quantidade de anos");
        anos = leitor.nextInt();
        System.out.println("Digite a quantidade de meses");
        meses = leitor.nextInt();
        System.out.println("Digite a quantidade de dias");
        dias = leitor.nextInt();

        //Processamento
        resultado = anos * 365 + meses * 30 + dias;

        //Saída
        System.out.printf("A sua idade em dias é: %d" , resultado);

        leitor.close();




    }
}
