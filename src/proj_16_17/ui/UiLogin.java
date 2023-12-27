package proj_16_17.ui;

import proj_16_17.model.Users;
import proj_16_17.model.Utilizador;
import proj_16_17.ui.Utils;

public class UiLogin {

    public UiLogin(Users lista1) {
        //loginUser(lista1);

    }

    public Utilizador loginUser(Users lista1) {
        Utilizador temp_user = new Utilizador();
        int x = 1;
        do {

            String username = "Insira o seu username:";
            String user = Utils.leLinhaDaConsola(username);
            for (Utilizador u : lista1.getListaUsers()) {
                if (u.getUser().equals(user)) {
                    String password = "Insira a sua password:";
                    String pass = Utils.leLinhaDaConsola(password);
                    if (u.getPass().equals(pass)) {
                        x = 0;  //acesso autorizado
                        temp_user = u;
                    } else {
                        System.out.println("Credenciais invalidas!");
                    }//pass
                } //user 
            }  //for  
        } while (x != 0); //do while para a pass e o user
        String acesso = "autorizado";
        return temp_user;
    } // metodo loginUser
} //class

