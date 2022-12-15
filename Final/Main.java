package pbo.Final;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Consumer;
import java.time.LocalDateTime;

import static pbo.Final.shortcut.Sysout.print;

public class Main {
    public static void main(String [] args){
        try {
            print("\n*** PROGRAM MENGHITUNG LUAS BANGUN DATAR ***\n");
            print("============================================\n\n");

            print("PILIHAN BANGUN DATAR:\n");
            print("=====================\n");
            print("1. Persegi\n");
            print("2. Persegi Panjang\n");
            print("3. Segitiga\n");
            print("4. Lingkaran\n");
            print("5. Trapesium\n");
            print("6. Jajar Genjang\n");
            print("7. Belah Ketupat\n");
            print("8. Layang-Layang\n");
            print("9. Oval\n");
            print("=====================\n\n");

            LocalDateTime waktuAkses = LocalDateTime.now();
            DateTimeFormatter formatwaktu = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

            String waktu = waktuAkses.format(formatwaktu);

            Scanner input = new Scanner(System.in);
            print("Masukkan Pilihan Anda: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    Persegi p1 = new Persegi();

                    print("Masukkan Sisi Persegi(cm): ");
                    double sisi = input.nextDouble();
                    p1.setSisi(sisi);

                    p1.setLuas(p1.getSisi());
                    print("\nluas Persegi: " + p1.getLuas() + " cm2");
                    print("\n============================================");
                    print("\nDibuat Pada: " + waktu);

                    File Output1 = new File("Persegi.txt");
                    if (Output1.createNewFile()) {
                        print("\n\nFile created: " + Output1.getName() + " \n");
                        print("File Path: " + Output1.getAbsolutePath() + "\n");
                    } else {
                        print("\n\nFile Path: " + Output1.getAbsolutePath());
                    }

                    FileWriter myCode1 = new FileWriter("Persegi.txt", true);
                    String stringLuas = Double.toString(p1.getLuas());
                    myCode1.write("\nluas Persegi: " + stringLuas + " cm2\n");
                    myCode1.close();
                    break;

                case 2:
                    PersegiPanjang pp1 = new PersegiPanjang();

                    print("Masukkan Panjang(cm): ");
                    double panjang = input.nextDouble();
                    pp1.setPanjang(panjang);

                    print("Masukkan Lebar(cm): ");
                    double lebar = input.nextDouble();
                    pp1.setLebar(lebar);

                    pp1.setLuas(pp1.getPanjang(), pp1.getLebar());
                    print("\nluas Persegi Panjang: " + pp1.getLuas() + " cm2");
                    print("\n============================================");
                    print("\nDibuat Pada: " + waktu);

                    File Output2 = new File("PersegiPanjang.txt");
                    if (Output2.createNewFile()) {
                        print("\n\nFile created: " + Output2.getName() + " ....\n");
                        print("File Path: " + Output2.getAbsolutePath());
                    } else {
                        print("\n\nFile Path: " + Output2.getAbsolutePath());
                    }

                    FileWriter myCode2 = new FileWriter("PersegiPanjang.txt", true);
                    String stringLuasPP1 = Double.toString(pp1.getLuas());
                    myCode2.write("\nluas Persegi Panjang: " + stringLuasPP1 + " cm2\n");
                    myCode2.close();
                    break;

                case 3:
                    print("Segitiga\n\n");

                    print("PILIHAN SEGITIGA:\n");
                    print("=====================\n");
                    print("1. Segitiga Siku-Siku\n");
                    print("2. Segitiga Sama Kaki\n");
                    print("3. Segitiga Sama Sisi\n");
                    print("4. Segitiga Sembarang\n");
                    print("=====================\n\n");
                    print("Masukkan Pilihan Anda: ");

                    int segitigaPilihan = input.nextInt();

                    switch (segitigaPilihan) {
                        case 1:
                            Segitiga.SegitigaSikuSiku SG1 = new Segitiga.SegitigaSikuSiku();

                            print("Masukkan Alas(cm): ");
                            double alasSG1 = input.nextDouble();
                            SG1.setAlas(alasSG1);

                            print("Masukkan Tinggi(cm): ");
                            double tinggiSG1 = input.nextDouble();
                            SG1.setTinggi(tinggiSG1);

                            SG1.setLuas(SG1.getAlas(), SG1.getTinggi());
                            print("\nluas Segitiga: " + SG1.getLuas() + " cm2");
                            print("\n============================================");
                            print("\nDibuat Pada: " + waktu);

                            File Output3 = new File("SegitigaSiku.txt");
                            if (Output3.createNewFile()) {
                                print("\n\nFile created: " + Output3.getName() + " ....\n");
                                print("File Path: " + Output3.getAbsolutePath());
                            } else {
                                print("\n\nFile Path: " + Output3.getAbsolutePath());
                            }

                            FileWriter myCode3 = new FileWriter("SegitigaSiku.txt", true);

                            String stringLuasSG1 = Double.toString(SG1.getLuas());
                            myCode3.write("\nluas Segitiga: " + stringLuasSG1 + " cm2\n");
                            myCode3.close();
                            break;

                        case 2:
                            Segitiga.SegitigaSamaKaki SG2 = new Segitiga.SegitigaSamaKaki();

                            print("Masukkan Alas(cm): ");
                            double alasSG2 = input.nextDouble();
                            SG2.setAlas(alasSG2);

                            print("Masukkan Tinggi(cm): ");
                            double tinggiSG2 = input.nextDouble();
                            SG2.setTinggi(tinggiSG2);

                            SG2.setLuas(SG2.getAlas(), SG2.getTinggi());
                            print("\nluas Segitiga: " + SG2.getLuas() + " cm2");
                            print("\n============================================");
                            print("\nDibuat Pada: " + waktu);

                            File Output4 = new File("SegitigaKaki.txt");
                            if (Output4.createNewFile()) {
                                print("\n\nFile created: " + Output4.getName() + " ....\n");
                                print("File Path: " + Output4.getAbsolutePath());
                            } else {
                                print("\n\nFile Path: " + Output4.getAbsolutePath());
                            }

                            FileWriter myCode4 = new FileWriter("SegitigaKaki.txt", true);

                            String stringLuasSG2 = Double.toString(SG2.getLuas());
                            myCode4.write("\nluas Segitiga: " + stringLuasSG2 + " cm2\n");
                            myCode4.close();
                            break;

                        case 3:
                            Segitiga.SegitigaSamaSisi SG3 = new Segitiga.SegitigaSamaSisi();

                            print("Masukkan sisi(cm): ");
                            double sisiSG3 = input.nextDouble();
                            SG3.setSisi(sisiSG3);

                            SG3.setLuas(SG3.getSisi());
                            print("\nluas segitiga: " + SG3.getLuas() + " cm2");
                            print("\n============================================");
                            print("\nDibuat Pada: " + waktu);

                            File Output5 = new File("SegitigaSisi.txt");
                            if (Output5.createNewFile()) {
                                print("\n\nFile created: " + Output5.getName() + " ....\n");
                                print("File Path: " + Output5.getAbsolutePath());
                            } else {
                                print("\n\nFile Path: " + Output5.getAbsolutePath());
                            }

                            FileWriter myCode5 = new FileWriter("SegitigaSisi.txt", true);

                            String stringLuasSG3 = Double.toString(SG3.getLuas());
                            myCode5.write("\nluas segitiga: " + stringLuasSG3 + " cm2\n");
                            myCode5.close();
                            break;

                        case 4:
                            Segitiga.SegitigaSembarang SG4 = new Segitiga.SegitigaSembarang();

                            print("Masukkan sisi pertama(cm): ");
                            double sisi1 = input.nextDouble();
                            SG4.setSisi(sisi1);

                            print("Masukkan sisi kedua(cm): ");
                            double sisi2 = input.nextDouble();
                            SG4.setSisiSejajar1(sisi2);

                            print("Masukkan sisi ketiga(cm): ");
                            double sisi3 = input.nextDouble();
                            SG4.setSisiSejajar2(sisi3);

                            SG4.setLuas(SG4.getSisi(), SG4.getSisiSejajar1(), SG4.getSisiSejajar2());
                            print("\nluas segitiga: " + SG4.getLuas() + " cm2");
                            print("\n============================================");
                            print("\nDibuat Pada: " + waktu);

                            File Output6 = new File("SegitigaSembarang.txt");
                            if (Output6.createNewFile()) {
                                print("\n\nFile created: " + Output6.getName() + " ....\n");
                                print("File Path: " + Output6.getAbsolutePath());
                            } else {
                                print("\n\nFile Path: " + Output6.getAbsolutePath());
                            }

                            FileWriter myCode6 = new FileWriter("SegitigaSembarang.txt", true);

                            String stringLuasSG4 = Double.toString(SG4.getLuas());
                            myCode6.write("\nluas segitiga: " + stringLuasSG4 + " cm2\n");
                            myCode6.close();
                            break;

                        default:
                            print("You entered an unavailable option!!");
                    }
                    break;

                case 4:
                    Lingkaran l1 = new Lingkaran();

                    print("Masukkan Jari-Jari(cm): ");
                    double jari = input.nextDouble();
                    l1.setJari_jari(jari);

                    l1.setLuas(l1.getJari_jari());
                    print("\nluas Lingkaran: " + l1.getLuas() + " cm2");
                    print("\n============================================");
                    print("\nDibuat Pada: " + waktu);

                    File Output7 = new File("Lingkaran.txt");
                    if (Output7.createNewFile()) {
                        print("\n\nFile created: " + Output7.getName() + " ....\n");
                        print("File Path: " + Output7.getAbsolutePath());
                    } else {
                        print("\n\nFile Path: " + Output7.getAbsolutePath());
                    }

                    FileWriter myCode7 = new FileWriter("Lingkaran.txt", true);

                    String stringLuasl1 = Double.toString(l1.getLuas());
                    myCode7.write("\nluas Lingkaran: " + stringLuasl1 + " cm2\n");
                    myCode7.close();
                    break;

                case 5:
                    Trapesium t1 = new Trapesium();

                    print("Masukkan Sisi Sejajar Pertama(cm): ");
                    double sisiSejajar1 = input.nextDouble();
                    t1.setSisiSejajar1(sisiSejajar1);

                    print("Masukkan Sisi Sejajar Kedua(cm): ");
                    double sisiSejajar2 = input.nextDouble();
                    t1.setSisiSejajar2(sisiSejajar2);

                    print("Masukkan Tinggi(cm): ");
                    double tinggiT = input.nextDouble();
                    t1.setTinggi(tinggiT);

                    t1.setLuas(t1.getSisiSejajar1(), t1.getSisiSejajar2(), t1.getTinggi());
                    print("\nluas Trapesium: " + t1.getLuas() + " cm2");
                    print("\n============================================");
                    print("\nDibuat Pada: " + waktu);

                    File Output8 = new File("Trapesium.txt");
                    if (Output8.createNewFile()) {
                        print("\n\nFile created: " + Output8.getName() + " ....\n");
                        print("File Path: " + Output8.getAbsolutePath());
                    } else {
                        print("\n\nFile Path: " + Output8.getAbsolutePath());
                    }

                    FileWriter myCode8 = new FileWriter("Trapesium.txt", true);

                    String stringLuast1 = Double.toString(t1.getLuas());
                    myCode8.write("\nluas Trapesium: " + stringLuast1 + " cm2\n");
                    myCode8.close();
                    break;

                case 6:
                    JajarGenjang j1 = new JajarGenjang();

                    print("Masukkan Alas(cm): ");
                    double alas = input.nextDouble();
                    j1.setAlas(alas);

                    print("Masukkan Tinggi(cm): ");
                    double tinggiJG = input.nextDouble();
                    j1.setTinggi(tinggiJG);

                    j1.setLuas(j1.getAlas(), j1.getTinggi());
                    print("\nluas Jajar Genjang: " + j1.getLuas() + " cm2");
                    print("\n============================================");
                    print("\nDibuat Pada: " + waktu);

                    File Output9 = new File("JajarGenjang.txt");
                    if (Output9.createNewFile()) {
                        print("\n\nFile created: " + Output9.getName() + " ....\n");
                        print("File Path: " + Output9.getAbsolutePath());
                    } else {
                        print("\n\nFile Path: " + Output9.getAbsolutePath());
                    }

                    FileWriter myCode9 = new FileWriter("JajarGenjang.txt", true);

                    String stringLuasj1 = Double.toString(j1.getLuas());
                    myCode9.write("\nluas Jajar Genjang: " + stringLuasj1 + " cm2\n");
                    myCode9.close();
                    break;

                case 7:
                    BelahKetupat b1 = new BelahKetupat();

                    print("Masukkan Diagonal Pertama(cm): ");
                    double diagonalBK1 = input.nextDouble();
                    b1.setDiagonal1(diagonalBK1);

                    print("Masukkan Diagonal Kedua(cm): ");
                    double diagonalBK2 = input.nextDouble();
                    b1.setDiagonal2(diagonalBK2);

                    b1.setLuas(b1.getDiagonal1(), b1.getDiagonal2());
                    print("\nluas Belah Ketupat: " + b1.getLuas() + " cm2");
                    print("\n============================================");
                    print("\nDibuat Pada: " + waktu);

                    File Output10 = new File("BelahKetupat.txt");
                    if (Output10.createNewFile()) {
                        print("\n\nFile created: " + Output10.getName() + " ....\n");
                        print("File Path: " + Output10.getAbsolutePath());
                    } else {
                        print("\n\nFile Path: " + Output10.getAbsolutePath());
                    }

                    FileWriter myCode10 = new FileWriter("BelahKetupat.txt", true);

                    String stringLuasb1 = Double.toString(b1.getLuas());
                    myCode10.write("\nluas Belah Ketupat: " + stringLuasb1 + " cm2\n");
                    myCode10.close();
                    break;

                case 8:
                    LayangLayang ll1 = new LayangLayang();

                    print("Masukkan Diagonal Pertama(cm): ");
                    double diagonalLL1 = input.nextDouble();
                    ll1.setDiagonal1(diagonalLL1);

                    print("Masukkan Diagonal Kedua(cm): ");
                    double diagonalLL2 = input.nextDouble();
                    ll1.setDiagonal2(diagonalLL2);

                    ll1.setLuas(ll1.getDiagonal1(), ll1.getDiagonal2());
                    print("\nluas Belah Ketupat: " + ll1.getLuas() + " cm2");
                    print("\n============================================");
                    print("\nDibuat Pada: " + waktu);

                    File Output11 = new File("LayangLayang.txt");
                    if (Output11.createNewFile()) {
                        print("\n\nFile created: " + Output11.getName() + " ....\n");
                        print("File Path: " + Output11.getAbsolutePath());
                    } else {
                        print("\n\nFile Path: " + Output11.getAbsolutePath());
                    }

                    FileWriter myCode11 = new FileWriter("LayangLayang.txt", true);

                    String stringLuasll1 = Double.toString(ll1.getLuas());
                    myCode11.write("\nluas Belah Ketupat: " + stringLuasll1 + " cm2\n");
                    myCode11.close();
                    break;

                case 9:
                    Oval o1 = new Oval();

                    print("Masukkan Jari-Jari Pertama(cm): ");
                    double jari1 = input.nextDouble();
                    o1.setDiagonal1(jari1);

                    print("Masukkan Jari-Jari Kedua(cm): ");
                    double jari2 = input.nextDouble();
                    o1.setDiagonal2(jari2);

                    o1.setLuas(o1.getDiagonal1(), o1.getDiagonal2());
                    print("\nluas Oval: " + o1.getLuas() + " cm2");
                    print("\n============================================");
                    print("\nDibuat Pada: " + waktu);

                    File Output12 = new File("Oval.txt");
                    if (Output12.createNewFile()) {
                        print("\n\nFile created: " + Output12.getName() + " ....\n");
                        print("File Path: " + Output12.getAbsolutePath());
                    } else {
                        print("\n\nFile Path: " + Output12.getAbsolutePath());
                    }

                    FileWriter myCode12 = new FileWriter("Oval.txt", true);

                    String stringLuaso1 = Double.toString(o1.getLuas());
                    myCode12.write("\nluas Oval: " + stringLuaso1 + " cm2\n");
                    myCode12.close();
                    break;

                default:
                    print("You entered an unavailable option!!!!");

            }

            print("\n\nThank you for trying this program.\nDo you feel satisfied(y/n)? ");
            char kepuasan;
            kepuasan = input.next().charAt(0);

            Consumer<Character> hasil = (inputan) -> {
                char jawaban = inputan;
                if (jawaban == 'y'){
                    print("\nThank You...");
                } else if (jawaban == 'n') {
                    print("\nWe will upgrade to a better version...\n");
                    print("Enter your suggestions: ");
                    String saran = input.next();

                    try {
                        FileWriter inputSaran = new FileWriter("saran.txt", true);
                        inputSaran.write(saran);
                        inputSaran.close();

                    } catch ( IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }

                } else {
                    print("\nWe don't know what your needs are!!");
                }
            };
            hasil.accept(kepuasan);

        }catch(InputMismatchException e) {
            print("\nCaution!!\n");
            print("Note the Input Data Type!!");
            e.printStackTrace();

        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }catch(Exception e) {
            print("\nUpsss...\n");
            print("Something wrong with your program!!");
            e.printStackTrace();

        }finally {
            print("\n\nProgram has been Completed.....");
        }
    }
}

