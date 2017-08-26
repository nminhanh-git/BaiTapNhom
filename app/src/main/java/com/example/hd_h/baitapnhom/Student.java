package com.example.hd_h.baitapnhom;

/**
 * Created by nminh on 8/24/2017.
 */

public class Student {
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private String diaChi;
    private String gioiTinh;

    public Student() {
        this.hoTen = "Lê Văn Sáng";
        this.lop = "CNTT3-K56";
        this.ngaySinh = "20/09/1997";
        this.diaChi = "Nam Định";
        this.gioiTinh = "Nam";
    }

    public Student(String hoTen, String lop, String ngaySinh, String diaChi, String gioiTinh) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
}
