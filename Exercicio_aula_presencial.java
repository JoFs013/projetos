import javax.swing.JOptionPane;
public class Exercicio_aula_presencial {
    public static void main (String [] args){

        double salario;
        double salariominimo = 1210;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salário "));

        if(salario > salariominimo){
            JOptionPane.showMessageDialog(null, "Seu salário é maior que um salário mínimo !!!");    
        }else{
            JOptionPane.showMessageDialog(null, "Seu salário é menor que um salário mínimo !!!");
        }



    }
}
