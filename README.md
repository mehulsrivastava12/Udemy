# Steps For Integrating Groovy In Java Application

  * First of all in pom.xml of the project in plugin section add the dependency
```
  <plugins>
        <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-compiler-plugin</artifactId>
          <version>3.8.1</version>
          <configuration>
            <compilerId>groovy-eclipse-compiler</compilerId>
            <source>1.8</source>
            <target>1.8</target>
          </configuration>
          <dependencies>
            <dependency>
              <groupId>org.codehaus.groovy</groupId>
              <artifactId>groovy-eclipse-compiler</artifactId>
              <version>3.4.0-01</version>
            </dependency>
            <dependency>
              <groupId>org.codehaus.groovy</groupId>
              <artifactId>groovy-eclipse-batch</artifactId>
              <version>2.5.8-01</version>
            </dependency>
          </dependencies>
        </plugin>
  </plugins>
``` 
  * And in the dependencies tag add these two dependency after this update your project
```
      <dependency>
        <groupId>org.codehaus.groovy</groupId>
        <artifactId>groovy</artifactId>
        <version>2.5.8</version>
      </dependency>

      <dependency>
        <groupId>javax.servlet</groupId>
        <artifactId>javax.servlet-api</artifactId>
        <version>3.0.1</version>
        <scope>provided</scope>
      </dependency>
```
  * And then we can check that the groovy is configured successfully by compiling it using a command in terminal "mvn clean compile"
  ![image](https://user-images.githubusercontent.com/101263525/173765966-17fc5178-e1b3-416b-99b5-d3d609e3e216.png)

  * Creat a source folder named "src/main/groovy"
  * In this folder under a create a package groovy and under that package create a Groovy Class for example "Demo.groovy"
  * For testing groovy scripts 
```
      package learning.groovy

        class Demo {
          String getMessage() {
            println "Your Groovy Integration was successfull."
            return "Your Groovy Integration was successfull."
          }
        }
```

  * And in that package we can create a Test.java file to test groovy code is working or not.
``` 
    package learning.groovy

    public class Test {
      public static void main(String[] args) {
        Demo demo=new Demo();
        demo.getMessage();
        System.out.println(demo.getMessage());
      }
    }
```

  * The console should print like this

![image](https://user-images.githubusercontent.com/101263525/173770591-cd775fbb-1606-4a47-bb3c-27d3853a5bc4.png)


