package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JButton addName=new JButton();
	JButton viewNames=new JButton();
	ArrayList<String> names = new ArrayList<String>();
	
	void doingStuff() {
		frame.add(panel);
		panel.add(addName);
		panel.add(viewNames);
		addName.setText("Add Name");
		viewNames.setText("View Names");
		addName.addActionListener(this);
		viewNames.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==addName) {
			String name=JOptionPane.showInputDialog("Enter a name");
			
			names.add(name);
		}
		
		// String allGuests = "";
		// for( all guests ){
		//   allGuests += "Guest #" + i +.... "\n";
		// }
		// JOptionPane.showMessageDialog( null, allGuests);
		String allGuests="";
		if(e.getSource()==viewNames) {
			for(int i=0; i<names.size();i++ ) {
				String s=names.get(i);
				allGuests+="Guest#"+(i+1)+": "+""+s+"\n";
				
			}
			JOptionPane.showMessageDialog(null, allGuests);
		}
	}

	
	
}
