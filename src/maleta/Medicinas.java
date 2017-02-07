/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maleta;

/**
 * La clase medicina permite crear items de este tipo
 * 
 * @author Daniel Jimenez
 */



public class Medicinas extends Item{
    private int health;
    
    /**
     * Constructor de la clase medicinas
     * 
     * @param Nombre Nombre de la medicina
     * @param id # de identificacion de la medicina
     */
    public Medicinas(String Nombre, int id) {
        super(Nombre, id);
    }
    
    /**
     * Da acceso al atributo salud
     * 
     * @return salud que recupera la medicina
     */
    public int getHealth() {
        return health;
    }
    
     /**
      * Permite configurar la salud de una medicina
      * 
      * @param health salud que recupera la medicina
      */
    public void setHealth(int health) {
        this.health = health;
    }
    @Override
    public Medicinas clone(){
        return new Medicinas(getNombre(), this.health);
}
}
