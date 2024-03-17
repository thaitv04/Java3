/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import model.NhanVien;
import java.sql.*;
import model.Login;
/**
 *
 * @author thaitv
 */
public class NhanVienRepository {
    
    ConnectionProvider connectionProvider;
    
    public ArrayList<NhanVien> getAll(){
        String sql = "SELECT * FROM NHANVIEN";
        ArrayList<NhanVien> listNhanVien = new ArrayList<>();
        try(Connection conn = ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                NhanVien nhanVien = new NhanVien();
                nhanVien.setMaNV(rs.getInt("MANV"));
                nhanVien.setHoTen(rs.getString("HOTEN"));
                nhanVien.setPhongBan(rs.getString("PHONGBAN"));
                nhanVien.setTuoi(rs.getInt("TUOI"));
                nhanVien.setDiaChi(rs.getString("DIACHI"));
                nhanVien.setChucVu(rs.getInt("CHUCVU"));
                listNhanVien.add(nhanVien);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
            return listNhanVien;
    }
    
    public Boolean addNV(NhanVien nhanVien){
        String sql = "INSERT INTO NHANVIEN(MANV, HOTEN, PHONGBAN, TUOI, DIACHI, CHUCVU) VALUES(?, ?, ?, ?, ?, ?)";
        try(Connection conn = ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setObject(1, nhanVien.getMaNV());
            ps.setObject(2, nhanVien.getHoTen());
            ps.setObject(3, nhanVien.getPhongBan());
            ps.setObject(4, nhanVien.getTuoi());
            ps.setObject(5, nhanVien.getDiaChi());
            ps.setObject(6, nhanVien.getChucVu());
            
            int kq = ps.executeUpdate();
            if(kq > 0){
                return true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public Boolean xoa(int maNV, NhanVien nhanVien){
        String sql = " DELETE FROM NHANVIEN WHERE MANV = ?";
        try(Connection conn = ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
                ps.setObject(1, maNV);
                 int kq = ps.executeUpdate();
            if(kq > 0){
                return true;
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public Boolean update(int maNV, NhanVien nhanVien){
        String sql = "UPDATE NHANVIEN SET HOTEN = ?, PHONGBAN = ?, TUOI = ?, DIACHI = ?, CHUCVU = ? WHERE MANV = ?";
        try(Connection conn = ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setObject(6, nhanVien.getMaNV());
            ps.setObject(1, nhanVien.getHoTen());
            ps.setObject(2, nhanVien.getPhongBan());
            ps.setObject(3, nhanVien.getTuoi());
            ps.setObject(4, nhanVien.getDiaChi());
            ps.setObject(5, nhanVien.getChucVu());
            
            int kq = ps.executeUpdate();
            if(kq > 0){
                return true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
}
