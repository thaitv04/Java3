/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author thaitv
 */
public class Login {
    
    private String maNV;
    
    private String hoTen;
    
    private String matKhau;
    
    private Integer vaiTro;

    public Login() {
    }

    public Login(String maNV, String hoTen, String matKhau, Integer vaiTro) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.matKhau = matKhau;
        this.vaiTro = vaiTro;
    }
    
    public String hienThiVaiTro(){
        if (vaiTro == 1) {
            return "Quan ly";
        } else {
            return "Nhan vien";
        }
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public Integer getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(Integer vaiTro) {
        this.vaiTro = vaiTro;
    }
    
    
    
}
