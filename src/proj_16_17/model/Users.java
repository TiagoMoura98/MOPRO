
package proj_16_17.model;
import java.util.ArrayList;

public class Users {
    
    
    private ArrayList<Utilizador> listaUsers; 
    
    public Users (){
        this.listaUsers = new ArrayList<Utilizador> ();
    }
   
   
    public ArrayList<Utilizador> getListaUsers() {
        return listaUsers;
    }

    public void setListaUsers(ArrayList<Utilizador> listaUsers) {
        this.listaUsers = listaUsers;
    }
        
    
        
}
