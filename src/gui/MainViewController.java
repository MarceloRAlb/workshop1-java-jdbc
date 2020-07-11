package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{
	
	@FXML
	private MenuItem menuItemSeller;
	
	@FXML
	private MenuItem menuItemDepartment;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuIremSellerAction() {
		System.out.println("onMenuIremSellerAction");
	}
	
	@FXML
	public void onMenuIremDepartmentAction() {
		System.out.println("onMenuIremDepartmentAction");
	}
	
	@FXML
	public void onMenuIremAboutAction() {
		System.out.println("onMenuIremAboutAction");
	}
	

	@Override
	public void initialize(URL uri, ResourceBundle rb) {
	}
	
	
	

}
