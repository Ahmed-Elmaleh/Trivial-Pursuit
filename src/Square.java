import javax.swing.JButton;

public class Square {

    public Square() {
    	this.button = new JButton("");
    	
    }

    //get button name
    public String getButtonName() {
    	return (button.getName());
    }
    
    //set button name
    public void setButtonName(String newName) {
    	button.setName(newName);
    }
    
    //set button text
    public void setButtonText(String newText) {
    	button.setText(newText);
    }
    //get button text
    public String getButtonText() {
    	return (button.getText());
    }
   
	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}


    private JButton button;
  

}

