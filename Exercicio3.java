import javax.swing.JOptionPane;
public class Exercicio3 {
    public static void main (String [] args){

        // Declaração
        double preco;
        double comissao;
        double resultcompra;
        int quant;
        
        //ENTRADA 

        preco =  Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto "));

        quant =  Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produto(s) "));

        //LÓGICA

        resultcompra = preco * quant;
        
        comissao = resultcompra * 0.05;

        //SAÍDA

        JOptionPane.showMessageDialog(null, "A comissão é " + String.format("%.2f" , comissao) + " reais");







    }
}
