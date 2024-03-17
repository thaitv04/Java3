/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import model.NhanVien;
import model.SinhVien;
import repository.NhanVienRepository;
import service.NhanVienService;

/**
 *
 * @author thaitv
 */
public class NhanVienServiceImpl implements NhanVienService{

    NhanVienRepository nhanVienRepository = new NhanVienRepository();
    
    @Override
    public ArrayList<NhanVien> getList() {
        return nhanVienRepository.getAll();
    }

    @Override
    public String addNV(SinhVien sinhVien) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String xoa(int maNV, SinhVien sinhVien) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String update(int maNV, SinhVien sinhVien) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
