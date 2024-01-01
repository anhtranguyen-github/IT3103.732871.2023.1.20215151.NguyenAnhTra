
package hust.soict.ite6.aims.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


import hust.soict.ite6.aims.media.Media;
import hust.soict.ite6.aims.store.Store;


public class StoreScreen extends JFrame {
	private Store store;
	private JPanel center;
	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}
	JMenuBar createMenuBar() {
		JMenu menu = new JMenu("Options");

		JMenu smUpdateStore = new JMenu("Update Store");

		JMenuItem item;
		smUpdateStore.add(item = new JMenuItem("Add Book"));
		smUpdateStore.add(item = new JMenuItem("Add CD"));
		smUpdateStore.add(item = new JMenuItem("Add DVD"));
		menu.add(smUpdateStore);
		menu.add(new JMenuItem("View store"));
		menu.add(item = new JMenuItem("View cart"));
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);

		return menuBar;
	}
	JPanel createHeader() {
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

		JLabel title = new JLabel("My Store");
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
		title.setForeground(Color.CYAN);

		JButton cart = new JButton("View cart");
		cart.setPreferredSize(new Dimension(100, 50));
		cart.setMaximumSize(new Dimension(100, 50));


		header.add(Box.createRigidArea(new Dimension(10, 10)));
		header.add(title);
		header.add(Box.createRigidArea(new Dimension(225, 10)));
		header.add(Box.createHorizontalGlue());
		header.add(cart);
		header.add(Box.createRigidArea(new Dimension(10, 10)));

		return header;
	}

	JPanel createCenter() {
		JPanel center = new JPanel();


		center.setLayout(new GridLayout(3, 3, 2, 2));
		ArrayList<Media> mediaInStore = (ArrayList<Media>) store.getItemsInStore();
		for(int i = 0; i< 9 ; i++){
			MediaStore cell = new MediaStore(mediaInStore.get(i));
			center.add(cell);

		}
		return center;
	}
	public StoreScreen(Store store) {
		this.store = store;

		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());

		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);

		setVisible(true);
		setTitle("My Store");
		setBounds(100, 0, 1024, 768);
	}
}
