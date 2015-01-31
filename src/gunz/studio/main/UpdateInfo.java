package gunz.studio.main;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Thomas Otero H3R3T1C
 */
public class UpdateInfo extends JFrame{

    /**
	 * ID de serialização
	 */
	private static final long serialVersionUID = 2042765304869169159L;
	
	private JEditorPane infoPane;
    private JScrollPane scp;
    private JButton ok;
    private JButton cancel;
    private JPanel pan1;
    private JPanel pan2;
    

    public UpdateInfo(String info) {
        initComponents();
        infoPane.setText(info);
    }

    @SuppressWarnings("deprecation")
	private void initComponents() {

        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("GunzStudio (ATUALIZAÇÃO DISPONIVEL)");
        pan1 = new JPanel();
        pan1.setLayout(new BorderLayout());

        pan2 = new JPanel();
        pan2.setLayout(new FlowLayout());

        infoPane = new JEditorPane();
        infoPane.setContentType("text/html");

        scp = new JScrollPane();
        scp.setViewportView(infoPane);

        ok = new JButton("Atualizar");
        ok.addActionListener( new ActionListener(){

            public void actionPerformed(ActionEvent e) {
                update();
            }
        });

        cancel = new JButton("Cancelar");
        cancel.addActionListener( new ActionListener(){

            public void actionPerformed(ActionEvent e) {
                UpdateInfo.this.dispose();
            }
        });
        pan2.add(ok);
        pan2.add(cancel);
        pan1.add(pan2, BorderLayout.SOUTH);
        pan1.add(scp, BorderLayout.CENTER);
        this.add(pan1);
        pack();
        show();
        this.setSize(300, 130);
    }
    private void update()
    {
        // TODO: Add my Code!
    	try {
    	    URL myURL = new URL("http://gunzstudio.blogspot.com/");
    	    URLConnection myURLConnection = myURL.openConnection();
    	    myURLConnection.connect();
    	} 
    	catch (MalformedURLException e) { 
    	    // new URL() failed
    	    // ...
    	} 
    	catch (IOException e) {   
    	    // openConnection() failed
    	    // ...
    	}
    }
    
   

}
