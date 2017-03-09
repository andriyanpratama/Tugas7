package employee;
/**
 *
 * @author Andriyan
 */
public class Manajer extends Employee{
    private int bonus;
    public Manajer(String name, String address, int gaji) {
        super(name, address, gaji);
    }
    public int getBonus() {
        return bonus;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    @Override
    public int getGaji(){
        return this.gaji +this.getBonus(); 
    }
}