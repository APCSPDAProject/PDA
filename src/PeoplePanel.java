
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class PeoplePanel extends JPanel{

	public PeoplePanel(){
		JTextPane a = new JTextPane();
		a.setText("Chat with:");
		a.setEditable(false);
		a.setBackground(new Color(40, 40, 40));
		a.setForeground(new Color(200, 200, 200));
		this.add(a);
		UpdatePeople(new String[]{"Little Johny","Poor Susan","Michael Jackson's Kid"});
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
	}
	
	
	void UpdatePeople(String[] newPeople){
		
		for(String x: newPeople){			
			this.add(new TAListener(x));
		}
	}
		
	void UpdatePeople(String newPerson){
		this.add(new TAListener(newPerson));
	}
	
}
