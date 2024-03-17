/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import model.Login;
import repository.LoginRepository;
import service.LoginService;

/**
 *
 * @author thaitv
 */
public class LoginServiceImpl implements LoginService{

    private LoginRepository loginRepository = new LoginRepository();
    
    @Override
    public ArrayList<Login> getList() {
        return loginRepository.getAll();
    }

    @Override
    public String delete(String maNV, Login login) {
        if (loginRepository.xoa(maNV, login)) {
            return "Xoa thanh cong";
        } else {
            return "Xoa that bai";
        }
    }

    @Override
    public String them(Login login) {
        if (loginRepository.addNew(login)) {
            return "Them thanh cong";
        } else {
            return "Them that bai";
        }
    }
    
}
