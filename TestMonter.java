public class TestMonter {
    public static void main(String[] args) {
        Monster m1 = new FireMonster("hy");
        Monster m2 = new WaterMonster("Water");
        Monster m3 = new StoneMonster("Stone","Malphile: ");

        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());

        m1 = new StoneMonster("Stone","Malphile: ");
        System.out.print(m1.toString());
        System.out.println(m1.attack());

        Monster m4 = new Monster("");
        System.out.println(m4.attack());
    }
}
