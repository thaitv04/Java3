/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import model.SanPham;
import java.sql.*;
/**
 *
 * @author ThaiDepZai
 */
public class SanPhamRepository {
    ConnectionProvider connectionProvider;
    
    public ArrayList<SanPham> getList(){
        String sql = "SELECT * FROM SANPHAM";
        ArrayList<SanPham> listSP = new ArrayList<>();
        try(Connection conn = connectionProvider.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                Integer id = rs.getInt("ID");
                String tenSP = rs.getString("TENSANPHAM");
                String danhMuc = rs.getString("DANHMUC");
                Integer soLuong = rs.getInt("SOLUONG");
                String trangThai = rs.getString("TRANGTHAI");
                SanPham sp = new SanPham(id, tenSP, danhMuc, soLuong, trangThai);
                listSP.add(sp);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listSP;
    }
    public Boolean addNew(SanPham sanPham){
        String sql = "INSERT INTO SANPHAM(ID, TENSANPHAM, SOLUONG, DANHMUC, TRANGTHAI) VALUES (?, ?, ?, ?,?)";
        try(Connection conn = connectionProvider.getConnection(); 
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setObject(1, sanPham.getId());
            ps.setObject(2, sanPham.getTenSP());
            ps.setObject(3, sanPham.getSoLuong());
            ps.setObject(4, sanPham.getDanhMuc());
            ps.setObject(5, sanPham.getTrangThai());
            
            int kq = ps.executeUpdate();
            if (kq > 0){
                return true;
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    public Boolean delete(Integer id){
        String sql = "DELETE FROM SANPHAM WHERE ID = "+ id;
        try(Connection conn = connectionProvider.getConnection(); 
                PreparedStatement ps = conn.prepareStatement(sql)){
            int kq = ps.executeUpdate();
            if (kq > 0){
                return true;
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public Boolean upadte(SanPham sanPham){
        String sql = "UPDATE SANPHAM set TENSANPHAM = ?, SOLUONG = ?, DANHMUC = ?,  TRANGTHAI = ? WHERE ID = ?";
        try(Connection conn = connectionProvider.getConnection(); 
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setObject(5, sanPham.getId());
            ps.setObject(1, sanPham.getTenSP());
            ps.setObject(2, sanPham.getSoLuong());
            ps.setObject(3, sanPham.getDanhMuc());
            ps.setObject(4, sanPham.getTrangThai());
            
            int kq = ps.executeUpdate();
            if (kq > 0){
                return true;
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
}

