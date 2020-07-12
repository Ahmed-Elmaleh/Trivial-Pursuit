public class Square {

    private int x;
    private int y;
    private Token token;

    public Square(int x, int y, Token token)
    {
        this.setToken(token);
        this.setX(x);
        this.setY(y);
    }

    /********************* SET METHODS ******************/
    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void setToken(Token token)
    {
        this.token = token;
    }

    /********************* GET METHODS ******************/
    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }

    public Token getToken()
    {
        return this.token;
    }

}

