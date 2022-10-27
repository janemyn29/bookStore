/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.Cart;

import com.bookstore.Order.Order;
import com.bookstore.Order.OrderDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class UpdateDetailOrder extends HttpServlet {

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
            throws ServletException, IOException, NoSuchAlgorithmException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            OrderDAO odao = new OrderDAO();
            HttpSession session = request.getSession();
            List<Cart> cart = (List<Cart>) session.getAttribute("cart");
            List<Order> list = odao.getOrderManage();
            int lastOrderID;
            int sizeList = list.size() - 1;
            lastOrderID = (int) (list.get(sizeList).getOrderID() + 1);

            int orderID = lastOrderID;

            for (Cart c : cart) {

                List<Order> list2 = odao.getOrderDetailManage();
                int lastOrderDetailID;
                int sizeList2 = list2.size() - 1;
                lastOrderDetailID = (int) (list2.get(sizeList2).getoDetailID() + 1);

                int oDetailID = lastOrderDetailID;

                long bookCode = c.getBook().getBookCode();

                int oDetailQty = c.getQty();

                int buyPrice = c.getBuyPrice();

                odao.addNewOrderDetail(oDetailID, bookCode, oDetailQty, buyPrice, orderID);
            }

            cart = null;
            session.setAttribute("cart", cart);
            request.getRequestDispatcher("cusOrders.jsp").forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UpdateDetailOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UpdateDetailOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
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
