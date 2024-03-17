/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author thaitv
 */
public class SinhVien {
    
    private Integer id;
    
    private String hoTen;
    
    private String diaChi;
    
    private Integer tuoi;
    
    private String trangThai;

    public SinhVien() {
    }

    public SinhVien(Integer id, String hoTen, String diaChi, Integer tuoi, String trangThai) {
        this.id = id;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
        this.trangThai = trangThai;
    }

   
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
