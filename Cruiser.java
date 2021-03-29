
public class Cruiser extends ScoutBoat
{
    
    private int boater;
    public Cruiser(int teamm, Coordinates location, int directionn){
        super(teamm, directionn, 3, 0, 3, location);
        boater = teamm;
    }
    public String getID(){
        
        return("C"+ boater);
    }
    public String getActions(){
        return("Choose any of the following actions for the Cruiser: \n 1. Move \n2. Turn left\n3. Turn right");
    }
    public String act(int[] array, World worldie){
        String finalDood = "";
        for(int n = 0; n < array.length; n++){
            if(array[n] == 1 && n < 2){
                move(worldie);
                finalDood += " ##The boat moved";
            }
            else if(array[n] == 2 && n < 2){
                turn(-1);
                finalDood += " ## The boat turned left";
            }
            else if(array[n] == 3 && n < 2){
                turn(1);
                finalDood += " ## The boat turned right";
            }
            else{
                finalDood += " ## The boat did nothing";
            }
        }
        return(finalDood);
    }
}
