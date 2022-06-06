import javax.swing.JOptionPane;
public class Exercicio5 {
    public static void main (String [] args){

        double base;
        double altura;
        double areaRetangulo;

        base =  Double.parseDouble(JOptionPane.showInputDialog("Digite a base do retângulo em centímetros "));

        altura =  Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do retângulo em centímetros "));

        areaRetangulo = base * altura;

        //JOptionPane.showMessageDialog(null, "A área do retangulo é " + areaRetangulo + " centímetros");

        JOptionPane.showMessageDialog(null, "A área do retangulo é " + String.format("%.0f" , areaRetangulo) + " centímetros");













    }

}
