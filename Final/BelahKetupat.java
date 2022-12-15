package pbo.Final;

import static pbo.Final.shortcut.Sysout.print;

public class BelahKetupat extends BangunDatar implements InterfaceBangunDatar{
    private double luas;
    private String nama = "Belah Ketupat";
    private String rumus = "Diagonal1 x Diagonal2 x 1/2";

    protected BelahKetupat(){
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

    protected void setLuas(double diagonal1, double diagonal2){
        this.luas = (diagonal1*diagonal2)/2;
    }

    protected double getLuas(){
        return this.luas;
    }
}
