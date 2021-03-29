public class Tester2 {
    public static void main(String[] args) {
        Coordinates x = new Coordinates(3, 6);
        System.out.println(x);
        World w1 = new World(10, 10);
        Boat[] bArr = new Boat[2];
        bArr[0] = new Submarine(1,new Coordinates(4,4), 3, 4);
        bArr[1] = new AircraftCarrier(2,new Coordinates(5,5), 1);
        System.out.println(bArr[0]);
        System.out.println(bArr[1].locationx);
        System.out.println(bArr[1].turn(-1));
        bArr[1].move(w1);
        System.out.println(bArr[1].locationx);
        System.out.println(bArr[1].locationy);
        String map = w1.drawTeamMap(bArr, 2);
        System.out.println(map);
    }
}