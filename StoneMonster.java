public class StoneMonster extends Monster{
    private String nameMonter;
    public StoneMonster(String name, String NameMonter){
        super(name);
        this.nameMonter=NameMonter;
    }
    @Override
    public String toString(){
        return "Monter: "+nameMonter;
    }
    @Override
    public String attack(){
        return "Attack with stone!";
    }
}
