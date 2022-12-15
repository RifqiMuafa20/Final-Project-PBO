package pbo.Final;

public abstract class BangunDatar {
    private double panjang;
    private double lebar;
    private double sisi;
    private double alas;
    private double tinggi;
    private double jari_jari;
    private double diagonal1;
    private double diagonal2;
    private double sisiSejajar1;
    private double sisiSejajar2;
    private double PHI = Satuan.PHI.getNilai();

    protected void setPanjang(double panjang){
        this.panjang = panjang;
    }

    protected void setLebar(double lebar){
        this.lebar = lebar;
    }

    protected void setSisi(double sisi){
        this.sisi = sisi;
    }

    protected void setAlas(double alas){
        this.alas = alas;
    }

    protected void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    protected void setJari_jari(double jari_jari){
        this.jari_jari = jari_jari;
    }

    protected void setDiagonal1(double diagonal1){
        this.diagonal1 = diagonal1;
    }

    protected void setDiagonal2(double diagonal2){
        this.diagonal2 = diagonal2;
    }

    protected void setSisiSejajar1(double sisiSejajar1){
        this.sisiSejajar1 = sisiSejajar1;
    }

    protected void setSisiSejajar2(double sisiSejajar2){
        this.sisiSejajar2 = sisiSejajar2;
    }

    protected double getPanjang(){
        return this.panjang;
    }

    protected double getLebar(){
        return this.lebar;
    }

    protected double getSisi(){
        return this.sisi;
    }

    protected double getAlas(){
        return this.alas;
    }

    protected double getTinggi(){
        return this.tinggi;
    }

    protected double getJari_jari(){
        return this.jari_jari;
    }

    protected double getDiagonal1(){
        return this.diagonal1;
    }

    protected double getDiagonal2(){
        return this.diagonal2;
    }

    protected double getSisiSejajar1(){
        return this.sisiSejajar1;
    }

    protected double getSisiSejajar2(){
        return this.sisiSejajar2;
    }

    protected double getPHI(){
        return this.PHI;
    }

    protected abstract double getLuas();
}
