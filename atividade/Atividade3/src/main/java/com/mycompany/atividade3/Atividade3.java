/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade3;

import javax.swing.JOptionPane;
import java.lang.Math;

public class Atividade3 {

    public static void main(String[] args) {
      
      /*
        int n1,n2;
        String sn1, sn2;
        sn1 = JOptionPane.showInputDialog(null, "Digite o primeiro valor");
        sn2 = JOptionPane.showInputDialog(null,"Digite o segundo valor");
        n1 = Integer.parseInt(sn1);
        n2 = Integer.parseInt(sn2);
        if (n1 >= n2)
        {
        JOptionPane.showMessageDialog(null," n1 é maior que n2");
        }
        else 
        {
        JOptionPane.showMessageDialog(null," n1 é menor que n2");
        }
        */
        /*
        double dis,tmp, vel;
        String sdis, stmp;
        sdis = JOptionPane.showInputDialog(null, "digite a distancia ");
        stmp = JOptionPane.showInputDialog(null, "Digite o tempo");
        dis = Double.parseDouble(sdis);
        tmp = Double.parseDouble(stmp);
        vel = dis / tmp;
        
        if (vel >= 110 )
        {
             JOptionPane.showMessageDialog(null," acima");
        }
        else
        {
            JOptionPane.showMessageDialog(null," abaixo " );
        }
        */
        
        /*
        double tmp;
        String stmp;
        stmp = JOptionPane.showInputDialog(null, "digite a temperatura ");
        tmp = Double.parseDouble(stmp);
      
        if (tmp >= 36.6 )
        {
             JOptionPane.showMessageDialog(null," acima");
        }
        else
        {
            JOptionPane.showMessageDialog(null," abaixo " );
        }
        */
        
         /*
        double rDi, di;
        String sdi;
        sdi = JOptionPane.showInputDialog(null, "digite o numero ");
        di = Double.parseDouble(sdi);
        rDi = di % 7;
      
        if (rDi >= 0.0)
        {
             JOptionPane.showMessageDialog(null," divisivel");
        }
        else
        {
            JOptionPane.showMessageDialog(null," não divisivel " );
        }
        */
         
         /*
        int n1;
        String sn1;
        sn1 = JOptionPane.showInputDialog(null, "digite o numero ");
        n1 = Integer.parseInt(sn1);
        if ((n1 % 2 == 0) && (n1 % 3 == 0))
        {
             JOptionPane.showMessageDialog(null," par é dividido por 3");
        }
        else
        {
            JOptionPane.showMessageDialog(null," não divisivel " );
        }
        */
         
         /*
        int id;
        String sd1;
        sd1 = JOptionPane.showInputDialog(null, "digite a idade ");
        id = Integer.parseInt(sd1);
        if ((id >= 18) && (id >= 65))
        {
             JOptionPane.showMessageDialog(null," idade certa");
        }
        else
        {
            JOptionPane.showMessageDialog(null," idade incorreta " );
        }
        */
        /*
        String sex;
        //String sex1;//
        sex = JOptionPane.showInputDialog(null, "digite o sexo ");
        //sex = Integer.parseInt(sex1);//
        if (sex.equals("masculino"))
        {
             JOptionPane.showMessageDialog(null," Masculino");
        }
        else
        {
            JOptionPane.showMessageDialog(null," Feminino " );
        }
        */
        /*
        int b1,b2;
        String sb1,sb2;
         sb1= JOptionPane.showInputDialog(null, " Digite o Preço ");
         sb2= JOptionPane.showInputDialog(null, " Digite o segundo ");
         b1 = Integer.parseInt(sb1);
         b2 = Integer.parseInt(sb2);
        if(b1 > b2)
        {
             JOptionPane.showMessageDialog(null,"blusa mais cara");
        }
        else
        {
            JOptionPane.showMessageDialog(null," blusa mais barata " );
        }
        */
        /*
         String vog;
      
        vog = JOptionPane.showInputDialog(null, "digite uma letra ");
        
        if ((vog.equals("A")) ||(vog.equals("E")) ||(vog.equals("I")) ||(vog.equals("O")) ||(vog.equals("U")))
        {
             JOptionPane.showMessageDialog(null," VOGAL ");
        }
        else
        {
            JOptionPane.showMessageDialog(null," CONSOANTE " );
        }
         */
        /*
        double x1,y2;
        String sx1, sy2;
        sx1 = JOptionPane.showInputDialog(null, "digite o numero ");
        sy2 = JOptionPane.showInputDialog(null, "digite o numero");
        x1 = Double.parseDouble(sx1);
        y2 = Double.parseDouble(sy2);
        if ((x1 % y2 == 0))
        {
             JOptionPane.showMessageDialog(null,"divisivel");
        }
        else
        {
            JOptionPane.showMessageDialog(null," não divisivel " );
        }
        */
        int id,cal;
        String id1;
        id1 = JOptionPane.showInputDialog(null," Digite o ano que voçê nasceu");
         id = Integer.parseInt(id1);
         cal = 2023 - id;
        if (cal < 16)
        {
             JOptionPane.showMessageDialog(null," Não pode votar ");
        }
        else
        {
             JOptionPane.showMessageDialog(null,"  Pode votar " );
        }
        
        
        
        
    }
}
