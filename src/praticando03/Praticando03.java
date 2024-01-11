
package praticando03;
import javax.swing.*;

public class Praticando03 {
    //procedimento sem parametro
      public static void soma (){
          //variaveis locais
          double s1,s2,result;
          //entrada de dados
         s1=Double.parseDouble( JOptionPane.showInputDialog("digite o primeiro numero da soma: "));
         s2=Double.parseDouble(JOptionPane.showInputDialog("agora digite o segundo numero"));
          //processamento
         result=s1+s2;
         JOptionPane.showMessageDialog(null,"o resuntado e: "+result);
      }                                                                       
      public static void subtracao(double sub1,double sub2){
         //variaveis loccais
         double m;
         //processamento
         m=sub1-sub2;  
         //saida
         JOptionPane.showMessageDialog(null,"o resuntado e: "+m); 
      }  
             public static double multiplicacao (){
             //variaveis locais
             double m1,m2,result;
             //entrada de dados
            m1=Double.parseDouble( JOptionPane.showInputDialog("digite um numero para a multiplicação: "));
            m2=Double.parseDouble(JOptionPane.showInputDialog("agora digite outro numero: "));
            //processamento
            result=m1*m2;
            //saida de dados
            return result;
      }  
             public static double divisao(double div1,double div2){
                 
                 double result=0;  //declaração de variaveis
                 try{
                 result= div1/div2;  //processamento
                 }
                 catch(ArithmeticException e){
                     System.out.println("por favor incira um numero valido");
                 }
                 return result; //saida de dados
                 
             }
               
             
    public static void main(String[] args) {
              
      //variaveis globais
      String msg;
      msg="escolha uma das operações:\n 1- para soma, 2- para subtração, 3- para multiplicação e 4- para divisão.";
      char op;
      double s1,s2,mult,d1,d2,divResult;
      String msg2="agora digite outro: ";
      op=0;
      
      //entrada de dados
      op=(JOptionPane.showInputDialog(msg)).charAt(op);
      
      //processament
      switch(op)
      {
          
    case'1': {
      soma();  
    break;}
      
    case'2':{
     s1=Double.parseDouble( JOptionPane.showInputDialog("digite um numero para a subtração: "));
     s2=Double.parseDouble(JOptionPane.showInputDialog(msg2));
     subtracao(s1,s2);
    break;}
    
    case'3':{
    mult=(multiplicacao());
    JOptionPane.showMessageDialog(null, "o resuntado e: "+mult);
    break;}
    
    case'4':{
    d1=Double.parseDouble(JOptionPane.showInputDialog("digite um numero para a divisão: "));
    d2=Double.parseDouble(JOptionPane.showInputDialog("digite outro numero: "));
    divResult=(divisao(d1,d2));
    JOptionPane.showMessageDialog(null,"o resuntado e: "+divResult);
       break;}
   
   default:JOptionPane.showMessageDialog(null, "opção invalida, tente novamente.");
            }
      //saida de dados
      
    }
}