
package proj_16_17.ui;

import java.io.IOException;
import proj_16_17.model.Curso;

public class UiAdmin {

    private Curso c;
    
    public UiAdmin() {
    }

    public UiAdmin(Curso c) {
        this.c = c;
    }
    
    private int menu() {      

        String msg = " 1) Listar\n";
        msg += " 2) Inserir\n";
        msg += " 3) Alterar\n";
        msg += " 4) Gerir\n";
        msg += "\n";
        msg += " 0) Terminar\n";
        msg += "Opção?:";
        
        int op = Utils.leIntDaConsola(msg); //vai dar print deste menu e ler aquilo qe o user escreve na consola aseguir
        return op;
    }

    private int menu_1() {

        String msg;
   
        msg = " 1) "
                + "Projetos\n";
        msg += " 2) Empresas\n";
        msg += " 3) Alunos\n";
        msg += " 4) Orientadores\n";
        msg += " 5) Supervisores\n";
        msg += "\n";
        msg += " 0) Regressar\n";
        msg += "Opção?:";

        int op = Utils.leIntDaConsola(msg);
        return op;
    }
    
    private int menu_2() {

        String msg;

        msg = " 1) Projetos para o ano corrente\n";
        msg += " 2) Projetos disponíveis\n";
        msg += " 3) Docente com mais alunos\n";
        msg += " 4) Empresa com mais projetos propostos\n";
        msg += "\n";
        msg += " 0) Regressar\n";
        msg += "Opção?:";

        int op = Utils.leIntDaConsola(msg);
        return op;
    }

    public void menu_geral() throws IOException{
        // menu de selecção
        int opcao;
        do {
            opcao = menu();
            switch (opcao) {
                case 1:
                    int op1 = menu_1();
                    switch (op1) {
                        case 1:    
                            Curso.listar(c.getProjetos());
                            break;
                        case 2:
                            Curso.listar(c.getEmpresas());
                            break;
                        case 3:
                            Curso.listar(c.getAlunos());
                            break;
                        case 4:
                            Curso.listar(c.getOrientadores());
                            break;
                        case 5:
                            Curso.listar(c.getSupervisores());
                            break;
                        case 0:
                            System.out.println("Regressar");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                    break;
                case 2:
                    op1 = menu_1();
                    switch (op1) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 0:
                            System.out.println("Regressar");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                    break;
                case 3:
                    op1 = menu_1();
                    switch (op1) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 0:
                            System.out.println("Regressar");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                   
                    break;
                case 4:
                    int op2 = menu_2();
                    switch (op2) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 0:
                            System.out.println("Regressar");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                   
                    break;    
                case 0:
                    System.out.println("Fim!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
    
}
