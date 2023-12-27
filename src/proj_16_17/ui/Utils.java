
package proj_16_17.ui;

import java.util.ArrayList;
import java.util.Scanner;

public class Utils {

    static public String leLinhaDaConsola(String strPrompt) // le aquilo qe o user escreve na consola 
    {
         Scanner in = new Scanner(System.in);
        try
        {
            System.out.println(strPrompt); 
            return in.nextLine();  //da return do qe o user escreve
        } catch (Exception e) 
        {
            e.printStackTrace(); //serve para dar "trace" de uma exception, ou seja, saber a sua origem
            return null; // da return de um null ou seja de nada
        }
    }

    static public boolean confirma(String sMessage) {      //serve para confirmar a opção
        String strConfirma;
        do {
            strConfirma = leLinhaDaConsola("\n" + sMessage + "\n");
        } while (!strConfirma.equalsIgnoreCase("s") && !strConfirma.equalsIgnoreCase("n")); // enquanto for diferente de "s" ou "n" vai continuar a perguntar se tem a certeza?

        return strConfirma.equalsIgnoreCase("s");
    }
    
    static public Object apresentaESeleciona(ArrayList list,String sHeader)
    {
        apresentaLista(list,sHeader);
        return selecionaObject(list);
    }
    
    static public void apresentaLista(ArrayList list,String sHeader)   // da print da lista 
    {
        System.out.println(sHeader);
        int index = 0;
        for (Object o : list)
        {
            index++;
            System.out.println(index + ". " + o.toString());
        }
        System.out.println("");
        System.out.println("0 - Cancelar");
    }
    
    static public Object selecionaObject(ArrayList list)
    {
        String opcao;
        int nOpcao;
        do
        {
            opcao = Utils.leLinhaDaConsola("Introduza opção: ");
            nOpcao = new Integer(opcao);
        } while (nOpcao < 0 || nOpcao > list.size());

        if (nOpcao == 0)
        {
            return null;
        } else
        {
            return list.get(nOpcao - 1);
        }
    }

    public static int leIntDaConsola(String strPrompt)
    {
        do
        {
            try
            {
                String strInt = leLinhaDaConsola(strPrompt);
                int iInt = Integer.parseInt(strInt);
                return iInt;
            } catch (NumberFormatException ex)
            {
                System.out.println("Valor invalido!");
            }
        } while (true);
    }

    public static double leDoubleDaConsola(String strPrompt)
    {
        do
        {
            try
            {
                String strDbl = leLinhaDaConsola(strPrompt);
                double dValor = Double.parseDouble(strDbl);
                return dValor;
            } catch (NumberFormatException ex)
            {
                 System.out.println("Valor invalido!");
            }
        } while (true);
    }
}

