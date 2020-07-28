import javax.swing.JButton;

public class Square {

    public Square() {
    	this.pos_x = 0;
    	this.pos_y = 0;
    	this.button = new JButton("");
    	this.color = "";
    }

    public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}

	public Square(int x, int y, JButton botton)
    {
        //this.setToken(token);
        this.setX(x);
        this.setY(y);
        this.setButton(botton);
    }

    /********************* SET METHODS ******************/
    public void setX(int x)
    {
        this.pos_x = x;
    }

    public void setY(int y)
    {
        this.pos_y = y;
    }

//    public void setToken(Token token)
//    {
//        this.token = token;
//    }

    /********************* GET METHODS ******************/
    public int getX()
    {
        return this.pos_x;
    }

    public int getY()
    {
        return this.pos_y;
    }

//    public Token getToken()
//    {
//        return this.token;
//    }
    
    private int pos_x;
    private int pos_y;
    //private Token token;
    private JButton button;
    private String color;

}

