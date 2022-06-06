import javax.swing.JOptionPane;
public class Exercicio4 {
    public static void main (String [] args){

        int valor1;
        int resultado;

        valor1 =  Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para saber seu antecessor "));

        resultado = valor1 - 1;

        JOptionPane.showMessageDialog(null, "O antecessor de " + valor1 +" é igual a " + resultado);

        

    }
}
