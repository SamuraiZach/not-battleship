import java.util.ArrayList;
public abstract class Boat
{
    private int team, direction, health, strength, vision;
    public Coordinates obj;
    public int locationx, locationy;
    public Boat(int teamm, int directionn, int healthh, int strengthh, int visionn, Coordinates location)
    {
        team = teamm;
        direction = directionn;
        health = healthh;
        strength = strengthh;
        vision = visionn;
        obj = location;
    }
    public int getTeam(){
        return team;
    }
    public int getDirection(){
        return direction;
    }
    public int getHealth(){
        return health;
    }
    public int getStrength(){
        return strength;
    }
    public int getVision(){
        return vision;
    }
    public Coordinates getLocation(){
        return obj;
    }
    public abstract  String getID();
    public abstract String act(int[] array, World x);
    public abstract String getActions();
    public String move(World ash){
        if(getDirection() % 2 == 0){
            if(getDirection() == 0){
                if(ash.array[locationx][locationy-1] == null){
                    ash.array[locationx][locationy-1] = obj;
                    ash.array[locationx][locationy] = null;
                    locationy -= 1;
                    return "Boat moves";
                }else{
                    return "Cannot move";
                }
            }
            else if(getDirection() == 2){
                if(ash.array[locationx+1][locationy] == null){
                    ash.array[locationx+1][locationy] = obj;
                    ash.array[locationx][locationy] = null;
                    locationx += 1;
                    return "Boat moves";
                }else{
                    return "Cannot move";
                }
            }
            else if(getDirection() == 4){
                if(ash.array[locationx][locationy+1] == null){
                    ash.array[locationx][locationy+1] = obj;
                    ash.array[locationx][locationy] = null;
                    locationy += 1;
                    return "Boat moves";
                }else{
                    return "Cannot move";
                }
            }
            else{
                if(ash.array[(locationx)-1][locationy] == null){
                    ash.array[locationx-1][locationy] = obj;
                    ash.array[locationx][locationy] = null;
                    locationx -= 1;
                    return "Boat moves";
                }else{
                    return "Cannot move";
                }
            }
        }else{
            if(getDirection() == 1){
                if(ash.array[locationx+1][locationy-1] == null){
                    ash.array[locationx+1][locationy-1] = obj;
                    ash.array[locationx][locationy] = null;
                    locationy -= 1;
                    locationx += 1;
                    return "Boat moves";
                }else{
                    return "Cannot move";
                }
            }else if(getDirection() == 3){
                if(ash.array[locationx+1][locationy+1] == null){
                    ash.array[locationx+1][locationy+1] = obj;
                    ash.array[locationx][locationy] = null;
                    locationy += 1;
                    locationx += 1;
                    return "Boat moves";
                }else{
                    return "Cannot move";
                }
            }else if(getDirection() == 5){
                if(ash.array[locationx-1][locationy+1] == null){
                    ash.array[locationx-1][locationy+1] = obj;
                    ash.array[locationx][locationy] = null;
                    locationy += 1;
                    locationx -= 1;
                    return "Boat moves";
                }else{
                    return "Cannot move";
                }
            }else{
                if(ash.array[locationx-1][locationy-1] == null){
                    ash.array[locationx-1][locationy-1] = obj;
                    ash.array[locationx][locationy] = null;
                    locationy -= 1;
                    locationx -= 1;
                    return "Boat moves";
                }else{
                    return "Cannot move";
                }
            }
        }
    }
    public String turn(int x){
        String an = "";
        if(x == -1){
            if( direction  == 0){
                direction = 7;
                an = "S1 turned left, now facing "+ getDirection();
            }else{
                direction -= 1;
                an = ("S1 turned left, now facing "+getDirection());
            }
        }
        else if(x == 1){
            if(direction  == 7){
                direction = 0;
                an = ("S1 turned right, now facing "+ getDirection());
            }
            else{
                direction += 1;
                an = ("S1 turned right, now facing "+ getDirection());
            }
        }
        return an;
    }
}
