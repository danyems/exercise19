<?php

## Connection to a MySQL Database:
## Please move to outside web root. Change database_connection.php to point to the directory which you moved your connection to

## What we need to connect (please change):
	// Host
	// Username
	// Password
	// Database Name
	
	//important!! please leave database connection variable as $dbc
	
	$dbc = @mysqli_connect('localhost','root','admin','metalims_demo') or die ('Could not connect to the database because:'.mysqli_connect_error());mysqli_query($dbc, "SET SESSION sql_mode = ''"); 
	
?>