
package proj_16_17.model;

public class Orientador extends Pessoa {
   private String sigla;
   private String mail;
   
   public Orientador (String sigla,String mail){
       this.mail = mail;
       this.sigla = sigla;
   }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}

