
package proj_16_17.model;

public class Supervisor extends Pessoa{
    private String mail;
    
    public Supervisor (String mail){
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
