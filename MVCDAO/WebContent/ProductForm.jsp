<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function validateForm(){
	if( document.prodform.pno.value == "" )
	   {
	     alert( "Please provide product number" );
	     document.prodform.pno.focus() ;
	     return false;
	   }
	   if( document.prodform.pname.value == "" )
	   {
	     alert( "Please provide product name" );
	     document.prodform.pname.focus() ;
	     return false;
	   }
	   if( document.prodform.price.value == "" )
	   {
	     alert( "Please provide prdouct price" );
	     document.prodform.price.focus() ;
	     return false;
	   }
}	
</script>
</head>
<body>
 <form action= Controller name = prodform 
 onsubmit="return validateForm()">
 <input type=hidden name ="action" value="Add">
 Enter Product No:<input type =text name =pno><br>
 Enter Product Name:<input type =text name =pname><br>
 Enter Product Price:<input type =text name =price><br>
 <input type = submit value = "AddProduct">
 </form>
</body>
</html>