/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade;

import javax.swing.JOptionPane;
import java.lang.Math;
public class Atividade {


    
    public static void main(String[] args) {


    //questão 1 letra A//
        /*
        int l, area;
        String l1;
        l1 = JOptionPane.showInputDialog(null,"digite primeiro valor");
        l = Integer.parseInt(l1);
        area = l*l;
        JOptionPane.showMessageDialog(null,"0 resultado da area é "+ area);
        */
        //letra B//
        /*
        int comp, alt,area;
        String comp5, alt2;
        comp5 = JOptionPane.showInputDialog(null,"digite o primeiro valor");
        alt2 = JOptionPane.showInputDialog(null,"Digite o segundo valor");
        comp = Integer.parseInt(comp5);
        alt = Integer.parseInt(alt2);
        area = comp * alt;
        JOptionPane.showMessageDialog(null," O Resultado da area é " + area);
        */
        //letra C//
        /*
        int lmaior, lmenor,alt;
        double area;
        String lmaior1,lmenor2,alt3;
        lmaior1 = JOptionPane.showInputDialog(null,"digite o lado maior ");
        lmenor2 = JOptionPane.showInputDialog(null, "Digite o lado menor ");
        alt3 = JOptionPane.showInputDialog(null,"Digite a altura ");
        lmaior = Integer.parseInt(lmaior1);
        lmenor = Integer.parseInt(lmenor2);
        alt = Integer.parseInt(alt3);
        area = lmaior + lmenor * alt / 2;
        JOptionPane.showMessageDialog(null,"O resultado final é" + area);
        */
        //letra D//
        /*
        int raio;
        double area;
        String raio1;
        raio1 = JOptionPane.showInputDialog(null,"Digite o raio ");
        raio = Integer.parseInt(raio1);
        area = raio * raio * 3.14;
        JOptionPane.showMessageDialog(null,"O resultado final é" + area);
        */
        //letra E//
        /*
        int base, alt;
        double area;
        String base1, alt2;
        base1 = JOptionPane.showInputDialog(null,"Digite o valor da base");
        alt2 = JOptionPane.showInputDialog(null,"Digite o valor da altura");
        base = Integer.parseInt(base1);
        alt = Integer.parseInt(alt2);
        area = base * alt /2;
        JOptionPane.showMessageDialog(null,"O resultado final é" + area);
        */
        //número 2//
        /*
        double salin, salmi;
        String salin1;
        salin1 = JOptionPane.showInputDialog(null,"Digite o valor do salario");
        salin = Double.parseDouble(salin1);
        salmi = salin * 0.86;
        JOptionPane.showMessageDialog(null," O resultado final é" + salmi);
        */
        //numero 3//
        /*
        double salin, salmi;
        String salin1;
        salin1 = JOptionPane.showInputDialog(null,"Digite o valor do salario");
        salin = Double.parseDouble(salin1);
        salmi = salin * 1.05;
        JOptionPane.showMessageDialog(null," O resultado final é" + salmi);
        */
        //número 4//
       /*
        double peso, alt,imc;
        String peso1, alt2;
        peso1 = JOptionPane.showInputDialog(null,"Digite o peso");
        alt2 = JOptionPane.showInputDialog(null,"Digite a altura");
        peso = Double.parseDouble(peso1);
        alt = Double.parseDouble(alt2);
        imc = peso / (alt * alt);
        JOptionPane.showMessageDialog(null," o peso final é " + imc);
        */
        //número 5//
        /*
        double b, a, c, x1, x2, delta;
        String a1, b1, c1;
        a1 = JOptionPane.showInputDialog(null,"Digite o preço");
        b1 = JOptionPane.showInputDialog(null, "Digite o imposto");
        c1 = JOptionPane.showInputDialog(null,"Digite o lucro");
        a = Double.parseDouble(a1);
        b = Double.parseDouble(b1);
        c = Double.parseDouble(c1);
        delta = (b*b)- (4* a *c);
        x1 = ((- b )+ Math.sqrt(delta))/ 2*a;
        x2 = ((- b )- Math.sqrt(delta))/ 2*a;
        JOptionPane.showMessageDialog(null," Primeira raiz" +x1);
        JOptionPane.showMessageDialog(null,"Primeira raiz" +x2);
        */
        //número 6//
        /*
        double a,b,c,delta,raiz,par2,par3,res1,res2;
        String a1,b1,c1;
        a1 = JOptionPane.showInputDialog(null,"Digite a raiz a");
        b1 = JOptionPane.showInputDialog(null,"Digite a raiz b");
        c1 = JOptionPane.showInputDialog(null,"Digite a raiz c");
        a = Double.parseDouble(a1);
        b = Double.parseDouble(b1);
        c = Double.parseDouble(c1);
        delta = b*b - 4*a*c;
        raiz = Math.sqrt(delta);
        par2 = - b + raiz;
        par3 = - b - raiz;
        res1 = par2 / 2 * a;
        res2 = par3 / 2 * a ;
       
        JOptionPane.showMessageDialog(null," Raiz final " + res1);
        JOptionPane.showMessageDialog(null," Raiz final " + res2);
        */
        //número 7//
        
         /*
         double a11,a12,a13,b21,b22,b23,c31,c32,c33;
         String sa11,sa12,sa13,sb21,sb22,sb23;
         sa11 = JOptionPane.showInputDialog(null," Digite o valor");
         sa12 = JOptionPane.showInputDialog(null," Digite o valor");
         sa13 = JOptionPane.showInputDialog(null," Digite o valor");
         sb21 = JOptionPane.showInputDialog(null," Digite o valor");
         sb22 = JOptionPane.showInputDialog(null," Digite o valor");
         sb23 = JOptionPane.showInputDialog(null," Digite o valor");
         a11 = Double.parseDouble(sa11);
         a12 = Double.parseDouble(sa12);
         a13 = Double.parseDouble(sa13);
         b21 = Double.parseDouble(sb21);
         b22 = Double.parseDouble(sb22);
         b23 = Double.parseDouble(sb23);
         c31 = a11 + b21;
         c32 = a12 + b22;
         c33 = a13 + b23;
         JOptionPane.showMessageDialog(null," Soma " + c31);
         JOptionPane.showMessageDialog(null," Soma " + c32);
         JOptionPane.showMessageDialog(null," Soma " + c33);
         */
        //número 8 //
         /*
         double r1, r2, raiz;
         String sr1, sr2;
         sr1 = JOptionPane.showInputDialog(null," Digite o numero ");
         sr2 = JOptionPane.showInputDialog(null," Digite o numero ");
         r1 = Double.parseDouble(sr1);
         r2 = Double.parseDouble(sr2);
         raiz = r1 - r2;
         JOptionPane.showMessageDialog(null," O resultado é " + raiz);
         */
        //número 9//
         
         /*
         double a1, raiz;
         String sa1;
         sa1 = JOptionPane.showInputDialog(null," Digite a raiz");
         a1 = Double.parseDouble(sa1);
         raiz = Math.sqrt(a1);
         JOptionPane.showMessageDialog(null," O resultado é " + raiz);
         */ 
        //número 10//
        /*
        double hora =  8;
        String shora;
        shora = JOptionPane.showInputDialog(null, "Digite a hora");
        hora = Double.parseDouble(shora);
        JOptionPane.showMessageDialog(null," bom dia, são" + hora + "horas");
        */
        
                
        
    }
    
}
