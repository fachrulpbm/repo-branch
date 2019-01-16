package contohbranching;

public class Dosen extends Person{
    
    private String nidn;

    public Dosen(String nidn, String nama) {
        super(nama);
        this.nidn = nidn;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }
               
}
