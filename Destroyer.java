import java.lang.Math;
public class Destroyer extends Boat implements Attacker
{ 
    private int boatt;
    public Destroyer(int teamm, Coordinates location, int directionn)
    {
        super(teamm, directionn, 2, 2, 1, location);
        boatt = teamm;
    }
    public String getID(){
        int AtA = 65;
        return("D"+boatt);
    }
    public String getActions(){
        return("Choose any of the following actions for the Destroyer:\n1.Move\n2.Turn left\n3.Turn right\n4.Attack");
    }
    public String attack(World ash){
        if(getDirection() % 2 == 0){
            if(getDirection() == 0){
                if(ash.array[locationx][locationy-1] == null){
                    return "No boats in range";
                }else{
                    return "Boat attacks";
                }
            }
            else if(getDirection() == 2){
                if(ash.array[locationx+1][locationy] == null){
                    return "No boats in range";
                }else{
                    return "Boat attacks";
                }
            }
            else if(getDirection() == 4){
                if(ash.array[locationx][locationy+1] == null){
                    return "No boats in range";
                }else{
                    return "Boat attacks";
                }
            }
            else{
                if(ash.array[(locationx)-1][locationy] == null){
                    return "No boats in range";
                }else{
                    return "Boat attacks";
                }
            }
        }else{
            if(getDirection() == 1){
                if(ash.array[locationx+1][locationy-1] == null){
                    return "No boats in range";
                }else{
                    return "Boat attacks";
                }
            }else if(getDirection() == 3){
                if(ash.array[locationx+1][locationy+1] == null){
                    return "No boats in range";
                }else{
                    return "Boat attacks";
                }
            }else if(getDirection() == 5){
                if(ash.array[locationx-1][locationy+1] == null){
                    return "No boats in range";
                }else{
                    return "Boat attacks";
                }
            }else{
                if(ash.array[locationx-1][locationy-1] == null){
                    return "No boats in range";
                }else{
                    return "Boat attacks";
                }
            }
        }
    }
    public String act(int[] array, World worldie){
        String finalDood = "";
        for(int n = 0; n < array.length; n++){
            if(array[n] == 1){
                move(worldie);
                finalDood += " ##The boat moved";
            }
            else if(array[n] == 2){
                turn(-1);
                finalDood += " ## The boat turned left";
            }
            else if(array[n] == 3){
                turn(1);
                finalDood += " ## The boat turned right";
            }
            else if(array[n] == 4){
                attack(worldie);
                finalDood += " ## Engages attack measures";
            }
        }
        return finalDood;
    }
    public String takeHit(int i){
        if(Math.random() == 0){
            return(getID() + " takes " + i + " damage");
        }
        else{
            return(getID() + " dodged the attack");
        }
    }
}