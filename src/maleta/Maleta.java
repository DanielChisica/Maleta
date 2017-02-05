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
public class Maleta {
    
    public static void main(String[] args) throws Exception {
        Maleta maleta1=new Maleta();
        Armas arma1=new Armas(34, "uzi", 001);
        Medicinas med1=new Medicinas("yerbaroja", 021);
        ObjetosClaves obj1=new ObjetosClaves("medal", 034);
        
        /*Item consulta1[]=maleta1.consultar();
        
        for (int i = 0; i <consulta1.length; i++) {
            System.out.println(consulta1[i]+ "i");
        }
        */
        
        maleta1.almacenar(obj1);
        maleta1.almacenar(med1);
        maleta1.almacenar(arma1);
        
        maleta1.retirar(021);
        
        /*
        Item consulta2[]=maleta1.consultar();
        
        for (int i = 0; i <consulta2.length; i++) {
            System.out.println(consulta2[i]+ "i");
        }
        */
        
        
        
        
    }
    
    private Item arreglo[]= new Item[20];
    
    public Item[] consultar(){
        Item clon[]=new Item[20];
        for (int i = 0; i <clon.length; i++) {
            clon[i]=arreglo[i].clone();
        }
        return clon;
    }
   
    public void retirar(int id){
        for(int j=0; j<arreglo.length; j++){
            if(arreglo[j].getId()==id){
                arreglo[j]=null;
                break;
            }
        }
    }
    
    public void almacenar(Item item)throws Exception{
        boolean error;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]==null){
                arreglo[i]=item;
                error=true;
                break;
            }
            else{
                
            }
        }
        throw new Exception(
        );
    }

    public Item[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Item[] arreglo) {
        this.arreglo = arreglo;
    }
   
    }

