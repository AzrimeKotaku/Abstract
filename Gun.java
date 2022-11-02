/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgabstract;

/**
 *
 * @author Mahasiswa
 */
public class Gun extends Weapon{
    public int bullets;
    
    public Gun(int bullets){
        this.bullets = bullets;
    }
    
    @Override
    public void info(){
        System.out.println("Senjata menembakkan peluru");
        this.bullets--;
        System.out.println("sisa pelurub: " + this.bullets);
    }
    
    @Override
    public void attack(){
        info();
    }
}
