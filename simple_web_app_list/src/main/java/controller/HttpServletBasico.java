/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UsuarioService;
import model.Usuario;
import java.util.List;
/**
 *
 * @author fabriciogmc
 */
@WebServlet({"*.action","/"})
public class HttpServletBasico extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req,
                       HttpServletResponse res){
        
        String path = req.getServletPath();
        ServletContext sc = req.getServletContext();
		UsuarioService us = new UsuarioService();
		List<Usuario> users = us.list();			
		req.setAttribute("users", users);
        switch (path){
            case "/":
               try{
                    sc.getRequestDispatcher("/jsp/list.jsp").forward(req, res);
                } catch (Exception e){}
               break;
            default:
                try{
                   sc.getRequestDispatcher("/jsp/nao_encontrado.jsp").forward(req, res);
                }catch (Exception e){}               
        }
        
    }  
}