/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.NhanVien;
import model.SinhVien;

/**
 *
 * @author thaitv
 */
public interface NhanVienService {
    
    ArrayList<NhanVien> getList();
    
    String addNV(SinhVien sinhVien);
    
    String xoa(int maNV, SinhVien sinhVien);
    
    String update(int maNV, SinhVien sinhVien);
    
}
