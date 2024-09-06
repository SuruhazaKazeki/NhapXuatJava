/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BaiTap01;

import Baitap01.SanPham;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class WriteTextFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<SanPham> ds = new ArrayList<>();
        ds.add(new SanPham("SP01", "Gao", 25000));
        ds.add(new SanPham("SP02", "Duong", 45000));
        ds.add(new SanPham("SP03", "Keo", 29000));
        
        try{
            //tao luong ghi du lieu ra tap tin van ban
            FileWriter fw = new FileWriter("sanpham.txt");
            
            for(SanPham sp : ds)
            {
                //ghi du lieu file
                fw.write(sp.getMaso() + ":" + sp.getTen() + ":" +sp.getGia() + "\n");
            }
            //dong luong
            fw.close();
            System.out.println("Ghi thanh cong");
        }catch (Exception ex){
            System.out.println("Loi xay ra:" + ex.toString());
            System.out.println("Ghi file that bai");
        }
    }
    
}