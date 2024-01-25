node{
    stage('code checkout'){
       
        git 'https://github.com/vijayalakshmipushpendra/php-registeration-test-cases.git'
    }
    
    stage('build test scripts'){
        sh 'mvn clean package'
    }
    
    stage('run test scripts'){
        sh 'java -jar target/php-web-app-jar-with-dependencies.jar'
    }
    
}
