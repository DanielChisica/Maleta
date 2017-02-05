/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maleta;

/**
 *
 * @author EAN
 */
public class Armas extends Item{
    private int dmg;

    public Armas(int dmg, String Nombre, int id) {
        super(Nombre, id);
        this.dmg = dmg;
    }



    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }
    
    @Override
    public Armas clone(){
        return new Armas(this.dmg,getNombre(),getId() );
    }
    
}
