package BioskopHumam;

public class Penonton {
    private String ID;
    private String NAMA;
    private String NO_HP;
    private String FILM_PILIHAN;

    public String getFILM_PILIHAN() {
        return FILM_PILIHAN;
    }

    public void setFILM_PILIHAN(String FILM_PILIHAN) {
        this.FILM_PILIHAN = FILM_PILIHAN;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNAMA() {
        return NAMA;
    }

    public void setNAMA(String NAMA) {
        this.NAMA = NAMA;
    }

    public String getNO_HP() {
        return NO_HP;
    }

    public void setNO_HP(String NO_HP) {
        this.NO_HP = NO_HP;
    }

    public Penonton(){

    }

}
