<%@ page import="com.example.wwwduongtuankietgk2product.models.Product" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.wwwduongtuankietgk2product.enums.ProductStatus" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10/24/2024
  Time: 10:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Product</title>
</head>
<body>
    <h1>List Product</h1>
    <table>
        <thead>
            <tr>
                <th>Product ID</th>
                <th>Description</th>
                <th>Manufacturer Name</th>
                <th>Name</th>
                <th>Unit</th>
                <th>Status</th>
            </tr>
        </thead>
        <tbody>
           <%
                List<Product> products = (List<Product>) request.getAttribute("product");
                int i = 1;
                for(Product p: products){
           %>
           <tr>
               <td><%=p.getId()%></td>
               <td><%=p.getDescription()%></td>
               <td><%=p.getManufacturerName()%></td>
               <td><%=p.getName()%></td>
               <td><%=p.getUnit()%></td>
               <td><a href="page?action=product-detail&id=<%=p.getId()%>">See Detail</a> </td>
           </tr>
           <%
                }
           %>
        </tbody>
    </table>

</body>
</html>
