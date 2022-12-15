package pbo.Final;

import static pbo.Final.shortcut.Sysout.print;

public class Oval extends BangunDatar implements InterfaceBangunDatar{
    private double luas;
    private String nama = "Oval";
    private String rumus = "PHI x Jari-Jari 1 x jari-jari 2";

    protected Oval(){
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

    protected void setLuas(double jari1, double jari2){
        this.luas = getPHI()*jari1*jari2;
    }

    protected double getLuas(){
        return this.luas;
    }
}
