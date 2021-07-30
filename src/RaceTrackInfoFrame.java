/**
 *
 * @author 1819364
 */ 
import javax.swing.JFrame; // use JFrame to present information window 
import java.awt.Font; // set font of text in labels
import java.awt.FlowLayout; // specifies how components are arranged
import javax.swing.JLabel; // displays text and images
import javax.swing.SwingConstants; // common constants used with Swing
import javax.swing.Icon; // interface used to manipulate images
import javax.swing.ImageIcon; // loads images

public class RaceTrackInfoFrame extends JFrame
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    private JLabel descriptionTextLabel;
    private JLabel kartAruLabel;
    private JLabel kartOppLabel;

    public RaceTrackInfoFrame()
    {
        super( "ARU KART SPORT 2021" );
        setLayout( new FlowLayout() ); // set frame layout

        // JLabel constructor with description text as argument
        descriptionTextLabel = new JLabel( "<html>WELCOME DRIVER<br><br>Some tips:<br>\u26D4 Stay on the road<br>\uD83D\uDE97 Karts may not collide<br>\u23F0 Close and race!<br>i) Increase speed with key press<br>i) Shortcut: 'R' (RESTART)<br>i) Shortcut: 'M' (MUTE)</html>" );
        descriptionTextLabel.setFont( new Font( "DialogInput", 1, 14 ) ); // set font, make bold, resize to 14
        add( descriptionTextLabel ); // add descriptionTextLabel to JFrame

        // Get icon images
        Icon kartAruIcon = new ImageIcon( getClass().getResource( "C1_ARU\\kartAru0.png" ) );
        Icon kartOppIcon = new ImageIcon( getClass().getResource( "C2_OPP\\kartOpp0.png" ) );
       
        kartAruLabel = new JLabel(); // create new label
        kartAruLabel.setText( "<html>Kart ARU keys<br>\u2191 | \u2193 | \u2192 | \u2190<html>" ); // set label text
        kartAruLabel.setFont( new Font( "Monospaced", 1, 18 ) ); // set font
        kartAruLabel.setIcon( kartAruIcon ); // set label icon 
        kartAruLabel.setHorizontalTextPosition( SwingConstants.CENTER ); // place text in center of label
        kartAruLabel.setVerticalTextPosition( SwingConstants.BOTTOM ); // place text below icon
        add( kartAruLabel ); // add kartAruLabel to JFrame
        
        kartOppLabel = new JLabel();
        kartOppLabel.setText( "<html>Kart OPP keys<br>W | S | D | A<html>" );
        kartOppLabel.setFont( new Font( "Monospaced", 1, 18 ) );
        kartOppLabel.setIcon( kartOppIcon );
        kartOppLabel.setHorizontalTextPosition( SwingConstants.CENTER );
        kartOppLabel.setVerticalTextPosition( SwingConstants.BOTTOM );
        add( kartOppLabel ); // add kartAruLabel to JFrame
    }
}