 
package proj_16_17.model;


public class Utilizador {
  private String user;
  private String pass;
  private String function;
  
  
 public Utilizador(String user,String pass,String function){
  this.pass = pass;
  this.user = user;
  this.function = function;
 }

    public Utilizador() {
        user = null;
        pass = null;
        function = null;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
 
    public String toString(){
    String a = "";
    return a;
}

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}
