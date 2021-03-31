public class TurnBoat {
    public static void main(String[] args) {
        World w1 = new World(10, 10);
        Boat[] bArr = new Boat[1];
        bArr[0] = new Battleship(1,new Coordinates(5,5), 0);
        for(Boat b: bArr){
            w1.setOccupant(b, b.getLocation());
        }
        String map = w1.drawTeamMap(bArr, 2);
        System.out.println(map);
        System.out.println(bArr[0].turn(-1));
        System.out.println(bArr[0].move(w1));
        String map2 = w1.drawTeamMap(bArr, 2);
        System.out.println(map2);
        System.out.println(bArr[0].turn(1));
        System.out.println(bArr[0].turn(1));
        System.out.println(bArr[0].move(w1));
        String map3 = w1.drawTeamMap(bArr, 2);
        System.out.println(map3);
    }
}
