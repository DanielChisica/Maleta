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



public class Item {
    
    

    public Item(String Nombre, int id) {
        this.Nombre = Nombre;
        this.id = id;
    }
    
    private String Nombre;
    private int id;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Item clone(){
        return new Item(this.Nombre,this.id);
    }
}
