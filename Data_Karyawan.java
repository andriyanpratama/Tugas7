package employee;
/**
 *
 * @author Andriyan
 */
public class Data_Karyawan {
    public static void main (String[] args){
        Manajer bos = new Manajer("Saitama", "Kadipaten", 10000000);
        bos.setBonus(5000000);
        Employee[] karyawan = new Employee [3];
        karyawan[0] = bos;
        karyawan[1] = new Staff ("Genos", "Majalengka", 4000000);
        karyawan[2]= new Staff ("Toki", "Plered", 3500000);
        for (int i = 0; i<karyawan.length; i++){
            System.out.println(karyawan[i].getName()+"\t"+karyawan[i].getAddress()+"\t"+karyawan[i].getGaji());
        }
    }
}