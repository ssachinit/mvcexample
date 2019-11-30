<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
 
<html>
    <body>
        <h1 id="banner">Login to Security Demo</h1> 
        <form action="./auth" >
            <table>
                <tr>
                    <td>username:</td>
                    <td><input type='text' name='username' /></td>
                </tr>
                <tr>
                    <td>password:</td>
                </tr>
                    <td><input type='password' name='password'></td>
                <tr>
                    <td colspan="2">&nbsp;</td>
                </tr>
                <tr>
                    <td colspan='2'><input name="submit" type="submit">&nbsp;<input name="reset" type="reset"></td>
                </tr>
            </table>
        </form>
    </body>
</html>