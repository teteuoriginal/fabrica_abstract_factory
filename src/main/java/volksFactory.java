/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class volksFactory implements carFactory{

    @Override
    public void buildSedanCar() {
        Voyage voyage = new Voyage();
        voyage.sedan();
    }

    @Override
    public void buildHatchcar() {
       Gol gol = new Gol();
       gol.hatch();
    }
    
}
