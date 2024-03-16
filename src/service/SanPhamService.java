/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.SanPham;
import repository.SanPhamRepository;

/**
 *
 * @author ThaiDepZai
 */
public class SanPhamService {
    
    SanPhamRepository sanPhamRepository = new SanPhamRepository();
    
    public ArrayList<SanPham> getAll(){
        return sanPhamRepository.getList();
    }
    
    public String addNew(SanPham sanPham){
        Boolean check = sanPhamRepository.addNew(sanPham);
        if(check){
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }
    
    public String delete(Integer id){
        Boolean check = sanPhamRepository.delete(id);
        if(check){
            return "Xóa thành công";
        } else {
            return "Xóa thất bại";
        }
    }
    public String upadate(SanPham sanPham){
        Boolean check = sanPhamRepository.upadte(sanPham);
        if(check){
            return "Update thành công";
        } else {
            return "Update thất bại";
        }
    }
}
