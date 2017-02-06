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
public class ObjetosClaves extends Item{
    
    
    private String descripcion;

    public ObjetosClaves(String descripcion, String Nombre, int id) {
        super(Nombre, id);
        this.descripcion = descripcion;
    }

    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    @Override
    public ObjetosClaves clone(){
        return new ObjetosClaves(this.descripcion,getNombre(), getId());
    }
    
}
