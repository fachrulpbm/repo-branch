package contohbranching;

public class ContohBranching {

    public static void main(String[] args) {
        
        Person p1 = new Dosen("123", "Joko");

        Person p2  = new Mahasiswa("001", "Udin");

        System.out.println(p1.getNama());
        System.out.println(p2.getNama());
        
    }
    
}
