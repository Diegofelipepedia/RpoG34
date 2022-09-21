package clase_13_plntasvszoombies;

import java.util.ArrayList;

/**
 *
 * @author Felipe
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Zombie z1 = new Zombie("Pepe");
        Zombie z2 = new ZombienArmadura("Vicente");
        Zombie z3 = new ZombieRapido("Maria");
        Zombie z4 = new ZombieRapido("Pancha");
        
        //System.out.println(z3);
        
        ArrayList<Zombie> listaZombies = new ArrayList<>();
        listaZombies.add(z1);
        listaZombies.add(z2);
        listaZombies.add(z3);
        listaZombies.add(z4);
        
        
        //z1 vs z2
        System.out.println("--------Comienza la pelea--------");
        Zombie primero, segundo;
        if(z1.getVelocidad() >= z2.getVelocidad()){
            primero = z1;
            segundo = z2;
        }
        else{
            primero = z2;
            segundo = z1;
        }
        
        while (primero.puntosVida > 0 && segundo.puntosVida > 0 ){
            primero.atacar(segundo);
            segundo.atacar(segundo);
        }
        
        if(primero.puntosVida > 0){
            System.out.println("El ganador es " + primero);
        }
        else{
            System.out.println("El ganado es " + segundo);
        } 
        
        
        
    }
    
}
