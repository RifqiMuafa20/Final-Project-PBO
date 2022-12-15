package pbo.Final;

public enum Satuan {
    PHI(3.14),
    METER(0.01),
    MILIMETER(10),
    DESIMETER(0.1),
    KILOMETER(0.00001);

    private double nilai;

    Satuan(double v) {
        nilai = v;
    }

    double getNilai(){
        return nilai;
    }
}
