/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.Customer;

import com.bookstore.Category.Category;
import com.bookstore.Category.CategoryDAO;
import com.bookstore.Order.Order;
import com.bookstore.Order.OrderDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class CusEditNoteController extends HttpServlet {

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
            CategoryDAO daoC = new CategoryDAO();
            List<Category> listC = daoC.getCategoryBook();
            request.setAttribute("listC", listC);
            String note = request.getParameter("txtNote");
            OrderDAO odao = new OrderDAO();
            String id = request.getParameter("txtorderID");
            int orderID = Integer.parseInt(id);
            List<Order> listOrder = odao.getOrderDetailByorderID(orderID);
            if (note == null) {
                note = "(empty)";
                odao.updateNoteByOrderID(note, orderID);
                // lay list detail tu ham lay list theo id
                List<Order> listOrdetail = odao.getOrderDetailByorderID(orderID);
                // set attribute len
                request.setAttribute("listOrdetail", listOrdetail);
                //day du lieu va chuyen trang
                request.getRequestDispatcher("cusOrderDetails.jsp").forward(request, response);
            }
            odao.updateNoteByOrderID(note, orderID);
            List<Order> listOrdetail = odao.getOrderDetailByorderID(orderID);
            // set attribute len
            request.setAttribute("listOrdetail", listOrdetail);
            //day du lieu va chuyen trang
            request.getRequestDispatcher("cusOrderDetails.jsp").forward(request, response);
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
