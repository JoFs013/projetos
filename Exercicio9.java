import javax.swing.JOptionPane;
public class Exercicio9 {
        public static void main (String [] args){

            double salario;
            double reajuste;
            double resultado;
            double conta;

            salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario atual do funcionário "));

            reajuste = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de reajuste "));

            conta = (salario * reajuste) / 100;

            resultado = salario + conta;

            JOptionPane.showMessageDialog(null, "O valor de reajuste é igual a " + String.format("%.2f" , conta) + " reais !!! \n" + "O salário com o reajuste fica igual a " + String.format("%.2f", resultado) + " reais");



        }
}
