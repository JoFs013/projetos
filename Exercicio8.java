import javax.swing.JOptionPane;
public class Exercicio8 {
    public static void main (String [] args){
         
       int Eleitores;
       int Brancos;
       int Nulos;
       int Validos;
       double calcBrancos;
       double calcNulos;
       double calcValidos;
       int Result;
       int naovotaram;
       double calcnaovotaram;

       Eleitores = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de eleitores do município "));

       Brancos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de votos brancos "));

       Nulos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de votos nulos "));

       Validos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de votos válidos "));

       calcBrancos = (Brancos * 100) / Eleitores; 

       calcNulos = (Nulos * 100) / Eleitores;

       calcValidos = (Validos * 100) / Eleitores;

       Result = Brancos + Nulos + Validos;

       if(Result == Eleitores){
            JOptionPane.showMessageDialog(null, "O resultado é igual a \n" + String.format("%.2f", calcBrancos) + " % de votos brancos. \n" + String.format("%.2f", calcNulos) + " % de votos nulos. \n" + String.format("%.2f", calcValidos) + " % de votos válidos. ");
       }
       else if(Result > Eleitores){
            JOptionPane.showMessageDialog(null, "Valores inseridos inválidos ");
       
       } else{
            naovotaram = Eleitores - Brancos - Nulos - Validos;
            calcnaovotaram = (naovotaram * 100) / Eleitores;
            JOptionPane.showMessageDialog(null, "O resultado é igual a \n" + String.format("%.2f", calcBrancos) + " % de votos brancos. \n" + String.format("%.2f", calcNulos) + " % de votos nulos. \n" + String.format("%.2f", calcValidos) + " % de votos válidos.  \n" + String.format("%.2f", calcnaovotaram) + " % não votaram ");
            
       }



       
       




    }
}
