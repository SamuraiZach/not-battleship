import java.lang.Math;
public class Submarine extends ScoutBoat implements Attacker 
{
    private int numOfTorpedoes, boatie;
    private int team, direction, health, strength, vision;
    public Submarine(int teamm, Coordinates location, int directionn, int torpedoes)
    {
        super(teamm, directionn, 3, 1, 2, location);
        numOfTorpedoes = torpedoes;
        boatie = teamm;
    }
    public String getID(){
        int AtA = 65;
        char ReportChar = (char)(AtA + boatie);
        return("C"+ReportChar);
    }
    public String getActions(){
        return("Choose any of the following actions for the Submarine:\n1.Move\n2.Turn left\n3.Turn right\n4.Submerge\n5.Fire torpedoes");
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
            else if(array[n] == 5){
                attack(worldie);
                finalDood += " ## Engages attack measures";
            }else if(array[n] == 4){
                submerge(worldie);
                finalDood += " ## Engages submerge measures";
            }
        }
        return finalDood;
    }
    public String submerge(World ash){
        boolean yup = true;
        String finalyuyp = "";
        while(yup){
            if(ash.array[(int)Math.random() * (2 + 1) - 1][(int)Math.random() * (2 + 1) - 1] == null){
                locationx = (int)Math.random() * (2 + 1) - 1;
                locationy = (int)Math.random() * (2 + 1) - 1;
                int AtA = 65;
                char ReportChar = (char)(AtA + locationy);
                
                finalyuyp += getID() + " moves to " + ReportChar + "" + locationx;
                yup = false;
            }
        }
        return finalyuyp;
    }
    public String attack(World ash){
        if(getDirection() % 2 == 0){
            if(getDirection() == 0){
                if(ash.array[locationx][locationy-1] == null && ash.array[locationx][locationy-2] == null){
                    return "No boats in range";
                }else{
                    return "Boat attacks";
                }
            }
            else if(getDirection() == 2){
                if(ash.array[locationx+1][locationy] == null && ash.array[locationx+2][locationy] == null){
                    return "No boats in range";
                }else{
                    return "Boat attacks";
                }
            }
            else if(getDirection() == 4){
                if(ash.array[locationx][locationy+1] == null && ash.array[locationx][locationy+2] == null){
                    return "No boats in range";
                }else{
                    return "Boat attacks";
                }
            }
            else{
                if(ash.array[(locationx)-1][locationy] == null && ash.array[locationx-2][locationy] == null){
                    return "No boats in range";
                }else{
                    return "Boat attacks";
                }
            }
        }else{
            if(getDirection() == 1){
                if(ash.array[locationx+1][locationy-1] == null && ash.array[locationx+2][locationy-2] == null){
                    return "No boats in range";
                }else{
                    return "Boat attacks";
                }
            }else if(getDirection() == 3){
                if(ash.array[locationx+1][locationy+1] == null && ash.array[locationx+2][locationy+2] == null){
                    return "No boats in range";
                }else{
                    return "Boat attacks";
                }
            }else if(getDirection() == 5){
                if(ash.array[locationx-1][locationy+1] == null && ash.array[locationx-2][locationy+2] == null){
                    return "No boats in range";
                }else{
                    return "Boat attacks";
                }
            }else{
                if(ash.array[locationx-1][locationy-1] == null && ash.array[locationx-2][locationy-2] == null){
                    return "No boats in range";
                }else{
                    return "Boat attacks";
                }
            }
        }
    }
}
