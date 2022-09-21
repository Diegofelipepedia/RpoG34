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
public abstract class Zombie {
    
    protected String nombre;
    protected String tipo;
    protected int velocidad;
    protected int puntosVida;
    protected int armadura;
    protected int daño;

    //Constructor
    public Zombie(String nombre) {
        this.nombre = nombre;
        this.tipo = "Estandar";
        this.velocidad = 5;
        this.puntosVida = 10;
        this.armadura = 0;
        this.daño = 2;
    }

    public Zombie() {
    }

    //Getters
    
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public int getArmadura() {
        return armadura;
    }

    public int getDaño() {
        return daño;
    }

    @Override
    public String toString() {
        return nombre + "(" + tipo + '}';
    }
    
    
    public void recibirDaño(int daño){
        daño = daño - this.armadura;
        if (daño > 0){
            this.puntosVida = this.puntosVida - daño;
            System.out.println(this + "Ha recibido un daño");
            if(this.puntosVida <= 0){
                System.out.println(this + "Ha caido");
            }
        }
        else{
            System.out.println(this + "No recibio daño");
        }
    }
    
    public void atacar(Zombie victima){
        if(this.puntosVida > 0){
            victima.recibirDaño(daño);
        }
        else{
            System.out.println(this + "No se puede atacar ha caido");
        }
    }
    
    
    abstract public String Gruñir();
}
