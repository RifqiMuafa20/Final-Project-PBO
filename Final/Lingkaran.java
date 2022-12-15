package pbo.Final;

import static pbo.Final.shortcut.Sysout.print;

public class Lingkaran extends BangunDatar implements InterfaceBangunDatar{
    private double luas;
    private String nama = "Lingkaran";
    private String rumus = "PHI x Jari-Jari x jari-jari";

    protected Lingkaran(){
        nama();
        rumus();
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

    protected void setLuas(double jari){
        this.luas = getPHI()*jari*jari;
    }

    protected double getLuas(){
        return this.luas;
    }
}
