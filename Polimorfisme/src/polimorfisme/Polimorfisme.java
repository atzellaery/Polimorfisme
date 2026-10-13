/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author VANIA
 */
public class Polimorfisme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pegawai p = new Pegawai();
        p = new Programmer();
        p = new Manajer();
        
//        Manajer m = new Programmer();
        
        Manajer m = new Manajer();
        m.nama = "Lily";
        m.gajiPokok = 50000;
        m.tunjangan = 10000;
        p = m;//polimorfisme
        p.tampilData(); //VMI
        m.tampilData();//bukan VMI
        
        
//        Programmer pro = new Programmer();
//        pro.nama = "Meredith";
//        pro.gajiPokok = 75000;
//        pro.bonus = 20000;
//        p = pro;
//        p.tampilData();
        
        Pegawai[] arrPeg = new Pegawai[3];
        Programmer pr = new Programmer();
        pr.nama = "Asher";
        pr.gajiPokok = 100000;
        pr.bonus = 120000;
        pr.tampilData();
        arrPeg[0] = p;
        arrPeg [1] = m;
        arrPeg [2] = new Programmer();
        arrPeg[0].tampilData();
        arrPeg[1].tampilData();
        
        hitungGajiTotal(m);
        hitungGajiTotal(pr);
        
    }
    
    public static void hitungGajiTotal(Pegawai p){
        if (p instanceof Programmer){
            Programmer prog = (Programmer) p;
            int gajiTot = prog.bonus+prog.gajiPokok;
            System.out.println("Gaji Total Programmer = "+gajiTot);
        }
        else if (p instanceof Manajer){
            Manajer man = (Manajer) p;
            int gajiTot = man.tunjangan+man.gajiPokok;
            System.out.println("Gaji Total Manajer = "+gajiTot);
        }
    }
}
