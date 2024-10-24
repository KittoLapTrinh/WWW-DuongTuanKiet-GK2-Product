package com.example.wwwduongtuankietgk2product;

import com.example.wwwduongtuankietgk2product.models.Product;
import com.example.wwwduongtuankietgk2product.services.ProductService;
import com.example.wwwduongtuankietgk2product.services.impl.ProductServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "pageServlet", value = "/page")
public class PageServlet extends HttpServlet {
    private String message;

    public void init(){
        message = "Helloword!";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        try{
            String action = req.getParameter("action");
            if(action == null){
                PrintWriter out = resp.getWriter();
                out.println("<html><body>");
                out.println("<h1>"+message+"<h1>");
                out.println("</html></body>");
                return;
            }switch (action){
                case "home":{
                    PrintWriter out = resp.getWriter();
                    out.println("<html><body>");
                    out.println("<h1> Home </h1>");
                    out.println("</html></body>");
                }
                case "product":
                    handleActionProduct(req, resp);
                    break;
                case "product-detail":
                    handleActionProductDetail(req, resp);
                    break;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void handleActionProductDetail(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        long product_id = Long.parseLong(req.getParameter("id"));
        ProductService service = new ProductServiceImpl();
        Product product = service.getProductDetail(product_id);
        System.out.println(product);
        req.setAttribute("product", product);
        String page = "/product/product-detail.jsp";
        fowardToPage(page, req, resp);
    }

    private void handleActionProduct(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductService service = new ProductServiceImpl();
        List<Product> products = service.getAllProduct();
        req.setAttribute("product", products);
        String page = "/product/product.jsp";
        fowardToPage(page, req, resp);
    }

    private void fowardToPage(String page, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(page).include(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
