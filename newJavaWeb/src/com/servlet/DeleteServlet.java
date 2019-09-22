package com.servlet;

import com.dao.UserDao;
import com.dao.UserDapImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteServlet")
public class DeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("id");
        int userId = Integer.parseInt(id);

        UserDao ud = new UserDapImpl();

        if(ud.delete(userId)){
            request.setAttribute("xiaoxi", "删除成功");
            request.getRequestDispatcher("/Searchall").forward(request, response);
        }else {
            response.sendRedirect("index.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
