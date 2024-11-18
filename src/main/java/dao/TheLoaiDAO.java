/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dao;

import context.DbContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.TheLoai;

/**
 *
 * @author ADMIN
 */
public class TheLoaiDAO {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    
    
    public ArrayList<TheLoai> getAll()
    {
        ArrayList<TheLoai> ds = new ArrayList<>();
        String sql = "select * from theloai";
        conn =new DbContext().getConnection();
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ds.add(new TheLoai(rs.getInt(1),rs.getString(2)));
            }
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.toString());
        }
        return ds;    
    }
    public ArrayList<TheLoai> getTop10() {
        ArrayList<TheLoai> ds = new ArrayList<>();
        String sql = "select top 6 * from theloai order by maloai desc";
        conn =new DbContext().getConnection();
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ds.add(new TheLoai(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.toString());
        }
        return ds;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        TheLoaiDAO tDAO = new TheLoaiDAO();
         for(TheLoai c: tDAO.getAll())
         {
             System.out.println(c);
         }
    }
    
}
