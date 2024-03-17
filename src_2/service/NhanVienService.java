/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.NhanVien;

/**
 *
 * @author thaitv
 */
public interface NhanVienService {
    
    ArrayList<NhanVien> getList();
    
    String them(NhanVien nhanVien);
    
    String xoa(int maNV, NhanVien nhanVien);
    
    String update(int maNV, NhanVien nhanVien);
    
}
