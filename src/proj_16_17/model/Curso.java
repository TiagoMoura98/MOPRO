package proj_16_17.model;

import java.util.ArrayList;

public class Curso {

    private String sigla;
    private ArrayList<Projeto> projetos;
    private ArrayList<Empresa> empresas;
    private ArrayList<Aluno> alunos;
    private ArrayList<Orientador> orientadores;
    private ArrayList<Supervisor> supervisores;

    public Curso() {
        this.sigla = "LES";
        this.projetos = new ArrayList();
        this.empresas = new ArrayList();
        this.alunos = new ArrayList();
        this.orientadores = new ArrayList();
        this.supervisores = new ArrayList();
    }

    public Curso(String sigla, ArrayList<Projeto> projetos, ArrayList<Empresa> empresas, ArrayList<Aluno> alunos, ArrayList<Orientador> orientadores, ArrayList<Supervisor> supervisores) {
        this.sigla = sigla;
        this.projetos = projetos;
        this.empresas = empresas;
        this.alunos = alunos;
        this.orientadores = orientadores;
        this.supervisores = supervisores;
    }
    
    public static void listar(ArrayList obj) { // lista todos os objetos de um arraylist
        for (Object o : obj) {
            System.out.println(o);
        }
    }
      //criar lista de users com atributos pass user e funcao
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(ArrayList<Projeto> projetos) {
        this.projetos = projetos;
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Orientador> getOrientadores() {
        return orientadores;
    }

    public void setOrientadores(ArrayList<Orientador> orientadores) {
        this.orientadores = orientadores;
    }

    public ArrayList<Supervisor> getSupervisores() {
        return supervisores;
    }

    public void setSupervisores(ArrayList<Supervisor> supervisores) {
        this.supervisores = supervisores;
    }
}
