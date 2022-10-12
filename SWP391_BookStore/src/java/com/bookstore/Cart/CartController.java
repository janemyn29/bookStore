/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.Cart;

import com.bookstore.Book.Book;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class CartController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String action = request.getParameter("action");
            if(action.equals("Add to Cart")){
                HttpSession session = request.getSession(true);
                CartBean shop = (CartBean) session.getAttribute("SHOP");
                if(shop==null){
                    shop = new CartBean();
                }
                String bookName = request.getParameter("cboBook");
                Book book = new Book(bookName);
                shop.addBook(book);
                session.setAttribute("SHOP", shop);
                request.getRequestDispatcher("#").forward(request, response);
            }else if(action.equals("View Cart")){
                request.getRequestDispatcher("#").forward(request, response);
            }else if(action.equals("Add More")){
                request.getRequestDispatcher("#").forward(request, response);
            }else if(action.endsWith("Remove")){
                String[] list = request.getParameterValues("rmv");
                if(list!=null){
                    HttpSession session = request.getSession();
                    if(session!=null){
                        CartBean shop = (CartBean) session.getAttribute("SHOP");
                        if(shop!=null){
                            for(int i = 0; i<list.length ; i++){
                                shop.removeBook(list[i]);
                            }//end for
                            session.setAttribute("SHOP", shop);
                        }//end if shop
                    }//end if session
                }//end if list
                String url = "CartController?action=View Cart";
                request.getRequestDispatcher(url).forward(request, response);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
