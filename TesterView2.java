public class TesterView2 {
    public static void main(String[] args) {
        World w1 = new World(10, 10);
        Boat[] bArr = new Boat[2];
        bArr[0] = new Submarine(1,new Coordinates(4,4), 0, 4);
        bArr[1] = new Submarine(2,new Coordinates(8,8), 1, 4);
        for(Boat b: bArr){
            w1.setOccupant(b, b.getLocation());
        }
        String map = w1.drawTeamMap(bArr, 2);
        System.out.println(map);
    }
}
