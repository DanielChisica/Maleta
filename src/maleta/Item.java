/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maleta;

/**
 * La clase item contiene los atributos basicos del mismo
 * 
 * @author Daniel Jimenez
 */



public class Item {
    
    
    /**
     * Constructor de la clase item
     * 
     * @param Nombre Nombre del item
     * @param id Id con el que se identifica un item
     */
    public Item(String Nombre, int id) {
        this.Nombre = Nombre;
        this.id = id;
    }
    
    private String Nombre;
    private int id;
    
    /**
     * Retorna el nombre del item
     * 
     * @return Nombre del item
     */
    public String getNombre() {
        return Nombre;
    }
    
    /**
     * Permite modificar el nombre del item
     * 
     * @param Nombre Nombre del item
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    /**
     * Retorna el id del item
     * 
     * @return Int con el que se identifica un item
     */
    public int getId() {
        return id;
    }
    
    /**
     * Modifica el id del item
     * 
     * @param id Int que identifica el item
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Permite clonar un objeto de tipo item
     * 
     * @return Clon de un item
     */
    public Item clone(){
        return new Item(this.Nombre,this.id);
    }
}
