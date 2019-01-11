<?php
class DBController {
	private $host = "localhost";
	private $user = "id8216725_rajesh";
	private $password = "gupta@123";
	private $database = "id8216725_api";
	private $conn;
	public $msg;
	function __construct() {
		$this->conn = $this->connectDB();
	}
	/*Database connection function*/
	function connectDB() {
		$conn = mysqli_connect($this->host,$this->user,$this->password,$this->database);
		mysqli_set_charset($conn,"utf8");
		return $conn;
	}
	/*Insert Query function*/
	function insertQuery($query){
	    //if (mysqli_query($this->conn, $query)) {
		if ($this->conn->query($query)) {
	       $msg = "New record created successfully";
	    } else {
	       $msg = "Error: " . $sql . "" . mysqli_error($this->conn);
	    }
	    return $msg;
	}
	/*select Query function with Associative array*/
	function selectQuery($query) {
	    //$result = mysqli_query($this->conn,$query);
	    $result = $this->conn->query($query);
		while($row=mysqli_fetch_array($result)) {
			$resultset[] = $row;
		}		
		if(!empty($resultset))
			return $resultset;
	}
	/*Update Query function*/
	function updateQuery($query) {
		//if (mysqli_query($this->conn, $query)) {
		if ($this->conn->query($query)) {
	       $msg = "Updated successfully";
	    } else {
	       $msg = "Error: " . $sql . "" . mysqli_error($this->conn);
	    }
	    return $msg;
	}
	/*Count No of row of query*/
	function numRows($query) {
	    $result = $this->conn->query($query);
		$rowcount = $result->num_rows;
		return $rowcount;	
	}
}
?>