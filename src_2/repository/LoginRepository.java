/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import model.Login;
import java.sql.*;

/**
 *
 * @author thaitv
 */
public class LoginRepository {

    ConnectionProvider connectionProvider;

    public ArrayList<Login> getAll() {
        String sql = "SELECT * FROM LOGIN";
        ArrayList<Login> listLogin = new ArrayList<>();
        try (Connection conn = ConnectionProvider.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Login login = new Login();
                login.setMaNV(rs.getString("MANV"));
                login.setHoTen(rs.getString("HOTEN"));
                login.setMatKhau(rs.getString("MATKHAU"));
                login.setVaiTro(rs.getInt("VAITRO"));
                listLogin.add(login);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listLogin;
    }

    public Boolean addNew(Login login) {
        String sql = "INSERT INTO LOGIN(MANV, HOTEN, MATKHAU, VAITRO) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConnectionProvider.getConnection(); 
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, login.getMaNV());
            ps.setObject(2, login.getHoTen());
            ps.setObject(3, login.getMatKhau());
            ps.setObject(4, login.getVaiTro());
            int kq = ps.executeUpdate();
            if(kq > 0){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public Boolean xoa(String maNV, Login login) {
        String sql = "  DELETE FROM LOGIN WHERE MANV = ?";
        try (Connection conn = ConnectionProvider.getConnection(); 
                PreparedStatement ps = conn.prepareStatement(sql)) {
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
}
