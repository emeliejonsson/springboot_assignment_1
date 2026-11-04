cd /d "%~dp0"
start cmd /c "timeout /t 10 >nul & start http://localhost:8080/home"
mvnw.cmd spring-boot:run