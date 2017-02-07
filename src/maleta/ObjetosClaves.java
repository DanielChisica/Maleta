/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maleta;

/**
 * La clase objeto clave permitira crear items de este tipo
 * 
 * @author Daniel Jimenez
 */
public class ObjetosClaves extends Item{
    
    
    private String descripcion;
    
    /**
     * Constructor de la clase objetos clave
     * 
     * @param descripcion Cadena de caracteres con la descripcion de un objeto
     * @param Nombre el nombre del objeto clave
     * @param id Int que identifica al objeto clave
     */
    public ObjetosClaves(String descripcion, String Nombre, int id) {
        super(Nombre, id);
        this.descripcion = descripcion;
    }

    
    /**
     * Retorna la descripcion del objeto clave
     * 
     * @return Cadena de caracteres con la descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }
    
    /**
     * Metodo que modifica la descripcion de un objeto
     * 
     * @param descripcion Descripcion del objeto clave
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    /**
     * 
     * @return Clon del objeto clave
     */
    @Override
    public ObjetosClaves clone(){
        return new ObjetosClaves(this.descripcion,getNombre(), getId());
    }
    
}
