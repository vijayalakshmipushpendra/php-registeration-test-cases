This repository exclusively houses the test-scripts for the PHP registration form application. 
The actual PHP registration form application resides in a separate repository, which can be accessed through the following link: "https://github.com/vijayalakshmipushpendra/php-registration.git"

Selenium has been employed for automation testing in this project.
Please ensure to update the application link within the test scripts to reflect the current location.

To facilitate ease of execution, I have utilized the Assembly plugin in Selenium.
This plugin, when invoked through the "mvn clean package" command, compiles the test scripts and their dependencies into a JAR file, conveniently located in the target folder. This JAR file can be executed using the command "java -jar" followed by the name of the generated JAR file.

For Maven project packaging, initiate the process with the command "mvn clean package."

Additionally, a Jenkinsfile has been committed to this repository to streamline automation processes.


+-----------------+             +--------------------------+
|      Start      |             |                          |
|                 |             |  Repository with Test    |
|                 +------------>|  Scripts for PHP          |
|                 |             |  Registration Form App   |
+-----------------+             |                          |
                               +------------+-------------+
                                            |
                                            v
                               +--------------------------+
                               |                          |
                               |  Update link in test     |
                               |  scripts to the PHP      |
                               |  Registration Form Repo  |
                               |                          |
                               +------------+-------------+
                                            |
                                            v
                               +--------------------------+
                               |                          |
                               |  PHP Registration Form   |
                               |  Application Repo        |
                               |                          |
                               +------------+-------------+
                                            |
                                            v
                               +--------------------------+
                               |                          |
                               |  Selenium for Automation  |
                               |  Testing                 |
                               |                          |
                               +------------+-------------+
                                            |
                                            v
                               +--------------------------+
                               |                          |
                               |  Assembly Plugin for     |
                               |  Packaging Test Scripts  |
                               |                          |
                               +------------+-------------+
                                            |
                                            v
                               +--------------------------+
                               |                          |
                               |  Execute "mvn clean       |
                               |  package" to create JAR  |
                               |  with Dependencies       |
                               |                          |
                               +------------+-------------+
                                            |
                                            v
                               +--------------------------+
                               |                          |
                               |  JAR File in "target"    |
                               |  Folder                  |
                               |                          |
                               +------------+-------------+
                                            |
                                            v
                               +--------------------------+
                               |                          |
                               |  Run JAR: "java -jar"    |
                               |  <JAR_File_Name>         |
                               |                          |
                               +------------+-------------+
                                            |
                                            v
                               +--------------------------+
                               |                          |
                               |  Jenkinsfile for         |
                               |  Jenkins Integration     |
                               |                          |
                               +--------------------------+
                                            |
                                            v
                               +--------------------------+
                               |                          |
                               |           End            |
                               |                          |
                               +--------------------------
