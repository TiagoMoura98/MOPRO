
package proj_16_17.ui;

import java.io.IOException;
import proj_16_17.model.Curso;
import proj_16_17.model.Utilizador;
import proj_16_17.model.Users;


public class Teste {

    public static void main(String[] args) throws IOException {
        Users lista1 = new Users();
        Utilizador user1 = new Utilizador("Tiago" , "1998", "aluno");  //aluno teste
        Utilizador user2 = new Utilizador("Hugo","2017","orientador"); //orientador teste
        Utilizador user3 = new Utilizador("Josué","2016","supervisor"); //supervisor teste
        Utilizador user4 = new Utilizador("Administrador","0000","admin"); //admin teste
        lista1.getListaUsers().add(user1);
        lista1.getListaUsers().add(user2);
        lista1.getListaUsers().add(user3);
        lista1.getListaUsers().add(user4);
        
        
        Curso c = new Curso();
        
        UiLogin u = new UiLogin(lista1);
        Utilizador loggedIn_user = u.loginUser(lista1);
        String function = loggedIn_user.getFunction();
        
        if (function.equalsIgnoreCase("admin")){  //caso seja admin expor o ui de admin
            UiAdmin a = new UiAdmin(c);
            a.menu_geral();
        }else{
         if(function.equalsIgnoreCase("supervisor")){  // caso seja supervisor expor o ui de supervisor
             System.out.println("hi"); //para verificar se o erro é aqui
         }else{
          if(function.equalsIgnoreCase("orientador")){  //caso seja orientador expor o ui de orientador
              System.out.println("hi2"); //para verificar se o erro é aqui
          } else{      
           if(function.equalsIgnoreCase("aluno")){ // caso seja aluno expor o ui de aluno
            UiAluno b = new UiAluno(c);
            b.menu_geral();
           }   
          }
         }
        }
    }
}
