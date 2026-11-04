# Running the application
## Double-click
Double click 'run.bat' in the project root

## From the terminal
In the project root, run:

**PowerShell:** 
`.\run.bat`

**Command Prompt:**
`run.bat`

## What the script does
1. Switches to the project directory
2. Starts the Spring Boot application using Maven wrapper
3. Automatically opens /home after 10 seconds

*Note:* The browser opens on a fixed timer, not when the app is actually ready. The page may fail to load if the app is still starting. If so, reload the page when the terminal shows the application has started.

## Quick links
* http://localhost:8080/home - home-page
* http://localhost:8080/booklist - shows all books
* http://localhost:8080/genre - shows all books with genre
* http://localhost:8080/genre?type=coming-of-age - shows only coming-of-age-books
* http://localhost:8080/genre?type=fantasy - shows only fantasy-books(none)