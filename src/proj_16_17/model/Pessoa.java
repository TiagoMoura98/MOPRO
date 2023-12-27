
package proj_16_17.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Pessoa {
    private String nome;
    private Data dataNasc;
    private String NIF;
    private String numCC;

    public Pessoa(){
        this.nome = "";
        this.dataNasc = null;
        this.NIF = null;
    }

    public Pessoa(String nome){
        this.nome = nome;
        this.dataNasc = null;
        this.NIF = null;
    }

    public Pessoa(String nome, Data data){
        this.nome = nome;
        this.dataNasc = data;
        this.NIF = null;
    }

    public Pessoa(String nome, String NIF){
        this.nome = nome;
        this.NIF = NIF;
    }

    public Pessoa(String nome, Data dataNasc, String NIF, String numCC) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.NIF = NIF;
        this.numCC = numCC;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int calculaIdade() {

    // Data de hoje.
        GregorianCalendar agora = new GregorianCalendar();
        int ano = agora.get(Calendar.YEAR);
        int mes = agora.get(Calendar.MONTH);
        int dia = agora.get(Calendar.DAY_OF_MONTH);

        int anoNasc = 0;
        int mesNasc = 0;
        int diaNasc = 0;

        if(getDataNasc() != null){
            anoNasc = getDataNasc().getAno();
            mesNasc = getDataNasc().getMes();
            diaNasc = getDataNasc().getDia();
        }

        int idade = ano - anoNasc;

        // Calculando diferencas de mes e dia.
        if(mes < mesNasc) {
            idade--;
        } else {
            if(mes == mesNasc && dia < diaNasc) {
                idade--;
            }
        }
        return (idade);
    }


    public  String toString(){
        String s = " ";
        s += nome + " tem " + calculaIdade() + " anos.";
        return s;
    }

    /**
     * @return the dataNasc
     */
    public Data getDataNasc() {
        return dataNasc;
    }

    /**
     * @param dataNasc the dataNasc to set
     */
    public void setDataNasc(Data dataNasc) {
        this.dataNasc = dataNasc;
    }
}
