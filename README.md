# WanderingCape

*Wandering Cape* is a Fantasy Text based RPG inspired by old adventure games form the 1980s/90s.

## Wandering Cape Trailer

**The trailer video is a little outdated with the current build**

https://www.youtube.com/watch?v=P4LZjp4EgRU


## Background Story
You wake up in a tavern after a heavy night of drinking. You don't remember anything from last night, but the only thing you know is that you put on your cape and wander forth.

*Adventure awaits*


## Instruction

### To play the game you need to have
1. Java pre-installed
2. IDE to launch the game

### To launch the game follow this step-by-step
1. Fork the repository to your local device.
2. In the *Wandering Cape* repository open **src** -> **Game** -> **Game.java**
3. run **Game.main()**.(The game should start without a problem.
4. **Game.java** works the same way as if it was a **Main.java** (If you know how main.java works :D)

### After starting
The game is about reading the text to gather clues on what to do and choosing what to do through clicking choice buttons. The game will changes depending on what you do. Two different runs may have slight changes to them depending on which direction you go
1. Click "start game" (To proceed to the game)
2. Read story text (To get an understanding what is going on)
3. Choose one of four buttons with text to choose your action.

## Sources

### Resources for SFX

runescapeTheme
**LINK:** https://www.youtube.com/watch?v=C7Qo2QZ8NE8&t=23s

swordSlashSoundEffect
**LINK:** https://www.youtube.com/watch?v=RbU34j6QMOQ

### Resources for programming

general java turorial
**LINK:** https://www.w3schools.com/java/default.asp

javax.swing.* 
**LINK:** https://docs.oracle.com/javase/7/docs/api/javax/swing/package-summary.html

Enchanted switch statements
**LINK:** https://www.vojtechruzicka.com/java-enhanced-switch/

## Inspiration

QuestLord gameplay
**LINK:** https://www.youtube.com/watch?v=g0XVmo2pYzE

I used this as ground works to make it a multiple class programm and adding things of my own. Like the music, storyline, armor, weapons, etc.
Ryisnow
**LINK:** https://www.youtube.com/watch?v=G5yr4sekAI0&t=2s&ab_channel=RyiSnow
Much Love to Ryisnow check out his stuff.

## Things to Improve
1. Moving the playerAttack method perhaps into Player/IPlayer and monsterAttack into creature mold
2. The Player class can add things like armor and potion effect. Instead of it being a field value in Storyline defaultStatus() method
3. Splitting Storyline class into its own package and making classes for every direction. This will perhaps make it less cluttered in the Storyline class
4. Saving the previous method of a visited location in a variable so that it is to be access if the player decided to go back. This makes it so when you're creating scenarios you only need to write the variable instead of the actual previous position.
5. Also having a currentLocation variable so that when the player enters an area it is saved in the variable and then when going to another "location" the currenLocation -> previousLocation. Saving the old one.
6. When creating a new equipment. One need to change many different classes for it to work. (Not much work, but it is possible make less steps.)

## Additional information

There is a class diagram in the information folder/package

In the src -> Bugs-in-the-Game. Is used to play test the game. If I ever spotted a bug I added it to the list.

## Wandering Cape Road Map

1. Quests display
2. Expirance points
3. Inventory




