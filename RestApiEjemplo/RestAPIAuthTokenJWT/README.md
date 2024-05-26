

<h4>Referencias</h4>


<a href="https://medium.com/@thecodebean/implementing-jwt-authentication-in-a-spring-boot-application-5a7a94d785d1">ejemplo 1</a>
<a href="https://www.bezkoder.com/spring-boot-jwt-mysql-spring-security-architecture/">ejemplo 2</a>
<a href="https://dev.to/abhi9720/a-comprehensive-guide-to-jwt-authentication-with-spring-boot-117p">ejemplo 3</a>
<a href="https://docs.spring.io/spring-security/reference/servlet/oauth2/resource-server/jwt.html">ejemplo 4</a>


<h4>pruebas</h4>

<code>

curl -H "Content-Type: application/json" -d '{"username":"fernando", "password":"password"}' -X POST http://localhost:8080/login

curl -H "Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJmZXJuYW5kbyIsImV4cCI6MTcxNzU1OTI4Nn0.qJW1o7OzTJeSA-bYAEI1aecq30G6k4P3iq8nTCdYViKZnIS_HvNB5hkh8esvDoet6c1cwMdJ6MzA-Iev8UKPLg" -H "Content-Type: application/json" -X GET http://localhost:8080/protected

</code>