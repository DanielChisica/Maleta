/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maleta;
import javax.swing.JOptionPane;

/**
 *
 * @author EAN
 */
public class Maleta {
    
    public static void main(String[] args) throws Exception {
       
        
        /*
         Maleta maleta1=new Maleta();
        Armas arma1=new Armas(34, "uzi", 001);
        Medicinas med1=new Medicinas("yerbaroja", 021);
        ObjetosClaves obj1=new ObjetosClaves("medal", 034);
        */
        
        /*
        Item item1= new Item("shotgun", 021);
        Item item2= new Item("Yerba roja", 022);
        Item item3= new Item("Sapphire", 045);
        Item item4= new Item("yerba verde", 036);
        Item item5= new Item("polvora a", 035);
        Item item6= new Item("Lata", 065);
        Item item7= new Item("polvora b", 9);
        Item item8= new Item("uzi", 011);
        Item item9= new Item("key", 013);
        Item item10= new Item("health spray", 014);
        Item item11= new Item("disquette", 044);
        Item item12= new Item("hosepipe", 020);
        Item item13= new Item("photo", 024);
        Item item14= new Item("magnum", 8);
        Item item15= new Item("flamethrower", 7);
        Item item16=new Item("lantern", 006);
        Item item17= new Item("chain", 005);
        Item item18= new Item("glove", 004);
        Item item19= new Item("glasses", 003);
        Item item20= new Item("grenade launcher", 002);
        Item item21= new Item("Tape", 001);
        Armas arma1= new Armas(34, "gaga", 03);
                
        
        
        Item consulta1[]=maleta1.consultar();
        
        for (int i = 0; i <consulta1.length; i++) {
            System.out.println(consulta1[i]+ "i");
        }
        
        maleta1.almacenar(item1);
        maleta1.almacenar(arma1);
        
        */
        
        
        

        /*
        Item consulta2[]=maleta1.consultar();
        
        for (int i = 0; i <consulta2.length; i++) {
            System.out.println(consulta2[i]+ "i");
        }
        */
                
    }
    
    private Item arreglo[]= new Item[20];
    
    private Item clon[]= new Item[20];
    
    public Item[] consultar(){
        for (int i = 0; i <clon.length; i++) {
            clon=arreglo.clone();
        }
        return clon;
    }
   
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

    public Item[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Item[] arreglo) {
        this.arreglo = arreglo;
    }
   
    }

