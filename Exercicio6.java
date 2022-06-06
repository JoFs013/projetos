import javax.swing.JOptionPane;
public class Exercicio6 {
    public static void main (String [] args) {

    int idade;
    int ano = 365;
    int resultado;

    idade =  Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade "));

    resultado = idade * ano;
    
    JOptionPane.showMessageDialog(null, "A sua idade em dias é igual a " + resultado);

    


    } 
}
