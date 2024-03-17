/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;
import java.sql.*;
import java.util.ArrayList;
import model.SinhVien;
/**
 *
 * @author thaitv
 */
public class SinhVienRepository {
    
    ConnectionProvider connectionProvider;
    
    public ArrayList<SinhVien> getAll(){
        ArrayList<SinhVien> listSinhVien = new ArrayList<>();
        String sql = "SELECT * FROM SINHVIEN";
        try(Connection conn = ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                SinhVien sinhVien = new SinhVien();
                sinhVien.setId(rs.getInt("ID"));
                sinhVien.setHoTen(rs.getString("HOTEN"));
                sinhVien.setTuoi(rs.getInt("TUOI"));
                sinhVien.setDiaChi(rs.getString("DIACHI"));
                sinhVien.setTrangThai(rs.getString("TRANGTHAI"));
                listSinhVien.add(sinhVien);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return listSinhVien;
    }
    
    public Boolean addSV(SinhVien sinhVien){
        String sql = "INSERT INTO SINHVIEN(ID, HOTEN, DIACHI, TUOI, TRANGTHAI) VALUES (?, ?, ?, ?, ?)";
        try(Connection conn = ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setObject(1, sinhVien.getId());
            ps.setObject(2, sinhVien.getHoTen());
            ps.setObject(3, sinhVien.getDiaChi());
            ps.setObject(4, sinhVien.getTuoi());
            ps.setObject(5, sinhVien.getTrangThai());
            
            int kq = ps.executeUpdate();
            if(kq > 0){
                return true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public Boolean delete(int id, SinhVien sinhVien){
        String sql = "DELETE FROM SINHVIEN WHERE ID = "+id;
        try(Connection conn = ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            int kq = ps.executeUpdate();
            if(kq > 0){
                return true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
     public Boolean update(int id, SinhVien sinhVien){
        String sql = "UPDATE SINHVIEN SET HOTEN = ?, DIACHI = ?, TUOI = ?, TRANGTHAI = ? WHERE ID = ?";
        try(Connection conn = connectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setObject(5, sinhVien.getId());
            ps.setObject(1, sinhVien.getHoTen());
            ps.setObject(2, sinhVien.getDiaChi());
            ps.setObject(3, sinhVien.getTuoi());
            ps.setObject(4, sinhVien.getTrangThai());
            
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
