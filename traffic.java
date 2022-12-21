import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Traffic extends JPanel implements ActionListener{
  Color rc,ry,rg;
  JRadioButton r1,r2,r3;
  Traffic(){
    setBounds(0,0,400,400);
    r1=new JRadioButton("RED");r2=new JRadioButton("YELLOW");r3=new JRadioButton("GREEN");  
    ButtonGroup bg=new ButtonGroup(); 
    add(r1);add(r2);add(r3);
    bg.add(r1);bg.add(r2);bg.add(r3);
r1.addActionListener(this);r2.addActionListener(this);r3.addActionListener(this);
   }
 public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawOval(50,100,50,50);
    g.drawOval(150,100,50,50);
    g.drawOval(250,100,50,50);
    g.setColor(rc);g.fillOval(50,100,50,50);
    g.setColor(ry);g.fillOval(150,100,50,50);
    g.setColor(rg);g.fillOval(250,100,50,50);

 }
 public void actionPerformed(ActionEvent e){
    if(r1.isSelected()==true)
     {
        rc=Color.red;
        ry=getBackground();
        rg=getBackground();
     }  
    else if(r2.isSelected()==true)
     {
        ry=Color.yellow;
        rc=getBackground();
        rg=getBackground();
     }
    else if(r3.isSelected()==true)
     {
        rg=Color.green;
        ry=getBackground();
        rc=getBackground();
     }   
  repaint();
  }
}
class Traffic2{
 public static void main(String[] args){
  JFrame jf=new JFrame("Traffic Light");
  jf.setSize(400,400);
  jf.setLayout(null);
  jf.setVisible(true); 
  Traffic t=new Traffic();
  jf.add(t);
 }
}
