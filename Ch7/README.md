# Chapter 7

Chapter 7  Arrays and References
Up to this point, the only variables we have used were for individual values such as numbers or strings. In this chapter, you’ll learn how to store multiple values of the same type by using a single variable. This language feature will enable you to write programs that manipulate larger amounts of data.

For example, Exercise 5 asked you to check whether every letter in a string appears exactly twice. One algorithm (which hopefully you already discovered) loops through the string 26 times, once for each lowercase letter:

This “nested loops” approach is inefficient, especially when the string is long. For example, there are more than 3 million characters in War and Peace; to process the whole book, the nested loop would run about 80 million times.

Another algorithm would initialize 26 variables to zero, loop through the string one time, and use a giant if statement to update the variable for each letter. But who wants to declare 26 variables?

That’s where arrays come in. We can use a single variable to store 26 integers. Rather than use an if statement to update each value, we can use arithmetic to update the nth value directly. We will present this algorithm at the end of the chapter.
