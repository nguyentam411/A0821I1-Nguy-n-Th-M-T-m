package controller;

import model.Category;
import model.Color;
import model.Product;
import service.CategoryService;
import service.ColorService;
import service.ProductService;
import service.imp.CategoryServiceImp;
import service.imp.ColorServiceImp;
import service.imp.ProductServiceImp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/product")
public class ProductServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImp();
    private CategoryService categoryService = new CategoryServiceImp();
    private ColorService colorService = new ColorServiceImp();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                showFormCreate(request, response);
                // thêm mới
                break;
            case "edit":
                showEditForm(request, response);
                break;
            case "delete":
                showFormDelete(request, response);
//                break;
//            case "view":
//                showView(request, response);
//                break;
//            case "find_by_country":
//                showFormByCountry(request, response);
            default:
                showList(request, response);

        }

    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<Product> productList = productService.findAll();
        List<Color> colorList = colorService.findAll();
        List<Category> categoryList = categoryService.findAll();
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/product/list.jsp");
        request.setAttribute("productList", productList);
        request.setAttribute("categoryList", categoryList);
        request.setAttribute("colorList", colorList);
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void showFormDelete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productService.findById(id);
        List<Category> categoryList = categoryService.findAll();
        List<Color> colorList = colorService.findAll();
        request.setAttribute("colorList", colorList);
        request.setAttribute("categoryList", categoryList);

//        Category category=categoryService.findById(id);
        request.setAttribute("product", product);
//        request.setAttribute("category",category);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/product/delete.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productService.findById(id);
        List<Category> categoryList = categoryService.findAll();
        List<Color> colorList = colorService.findAll();
        RequestDispatcher dispatcher;
        request.setAttribute("product", product);
        request.setAttribute("categoryList", categoryList);
        request.setAttribute("colorList", colorList);
        dispatcher = request.getRequestDispatcher("view/product/edit.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        List<Category> categoryList = new CategoryServiceImp().findAll();
        List<Color> colorList = new ColorServiceImp().findAll();
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/product/create.jsp");
        request.setAttribute("categoryList", categoryList);
        request.setAttribute("colorList", colorList);
        try {
            requestDispatcher.forward(request, response);
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
                update(request, response);
                break;
            case "delete":
                delete(request, response);
                break;
            case "searchName":
                searchName(request, response);
                break;
            case "searchPrice":
                searchPrice(request, response);
                break;
            case "searchAll":
                searchAll(request,response);
            case "view":
//                view(request,response);
            case "find_by_country":
//                find(request, response);
            default:
                showList(request, response);
                // hien thi danh sách

        }

    }

    private void searchAll(HttpServletRequest request, HttpServletResponse response) {
        String name=request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        int colorId = Integer.parseInt(request.getParameter("colorId"));
        int categoryId = Integer.parseInt(request.getParameter("categoryId"));
        List<Product> productList = productService.findByAll(name,price,colorId,categoryId);
        List<Category> categoryList = categoryService.findAll();
        List<Color> colorList = colorService.findAll();
        request.setAttribute("categoryList", categoryList);
        request.setAttribute("colorList", colorList);
        request.setAttribute("productList", productList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/product/list.jsp");

        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void searchPrice(HttpServletRequest request, HttpServletResponse response) {
        int price = Integer.parseInt(request.getParameter("price"));
        List<Product> productList = productService.findByPrice(price);
        List<Category> categoryList = categoryService.findAll();
        List<Color> colorList = colorService.findAll();
        request.setAttribute("categoryList", categoryList);
        request.setAttribute("colorList", colorList);
        request.setAttribute("productList", productList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/product/list.jsp");

        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void searchName(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        List<Product> productList = productService.findByName(name);
        List<Category> categoryList = categoryService.findAll();
        List<Color> colorList = colorService.findAll();
        request.setAttribute("categoryList", categoryList);
        request.setAttribute("colorList", colorList);
        request.setAttribute("productList", productList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/product/list.jsp");

        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void save(HttpServletRequest request, HttpServletResponse response) {
//        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        float price = Float.parseFloat(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        int colorId = Integer.parseInt(request.getParameter("colorId"));
        int categoryId = Integer.parseInt(request.getParameter("categoryId"));
        Product product = new Product(name, price, quantity, colorId, categoryId);
        boolean check = productService.save(product);
        String mess = "thêm mới thành công";
        if (!check) {
            mess = "thêm mới không thành công";
        }
        request.setAttribute("mess", mess);
        try {
            response.sendRedirect("/product");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void update(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        float price = Float.parseFloat(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        int colorId = Integer.parseInt(request.getParameter("colorId"));
        int categoryId = Integer.parseInt(request.getParameter("categoryId"));
        Product product = productService.findById(id);
        RequestDispatcher dispatcher;
        product.setName(name);
        product.setPrice(price);
        product.setQuantity(quantity);
        product.setColorId(colorId);
        product.setCategoryId(categoryId);
        productService.update(id, product);
        request.setAttribute("product", product);
//            request.setAttribute("message", "Product information was updated");
        try {
            response.sendRedirect("/product");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productService.findById(id);
        RequestDispatcher dispatcher;
        productService.remove(id);
        try {
            response.sendRedirect("/product");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
