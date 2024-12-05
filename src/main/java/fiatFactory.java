/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class fiatFactory implements carFactory {

    @Override
    public void buildSedanCar() {
      Siena siena = new Siena();
      siena.sedan();
    }

    @Override
    public void buildHatchcar() {
         Palio palio = new Palio();
         palio.hatch();
    }
    
}
