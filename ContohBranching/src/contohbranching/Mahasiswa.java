package contohbranching;

public class Mahasiswa extends Person{
    
    private String nim;

    public Mahasiswa(String nim, String nama) {
        super(nama);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }                
    
}
