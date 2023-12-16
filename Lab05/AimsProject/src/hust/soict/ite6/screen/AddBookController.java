package hust.soict.ite6.screen;

import hust.soict.ite6.aims.media.Book;
import hust.soict.ite6.aims.Aims;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class AddBookController {

    @FXML
    private TextField tfCost;

    @FXML
    private TextField tfTitle;

    @FXML
    private TextField tfCategory;

    @FXML
    private TextField tfID;

    @FXML
    void OkPressed(ActionEvent event) {
    	Book book =new Book();
    	book.setTitle(tfTitle.getText());
    	book.setCategory(tfCategory.getText());
    	book.setId(Integer.parseInt(tfID.getText()));
    	book.setCost(Float.parseFloat(tfCost.getText()));
    	Aims.Mediastore.addMedia(book);
    	JFrame frame = new JFrame("JOptionPane showMessageDialog example");
    	JOptionPane.showMessageDialog(frame, "Update Store", book.getTitle() + " Added to Store", JOptionPane.INFORMATION_MESSAGE);  
    	new StoreScreen(Aims.MediaStore);
    	StoreScreen.sc2.setVisible(false);
    }

}