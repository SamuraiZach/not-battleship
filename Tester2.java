public class Tester2 {
    public static void main(String[] args) {
        int[] jd = {4};
        World w1 = new World(10, 10);
        Boat[] bArr = new Boat[6];
        bArr[0] = new Submarine(1,new Coordinates(6,6), 3, 4);
        bArr[1] = new AircraftCarrier(1,new Coordinates(5,5), 3);
        bArr[2] = new Battleship(2,new Coordinates(9,8), 0);
        bArr[3] = new Battleship(1,new Coordinates(9,9), 0);
        bArr[4] = new Battleship(1,new Coordinates(9,6), 0);
        bArr[5] = new Battleship(2,new Coordinates(3,3), 3);
        for(Boat b: bArr){
            w1.setOccupant(b, b.getLocation());
        }
        String map = w1.drawTeamMap(bArr, 2);
        System.out.println(map);
        // System.out.println(bArr[0]);
        // System.out.println(bArr[1].locationx);
        // System.out.println(bArr[1].getLocation());
        // System.out.println(bArr[0].getLocation());
        // System.out.println(bArr[1].turn(-1));
        // System.out.println(bArr[0].getActions());
        // bArr[1].move(w1);
        // bArr[0].act(jd,w1);
        // System.out.println(bArr[1].getLocation());
        // System.out.println(bArr[1].locationy);
        // System.out.println(bArr[2].getLocation());
        // System.out.println(bArr[3].getLocation());
        // System.out.println(bArr[3].act(jd,w1));
        // System.out.println(bArr[2].act(jd,w1));
        // System.out.println(map);
    }
}