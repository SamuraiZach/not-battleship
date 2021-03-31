public class TestAttack {
    public static void main(String[] args) {
        int[] jd = {4};
        World w1 = new World(10, 10);
        Boat[] bArr = new Boat[6];
        bArr[0] = new Battleship(1,new Coordinates(5,5), 0);
        bArr[1] = new Battleship(2,new Coordinates(5,4), 0);
        bArr[2] = new Battleship(2,new Coordinates(7,3), 0);
        bArr[3] = new Battleship(1,new Coordinates(7,5), 0);
        bArr[4] = new Battleship(1,new Coordinates(9,8), 1);
        bArr[5] = new Battleship(2,new Coordinates(9,7), 0);
        for(Boat b: bArr){
            w1.setOccupant(b, b.getLocation());
        }
        String map = w1.drawTeamMap(bArr, 2);
        System.out.println(map);
        System.out.println(bArr[0].act(jd,w1));
        System.out.println(bArr[3].act(jd,w1));
        System.out.println(bArr[4].act(jd,w1));

    }
}
