/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author dsl15
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0, totVal=0, totPar=0, totImpar=0, a100=0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <em><br>(O valor 0 interrompe)</em></html>"));
            s += n;
            totVal++; // valores digitados
            
            if(n%2==0) {
                totPar++; //Total PAR
            } else {
                totImpar++;//Total IMPAR
            }
            if (n > 100) {
                a100++;
            }
        } while(n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado Final<br><hr><br>Somatório vale " + s + "<br>Total de valores: " + totVal + "<br>Total de Pares: " + totPar + "<br>Total de Impares: " + totImpar + "<br>Valores acima de 100: " + a100 + "</html>");
    }
    
}
