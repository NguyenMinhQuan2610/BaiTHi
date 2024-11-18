/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class SanPham {
   private int Masp;
   private String TenSp;
   private float DonGia;
   private String Hinh;
   private int maloai;
   private boolean Khuyenmai;

    public int getMasp() {
        return Masp;
    }

    public void setMasp(int Masp) {
        this.Masp = Masp;
    }

    public String getTenSp() {
        return TenSp;
    }

    public void setTenSp(String TenSp) {
        this.TenSp = TenSp;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public int getMaloai() {
        return maloai;
    }

    public void setMaloai(int maloai) {
        this.maloai = maloai;
    }

    public boolean isKhuyenmai() {
        return Khuyenmai=true;
    }

    public void setKhuyenmai(boolean Khuyenmai) {
        this.Khuyenmai = Khuyenmai;
    }

    public SanPham(int Masp, String TenSp, float DonGia, String Hinh, int maloai) {
        this.Masp = Masp;
        this.TenSp = TenSp;
        this.DonGia = DonGia;
        this.Hinh = Hinh;
        this.maloai = maloai;
    }

    public SanPham() {
    }

    @Override
    public String toString() {
        return "SanPham{" + "Masp=" + Masp + ", TenSp=" + TenSp + ", DonGia=" + DonGia + ", Hinh=" + Hinh + ", maloai=" + maloai + ", Khuyenmai=" + Khuyenmai + '}';
    }
    
}
