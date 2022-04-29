# WanderingCape

*Wandering Cape* is a Fantasy Text based RPG inspired by old adventure games form the 1980s/90s.

## Background Story
You wake up in a tavern after a heavy night of drinking. You don't remember anything from last night, but the only thing you know is that you put on your cape and wander forth.
*Adventure awaits*


## Instruction

To play the game you need to have
1. Java pre-installed
2. IDE to launch the game

To launch the game follow this step-by-step
1. Fork the repository to your local device.
2. In the *Wandering Cape* repository open **src** -> **Game** -> **Game.java**
3. run **Game.main()**.(The game should start without a probelm)
4. **Game.java** works the same way as if it was a **Main.java**

## Sources

runescapeTheme
**LINK:** https://www.youtube.com/watch?v=C7Qo2QZ8NE8&t=23s

swordSlashSoundEffect
**LINK:** https://www.youtube.com/watch?v=RbU34j6QMOQ

## Inspiration

QuestLord gameplay
**LINK:** https://www.youtube.com/watch?v=g0XVmo2pYzE

## Things to Improve
1. Moving the playerAttack method perhaps into Player/IPlayer and monsterAttack into creature mold
2. The Player class can add things like armor and potion effect. Instead of it being a field value in Storyline defaultStatus() method
3. Splitting Storyline class into its own package and making classes for every direction. This will perhaps make it less cluttered in the Storyline class
4. Saving the previous method of a visited location in a variable so that it is to be access if the player decided to go back. This makes it so when you're creating scenarios you only need to write the variable instead of the actual previous position.
5. Also having a currentLocation variable so that when the player enters an area it is saved in the variable and then when going to another "location" the currenLocation -> previousLocation. Saving the old one.
6. 
