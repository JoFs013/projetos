import javax.swing.JOptionPane;
public class Exercicio2 {
    public static void main (String [] args){
        //ENTRADA DECLARAÇÃO
        double num1;
        double num2;
        double num3;
        double num4;
        
        //RESULTADOS DECLARAÇÃO

        double result1;
        double result2;
        double result3;
        double result4;

        double resultfinal;
  
        //ENTRADA
        num1 =  Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor "));

        num2 =  Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor "));

        num3 =  Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor "));

        num4 =  Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto valor "));

        //QUADRADO DO VALOR DIGITADO
        result1 = num1 * num1;

        result2 = num2 * num2;

        result3 = num3 * num3;

        result4 = num4 * num4;

        //SOMA DOS QUADRADOS
        resultfinal = result1 + result2 + result3 + result4;

        //SAÍDA
        JOptionPane.showMessageDialog(null, "O resultado da soma dos quadrados dos números digitados é " + String.format("%.0f" , resultfinal));

        




















    
    }
}
