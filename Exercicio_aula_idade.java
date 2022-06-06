import javax.swing.*;
public class Exercicio_aula_idade {
    public static void main (String [] args){

        int idade;

        idade = Integer.parseInt(JOptionPane.showInputDialog(" Qual a sua idade? "));

        if( idade >= 18){
            JOptionPane.showMessageDialog(null, " Voce é maior de idade !!!");
        }else{
            JOptionPane.showMessageDialog(null, "Voce é menor de idade !!!");
        }



    }
}
