
package proj_16_17.model;

public class Aluno extends Pessoa{
    private int numMecan;
    private int numECTS;  // necessários para entrar em estagio
    private int notaProj;
    
    public Aluno (int numMecan,int numECTS,int notaProj){
        this.numECTS = numECTS;
        this.numMecan = numMecan;
        this.notaProj = notaProj;
    }
    
    public int getNumMecan() {
        return numMecan;
    }

    public void setNumMecan(int n5umMecan) {
        this.numMecan = numMecan;
    }

    public int getNumECTS() {
        return numECTS;
    }

    public void setNumECTS(int numECTS) {
        this.numECTS = numECTS;
    }

    public int getNotaProj() {
        return notaProj;
    }

    public void setNotaProj(int notaProj) {
        this.notaProj = notaProj;
    }
   
    
    @Override
    public String toString(){
        return String.format(" %n Nota projeto: % d", notaProj);
    }
}
