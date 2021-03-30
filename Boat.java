import java.util.ArrayList;
public abstract class Boat
{
    private int team, direction, health, strength, vision;
    public Coordinates obj;
    public int locationx, locationy;
    public String directo;
    public Boat(int teamm, int directionn, int healthh, int strengthh, int visionn, Coordinates location)
    {
        team = teamm;
        direction = directionn;
        health = healthh;
        strength = strengthh;
        vision = visionn;
        obj = location;
        locationx = location.getX();
        locationy = location.getY();
    }
    public int getTeam(){
        return team;
    }
    public int getDirection(){
        if(direction == 0){
            directo = "NORTH";
        }else if(direction == 1){
            directo = "NORTHEAST";
        }else if(direction == 2){
            directo = "EAST";
        }else if(direction == 3){
            directo = "SOUTHEAST";
        }else if(direction == 4){
            directo = "SOUTH";
        }else if(direction == 5){
            directo = "SOUTHWEST";
        }else if(direction == 6){
            directo = "WEST";
        }else{
            directo = "NORTHWEST";
        }
        
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
                    obj.setCoordinates(locationx, locationy);
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
                    obj.setCoordinates(locationx, locationy);
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
                    obj.setCoordinates(locationx, locationy);
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
                    obj.setCoordinates(locationx, locationy);
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
                    obj.setCoordinates(locationx, locationy);
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
                    obj.setCoordinates(locationx, locationy);
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
                    obj.setCoordinates(locationx, locationy);
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
                    obj.setCoordinates(locationx, locationy);
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
                getDirection();
                an = getID() + " turned left, now facing "+ directo;
            }else{
                this.direction -= 1;
                getDirection();
                an = getID() + " turned left, now facing "+ directo; 
            }
        }
        else if(x == 1){
            if(direction  == 7){
                direction = 0;
                getDirection();
                an = getID() + " turned left, now facing "+ directo;
            }
            else{
                this.direction += 1;
                getDirection();
                an = getID() + " turned left, now facing "+ directo;
            }
        }
        return an;
    }
}
