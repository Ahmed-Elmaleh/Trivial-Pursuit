import javax.swing.JTextField;

public class Token {

    private boolean blueSlot;
    private boolean greenSlot;
    private boolean redSlot;
    private boolean whiteSlot;
    



    public Token()
    {
        this.blueSlot = false;
        this.greenSlot = false;
        this.redSlot = false;
        this.whiteSlot = false;
        
 
        
        
    }
    
    
    /********************* SET METHODS ******************/
    public void setBlueSlot(boolean blueSlot)
    {
        this.blueSlot = blueSlot;
    }

    public void setGreenSlot(boolean greenSlot)
    {
        this.greenSlot = greenSlot;
    }

    public void setRedSlot(boolean redSlot)
    {
        this.redSlot = redSlot;
    }

    public void setWhiteSlot(boolean whiteSlot)
    {
        this.whiteSlot = whiteSlot;
    }

    /********************* GET METHODS ******************/
    public boolean getBlueSlot()
    {
        return this.blueSlot;
    }

    public boolean getGreenSlot()
    {
        return this.greenSlot;
    }

    public boolean getRedSlot()
    {
        return this.redSlot;
    }

    public boolean getWhiteSlot()
    {
        return this.whiteSlot;
    }


    public boolean  readyToWin()
    {
        return getBlueSlot() && getGreenSlot() && getRedSlot() && getWhiteSlot();
    }
}
