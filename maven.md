# maven

Some tips on how to use maven.

## Dependencies

* Maven lets you require libraries (other code) as dependencies. A dependency is declared within the `pom.xml`. 
* The pom describes your project and anything your project needs to work successfully. 

## Running Maven

* The most common commands are:
  * `clean`: removes generated/compiled code (in a directory called `target/`)
  * `verify`: compiles your code and runs the tests (if you had any), and produces a `.jar` file under `target/`
  * `install`: same thing as verify, except moves that `jar` into a spot where other things on your machine can use it.