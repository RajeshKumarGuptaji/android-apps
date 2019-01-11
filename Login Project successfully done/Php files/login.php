<?php 
// Include connection file
require_once ("conn.php");
// Make object of class DBBontroller
$db_handle = new DBController();
// Get user Name and Password through post method
$user_name = $_POST['user_name'];
$user_pass = $_POST['password'];
// Make sql query
$mysql_qry ="select * from employee_data where username like '$user_name' and password like '$user_pass'";
// Call the numRosw function 
$results = $db_handle->numRows($mysql_qry);
// check result is zero or 1
if($results > 0) {
	echo "Login successfully";
}else{
	echo "Login not success";
}?>