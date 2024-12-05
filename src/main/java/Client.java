
import javax.swing.JOptionPane;

public class Client {
    public static void main(String[] args) {
        int escolha = Integer.parseInt(JOptionPane.showInputDialog("Esolha qual carro voce deseja criar: 1 - Fiat \n 2 - Volks "));
        
        switch(escolha){
            case 1:
                fiatFactory fiat = new fiatFactory();
                int escolha2 = Integer.parseInt(JOptionPane.showInputDialog("Esolha o modelo: 1 - Sedan \n 2 - Hatch "));
                if(escolha2 == 1){
                    fiat.buildSedanCar();
                }else if(escolha2 == 2){
                    fiat.buildHatchcar();
                }else {
                    JOptionPane.showMessageDialog(null, "Escolha uma opcao valida");
                }
                break;
            case 2:
                 volksFactory volks = new volksFactory();
                int escolha3 = Integer.parseInt(JOptionPane.showInputDialog("Esolha o modelo: 1 - Sedan \n 2 - Hatch "));
                if(escolha3 == 1){
                    volks.buildSedanCar();
                }else if(escolha3 == 2){
                    volks.buildHatchcar();
                }else {
                    JOptionPane.showMessageDialog(null, "Escolha uma opcao valida");
                }
                break;
        }
        
        
    }
}
