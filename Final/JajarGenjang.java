package pbo.Final;

import static pbo.Final.shortcut.Sysout.print;

public class JajarGenjang extends BangunDatar implements InterfaceBangunDatar{
    private double luas;
    private String nama = "Jajar Genjang";
    private String rumus = "Alas x Tinggi";

    protected JajarGenjang(){
        nama();
        rumus();
        pemisah();
    }

    @Override
    public void nama() {
        print("Jenis: " + this.nama + "\n");
    }

    @Override
    public void rumus() {
        print("Rumus: " + this.rumus + "\n\n");
    }

    @Override
    public void pemisah() {
        print("============================================\n");
    }

    protected void setLuas(double alas, double tinggi){
        this.luas = alas*tinggi;
    }

    protected double getLuas(){
        return this.luas;
    }
}
