public class TestSubmer {
    public static void main(String[] args) {
        int[] jd = {4};
        World w1 = new World(10, 10);
        Boat[] bArr = new Boat[1];
        bArr[0] = new Submarine(1,new Coordinates(4,4), 1, 4);
        for(Boat b: bArr){
            w1.setOccupant(b, b.getLocation());
        }
        String map = w1.drawTeamMap(bArr, 2);
        System.out.println(map);
        System.out.println(bArr[0].act(jd,w1));
        String map2 = w1.drawTeamMap(bArr, 2);
        System.out.println(map2);
    }
}
