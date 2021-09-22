# Reflections

## Shooting
The possible reasons for the man not dying:  
Gun didn't fire properly.  
Bullet missed a vital organ.  
Target was treated in time.  

## Alien
Grab toothbrush with your left hand  
Grab toothpaste with your right  
Turn off cap anti clockwise  
Push the tube to release toothpaste the size of your pinky nail onto the hairs of the toothbrush  
Put cap of toothpaste back on, turn clockwise  
Put toothpaste away  
Insert toothbrush with toothpaste into mouth  
Align toothbrush so hairs hit back teeth  
Rotate toothbrush around teeth  
Repeat for all teeth  
Spit out excess toothpaste  
Wash toothbrush  

# Thoughts

## What was positive and good about using TDD?
It makes it simple to know what you need to code to make the program work.

## What was annoying or difficult?
If you make a mistake when first creating the test it can be quite frustrating. In the converter assignment I had
to pre-calculate the answer with a desktop calculator that wouldn't round off decimals in the same manner as 
Intellij did it.

## What surprised you?
I've never actually used this style before. Also, I never tested a whole lot in my projects, unless it was part of
the assignment.

## Did TDD help you write some tests you wouldn’t otherwise have thought of?
I didn't think about it when writing the tests, but now i realize i haven't tested the largest of int values and
how to handle them. I only thought in thousands because it is the largest of roman numerals, but we 
wouldn't want the calculator to print 1.000 M's when giving it 1.000.000. We would probably want it to be handled
differently.

## Sidenote
I realize my solution for the roman numerals is messy, compared to what can be found of coding examples on the web.
Using maps or enums etc. would have been better, but i wouldn't have thought about this without googling.
But I do believe it should work properly nevertheless. It basicly divides the given value with each of the values
of the roman numerals one at a time, from top to bottom. It uses modulo to keep track of the remaining value through this cycle.
