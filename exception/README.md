# Exception Handling
 
 An exception is an unwanted or unexpected event, which occurs during the execution of a program i.e. at run time , that disrupts the normal flow of the program's instructions.

 ![Exception Heirarchy](https://tekslate.com/wp-content/uploads/2016/12/Screenshot_26.jpg) 

- The above photo shows the heirarchy of the exception 
- While checking the exception the specific exception must be checked first rather than general exception
	-if not done so then ureachable code is encountered

## Exception Blocks

>Try 

- This block is used to try the code that may cause exception and throws it

>catch

- This block is used to catch the exception thrown by try block and checks what type it is

>finally

- This block is used to run a set of code that has to be run no matter the method is exited or not

>throw

- This block is used to throw specific exceptions manually

>throws 

- This block is used to throw multiple exceptions manually
- It is done by using it besides the method definitions
- If a method with throw exception is used inside another method then the method alson must throw the exception
