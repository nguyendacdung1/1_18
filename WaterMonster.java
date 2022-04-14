public class WaterMonster extends Monster{
    private String nameMonter;
    public WaterMonster(String name, String NameMonter){
        super(name);
        this.nameMonter = NameMonter;
    }
    @Override
    public String toString(){
        return "Monter " + nameMonter;
    }
    @Override
    public String attack(){
        return "Attack with water!";
    }
}
