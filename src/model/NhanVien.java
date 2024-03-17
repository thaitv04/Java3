package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thaitv
 */
public class NhanVien {
    
    private Integer maNV;
    
    private String hoTen;
    
    private String phongBan;
    
    private Integer tuoi;
    
    private String diaChi;
    
    private Integer chucVu;

    public NhanVien() {
    }

    public NhanVien(Integer maNV, String hoTen, String phongBan, Integer tuoi, String diaChi, Integer chucVu) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.phongBan = phongBan;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.chucVu = chucVu;
    }
    
    public String hienThiChucVu(){
        if(chucVu == 1){
            return "Trưởng phòng";
        } else {
            return "Nhân viên";
        }
    }

    public Integer getMaNV() {
        return maNV;
    }

    public void setMaNV(Integer maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Integer getChucVu() {
        return chucVu;
    }

    public void setChucVu(Integer chucVu) {
        this.chucVu = chucVu;
    }
    
    
}
