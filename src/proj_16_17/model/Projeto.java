
package proj_16_17.model;

public class Projeto {
   private double nSeq;
   private String titulo;
   private String empresa;
   private Data dataInicio;
   private Data dataFim;
   private String descricaoProj;
   private int estadoProj;
    
  public Projeto(double nSeq,String titulo,String empresa,Data dataInicio,Data dataFim,String descricaoProj,int estadoProj){
      this.dataFim = dataFim;
      this.dataInicio = dataInicio;
      this.descricaoProj = descricaoProj;
      this.empresa = empresa;
      this.estadoProj = estadoProj;
      this.nSeq = nSeq;
      this.titulo = titulo;
  } 
   
    public double getnSeq() {
        return nSeq;
    }

    public void setnSeq(double nSeq) {
        this.nSeq = nSeq;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Data getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Data dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Data getDataFim() {
        return dataFim;
    }

    public void setDataFim(Data dataFim) {
        this.dataFim = dataFim;
    }

    public String getDescricaoProj() {
        return descricaoProj;
    }

    public void setDescricaoProj(String descricaoProj) {
        this.descricaoProj = descricaoProj;
    }

    public int getEstadoProj() {
        return estadoProj;
    }

    public void setEstadoProj(int estadoProj) {
        this.estadoProj = estadoProj;
    }
   
   
}

