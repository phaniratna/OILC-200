<!DOCTYPE html>
<%@page import = "java.sql.*,java.util.*" %>
<%!
	    Connection con = null;
		ArrayList list = null;
		public void jspInit()
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojasemployees","root","root");
				System.out.println("Connected successfully " + con);
				Statement st = con.createStatement();
				ResultSet res = st.executeQuery("select pid from product");
				 list = new ArrayList();
				while(res.next())
				{
					list.add(res.getInt(1));
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor = wheat text = red>
<form action = Controller>
<center><h1>Delete Form</h1></center>

<input type = hidden name ="action" value ="Delete">

<table  border =1 align =center cellpadding = 10>
  <tr><td>Select Product Id:
   
	

  </td><td><select name =pno>
  <%
		for(int i = 0; i < list.size();i++)
		{
	%><option><%=list.get(i) %></option><%} %></select>
 </td></tr>
 <tr><td colspan = 2 align=center><input type =submit value = 'Delete Product'></td></tr>
 </table>
 </form>

</body>
</html>
