package pbo.Final;

import static pbo.Final.shortcut.Sysout.print;

public class PersegiPanjang extends BangunDatar implements InterfaceBangunDatar{
    private double luas;
    private String nama = "Persegi Panjang";
    private String rumus = "Panjang x Lebar";

    protected PersegiPanjang(){
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
        print("Rumus: " + this.rumus + "\n");
    }

    @Override
    public void pemisah() {
        print("============================================\n");
    }

    protected void setLuas(double panjang, double lebar){
        this.luas = panjang*lebar;
    }

    protected double getLuas(){
        return this.luas;
    }

}
