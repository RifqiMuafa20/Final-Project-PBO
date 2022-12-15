package pbo.Final;

import static pbo.Final.shortcut.Sysout.print;

public class Segitiga {
    protected String nama = "Segitiga";

    //innerclass 1
    static class SegitigaSamaKaki extends BangunDatar implements InterfaceBangunDatar {
        private double luas;
        private String nama = "Segitiga Sama Kaki";
        private String rumus = "Alas x Tinggi x 1/2";

        protected SegitigaSamaKaki(){
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

        protected void setLuas(double alas, double tinggi){
            this.luas = (alas*tinggi)/2;
        }

        protected double getLuas(){
            return this.luas;
        }
    }

    //innerclass 2
    static class SegitigaSamaSisi extends BangunDatar implements InterfaceBangunDatar{
        private double luas;
        private String nama = "Segitiga Sama Sisi";
        private String rumus = "sisi x sisi x 1/4 x √3";

        protected SegitigaSamaSisi(){
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
            this.luas = (sisi*sisi*Math.sqrt(3))/4;
        }

        protected double getLuas(){
            return this.luas;
        }
    }

    //innerclass 3
    static class SegitigaSembarang extends BangunDatar implements InterfaceBangunDatar{
        private double luas;
        private String nama = "Segitiga Sembarang";
        private String rumus = "akar(semiperimeter(semiperimeter - sisi1)(semiperimeter - sisi2)(semiperimeter - sisi3))";

        protected SegitigaSembarang(){
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

        protected void setLuas(double sisi1, double sisi2, double sisi3){
            double semiperimeter = (sisi1 + sisi2 + sisi3)/2;
            this.luas = Math.sqrt((semiperimeter)*(semiperimeter - sisi1)*(semiperimeter - sisi2)*(semiperimeter - sisi3));
        }

        protected double getLuas(){
            return this.luas;
        }
    }

    //innerclass 4
    static class SegitigaSikuSiku extends BangunDatar implements InterfaceBangunDatar {
        private double luas;
        private String nama = "Segitiga Siku-Siku";
        private String rumus = "Alas x Tinggi x 1/2";

        protected SegitigaSikuSiku(){
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

        protected void setLuas(double alas, double tinggi){
            this.luas = (alas*tinggi)/2;
        }

        protected double getLuas(){
            return this.luas;
        }

    }
}
