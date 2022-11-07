/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.Cart;

import com.bookstore.Account.Account;
import com.bookstore.Book.Book;
import com.bookstore.Book.BookDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author Admin
 */
public class CusAddShoppingController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String action = request.getParameter("action"); //lay action
            HttpSession session = request.getSession(); // new session
            List<Cart> cart = new ArrayList<Cart>();    // goi list cart
            BookDAO b = new BookDAO();  // goi dao
            String bookCode = request.getParameter("bookCode"); // lay ma sach
            long ibookCode = Long.parseLong(bookCode);
            //List<Book> list = new ArrayList<Book>();
            if (action == null) { // sai action
                request.getRequestDispatcher("cushome").forward(request, response);
            } else {
                if (action.equals("addToCart")) { // them sach vao cart
                    if (session.getAttribute("cart") == null) { // cart rong
                        cart.add(new Cart(b.getBookBybookCode(request.getParameter("bookCode")), 1));

                    } else { // add cung 1 cuon sach
                        cart = (List<Cart>) session.getAttribute("cart");
                        int index = isExisting(ibookCode, cart);
                        if (index == -1) {
                            cart.add(new Cart(b.getBookBybookCode(request.getParameter("bookCode")), 1));
                        } else {
                            int quantity = cart.get(index).getQty() + 1;
                            cart.get(index).setQty(quantity);
                        }
                    }
                    //tinh discount sach
                    for (int i = 0; i < cart.size(); i++) {
                        int discountPercent = b.getDisCountByBookCode(request.getParameter("bookCode"));
                        Book book = b.getBookBybookCode(request.getParameter("bookCode"));
                        Book book2 = b.getBookBybookCodeV2(request.getParameter("bookCode"));
                        if (discountPercent > 0) {// sach co discount
                            for (Cart c : cart) {
                                if (book.getBookCode() == (book2.getBookCode())) {
                                    int tmp = c.getBook().getBuyPrice();
                                    int tmp2 = c.getBook().getBuyPrice() * discountPercent / 100;
                                    int ibuyPrice = tmp - tmp2;
                                    c.setBuyPrice(ibuyPrice);
                                    ibuyPrice = +ibuyPrice;
                                    session.setAttribute("ibuyPrice", ibuyPrice);
                                }
                            }
                        } else if (discountPercent == 0) { // sach ko discount
                            bookCode = request.getParameter("bookCode");
                            for (Cart c : cart) {
                                if (String.valueOf(c.getBook().getBookCode()).equals(String.valueOf(bookCode))) {
                                    int ibuyPrice = c.getBook().getBuyPrice();
                                    c.setBuyPrice(ibuyPrice);
                                    break;
                                }
                            }
                        }
                    }

                    int totalPrice = totalPrice(cart);
                    session.setAttribute("totalPrice", totalPrice);// set tong tien

                    session.setAttribute("cart", cart);
                    Account acc = (Account) session.getAttribute("acc");
                    if (acc == null) {
                        request.getRequestDispatcher("shopping?index=1").forward(request, response);
                    } else {
                        request.getRequestDispatcher("cusshopping?index=1");
                    }
                }
                session.setAttribute("cart", cart);
                request.getRequestDispatcher("shopping?index=1").forward(request, response);;
            }
        }
    }

    private int isExisting(long bookCode, List<Cart> cart) { // kiem tra sach exist
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getBook().getBookCode() == bookCode) {
                return i;
            }
        }
        return -1;
    }

    private int totalPrice(List<Cart> cart) { // tinh tong tien
        int totalPrice = 0;
        for (Cart c : cart) {
            totalPrice += c.getBuyPrice() * c.getQty();
        }
        return totalPrice;
    }

//    public int totalBill(long bookCode, List<Cart> cart) {
//        for (int i = 0; i < cart.size(); i++) {
//            int total = cart.get(i).getBuyPrice() * cart.get(i).getQty();
//            int totalAll = +total;
//            return totalAll;
//        }
//        return 0;
//    }
//    public int totalAll() {
//        int totalAll = 0;
//        for (int i = 0; i < cart.size() ; i++) {
//
//        }
//
//        return 0;
//    }
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
