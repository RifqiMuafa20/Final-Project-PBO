package pbo.Final;

import static pbo.Final.shortcut.Sysout.print;

public class Persegi extends BangunDatar implements InterfaceBangunDatar{
    private double luas;
    private String nama = "Persegi";
    private String rumus = "Sisi x Sisi";

    protected Persegi(){
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

    protected void setLuas(double sisi){
        this.luas = sisi*sisi;
    }

    protected double getLuas(){
        return this.luas;
    }
}
