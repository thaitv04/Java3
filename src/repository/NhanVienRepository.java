/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import model.NhanVien;
import java.sql.*;
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
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listNhanVien;
    }
}
