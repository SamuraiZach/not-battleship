
public class Coordinates
{
    private int x, y;
    public Coordinates()
    {
        x = 0;
        y = 0;
    }
    public Coordinates(int xx, int yy)
    {
        x = xx;
        y = yy;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setCoordinates(int xxxx, int yyyy){
        x = xxxx;
        y = yyyy;
    }
    public String toString(){
        int AtA = 65;
        char ReportChar = (char)(AtA + y);
        return (ReportChar+""+x);
    }
}
