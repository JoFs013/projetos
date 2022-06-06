import javax.swing.JOptionPane;
public class Exercicio10 {
    public static void main (String [] args){

        double distribuidor = 0.28 ;
        double imposto = 0.45;
        double fabrica;
        double resultdistribuidor;
        double resultimposto;
        double total;

        fabrica = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo de fábrica do automóvel "));

        resultdistribuidor = fabrica * distribuidor;

        resultimposto = fabrica * imposto;

        total = fabrica + resultdistribuidor + resultimposto;

        JOptionPane.showMessageDialog(null, "O custo final do automóvel é " + String.format("%.2f" , total) + " reais");








    }
}
