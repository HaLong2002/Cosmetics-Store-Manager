/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.Controller;

import icy.DAO.ThamSoChung_DAO;
import icy.Model.ThamSoChung_DTO;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ThamSoChung_Controller {
    public static ArrayList<ThamSoChung_DTO> dsts;
    ThamSoChung_DAO data=new ThamSoChung_DAO();
    public void DocTS(){
        if(dsts==null) dsts=new ArrayList<ThamSoChung_DTO>();
        dsts=data.DocTS();
    }
    public void sua(ThamSoChung_DTO ts){
       data.sua(ts);
    }
}
