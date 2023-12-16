package hust.soict.ite6.screen;

import hust.soict.ite6.aims.media.Book;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class AddBookController {


    private TextField tfCost;


    private TextField tfTitle;


    private TextField tfCategory;


    private TextField tfID;


    void OkPressed(ActionEvent event) {
    	Book book =new Book();
    	book.setTitle(tfTitle.getText());
    	book.setCategory(tfCategory.getText());
    	book.setId(Integer.parseInt(tfID.getText()));
    	book.setCost(Float.parseFloat(tfCost.getText()));
    	//Aims.Mediastore.addMedia(book);
    	JFrame frame = new JFrame("JOptionPane showMessageDialog example");
    	JOptionPane.showMessageDialog(frame, "Update Store", book.getTitle() + " Added to Store", JOptionPane.INFORMATION_MESSAGE);  
    	//new StoreScreen(Aims.MediaStore);
    	StoreScreen.sc2.setVisible(false);
    }

}