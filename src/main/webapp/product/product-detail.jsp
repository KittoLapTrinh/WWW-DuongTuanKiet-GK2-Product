<%@ page import="com.example.wwwduongtuankietgk2product.models.Product" %>
<%@ page import="com.example.wwwduongtuankietgk2product.models.ProductPrice" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10/25/2024
  Time: 12:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>See Detail</title>
</head>
<body>
    <h1>Detail</h1>
    <%
        Product product = (Product) request.getAttribute("product");
        StringBuilder listProductStatus = new StringBuilder();
        for(ProductPrice pp:
                product.getProductPrices()){
            listProductStatus.append(pp);
        }
        System.out.println(listProductStatus);
    %>
    <table>
        <tr>
            <td>Id</td>
            <td><%=product.getId()%></td>
        </tr>
        <tr>
            <td>Description</td>
            <td><%=product.getDescription()%></td>
        </tr>
        <tr>
            <td>ManuFacturerName</td>
            <td><%=product.getManufacturerName()%></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><%=product.getName()%></td>
        </tr>
        <tr>
            <td>Unit</td>
            <td><%=product.getUnit()%></td>
        </tr>
        <tr>
            <td>List Product Price</td>
            <td><%=product.getProductPrices()%></td>
        </tr>
    </table>


</body>
</html>
