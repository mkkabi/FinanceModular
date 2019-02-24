<?php
// required headers
header("Access-Control-Allow-Origin: *");
header("Content-Type: application/json; charset=UTF-8");
header("Access-Control-Allow-Methods: POST");
header("Access-Control-Max-Age: 3600");
header("Access-Control-Allow-Headers: Content-Type, Access-Control-Allow-Headers, Authorization, X-Requested-With");
 
// get database connection
include_once '../config/database.php';
 
// instantiate transaction object
include_once '../objects/transaction.php';
 
$database = new Database();
$db = $database->getConnection();
 
$transaction = new transaction($db);
 
// get posted data
$data = json_decode(file_get_contents("php://input"));
 
// make sure data is not empty
if(
    !empty($data->table_name) &&
    !empty($data->date) &&
    !empty($data->amount) &&
    !empty($data->description) &&
    !empty($data->source)
){
 
    // set transaction property values
    $transaction->table_name = $data->table_name;
    $transaction->date = date('Y-m-d H:i:s');
    $transaction->amount = $data->amount;
    $transaction->description = $data->description;
    $transaction->source = $data->source;
 
    // create the transaction
    if($transaction->create()){
 
        // set response code - 201 created
        http_response_code(201);
 
        // tell the user
        echo json_encode(array("message" => "transaction was created."));
    }
 
    // if unable to create the transaction, tell the user
    else{
 
        // set response code - 503 service unavailable
        http_response_code(503);
 
        // tell the user
        echo json_encode(array("message" => "Unable to create transaction."));
    }
}
 
// tell the user data is incomplete
else{
 
    // set response code - 400 bad request
    http_response_code(400);
 
    // tell the user
    echo json_encode(array("message" => "Unable to create transaction. Data is incomplete."));
}
?>
