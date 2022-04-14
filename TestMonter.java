public class TestMonter {
    public static void main(String[] args) {
        Monster m1 = new FireMonster("Fire","Orl: ");
        Monster m2 = new WaterMonster("Water", "Nami: ");
        Monster m3 = new StoneMonster("Stone","Malphile: ");
        System.out.print(m1.toString());
        System.out.println(m1.attack());
        System.out.print(m2.toString());
        System.out.println(m2.attack());
        System.out.print(m3.toString());
        System.out.println(m3.attack());

        m1 = new StoneMonster("Stone","Malphile: ");
        System.out.print(m1.toString());
        System.out.println(m1.attack());

        Monster m4 = new Monster("");
        System.out.println(m4.attack());
    }
}
