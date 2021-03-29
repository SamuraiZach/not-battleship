import java.io.*;
import java.util.*;
import java.io.*;
public class World
{
    public static final int NORTH = 0, NORTHEAST = 1, EAST = 2, SOUTHEAST = 3, SOUTH = 4, SOUTHWEST = 5, WEST = 6, NORTHWEST = 7;
    public int width, height;
    public Object[][] array, map;
    public World(int x, int y)
    {
        if(x > 10){
            width = 10;
        }
        else if(x < 4){
            width = 4;
        }else{
            width = x;
        }
        if(y > 10){
            height = 10;
        }
        else if(y < 4){
            height = 4;
        }else{
            height = y;
        }
        Object[][] array = new Object [width][height];
        Object[][] map = new Object [width+1][height+1];
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                array[row][col] = null;
            }
        }
        for(int row = 0; row < map.length; row++){
            for(int col = 0; col < map[row].length; col++){
                map[row][col] = "";
            }
        }
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public Object getOccupant(Coordinates x){
        return(array[x.getX()][x.getY()]);
    }
    public boolean isLocationValid(Coordinates x){
        if((x.getX() >= 0 && x.getX() <= getWidth())&&(x.getY() >= 0 && x.getY() <= getHeight())){
            return true;
        }else{
            return false;
        }
    }
    public boolean isLocationOccupied(Coordinates x){
        if(array[x.getX()][x.getY()] == null){
            return false;
        }else{
            return true;
        }
    }
    public boolean setOccupant(Object boat, Coordinates coord){
        if(!this.isLocationOccupied(coord)){
            array[coord.getX()][coord.getY()] = boat;
            return true;
        }else{
            return false;
        }
    }
    public String getAdjacentLocation(Coordinates coord, int k){
        if(k == NORTH){
            int AtA = 65;
            char ReportChar = (char)(AtA + (coord.getY()-1));
            return (ReportChar+""+coord.getX());
        }else if(k == NORTHEAST){
            int AtA = 65;
            char ReportChar = (char)(AtA + (coord.getY()-1));
            return (ReportChar+""+(coord.getX()+1));
        }else if(k == EAST){
            int AtA = 65;
            char ReportChar = (char)(AtA + (coord.getY()));
            return (ReportChar+""+(coord.getX()+1));
        }else if(k == SOUTHEAST){
            int AtA = 65;
            char ReportChar = (char)(AtA + (coord.getY()+1));
            return (ReportChar+""+(coord.getX()+1));
        }else if(k == SOUTH){
            int AtA = 65;
            char ReportChar = (char)(AtA + (coord.getY()+1));
            return (ReportChar+""+coord.getX());
        }else if(k == SOUTHWEST){
            int AtA = 65;
            char ReportChar = (char)(AtA + (coord.getY()+1));
            return (ReportChar+""+(coord.getX()-1));
        }else if(k == WEST){
            int AtA = 65;
            char ReportChar = (char)(AtA + (coord.getY()));
            return (ReportChar+""+(coord.getX()-1));
        }else{
            int AtA = 65;
            char ReportChar = (char)(AtA + (coord.getY()-1));
            return (ReportChar+""+(coord.getX()-1));
        }
    }
    public String drawTeamMap(Boat[] Boats, int i){
        String gFinal = "";
        if(i == 1){
            for(int row = 0; row < map.length; row++){
                for(int col = 0; col < map[row].length; col++){
                    if(col == 0 && row == 0){
                        map[col][row] = "@";
                    }else if(col == 0 && row > 0){
                        int AtA = 65;
                        int x = 1;
                        char ReportChar = (char)(AtA + x);
                        map[col][row] = ReportChar;
                        x+=1;
                    }else if(row == 0 && col > 0){
                        int y = 1;
                        map[col][row] = y;
                    }else{
                        map[col][row] = "###";
                    }
                }
            }
        }
        else if (i == 2){// Dsiplay direction
            for(int row = 0; row < map.length; row++){
                for(int col = 0; col < map[row].length; col++){
                    if(col == 0 && row == 0){
                        map[col][row] = "@";
                    }else if(col == 0 && row > 0){
                        int AtA = 65;
                        int x = 1;
                        char ReportChar = (char)(AtA + x);
                        map[col][row] = ReportChar;
                        x+=1;
                    }else if(row == 0 && col > 0){
                        int y = 1;
                        map[col][row] = y;
                    }
                    else if(array[col][row] != null){
                        int count = 0;
                        boolean baba = true;
                        while(baba){
                            if(Boats[count] == array[col][row]){
                                baba = false;
                            }else{
                                count += 1;
                            }
                        }
                        map[col][row] = ("B"+Boats[count].getTeam());
                        map[col-1][row-1] = "~~~";
                        map[col-1][row] = "~~~";
                        map[col-1][row+1] = "~~~";
                        map[col][row-1] = "~~~";
                        map[col][row+1] = "~~~";
                        map[col+1][row-1] = "~~~";
                        map[col+1][row] = "~~~";
                        map[col][row+1] = "~~~";
                    }else{
                        map[col][row] = "###";
                    }
                }
            }
        }
        else if (i == 3){ // Health
            for(int row = 0; row < map.length; row++){
                for(int col = 0; col < map[row].length; col++){
                    if(col == 0 && row == 0){
                        map[col][row] = "@";
                    }else if(col == 0 && row > 0){
                        int AtA = 65;
                        int x = 1;
                        char ReportChar = (char)(AtA + x);
                        map[col][row] = ReportChar;
                        x+=1;
                    }else if(row == 0 && col > 0){
                        int y = 1;
                        map[col][row] = y;
                    }
                    else if(array[col][row] != null){
                        int count = 0;
                        boolean baba = true;
                        while(baba){
                            if(Boats[count] == array[col][row]){
                                baba = false;
                            }else{
                                count += 1;
                            }
                        }
                        map[col][row] = (""+Boats[count].getHealth() +"B"+ Boats[count].getTeam());
                        map[col-1][row-1] = "~~~";
                        map[col-1][row] = "~~~";
                        map[col-1][row+1] = "~~~";
                        map[col][row-1] = "~~~";
                        map[col][row+1] = "~~~";
                        map[col+1][row-1] = "~~~";
                        map[col+1][row] = "~~~";
                        map[col][row+1] = "~~~";
                    }else{
                        map[col][row] = "###";
                    }
                }
            }
        }
        for(int row = 0; row < map.length; row++){
                for(int col = 0; col < map[row].length; col++){
                    gFinal += map[col][row] + "\t";
                }
                gFinal += "\n";
        }
        return gFinal;
    }
}
