import java.lang.Math;
public class Submarine extends ScoutBoat implements Attacker 
{
    private int numOfTorpedoes, boatie;
    public Submarine(int teamm, Coordinates location, int directionn, int torpedoes)
    {
        super(teamm, directionn, 3, 1, 2, location);
        numOfTorpedoes = torpedoes;
        boatie = teamm;
    }
    public String getID(){
        
        return("S"+boatie);
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
                
                System.out.println(submerge(worldie));
                finalDood += " ## Engages submerge measures";
            }
        }
        return finalDood;
    }
    public String submerge(World ash){
        boolean yup = true;
        String finalyuyp = "";
        while(yup){
            int x = (int)(Math.random() * (2 + 1) - 1);
            int y = (int)(Math.random() * (2 + 1) - 1);
            int cacax = locationx + x;
            int cacay = locationy + y;
            if(ash.array[cacax][cacay] == null){
                getLocation().setCoordinates(cacax, cacay);
                int AtA = 64;
                char ReportChar = (char)(AtA + cacay);
                
                finalyuyp += getID() + " moves to " + ReportChar + "" + cacax;
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
                }else if(numOfTorpedoes >= 1){
                    return "No torps left";
                }else{
                    return "Boat attacks";
                }
            }
            else if(getDirection() == 2){
                if(ash.array[locationx+1][locationy] == null && ash.array[locationx+2][locationy] == null){
                    return "No boats in range";
                }else if(numOfTorpedoes >= 1){
                    return "No torps left";
                }else{
                    return "Boat attacks";
                }
            }
            else if(getDirection() == 4){
                if(ash.array[locationx][locationy+1] == null && ash.array[locationx][locationy+2] == null){
                    return "No boats in range";
                }else if(numOfTorpedoes >= 1){
                    return "No torps left";
                }else{
                    return "Boat attacks";
                }
            }
            else{
                if(ash.array[(locationx)-1][locationy] == null && ash.array[locationx-2][locationy] == null){
                    return "No boats in range";
                }else if(numOfTorpedoes >= 1){
                    return "No torps left";
                }else{
                    return "Boat attacks";
                }
            }
        }else{
            if(getDirection() == 1){
                if(ash.array[locationx+1][locationy-1] == null && ash.array[locationx+2][locationy-2] == null){
                    return "No boats in range";
                }else if(numOfTorpedoes >= 1){
                    return "No torps left";
                }else{
                    return "Boat attacks";
                }
            }else if(getDirection() == 3){
                if(ash.array[locationx+1][locationy+1] == null && ash.array[locationx+2][locationy+2] == null){
                    return "No boats in range";
                }else if(numOfTorpedoes >= 1){
                    return "No torps left";
                }else{
                    return "Boat attacks";
                }
            }else if(getDirection() == 5){
                if(ash.array[locationx-1][locationy+1] == null && ash.array[locationx-2][locationy+2] == null){
                    return "No boats in range";
                }else if(numOfTorpedoes >= 1){
                    return "No torps left";
                }else{
                    return "Boat attacks";
                }
            }else{
                if(ash.array[locationx-1][locationy-1] == null && ash.array[locationx-2][locationy-2] == null){
                    return "No boats in range";
                }else if(numOfTorpedoes >= 1){
                    return "No torps left";
                }else{
                    return "Boat attacks";
                }
            }
        }
    }
}
