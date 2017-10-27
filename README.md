# Prometheus

## Intro
This text-based game programmed in Java assumes a character to experience 3 kinds of activities

* **Story** is the activity where the player is first displayed with an interactive story introduction, followed by one or more battles. The battles outcomes depend on the strength (health) of the character, his/her ammonition (weapon + armor) and a number of randomized factors. Same is applicable to enimies. Completing the story as a winner is associated with monetary reward. Loosing in at most one battle is the **game over** condition.

* **Tournament** is where the character can **gamble** to *boost* or *loose* previously gained money. The tournament has a number of **levels of hardness** where opponents of matching skill levels will gamble with the character. The outcome of every round is randomized. The character can leave the tournament at any time, but will not be able to return to the same level there after, s/he will have to start from the very beginning. From this perspective the biggest difference in levels is the associated reward. The lower the level the smaller reward (loss). The character will not be allowed to gamble on the particular level shoud s/he has not enough money to match the possible reward / loss. 

* **Shopping** is where the character can spend previously gained money (in story or tournament activity) and purchase ammonition for story battles. Better ammonition increases the chance of the winning, so the positive outcome of the story activity. 

## Problem Formulation
All 3 activities should be implemented as standalone Java modules that can be instantiated into the game. The player should be given an interface (likely menu driven) to enter/leave particular game activities. The character him/herself should be modeled as an object with certain ammonition, money, health, and other attributes. Starting up particular activity should be implemented as a call to method `go()` of the character class that would take an instance of the activity object. The variety of activities should be implemented as derived classes from a set of 3 base classes (one per each kind of activity).

## Solution Components
There must be 5 packages to contain classes for:
1. Game
1. Character
1. Story activity
1. Tournament activity
1. Shopping activity
