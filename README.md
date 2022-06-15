# Steps For Integrating Groovy In Java Application

  * First of all in pom.xml of the project in plugin section add the dependency
```
  <plugins>
     <plugin>
      <groupId>org.codehaus.gmavenplus</groupId>
      <artifactId>gmavenplus-plugin</artifactId>
      <version>1.7.0</version>
      <executions>
       <execution>
        <goals>
         <goal>execute</goal>
         <goal>addSources</goal>
         <goal>addTestSources</goal>
         <goal>generateStubs</goal>
         <goal>compile</goal>
         <goal>generateTestStubs</goal>
         <goal>compileTests</goal>
         <goal>removeStubs</goal>
         <goal>removeTestStubs</goal>
        </goals>
       </execution>
      </executions>
      <dependencies>
       <dependency>
        <groupId>org.codehaus.groovy</groupId>
        <artifactId>groovy-all</artifactId>
        <version>3.0.11</version>
        <scope>runtime</scope>
        <type>pom</type>
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
        <version>3.0.11</version>
      </dependency>

      <dependency>
        <groupId>javax.servlet</groupId>
        <artifactId>javax.servlet-api</artifactId>
        <version>3.0.1</version>
        <scope>provided</scope>
      </dependency>
```
  * And then we can check that the groovy is configured successfully by compiling it using a command in terminal "mvn -f pom.xml clean compile"
![image](https://user-images.githubusercontent.com/101263525/173828836-1d555eb2-670b-492d-9dac-6bb97f8a6026.png)


  * Creat a source folder named "src/main/groovy"
  * In this folder under a create a package groovy and under that package create a Groovy Class for example "Demo.groovy"
  * For testing groovy scripts 
```
      package udemyapp.groovy

        class Demo {
          String getMessage() {
            println "Your Groovy Integration was successfull."
            return "Your Groovy Integration was successfull."
          }
        }
```

  * And in that package we can create a Test.java file to test groovy code is working or not.
``` 
    package udemyapp.groovy

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


