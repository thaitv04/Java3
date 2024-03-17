/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.SinhVien;

/**
 *
 * @author thaitv
 */
public interface SinhVienService {
    
    ArrayList<SinhVien> getList();
    
    String them(SinhVien sinhVien);
    
    String xoa(int id, SinhVien sinhVien);
    
    String update(int id, SinhVien sinhVien);
    
}
