<%@ page import="com.example.wwwduongtuankietgk2product.models.Product" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10/25/2024
  Time: 9:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Report 1</title>
</head>
<body>
    <h1>Filter Product By Status</h1><br>
    <form method="post">
        <label for="status"> Status
            <select id="status" name="status">
                <option name="TERMINATED" value="-1">TERMINATED</option>
                <option name="IN_ACTIVE" value="0">IN_ACTIVE</option>
                <option name="ACTIVE" value="1">ACTIVE</option>
            </select>
        </label>
        <button type="submit">View</button>
    </form>
    <div>
        <h1>List Product By Status</h1>
        <table>
            <thead>
                <tr>
                    <th>Product ID</th>
                    <th>Description</th>
                    <th>Manufacturer Name</th>
                    <th>Name</th>
                    <th>Unit</th>
                    <th>Status</th>
                    <th>Detail</th>
                </tr>
            </thead>
            <tbody>
               <%
                    List<Product> products = (List<Product>) request.getAttribute("product");
                    if(products != null){
                        for(Product p : products){
               %>
               <tr>
                   <td><%=p.getId()%></td>
                   <td><%=p.getDescription()%></td>
                   <td><%=p.getManufacturerName()%></td>
                   <td><%=p.getName()%></td>
                   <td><%=p.getUnit()%></td>
                   <td><%=p.getProductStatus()%></td>
                   <td><a href="page?action=product-detail&id=<%=p.getId()%>">See Detail</a> </td>
               </tr>
               <%
                        }
                    }
               %>
            </tbody>
        </table>
    </div>


</body>
</html>
