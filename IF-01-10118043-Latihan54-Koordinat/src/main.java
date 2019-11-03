/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat wk = new WarnaKoordinat(10, 4, "Jingga");
        System.out.println("Nama WARNA "+wk.getNamaWarna());
        System.out.println("Sumbu X: "+wk.getX()+", Y: "+wk.getY());
        
        
    }
    
}
