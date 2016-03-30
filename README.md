# Bowling-Kata

Programming Problem
You are asked to implement an application which records the bowling scores for bowling game using Test-Driven approach. You only need to record the score for one player.  Your program should work properly for all the cases.
 
The simple requirements for bowling application are described as follows:
 
To write an application that keeps track of a bowling league. It needs to record the run-time score for the game of one player, with following simple bowling rules:
Bowling is played on a lane with at the end 10 pins that the player should knock down with a ball that he throws and makes roll on the lane.
The placing of the ten pins makes up what we call a frame.
The object of the game is to knock down as many pins as the player can.
A game is scored on a single line on the score sheet. The line is divided into 10 boxes or "frames".
Scoring of the game proceeds from left to right, with the running total of pins knocked down noted in each frame.
Counts of pins knocked down in each frame are also noted in the upper portion of the frame.  In each frame, the player can knock down at most 10 pins.
The player starts bowling each frame with all 10 pins standing. The player has two "throws" with which to knock down all 10 pins for the current frame.
If the player knocks down all the pins on the first throw, it's called a "strike". The number of pins knocked down with the next two throws is added as "bonus" points for this frame.
If the player knocks down all the pins on the second throw, it's called a "spare". The number of pins knocked down with the next throw will be added as "bonus" points for this frame.
If the player does not knock down all 10 pins in a frame with two throws, the number of pins knocked down is added to the running total, which is marked in the frame.
This counting may demand to play one or two extra throws to complete the score of the 10th frame (one extra throw in case of spare and two in case of strike). Extra throws means extra frames (two if the 10th frame is strike and the first extra throw is a strike to).
Hand in
For the assignment, you have to hand in an electronic copy of the source and testing result.
 
Remarks: You only need to handle one player for this application, and no interface is required.
Requirements
Test cases
perfect game with all strike, total score is 300
simple game with all throw with 3 pins down, total score is 60
simple game with one spare (4/6) in the middle, and others are 3 pins down, total score is 67
simple game with two continued spares (4/6) in the middle and others are 3 pins down, total score is 75
simple game with one strike in the middle and others are 3 pins down, total score is 70
simple game with two continued strikes in the middle and others are 3 pins down, total score is 87
simple game with one spare in the tenth frame, bonus is 10, and others are 3 pins down, total score is 70 (tenth frame is 10, then 3, then 3)
simple game with one strike in the tenth frame, each bonus is 10 and others are 3 pins down, total score is 84
a game with all spare (3/7) total score is 130
Test wrong input
with 15 for one throw
with two throws in the same frame bigger than 10
with letter input
Running total calculation
Documentation
command line and output documentation
Code documentation
Design if you are using OO
 
