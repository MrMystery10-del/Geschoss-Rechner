import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.JPanel;

public class Gui extends JPanel{

Stats stats = new Stats();

// Zeichnungen updaten
public void update(){
    
repaint();

}

// Alle Zeichnungs Methoden Aufrufen
@Override
protected void paintComponent(Graphics g){

super.paintComponent(g);
Graphics2D g2d = (Graphics2D)g;

drawBackground(g2d);
drawRechnung(g2d);
drawExtras(g2d);

}

// Hintergrund Zeichnung
public void drawBackground(Graphics g2d){
    g2d.setColor(Color.RED);
    g2d.fillRect(0, 0, 800, 50);

    g2d.setColor(Color.LIGHT_GRAY);
    g2d.fillRect(0, 50, 800, 100);

    g2d.setColor(Color.GREEN);
    g2d.fillRect(0, 150, 800, 50);

    g2d.setColor(Color.LIGHT_GRAY);
    g2d.fillRect(0, 200, 800, 100);

    g2d.setColor(Color.CYAN);
    g2d.fillRect(0, 300, 800, 50);

    g2d.setColor(Color.GRAY);
    g2d.fillRect(0, 350, 800, 250);

    g2d.setColor(Color.BLUE);
    g2d.fillRect(200, 380, 30, 60);
    g2d.fillRect(200, 460, 30, 60);

    g2d.setColor(Color.CYAN);
    g2d.drawRect(200, 380, 30, 30);
    g2d.drawRect(200, 410, 30, 30);

    g2d.drawRect(200, 460, 30, 30);
    g2d.drawRect(200, 490, 30, 30);

    g2d.setColor(Color.BLACK);
    g2d.fillRect(0, 350, 350, 5);
    g2d.fillRect(0, 530, 355, 5);
    g2d.fillRect(350, 350, 5, 180);

    g2d.setColor(Color.PINK);
    g2d.fillRect(0, 535, 800, 65);

    g2d.setColor(Color.ORANGE);
    g2d.fillOval(30, 390, 70, 40);
    g2d.fillOval(30, 470, 70, 40);

    g2d.setColor(Color.GREEN);
    g2d.drawOval(30, 390, 70, 40);
    g2d.drawOval(30, 470, 70, 40);

    g2d.setColor(Color.ORANGE);
    g2d.fillRect(60, 390, 130, 40);
    g2d.fillRect(60, 470, 130, 40);

    g2d.setColor(Color.GREEN);
    g2d.drawRect(60, 390, 130, 40);
    g2d.drawRect(60, 470, 130, 40);

    g2d.setColor(Color.decode("#108f14"));
    g2d.fillRect(400, 370, 350, 150);

    g2d.setColor(Color.decode("#09730d"));
    g2d.drawRect(400, 370, 350, 150);
    g2d.drawRect(399, 369, 352, 152);
    g2d.drawRect(398, 368, 354, 154);
    g2d.drawRect(397, 367, 356, 156);

    g2d.drawRect(400, 370, 150, 65);
    g2d.drawRect(400, 370, 149, 64);
    g2d.drawRect(400, 370, 148, 63);
    g2d.drawRect(400, 370, 147, 62);

    g2d.drawRect(750, 524, -150, -65);
    g2d.drawRect(750, 524, -149, -64);
    g2d.drawRect(750, 524, -148, -63);
    g2d.drawRect(750, 524, -147, -62);

    g2d.setColor(Color.LIGHT_GRAY);
    g2d.fillOval(410, 410, 330, 60);

    g2d.setColor(Color.ORANGE);
    g2d.fillRect(60, 391, 1, 39);
    g2d.fillRect(60, 471, 1, 39);
}

// Alles an Stats Zeichnen
public void drawRechnung(Graphics g2d){
    stats.rechnung();
    g2d.setColor(Color.BLACK);
    
    g2d.setFont(new Font("Arial", Font.BOLD, 20));
    g2d.drawString("Schussweite: ",10,80);
    g2d.setFont(new Font("Arial", Font.ITALIC, 20));
    g2d.drawString(stats.SchussweiteOhneLuft+" Meter",220,80);
    g2d.drawString(Math.round(stats.SchussweiteOhneLuft * 3.28)+" Fuß",420,80);
    
    g2d.setFont(new Font("Arial", Font.BOLD, 20));
    g2d.drawString("Max Schuss Hoehe: ",10,110);
    g2d.setFont(new Font("Arial", Font.ITALIC, 20));
    g2d.drawString(stats.MaxSchussHoehe+" Meter",220,110);
    g2d.drawString(Math.round(stats.MaxSchussHoehe * 3.28)+" Fuß",420,110);
    
    g2d.setFont(new Font("Arial", Font.BOLD, 20));
    g2d.drawString("Flug Dauer: ",10,140);
    g2d.setFont(new Font("Arial", Font.ITALIC, 20));
    g2d.drawString(stats.SchussDauer+" Sekunden",220,140);
    g2d.drawString(Math.round(stats.SchussDauer * 3.28)+" Fuß",420,140);
    
    g2d.setFont(new Font("Arial", Font.BOLD, 20));
    g2d.drawString("Schussweite: ",10,230);
    g2d.setFont(new Font("Arial", Font.ITALIC, 20));
    g2d.drawString(stats.SchussweiteMitLuft+" Meter",220,230);
    g2d.drawString(Math.round(stats.SchussweiteMitLuft * 3.28)+" Fuß",420,230);
    
    g2d.setFont(new Font("Arial", Font.BOLD, 20));
    g2d.drawString("Max Schuss Hoehe: ",10,260);
    g2d.setFont(new Font("Arial", Font.ITALIC, 20));
    g2d.drawString(stats.MaxSchussHoeheLuft+" Meter",220,260);
    g2d.drawString(Math.round(stats.MaxSchussHoeheLuft * 3.28)+" Fuß",420,260);
    
    g2d.setFont(new Font("Arial", Font.BOLD, 20));
    g2d.drawString("Flug Dauer: ",10,290);
    g2d.setFont(new Font("Arial", Font.ITALIC, 20));
    g2d.drawString(stats.SchussDauerLuft+" Sekunden",220,290);
    g2d.drawString(Math.round(stats.SchussDauerLuft * 3.28)+" Fuß",420,290);

    
  
}

// Extras Zeichen wie zb. Untertitel und "Berechnen!"
public void drawExtras(Graphics g2d){

    g2d.setFont(new Font("Arial", Font.BOLD, 30));
    
    g2d.drawString("Ohne Luft Wiederstand", 10, 40);
    g2d.drawString("Mit Luft Wiederstand", 10, 190);
    g2d.drawString("Einstellungen", 10, 340);
    
    g2d.setFont(new Font("Arial", Font.BOLD, 25));
    g2d.drawString("Geschoss Geschwindigkeit",10,380);
    g2d.drawString("Geschoss Winkel",10,460);

    g2d.setColor(Color.decode("#a87a0d"));
    g2d.setFont(new Font("Arial", Font.BOLD, 30));
    g2d.drawString(""+stats.FinalSpeed,120,420);
    g2d.drawString(""+stats.FinalWinkel,150,500);

    g2d.drawString("+",206,405);
    g2d.drawString("_",207,420);

    g2d.drawString("+",206,485);
    g2d.drawString("_",207,500);

    g2d.setColor(Color.decode("#650da8"));
    g2d.setFont(new Font("Arial", Font.BOLD, 60));
    g2d.drawString("Berechnen!",410,460);
}

}
