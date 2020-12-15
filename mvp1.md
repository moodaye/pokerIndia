MVP1:

12 player max table.
Texas holdem only



Host goes to website.
Website allows for entering name - Host enter name and submits
Receives a link for the game and a button to start the game.
Host can now send link to other players.

Once there are 2 players - the game can start. 
While only one person can control the game - the control can be transferred.

Games continues until the game is deliberately ended.


Game Lifecycle:  Game can start once there are more than 2 players.   Game ends when all players have left or someone deliberately ends the game.  The system will only allow a single game at any time.  A summary of players and respective losses and gains is provided at the end of the game.  THe buyin for any game is predetermined and constant for the system. There is a single controller at any one time.  Any player can take control of the game. 

Player lifecycle: One player needs to initiate the game. Player will jon a game once given a url.  Upon joining - the user will be provided with a predefined number of chips.  The player can sit out at any time and for any period of time.  The player can leave the game.  At this point - the player's' chips are cashed in and the table is informed of the players losses / gains.  A record is kept of the players losses / gains for a given game for the duration of the game.  If the player runs out of chips - the player can rebuy and original stack amount which is predefined.  If the player sits out - the big blind and small blinds are removed as required.

Hand Lifecyle:  The controller initiates the start of a hand.  The ssytem assigns the dealer. The system automatically deducts the sb and bb. The hand is controlled by the system once initiated.  The controller can step in and check or fold a player if the player is not responsive. The hand is completed once the final bets are placed after the river, or if all but one players have folded their hands.  Players options for the hand are locked until it is the players turn.  

The UI will be sofisticated. So it will have a clean look and feel and appropriate branding. The design is tbd.

To get something barebones going - now that we have a poc with websockets established - we could probably have a simple text based version to get things going. The text based system will have the following

------------------------------------------------------------------
[text box for bet] [bottons for fold or check]

<Name> <Chip Count> [D|SB|BB| ** [folder] [bet amnt]
<Name> <Chip Count> [D|SB|BB| ** ??
<Name> <Chip Count> [D|SB|BB| ** 
<Name> <Chip Count> [D|SB|BB| ** 
<Name> <Chip Count> [D|SB|BB| ** 

pot: 
[flop][turn][river]

-------------------------------------------------------------------

Next step:  Wireframe the text based game.
