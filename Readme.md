# BlackJack

Basic Blackjack implementation with Java

## What is Blackjack

The goal of Blackjack is to amount your card values as near to 21 as possible without exceeding or 'busting' it. Moreover, you have to beat whatever hand both the dealer and other players have drawn; The player with a maximum card value wins the game. For example, if they have 20 and you have 19, you lose the hand.

## Understanding Hitting

"Hitting" is optional but could help you win the hand if your initial deal was a low value. It is requesting another card from the dealer. You may Hit any number of times in one turn. Do this until you are satisfied with your card total or bust.

## Understanding Staying

"Staying" is keeping the hand you've been dealt. It can be done as soon as you are satisfied with your card count.

## Rules for dealer

Dealers do not place bets, nor are required to play minimum. If the dealer's first two cards total less than 17, they are required to hit until their total is greater than 16. If initial totals are greater than 16, dealers are required to stay.

## Order of the game

* After the player has seen his card, The dealer shows his first card.
* Based on this card, players decide to hit or stay their hands.
* After each turn the player may decide to hit/stay.
* Once the player decides to stay or he busts, the dealer reveals their second card and the winner is decided based on the one with the highest card value
