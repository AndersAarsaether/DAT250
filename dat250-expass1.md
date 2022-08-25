# Software Technology Experiment Assignment 1

Running on a M1 Mac

### Installation
I already had Eclipse installed, so I did not download a new IDE. Downloading the JDK was simple enough, but I had some problems with making the JAVA_HOME elemental variable point to the JDK correctly. The problem was that I pointed to the outer JDK folder, rather than JDK/Contents/Home folder. Due to that problem, I also had some issues with Maven installation since a correct JAVA_HOME is a prerequisite for the Maven installation. I also had some problems with the terminal forgetting what I had put the variables to, so I made have to edit some startup scripts to set the variables there.

### Validating
I checked that everything was working by going through Heroku tutorial and running all of the commands. By doing that I validated Git, Maven and JDK. I also validated the PSQL installation as that was needed for the tutorial. I previously made a simple hello world program to validate my Eclipse installation.

### Problems with Heroku
The heroku tutorial was pretty smooth. I only had one problem with Maven which was that my JAVA_HOME pointed to a JRE, rather than a JDK. This was a solution found on StackOverflow as I did not get the JDK path to work due to the problems described under "Installation". Therefore I had to go back and resolve the paths before I could move on with the tutorial.

### Pending Issues
I need to find a better solution for elemental variables so that I dont need to write them into the terminal each time, but other than that I think everything is good to go. 

### URL for deployed Heroku App
https://floating-bayou-87728.herokuapp.com/
