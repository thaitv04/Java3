/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.Login;

/**
 *
 * @author thaitv
 */
public interface LoginService {
    
    ArrayList<Login> getList();
    
    String them(Login login);
    
    String delete(String maNV, Login login);
}
