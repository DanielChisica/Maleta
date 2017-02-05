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
public class Medicinas extends Item{
    private int health;

    public Medicinas(String Nombre, int id) {
        super(Nombre, id);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    @Override
    public Medicinas clone(){
        return new Medicinas(getNombre(), this.health);
}
}
