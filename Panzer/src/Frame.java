import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends JFrame{

Gui gui = new Gui();
Stats stats = new Stats();

public void JFrame(){

    // Buttons erstellen mit deren Funktionen
    JButton button1 = new JButton();
    button1.setBounds(200, 380, 30, 30);
    button1.addActionListener(new ActionListener(){  
            
        public void actionPerformed(ActionEvent e){ 

            stats.MorePower();

                }
            });

    JButton button2 = new JButton();
    button2.setBounds(200, 410, 30, 30);
    button2.addActionListener(new ActionListener(){  
            
        public void actionPerformed(ActionEvent e){ 

            stats.LessPower();

                }
            });

    JButton button3 = new JButton();
    button3.setBounds(200, 460, 30, 30);
    button3.addActionListener(new ActionListener(){  
            
        public void actionPerformed(ActionEvent e){ 

            stats.MoreWinkel();

                }
            });

    JButton button4 = new JButton();
    button4.setBounds(200, 490, 30, 30);
    button4.addActionListener(new ActionListener(){  
            
        public void actionPerformed(ActionEvent e){ 

            stats.LessWinkel();

                }
            });


    JButton button5 = new JButton();
    button5.setBounds(400, 370, 350, 150);
    button5.addActionListener(new ActionListener(){  
                    
        public void actionPerformed(ActionEvent e){ 
        
            stats.StartRechnung();
        
                }
            });

            // Frame Stats
this.setSize(800,600);
this.setLocationRelativeTo(null);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setResizable(false);
this.setTitle("Schuss Geschwindigkeit");

//Componente in frame packen
this.add(button1);
this.add(button2);
this.add(button3);
this.add(button4);
this.add(button5);
this.add(gui);

this.setFocusable(true);

this.setVisible(true);

while(true){
    gui.update();
}

}

}