//Conner Wilson , Kelvin Wenzen
public class runner {
    public static void main(String[] args){
    employee a = new employee("john", "jack", "111-11-1111");
    BasePlusCommissionEmployee B = new BasePlusCommissionEmployee("john", "jack", "111-11-1111", 1000, .5, 10000);
    CommissionEmployee c = new CommissionEmployee("john", "jack", "111-11-1111", 1000, .5);
    System.out.println(c.toString() + "\n");
    System.out.println(B.toString() + "\n");
    System.out.println(a.toString());
    }
}
