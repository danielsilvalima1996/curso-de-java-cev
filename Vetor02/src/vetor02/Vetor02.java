/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author dsl15
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int fev;
        Calendar cal = Calendar.getInstance();
        //int aA = cal.get(Calendar.YEAR);
        Scanner tec = new Scanner(System.in);
        
        int aA = tec.nextInt();
        if (aA % 400 == 0) {
            fev = 29;
        } else if ((aA % 4 == 0) && (aA % 100 != 0)) {
            fev = 29;
        } else {
            fev = 28;
        }
        int tot[] = {31,fev,31,30,31,30,31,31,30,31,30,31};
        for (int c = 0; c < mes.length; c++) {
            System.out.println("O mês de " + mes[c] + " tem " + tot[c] + " dias ao todo");
        }
    }
    
}
