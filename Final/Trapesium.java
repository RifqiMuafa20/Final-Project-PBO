package pbo.Final;

import static pbo.Final.shortcut.Sysout.print;

public class Trapesium extends BangunDatar implements InterfaceBangunDatar {
    private double luas;
    private String nama = "Trapesium";
    private String rumus = "(Jumlah sisi sejajar) x tinggi x 1/2";

    protected Trapesium(){
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

    protected void setLuas(double sisiSejajar1, double sisiSejajar2, double tinggi){
        this.luas = (sisiSejajar1 + sisiSejajar2)*(tinggi)/2;
    }

    protected double getLuas(){
        return this.luas;
    }
}
