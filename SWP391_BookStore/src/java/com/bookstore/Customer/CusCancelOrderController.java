/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.Customer;

import com.bookstore.Book.BookDAO;
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
public class CusCancelOrderController extends HttpServlet {

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
            OrderDAO odao = new OrderDAO();
            String id = request.getParameter("orderID");
            int orderID = Integer.parseInt(id);
            String status = odao.checkOrderStatus(orderID);
            List<Order> list = odao.getListOrderDetailByOrderID(orderID);
            BookDAO b = new BookDAO();

            if (status.equals("confirming")) {
                for (Order o : list) {
                    int detailQuantity = o.getoDetailQty();
                    long bookCode = o.getBookCode();
                    int quanityBookInStore = b.getQuantityByBookCode(bookCode);
                    int quanityBookInStoreAfter = quanityBookInStore + detailQuantity;
                    b.updateQuantityBookByBookCode(quanityBookInStoreAfter, bookCode);
                }
                odao.updateOrderStatusByID(orderID);
                request.getRequestDispatcher("cusorderhome").forward(request, response);
            } else if (status.equals("delivering")) {
                request.getRequestDispatcher("cusorderhome").forward(request, response);
            } else if (status.equals("recieved")) {

            }
            request.getRequestDispatcher("cusorderhome").forward(request, response);
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
