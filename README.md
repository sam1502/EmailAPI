https://circleci.com/gh/:owner/:repo.svg?style=shield&circle-token=:circle-token


# EmailAPI


You can download the project and then you'll have to put your emailID and password in the "applciaiton.properties" file under the resource folder.
You'll also have to allow less secure apps on your gamil account.




REST service to send Email using Spring Boot.
Input as JSON

Method: POST
Endpoint: http://localhost:8080/email/send

Input JSON: 
{
  "recipientEmailId": "emailid@gmail.com",
  "emailSubject": "Hello RSET API Test",
  "emailMessage": "Hello , hope you are doing good. API working :D"
}
