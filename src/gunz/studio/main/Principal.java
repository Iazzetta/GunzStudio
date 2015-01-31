package gunz.studio.main;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class Principal extends JFrame implements NativeKeyListener, WindowListener{

	/**
	 * ID de serialização
	 */
	private static final long serialVersionUID = -4483247134770978812L;

	public int func = 0;
	public Robot r;


	public Principal() {

		setTitle("GunzStudio 1.0");
		setSize(270, 100);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		JLabel label = new JLabel("       Created by Cr4cko - fb.com/srdocau");

		add(label);
		addWindowListener(this);
		setVisible(true);
	}

	public void windowOpened(WindowEvent e) {
		//Initialze native hook.
		try {
			GlobalScreen.registerNativeHook();
		}
		catch (NativeHookException ex) {
			System.err.println("Um problema surgiu ao registrar a biblioteca - java//cr4cko.");
			System.err.println(ex.getMessage());
			ex.printStackTrace();

			System.exit(1);
		}

		GlobalScreen.getInstance().addNativeKeyListener(this);
	}

	public void windowClosed(WindowEvent e) {
		//Clean up the native hook.
		GlobalScreen.unregisterNativeHook();
		System.runFinalization();
		System.exit(0);
	}

	public void windowClosing(WindowEvent e) { /* Unimplemented */ }
	public void windowIconified(WindowEvent e) { /* Unimplemented */ }
	public void windowDeiconified(WindowEvent e) { /* Unimplemented */ }
	public void windowActivated(WindowEvent e) { /* Unimplemented */ }
	public void windowDeactivated(WindowEvent e) { /* Unimplemented */ }

	public static void main(String[] args) {
		try {
            if (Integer.parseInt(Updater.getLatestVersion()) > 1) {
                new UpdateInfo(Updater.getWhatsNew());
            }else if(Integer.parseInt(Updater.getLatestVersion()) > 72973) {
                JOptionPane.showMessageDialog(null, "GunzStudio 1.0 está em manutenção!", "GunzStudio", JOptionPane.PLAIN_MESSAGE);
            } else {
            
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				new Principal();
			}
		});
            
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}	





	public void nativeKeyPressed(NativeKeyEvent e) {

		

		if(e.getKeyCode() == NativeKeyEvent.VK_K){


			try{
				r = new Robot();
				


				//		if(func == 0){
				//			r.keyPress(KeyEvent.VK_ENTER);r.keyRelease(KeyEvent.VK_ENTER);
				//			r.keyPress(KeyEvent.VK_SHIFT);
				//			r.keyPress('G');r.keyRelease('G');
				//			r.keyRelease(KeyEvent.VK_SHIFT);
				//			r.keyPress('U');r.keyRelease('U');
				//			r.keyPress('N');r.keyRelease('N');
				//			r.keyPress('Z');r.keyRelease('Z');
				//			r.keyPress(KeyEvent.VK_SHIFT);
				//			r.keyPress('S');r.keyRelease('S');
				//			r.keyRelease(KeyEvent.VK_SHIFT);
				//			r.keyPress('T');r.keyRelease('T');
				//			r.keyPress('U');r.keyRelease('U');
				//			r.keyPress('D');r.keyRelease('D');
				//			r.keyPress('I');r.keyRelease('I');
				//			r.keyPress('O');r.keyRelease('O');
				//			r.keyPress(KeyEvent.VK_SPACE);r.keyRelease(KeyEvent.VK_SPACE);
				//			r.keyPress(KeyEvent.VK_SHIFT);
				//			r.keyPress('S');r.keyRelease('S');
				//			r.keyRelease(KeyEvent.VK_SHIFT);
				//			r.keyPress('T');r.keyRelease('T');
				//			r.keyPress('A');r.keyRelease('A');
				//			r.keyPress('R');r.keyRelease('R');
				//			r.keyPress('T');r.keyRelease('T');
				//			r.keyPress('E');r.keyRelease('E');
				//			r.keyPress('D');r.keyRelease('D');
				//			r.keyPress(KeyEvent.VK_ENTER);r.keyRelease(KeyEvent.VK_ENTER);
				//			func++;
				//			
				//		}
				
				 //Set<Thread> threadSet = Thread.getAllStackTraces().keySet(); Thread[] threadArray = threadSet.toArray(new Thread[threadSet.size()]); for (int i = 0; i < threadArray.length; i++) { System.out.println("Init " + threadArray[i].getName()); }
		        RobotThread rt = new RobotThread();
		        rt.start(); 

		        // Listen to the upcomming commands...and push them to the RobotThread

		        
				r.setAutoDelay(1);

				r.keyPress(KeyEvent.VK_SPACE);r.delay(5);r.keyRelease(KeyEvent.VK_SPACE); //PULA

				r.keyPress(KeyEvent.VK_CONTROL);r.delay(15);r.keyRelease(KeyEvent.VK_CONTROL); //ATACA
				r.keyPress(KeyEvent.VK_SHIFT);r.delay(5);r.keyRelease(KeyEvent.VK_SHIFT);//SHIFT (5 SEC)
				r.delay(260);//WAIT 260
				r.keyPress(KeyEvent.VK_CONTROL);r.delay(15);r.keyRelease(KeyEvent.VK_CONTROL); //ATACA
				r.keyPress(KeyEvent.VK_SHIFT);r.delay(5);r.keyRelease(KeyEvent.VK_SHIFT);//SHIFT (5 SEC)
				r.delay(260);//WAIT 260
				r.keyPress(KeyEvent.VK_CONTROL);r.delay(15);r.keyRelease(KeyEvent.VK_CONTROL); //ATACA
				r.keyPress(KeyEvent.VK_SHIFT);r.delay(5);r.keyRelease(KeyEvent.VK_SHIFT);//SHIFT (5 SEC)
				r.delay(259);//WAIT 260
				rt.shutdown();   

			}catch (Exception m) {
				System.out.println("Não foi possivel realizar TBF.");
			}

		}

		if(e.getKeyCode() == NativeKeyEvent.VK_L){
			
			try{
				r = new Robot();
				
				r.setAutoDelay(1);

				r.keyPress(KeyEvent.VK_SPACE);r.delay(5);r.keyRelease(KeyEvent.VK_SPACE); //PULA

				r.keyPress(KeyEvent.VK_CONTROL);r.delay(15);r.keyRelease(KeyEvent.VK_CONTROL); //ATACA
				r.keyPress(KeyEvent.VK_SHIFT);r.delay(5);r.keyRelease(KeyEvent.VK_SHIFT);//SHIFT (5 SEC)
				r.delay(300);//WAIT 260
				r.keyPress(KeyEvent.VK_CONTROL);r.delay(15);r.keyRelease(KeyEvent.VK_CONTROL); //ATACA
				r.keyPress(KeyEvent.VK_SHIFT);r.delay(5);r.keyRelease(KeyEvent.VK_SHIFT);//SHIFT (5 SEC)
				r.delay(259);//WAIT 260


			}catch (Exception m) {
				System.out.println("Não foi possivel realizar DBF.");
			}

		}


		if(e.getKeyCode() == NativeKeyEvent.VK_P){

			try{

				Robot r = new Robot();
				

				r.keyPress(KeyEvent.VK_2);r.delay(5);r.keyRelease(KeyEvent.VK_2); //PULA
				r.delay(50);
				r.keyPress(KeyEvent.VK_CONTROL);r.delay(100);r.keyRelease(KeyEvent.VK_CONTROL); //ATACA
				r.delay(300);//WAIT 260
				r.keyPress(KeyEvent.VK_R);r.delay(5);r.keyRelease(KeyEvent.VK_R);//SHIFT (5 SEC)
				r.delay(100);//WAIT 260
				r.keyPress(KeyEvent.VK_3);r.delay(5);r.keyRelease(KeyEvent.VK_3); //PULA
				r.delay(50);
				r.keyPress(KeyEvent.VK_CONTROL);r.delay(15);r.keyRelease(KeyEvent.VK_CONTROL); //ATACA
				r.delay(300);//WAIT 260
				r.keyPress(KeyEvent.VK_R);r.delay(5);r.keyRelease(KeyEvent.VK_R);//SHIFT (5 SEC)
				r.keyPress(KeyEvent.VK_1);r.delay(5);r.keyRelease(KeyEvent.VK_1);//SHIFT (5 SEC)
				


			}catch (Exception m) {
				System.out.println("Não foi possivel realizar RS.");
			}

		}
	}



	@Override
	public void nativeKeyReleased(NativeKeyEvent e) {

	}


	@Override
	public void nativeKeyTyped(NativeKeyEvent e) {
		// TODO Auto-generated method stub

	}



}
