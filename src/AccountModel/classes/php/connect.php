<?php
require_once("Java.inc");

$System = java("java.lang.System");
echo $System->getProperties();

if (isset($_POST['login']) && isset($_POST['password'])){
	echo $_POST['login']."\n";
	echo $_POST['password']."\n";
	echo "test";
	}

echo "adsfasdfasdf"."\n";
?>