/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap02;
import Baitap01.SanPham;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class ReadObject {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<SanPham> ds;
        try {
            FileInputStream fis = new FileInputStream("sanpham.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ds = (ArrayList<SanPham>) ois.readObject();

            System.out.println("\n Da doc xong");
            for (SanPham sp : ds) {
                System.out.println(sp);
            }
        } catch (Exception ex) {
            System.out.println("Loi xay ra" + ex.toString());
        }
    }

}
