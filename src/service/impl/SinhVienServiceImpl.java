/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import model.SinhVien;
import repository.SinhVienRepository;
import service.SinhVienService;

/**
 *
 * @author thaitv
 */
public class SinhVienServiceImpl implements SinhVienService{

    SinhVienRepository SinhVienRepository = new SinhVienRepository();
    
    @Override
    public ArrayList<SinhVien> getList() {
        return SinhVienRepository.getAll();
    }

    @Override
    public String them(SinhVien sinhVien) {
        if(SinhVienRepository.addSV(sinhVien)){
            return "Them thanh cong !";
        } else {
            return "Them that bai !";
        }
    }

    @Override
    public String update(int id, SinhVien sinhVien) {
        if(SinhVienRepository.update(id, sinhVien)){
            return "Sua thanh cong !";
        } else {
            return "Sua that bai !";
        }
    }

    @Override
    public String xoa(int id, SinhVien sinhVien) {
        if(SinhVienRepository.delete(id, sinhVien)){
            return "Xoa thanh cong !";
        } else {
            return "Xoa that bai !";
        }
    }
}
