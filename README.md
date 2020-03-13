#SeinfeldTriviaQuiz
 Java Console App - Seinfeld Trivia Quiz 

This is a simple Java Console App I made for an Interviewer who likes Seinfeld.

You need only download the 3 .java files to a folder locally and compile in your IDE.

The app asks 5 Seinfeld trivia questions, then provides a score. Note there is a Seinfeld easter egg. :)
It uses a Collection/List to hold the pool of 20 questions that are randomized before each attempt. A class was used to represent each question and associated answers.
There is some data validation contained in the Console class. 
This was a quick demo so there is no exception handling built in.

CHALLENGE:
The challenge for me was to randomize the 20 questions and as each one was randomized and added to the collection, I had to ensure it was unique and had not already been picked. So each set of 5 questions should be unique. I made a collection of 20 so that I could expand the number of questions later. This random pick/unique to the set was a new thing I hadn't done before. My method is for sure not the most efficient, but it did work!

Next Steps:
Clean and optimize the method I use to insert random questions into collection and then check for uniqueness. I suspect a binary search or other search algorithim would be much better.
Have exception handling and error catching.
make question pool reside in a back-end MySql db.


Next Steps II:
Make a SPA web app
Use angular to make SPA. Pages that will CRUD question pool.
Make it pretty.


