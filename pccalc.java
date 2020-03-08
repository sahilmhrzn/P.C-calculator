import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Pccalc implements ActionListener
{
  //Frontend 
    JFrame f;
    JTextField n1, n2, rslt;
    JButton fact, perm, comb;
    JLabel head, num1, num2, result;
    int a,i,temp=1;
    Pccalc()
    {
      f=new JFrame("Pc Calculator");
      f.setSize(800,500);
      f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      head=new JLabel("P.C Calculator");
      head.setBounds(360,30,500,10);
      num1=new JLabel("Num1");
      num1.setBounds(120,60,500,50);
      n1=new JTextField();
      n1.setBounds(50,100,200,40);
      num2=new JLabel("Num2");
      num2.setBounds(580,60,500,50);
      n2=new JTextField();
      n2.setBounds(500,100,200,40);
      fact=new JButton("factorial");
      fact.setBounds(70,200,150,50);
      perm=new JButton("permutation");
      perm.setBounds(300,200,150,50);
      comb=new JButton("combination");
      comb.setBounds(530,200,150,50);
      result=new JLabel("Result");
      result.setBounds(120,260,450,50);
      rslt=new JTextField();
      rslt.setBounds(50,300,650,40);
      JPanel p = new JPanel();
      p.setBackground(Color.LIGHT_GRAY);
      //Font font= new Font("Helvetica",Font.BOLD,33);
      p.add(head);
      p.add(num1);
      p.add(n1);
      p.add(num2);
      p.add(n2);
      p.add(fact);
      p.add(perm);
      p.add(comb);
      p.add(result);
      p.add(rslt);
      f.add(p);
      p.setLayout(null);
      p.setVisible(true);
      f.show();
      //fact.addActionListener(this);
      perm.addActionListener(this);
      comb.addActionListener(this);


try{
      fact.addActionListener(new ActionListener(){
        //this is anonymous class
        
        @Override
        public  void actionPerformed(ActionEvent evt){
          
          //int i,temp=1;
        a=Integer.parseInt(n1.getText());
       //int b=Integer.parseInt(n2.getText());
          for(i=1; i<=a; i++)
          {
             temp= temp*i;
          }
          String anser= String.valueOf(temp);
          rslt.setText(anser);
            /*String text = n1.getText();
            rslt.setText(text);*/
        }
    });

  }catch(Exception x){
    System.out.println(x.getMessage());
  }




    }
    
//backend
    /*public void actionPerformed(ActionEvent e)
    {
      try{
        int i,temp=1;
      int a=Integer.parseInt(n1.getText());
      int b=Integer.parseInt(n2.getText());

      //factorial calculating function
     public static int factorial(int n)
      {
        int i,temp=1;
        for(i=1; i<=a; i++)
        {
          temp=temp*i;
        }
        return temp;
      }
      if(e.getSource()==fact)
      {
        for(i=1; i<=a; i++)
        {
          temp=temp*i;
        }
        String anser= String.valueOf(temp);
        rslt.setText("anser");
      }
      else if(e.getSource()==perm)
      {

      }
    }catch(Exception x){
      System.out.println(x.getMessage());
    }
  }*/


  public static void main(String[] args)
    {
        Pccalc obj= new Pccalc();
    }   
}
