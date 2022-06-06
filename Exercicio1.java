import javax.swing.JOptionPane;
public class Exercicio1{
    public static void main (String [] args){
        
        double cotacaoDolar;
        double dolar ;
        double resultado;

        cotacaoDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do DÓLAR atual! "));

        dolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em DÓLAR para converter em REAL "));

        resultado = dolar * cotacaoDolar;

        JOptionPane.showMessageDialog(null, "O resultado da conversão é " + String.format("%.2f" , resultado) + " reais");

        // FORMATADO teste
        //System.out.println("O resultado da conversão é " + resultado + "reais");
        //System.out.printf("O resultado da conversão é %.2f " , resultado , "reais");

    }

}