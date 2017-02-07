/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maleta;

/**
 * La clase armas permite crear items de este tipo
 * 
 * @author Daniel Jimenez
 */
public class Armas extends Item{
    private int dmg;
    
    /**
     * Constructor de la clase armas
     * 
     * @param dmg Int que denota el daño que inflinge un arma
     * @param Nombre Nombre del arma
     * @param id Int que identifica un arma
     */
    public Armas(int dmg, String Nombre, int id) {
        super(Nombre, id);
        this.dmg = dmg;
    }


    /**
     * Retorna el daño del arma
     * 
     * @return Int con el dmg
     */
    public int getDmg() {
        return dmg;
    }
    
    /**
     * Modifica el daño de un arma
     * 
     * @param dmg Inr con el daño del arma
     */
    public void setDmg(int dmg) {
        this.dmg = dmg;
    }
    
    /**
     * Clona un item tipo arma
     * @return Un item de tipo arma
     */
    @Override
    public Armas clone(){
        return new Armas(this.dmg,getNombre(),getId() );
    }
    
}
