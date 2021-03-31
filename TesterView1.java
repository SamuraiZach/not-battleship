public class TesterView1 {
    public static void main(String[] args) {
        World w1 = new World(10, 10);
        Boat[] bArr = new Boat[1];
        bArr[0] = new Submarine(1,new Coordinates(6,6), 0, 4);
        String map = w1.drawTeamMap(bArr, 1);
        System.out.println(map);
        
    }
}
