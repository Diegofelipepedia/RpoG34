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
public class ZombieRapido extends Zombie {

    public ZombieRapido(String nombre) {
        this.nombre = nombre;
        this.tipo = "Estandar";
        this.velocidad = 9;
        this.puntosVida = 8;
        this.daño = 1;
    }

    @Override
    public String toString() {
        return this.nombre + "(" + this.tipo + "}" + "Velocidad: " + this.velocidad;
    }

    @Override
    public String Gruñir() {
        return "Gruu";
    }
    
    
    
    
}
