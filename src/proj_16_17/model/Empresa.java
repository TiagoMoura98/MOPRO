
package proj_16_17.model;

public class Empresa {
    private String nome;
    private String morada;
    private double NIPC;
    private double nTelefone;
    
    public Empresa (String nome,String morada,double NIPC,double nTelefone){
        this.NIPC = NIPC;
        this.morada = morada;
        this.nTelefone = nTelefone;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public double getNIPC() {
        return NIPC;
    }

    public void setNIPC(double NIPC) {
        this.NIPC = NIPC;
    }

    public double getnTelefone() {
        return nTelefone;
    }

    public void setnTelefone(double nTelefone) {
        this.nTelefone = nTelefone;
    }
    
}

