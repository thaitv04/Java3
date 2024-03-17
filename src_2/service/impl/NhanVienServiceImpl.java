/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import model.NhanVien;
import service.NhanVienService;
import java.sql.*;
import repository.NhanVienRepository;
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
    public String them(NhanVien nhanVien) {
        if(nhanVienRepository.addNV(nhanVien)){
            return "Thêm thành công !";
        } else {
            return "Thêm thất bại !";
        }
    }

    @Override
    public String xoa(int maNV, NhanVien nhanVien) {
        if (nhanVienRepository.xoa(maNV, nhanVien)) {
            return "Xóa thành công";
        } else {
            return "Xóa không thành công";
        }
    }

    @Override
    public String update(int maNV, NhanVien nhanVien) {
        if (nhanVienRepository.update(maNV, nhanVien)) {
            return "Update thành công";
        } else {
            return "Update không thành công";
        }
    }
    
}
