/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_13_plntasvszoombies;

/**
 *
 * @author Felipe
 */
public class ZombienArmadura extends Zombie{
    
    private int armadura;
    
    public ZombienArmadura(String nombre) {
        this.nombre = nombre;
        this.tipo = "Estandar";
        this.velocidad = 3;
        this.puntosVida = 10;
        this.armadura = 2;
        this.daño = 3;
    }

    public int getArmadura() {
        return armadura;
    }
    
    
//    @Override
//    public 

    @Override
    public String Gruñir() {
        return "Broo";
    }
}
