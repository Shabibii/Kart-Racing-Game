/**
 *
 * @author 1819364
 */
import javax.swing.*;

public class RaceTrack extends JFrame 
{
   /**
    *
    */
   private static final long serialVersionUID = -2860419872081392909L;

   public static void main(String[] args) throws Exception 
   {     
      // Set window 
      RaceTrack window = new RaceTrack();

      // Set window size 850 pixels by 650 pixels
      window.setSize(850, 650);
      window.setResizable(false);
      window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      
      // Call frame with game information
      RaceTrackInfoFrame labelFrame = new RaceTrackInfoFrame(); // create object labelFrame
      labelFrame.setDefaultCloseOperation( JFrame.HIDE_ON_CLOSE ); // note: HIDE_ON_CLOSE, so other frame exists
      labelFrame.setSize( 310, 460 ); // set frame size
      labelFrame.setResizable( false );
      labelFrame.setVisible( true ); // display frame

   } // end main

   // Constructor
   public RaceTrack() throws Exception
	{  
      // Retrieve panel from RaceTrackJPanel    
      RaceTrackJPanel panel = new RaceTrackJPanel();
         
      // Display panel 
      panel.setFocusable(true);
         
      // Fill JFrame with panel
		panel.setSize( WIDTH, HEIGHT );
		this.add( panel );
      setVisible(true);

	} // end constructor
} // end class RaceTrack