package resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDaTela {

    public static void main(String[] args) {
        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension tD = tela.getScreenSize();
        System.out.println("A resolução da tela é " + tD.width + " X " + tD.height);
    }
    
}
