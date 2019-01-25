package p2granskning;
import java.awt.*;
import java.awt.font.*;
import javax.swing.Icon;

/**
 * Klassen Text kan användas för att visa text i ett PaintWindow. Texten visas
 * som en bild och är därmed flyttbar.
 * @author TSROAX
 */
public class Text implements Icon {
    private String text;
    private Font font;
    private Color foreground;
    private Color background;
    private FontRenderContext frc;
    private boolean opaque;
    private int iconWidth;
    private int iconHeight;
    private int textDY;

    public Text(String text) {
        this(text,new Font("SansSerif",Font.PLAIN,12));
    }

    public Text(String text, Font font) {
        this(text,font,Color.BLACK,Color.WHITE,false);
    }

    public Text(String text, Font font, Color foreground) {
        this(text,font,foreground,null,false);
    }

    public Text(String text, Font font, Color foreground, Color background) {
        this(text,font,foreground,background,true);
    }

    private Text(String text, Font font, Color foreground, Color background, boolean opaque) {
        LineMetrics lm;
        this.font = font;
        this.foreground = foreground;
        this.background = background;
        this.opaque = opaque;
        setText(text);
    }

    public void setForeground(Color foreground) {
        this.foreground = foreground;
    }

    public void setBackground(Color background) {
        if(background!=null) {
            this.background = background;
            this.opaque = true;
        } else {
            this.opaque = false;
        }
    }
    
    public void setText(String txt) {
    	this.text = txt;
    	if(frc!=null) {
    		iconWidth = (int)font.getStringBounds(text, frc).getWidth();
    		iconHeight = (int)font.getStringBounds(text, frc).getHeight();
    		LineMetrics lm = font.getLineMetrics(text, frc);
    		textDY = (int)(lm.getHeight() - lm.getDescent());
    	}
    }

    public void paintIcon(Component c, Graphics g, int x, int y) {
        Color oldColor = g.getColor();
        Font oldFont = g.getFont();
        if(frc==null) {
        	frc = ((Graphics2D)g).getFontRenderContext();
            iconWidth = (int)font.getStringBounds(text, frc).getWidth();
            iconHeight = (int)font.getStringBounds(text, frc).getHeight();
            LineMetrics lm = font.getLineMetrics(text, frc);
            textDY = (int)(lm.getHeight() - lm.getDescent());
        }
        if(this.opaque) {
            g.setColor(this.background);
            g.fillRect(x, y, this.iconWidth, this.iconHeight);
        }
        g.setColor(this.foreground);
        g.setFont(this.font);
        g.drawString(text, x, y+this.textDY);
        g.setColor(oldColor);
        g.setFont(oldFont);
    }

    public int getIconWidth() {
        return iconWidth;
    }

    public int getIconHeight() {
        return iconHeight;
    }

}
