/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maleta;
import javax.swing.JOptionPane;

/**
 *La clase maleta contiene los metodos necesarios para que funcione este objeto
 * como unidad de almacenamiento
 * 
 * @author Daniel Jimenez
 */
public class Maleta {
    private Item arreglo[]= new Item[20];
    
    private Item clon[]= new Item[20];
    
    /**
     * Este metodo permite clonar el arreglo que contiene los items
     * 
     * @return Arreglo de tipo item consultado, es decir el clon 
     */
    public Item[] consultar(){
        for (int i = 0; i <clon.length; i++) {
            clon=arreglo.clone();
        }
        return clon;
    }
   
    /**
     * Retira un objeto de tipo item del arreglo que los contiene.
     * 
     * @param id Tipo de dato int que representa el numero de identificacion de
     * un item
     * @throws Exception Exception al intentar retirar un item que no se encuentra
     * en el arreglo
     */
    public void retirar(int id) throws Exception{
        boolean flag;
        flag=false;
        for(int j=0; j<arreglo.length; j++){
            if(arreglo[j].getId()==id){
                arreglo[j]=null;
                flag=true;
                System.out.println("Item retirado con exito");
                break;
            }
            
            else {
                flag=false;
            }
        }
        
        if (flag==false){
            throw new Exception("Su id introducido no concuerda con los items");
        }
    }
    
    /**
     * Almacena un objeto de tipo item en el arreglo que los contiene
     * 
     * @param item Objeto de tipo item que va a ser almacenado en el arreglo
     * @throws Exception Excepcion al introducir un item con el arreglo lleno
     */
    public void almacenar(Item item)throws Exception{
        boolean flag;
        flag=false;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]==null){
                arreglo[i]=item;
                flag=true;
                break;
            }
            else{
                flag=false;
            }
        }
        if(flag==false){
        JOptionPane.showMessageDialog(null, "La maleta esta llena");
        throw new Exception("La maleta esta llena");
        }
    }
    
    /**
     * Retorna el arreglo de items
     * @return arreglo de items
     */
    public Item[] getArreglo() {
        return arreglo;
    }
    
    /**
     * Modifica el arreglo con los items
     * @param arreglo arreglo de items 
     */
    public void setArreglo(Item[] arreglo) {
        this.arreglo = arreglo;
    }
   
    }

