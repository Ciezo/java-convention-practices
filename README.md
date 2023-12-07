# Practicing and writing clean code documentation

I am going to practice (again) when writing code comments. I have multiple projects all over my repositories which 
are quite all over the place, but I must know that I have done some projects which are I deemed good and cool.

Now, I need to review my code and project files - take out which ones that are good and improve those which can be improved.

# Overview of Java commenting or documentation

Writing code is like writing a poem. Every Software Engineer has their own ways of making implementations to fulfill 
requirements, and so it is very important to put lines of comment in a <code>src</code> file for every Java class or methods.

> Remember, don't comment or explain what the code is doing, but rather tell why you implemented or wrote it.
> Moreover, providing some little contexts on what the code is doing is also very important but don't put long paragraphs 
> explaning everything.

# Format of a doc comment according to Oracle

> A doc comment is written in HTML and must precede a class, field, constructor or method declaration. It is made up of two parts -- a description followed by block tags. In this example, the block tags are @param, @return, and @see.


# What is semantic formatting

<b>Semantic Formatting</b> is the way an engineer follows convention, standardss, and general practices when writing code. For example, when we are using Python in a project, we should remember to write clean code according to Python standards. And in this case, we are trying to write code and use comments which are in-line with Oracle standards said from their documentation.


## More about semantic formatting

Semantic formatting refers to the practice of structuring and formatting your code in a way that aligns with the semantics, or meaning, of the code. This goes beyond just adhering to the syntactic rules of the language and focuses on making the code more readable and expressive. Here are some key aspects: 

1. Consistent Naming Conventions:

Meaningful names for variables, functions, and classes that reflect their purpose.
Consistent use of camelCase, PascalCase, or snake_case for different elements.
Indentation and Whitespace:

2. Consistent indentation to represent the structure of the code.

Proper spacing to enhance readability.
Use of whitespace around operators and keywords for clarity.

3. Commenting:

Clear and concise comments to explain complex logic or the purpose of certain code blocks.
Avoid unnecessary comments that state the obvious; focus on explaining why something is done rather than what is done.

4. Consistent Code Structure:

Group related code together.
Follow a consistent structure for classes, methods, and other code blocks.
Logical ordering of methods and members within a class.

5. Semantic HTML and CSS:

In web development, semantic HTML involves using tags that convey the meaning of their content (e.g header, nav, article)
In CSS, semantic classes and IDs can make styling more intuitive (e.g., using .error-message instead of .red-text).

6. Use of Design Patterns:

Implementing design patterns that convey the intention of the code and provide proven solutions to common problems.

7. Consistent Code Formatting:

Following a consistent code style across the entire project.

Utilizing automatic code formatters to enforce consistency.

8. Avoiding Magic Numbers and Strings:

Instead of using "magic" numbers or strings directly in the code, use constants or enums with meaningful names.
Semantic formatting aims to make code more readable and maintainable, reducing the cognitive load for developers. It facilitates collaboration among team members and makes it easier for others (or your future self) to understand and modify the code. It's not just about making the code look nice but ensuring that the structure and style enhance the communication of the code's purpose and functionality.

## Examples of Block tags

These are the comment block tags which I use to my projects. I found these tags helpful when reading and looking at my code.

<ul>
    <li>@author</li>
    <li>@note</li>
    <li>@description</li>
    <li>@date</li>
    <li>@return</li>
    <li>@param</li>
    <li>@method</li>
</ul>

However, there are official block tags according to Oracle:

<ul>
    <li>@param</li>
    <li>@returns</li>
    <li>@throws</li>
    <li>@see</li>
    <li>@depcrecated</li>
    <li>@since</li>
    <li>@version</li>
</ul>

# Dependencies

Java SE 20 

# References 
<small>This will be updated from time to time</small>

<ul>
    <a href="https://www.oracle.com/java/technologies/javase/codeconventions-comments.html">Java SE Comments from Oracle</a>
</ul>

# Contribution

You may create a pull request to improve my code and correct if there is any. I would be glad for that as I want to get much, much better in Java and following language conventions and practices.

![Visual Studio Code](https://img.shields.io/badge/Visual%20Studio%20Code-0078d7.svg?style=for-the-badge&logo=visual-studio-code&logoColor=white)
![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white) 
![Shell Script](https://img.shields.io/badge/shell_script-%23121011.svg?style=for-the-badge&logo=gnu-bash&logoColor=white)