package employee;
/**
 *
 * @author Andriyan
 */
public class Employee {
   private String name;
   private String address;
   public int gaji;
    public Employee(String name, String address, int gaji) {
        System.out.println("Constructing pada karyawan");
        this.name = name;
        this.address = address;
        this.gaji = gaji;
    }
public double hitunggaji() {
     System.out.println("hitung gaji karyawan ");
     return 0.0;
   }
//getter
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getGaji() {
        return gaji;
    }
//setter
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
}