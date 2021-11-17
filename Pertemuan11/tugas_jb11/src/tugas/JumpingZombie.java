/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author Windows 8.1
 */
public class JumpingZombie extends Zombie{

    public JumpingZombie(int health, int level) {
        super.health = health;
        super.level = level;
    }
    
    public void heal(){
        if(level == 1){
            health += health * 0.3;
        }else if(level == 2){
            health += health * 0.4;
        }else if(level == 3){
            health += health * 0.5;
        }else{
            System.out.println("tidak ada tambahan energi");
        }
    }
    
    public void destroyed(){
        health -= health * 0.095;
    }
    
    public String getZombieInfo(){
        return "Jumping Zombie Data = \n"+
                "Health = "+health+"\n"+
                "Level = "+level+"\n";
    }
    
}
