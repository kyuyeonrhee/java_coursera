##### Getting Started with BlueJ
###### Reading: Module Learning Outcomes
**Fundamental Java Syntax and Semantics Module**
In this module, you will learn to write and run your first Java programs, including one program that prints “Hello!” in various countries’ languages and another where you will analyze the perimeters and other information of shapes. To accomplish these tasks, you will learn the basics of Java syntax and how to design stepwise solutions with programs.

By the end of this module, you will be able to:
- Download and run BlueJ, the Java programming environment for this course;
- Access the documentation for the Java libraries specially designed for this course;
- Edit, compile, and run a Java program;
- Construct methods, variables, if else statements, and for each loops in Java; and
- Use Iterables (like DirectoryResource) to run a program that iterates over multiples lines in a document or webpage or multiple files in a directory.



###### Video 1. Why Use Java?

Hi, in this lesson we're gonna introduce you to Java programming. In the BlueJ environment we use in this course to design, develop, test and run Java programs. Java is a popular and widely used language. It is the **foundation for the Android operating system** that powers more smart phones than any other system in the world. Java is an extremely useful and quite powerful language, with extensive support on almost every kind of computer. Java is also accessible to beginners, which is why we're using it in our courses. At the end of this lesson, you'll have experience with **BlueJ**, the development environment we use for programming with Java. You'll be able to use BlueJ to compile and run a java program. You'll know the basic design, edit, compile, and the execute cycle. That's part of programming with hundreds of different languages. And you'll see first hand how simple and powerful Java is, in accessing information that will print hello world in many languages. This is our take on a traditional first program. We'll explain that more as you begin your exploration of Java programming. So hola, mundo, konichiwa, nihao and hello world. Let's get started.



###### Reading: Course Programming Resources

###### Video 2. Using BleJ to Program in Java
Hello, world of learners. In this video we will look at how code is organized is Java, and how programs are executed by the computer. We will also demonstrate how to run programs in BlueJ, the programming environment you will use in this course.

<blockquote class="imgur-embed-pub" lang="en" data-id="a/VBZA2gf" data-context="false" ><a href="//imgur.com/a/VBZA2gf"></a></blockquote><script async src="//s.imgur.com/min/embed.js" charset="utf-8"></script>

Java is an **object oriented language**, this means *you'll use classes and objects* in writing your code. **Classes** are a way of organizing your programs, and **objects** are created using classes when your program runs. We'll learn more about objects, and object oriented programming, in the next course. Classes have a .java file extension. In a Java class, you will write one or more Java methods, instructions for your computer to carry out when you run the program. The code you write is called, source code. Source code is high level code, which is human readable, but not machine readable, so when I open this Java class here, I can read the Java program one of my fellow instructors wrote in it. Now, in order for the computer to run my program, my source code must be translated into low level byte code, which is machine readable. Byte code files have a .class file extension. This process of translating source code held inside classes into bytecode is called compilation. When you write Java programs, before you run your program you will need to compile it. So, where do you write this code that will eventually be run by the computer? Programmers write code in programming environments. In these courses, we'll be using a particular environment called BlueJ. We choose BlueJ because it's a great programming environment for novices. It allows you to start programming without
having to worry about editor complexities. And we've added some special features
that you'll use as you develop Java programs for this course. You're going to run your
first Java program. We're going to show you how to download it
from the Duke Learn to Program website, and then open up BlueJ,
and run the program. So I have the Duke Learn to
Program website up right here. And we're going to go to course two,
and click on there. There's lots of resources that we have
provided for you on this website. Since we're going to run a particular
project, we'll click on project resources. And here you can see our first program
called Hello World, The Blue J Project. I'm going to click on that, and that is
going to give you the Java program and the data file. So if you just click on that, it's a ZIP
file, a nd you will just unpack it and you'll have everything there. So I am now going to start BlueJ. So you should have
already installed BlueJ. I'm going to click here, and
BlueJ is going to start. And, for me, I've already got the program
there, but if you don't see it, you may have to click up here on project,
and open project, and you'll have to go to where your project
downloaded to, which folder it's in. Once you have it there
you'll see Hello World. So let's click on that and
see what's there. This is your Java file. And here you can see the code for this. I'm just going to scroll over so
we can see a little bit more. So this is a class, HelloWorld, and
it has one method in it called runHello. And this is very simple program. What we're going to do is,
we are just going to open up a file and we're going to print
every line in the file. Each line in the file is
a greeting from some country. So we're going to create a file resource,
and you can see, we're going to tie it to the file
called hello_unicode.txt. We are going to assign it to
a file resource called RES, and then what we're going to do is,
we're going to loop over the file, so we have a four loop where we are going to,
every time we call the file resource RES, res.lines, it gives us
another line from the file. We're going to assign that line
to the variable called line, and then you can see the line inside the four
loop is going to print that line. So that's what our program does. In order to run the program, we are going
to right click on Hello World here. You can see all the diagonal lines there, that means we haven't
compiled the program yet. You need to compile the program so
your computer can understand it. So we will right click here, and
there's a compile, so we'll compile it. If everything works good,
you see the slanted lines disappear, except for
just the two in the right corner, and then that means it's compiled,
it's created the class file, which is a machine readable code
that the computer understands. So now we can right click on that and
create an instance, or an object. You can give it whatever name you want,
I'm just going to leave that name there. And so, the object has been created and
now we can run it. So I'm going to right click on here, and you can see that method
runHello is right there. I'm going to run it. And, voila, we have just printed
all the lines from the file. And you can see all these
wonderful greetings here. We have hello, hallo, bonjour, guten tag, aloha,
all of these nice greetings. Now, I want to show you
where these come from. There is a file that you
are also downloading, and I have a copy of it right over here. Let's see. So this is the file,
hello_unicode.txt, and you can see the exact same
lines that we printed here. All here, bon jour, guten tag,
aloha, all of these are right here. So our program again, let me just
come back to our program, right here, again just real quick,
we open up the file, you saw the file, we go over the file,
we create a file resource and go through one line at a time in the file,
we grab the line, and we print the line. And that's it. So, hopefully, you've gotten your program
to run, your first Java program, and you've enjoyed it. Thank you.
