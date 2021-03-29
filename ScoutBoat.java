import java.lang.Math;
public abstract class ScoutBoat extends Boat
{
    public ScoutBoat(int teamm, int directionn, int healthh, int strengthh, int visionn, Coordinates location){
        super(teamm, directionn, healthh, strengthh, visionn, location);
    }
    public String takeHit(int i){
        int j = 0;
        int count = 0;
        while (j < i){
            if(Math.random() * (5 - 1) + 1 == 1){
                j += 1;
                count += 1;
            }
            else{
                j+=1;
            }
        }
        if(count > 0){
            return("Boat takes "+count+" damage.");
        }else{
            return("Boat dodged all!");
        }
    }
}
