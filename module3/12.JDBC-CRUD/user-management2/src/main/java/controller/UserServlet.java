package controller;

import model.bean.User;
import model.service.UserService;
import model.service.UserServiceImp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UserServlet", value = "/user")
public class UserServlet extends HttpServlet {
   private UserService userService=new UserServiceImp();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                showFormCreateUser(request, response);
                // thêm mới
                break;
            case "edit":
                showEditForm(request,response);
                break;
            case "delete":
                showFormDeleteUser(request,response);
                break;
            case "view":
                showView(request,response);
                break;
            default:
                showListUser(request, response);

        }
    }

    private void showListUser(HttpServletRequest request, HttpServletResponse response) {
        List<User> userList = userService.findAll();
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/user/list.jsp");
        request.setAttribute("userList", userList);
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void showView(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        User user=userService.findById(id);
        RequestDispatcher dispatcher;
        if(user == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("user", user);
            dispatcher = request.getRequestDispatcher("view/user/view.jsp");
        }
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormDeleteUser(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        User user=userService.findById(id);
        request.setAttribute("user", user);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("view/user/delete.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        User user=userService.findById(id);
        RequestDispatcher dispatcher;
        if(user == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("user",user);
            dispatcher = request.getRequestDispatcher("view/user/edit.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormCreateUser(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("view/user/create.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                save(request, response);
                // thêm mới
                break;
            case "edit":
                update(request,response);
                break;
            case "delete":
                delete(request,response);
                break;
            case "view":
//                view(request,response);
            default:
                showListUser(request, response);
                // hien thi danh sách

        }


    }

    private void save(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email=request.getParameter("email");
        String country=request.getParameter("country");
        User user=new User(id,name,email,country);
        boolean check= userService.save(user);
        try {
            response.sendRedirect("/user");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void update(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email=request.getParameter("email");
        String country=request.getParameter("country");
        User user=userService.findById(id);
        RequestDispatcher dispatcher;
        if(user == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            user.setName(name);
            user.setEmail(email);
            user.setCountry(country);
            userService.update(id,user);
            request.setAttribute("user", user);
            request.setAttribute("message", "User information was updated");
        }
        try {
            response.sendRedirect("/user");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        User user=userService.findById(id);
        RequestDispatcher dispatcher;
        if(user==null){
            dispatcher=request.getRequestDispatcher("error-404.jsp");
        }else {
           userService.remove(id);
            try {
                response.sendRedirect("/user");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
