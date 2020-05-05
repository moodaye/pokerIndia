# pokerIndia
Software to support multiple forms of poker including 3 card poker (teen patti). 

## SubSystems
  #### Interface
  #### Game Logic
  #### Security
## Functional Specifications
  #### Game Lifecycle
  #### Hand Lifecycle
  #### Player Lifecycle
  #### Betting Logic
## Architecture
  #### Cloud Architecture
  #### Microservice Modules
  #### State 
  #### Angular (User Interface)
## MVP
  * 3 card face up (open) teen pati - but dealer controls the hand and the game.
  * Dealer: Constant. Triggers dealing. 
  * Players: 2 (Including dealer)
  * Use Case 1: Intiate a game
    * Dealer initiates game by clicking on a button on the website
    * Dealer receives a url for the game.
    * UI shows dealer ready for game
    * Second player connects with the url (Dealer needs to send this)
    * Dealer provides each player with the required $ value of chips
  * Use Case 2: Play a hand (Game Lifecycle)
    * TBD
  * System only had random dealing functionality. 
  * Players reponsible for determining legal moves; numbers of hole cards; etc.
  * No registration logic
  * No state beyond game lifecycle
