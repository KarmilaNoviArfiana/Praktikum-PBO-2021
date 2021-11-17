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
public class Plant {

    public void doDestroy(Destroyable d) {
        if (d instanceof JumpingZombie) {
            JumpingZombie jz = (JumpingZombie) d;
            jz.destroyed();
            jz.getZombieInfo();
        } else if (d instanceof WalkingZombie) {
            WalkingZombie wz = (WalkingZombie) d;
            wz.destroyed();

        } else if (d instanceof Barrier) {
            Barrier b = (Barrier) d;
            b.destroyed();
        }

    }
}
