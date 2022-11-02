/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgabstract;

/**
 *
 * @author Mahasiswa
 */
public class Knife extends Weapon{
    
    public String knifeEdge(){
        
        return null;
        
    }
    
    @Override
    public void info(){
        System.out.println("Menyayat dan menusuk musuh");
    }
    
    @Override
    public void attack(){
        info();
    }
}
