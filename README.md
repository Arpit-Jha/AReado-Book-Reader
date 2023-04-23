# AReado-Interactive-Book-Reader
AReado is an interactive book reader companion system developed to increase the interest of reading and learning for specially abled children. It mainly provides the usage of Augmented reality, Text detection and recognition, Text to speech and many other functionalities for the users. They can capture text and search for meanings, add comments and save them, download and experience the models provided for books and various other things using AReado. It also helps book readers to understand the content of the book properly with visual and graphical involvement. 
The app enables you to upload your PDF files to the app using <b> Google Firebase Storage </b> and allows you to retrieve them using <b> Firebase Realtime Database </b>.
It also involves an extensive Text Detection system with the help of <b> Android Vision </b>. The most attractive feature of the app is its AR Game made using Sceneform of <b> AR Core </b>.

### APK Download Link - https://github.com/Arpit-Jha/Interactive-Book-Reader/raw/master/APK%20-%20AReado.zip

### Used Technolgies
AReado app is based on Android Studio with many supporting libraries and tools. Android Studio version 3.5 was used as the integrated development environment.
Sceneform version 1.15.0 was used to Implement the augmented reality related functionalities of the application. It is an SDK developed by Google based on their ARcore platform, which enables to build augmented reality applications without the explicit usage of OpenGL libraries.
Apart from that Android Vision library for text detection, Android material design for UI implementation are the main support packages used in ‘AReado’. SQLite integration to Android is used to implement the local database which stores the details of downloaded books and content, saved words and comments.

## User Manual

### AReado Android App

<p align="center">
  <img src="https://github.com/Arpit-Jha/Interactive-Book-Reader/blob/6521d6a03963224f5ea36411cd8030d7a1555930/ReadMe%20content/light.jpg" height="500px" alt="Sublime's custom image"/>
  <img src="https://github.com/Arpit-Jha/Interactive-Book-Reader/blob/6521d6a03963224f5ea36411cd8030d7a1555930/ReadMe%20content/dark.jpg" height="500px" alt="Sublime's custom image"/>
</br><i>dark and light themes of main menu</i>
</p>
When you download and open our ‘AReado’ app you will be guided to the main menu with 6 buttons on screen. Without any books and content added you can’t enjoy the great experience provided by it.

#### Adding Books

You can add books and content to your library by selecting your file from your device or Google Drive.
Click on the "Plus" icon and then select the file.
Provide a suitable name to the file and then click on the Upload button.

#### Library

You can access all downloaded books and content through the library. To go to the library just click the ‘My Library’ button on the menu.
You can search a book by its title from the search bar.
If you long click a book the book will be selected and highlighted. Now you can click the ‘Remove’ button in red to delete the whole book or models of the book as required.
Click a book to enter the AR view of that book.

<p align="center">
  <img src="https://github.com/Arpit-Jha/Interactive-Book-Reader/blob/6521d6a03963224f5ea36411cd8030d7a1555930/ReadMe%20content/library.jpg" height="500px" alt="Sublime's custom image"/>
  <img src="https://user-images.githubusercontent.com/77734479/131717353-8e5cad79-604b-4bfb-b619-ba84f16fd6ea.png" height="500px" alt="Sublime's custom image"/>
</p>

#### Text Detection

<p align="center">
  <img src="https://github.com/chamikaCN/LIVRA-Interactive-Book-Reader/blob/master/ReadMe%20content/Screenshot_20200625-114011.png" height="500px" alt="Sublime's custom image"/>
</p>

Text detection is another functionality available in our app.
First you have to hold the text in front of the camera and click the capture button in the text detection interface.
All detected text will be displayed with three buttons at the bottom.
First button is the speak button. If you click the speak button whole detected text will be read out in the speak mode. 
But if you want to pronounce a single word or a phrase select it by long clicking it and then click the speak button.
Second button is the dictionary button.You can select a word and click the dictionary button to get the definitions of that word. You should be connected to the internet for this. After receiving definitions you can save the word for later reference.
Third button is the comment button from where you can save a comment on a selected phrase of detected text. The comment can also be linked with a book in the library.
#### Saved Items
From here you can access and search the previously saved words and comments as you like.
#### Alphabet Game

<p align="center">
  <img src="https://github.com/chamikaCN/LIVRA-Interactive-Book-Reader/blob/master/ReadMe%20content/Screenshot_20200625-114117.png" height="500px" alt="Sublime's custom image"/>
</p>

This is a small learning activity intended for small children to learn the alphabet with interaction.
Letter Placement
After you click the Alphabet Game button on the menu you will see an interface like AR view. You can place randomly selected letters all around you by tapping on the detected planes. The app will pronounce the placed letter giving children the chance to identify the letter.
If you click the Change Letter button you can select and fix a letter to be generated when you tap the screen again.
The Game
The Start Game button starts the activity. In this activity 6 random letters will be placed around you automatically and you have to select the relevant letter as the app's instructions. After all 6 letters are found the game will end.
#### Settings

<p align="center">
  <img src="https://github.com/Arpit-Jha/Interactive-Book-Reader/blob/6521d6a03963224f5ea36411cd8030d7a1555930/ReadMe%20content/Settings.jpg" height="500px" alt="Sublime's custom image"/>
</p>

On the settings popup you can adjust some criterias according to your preference.
Theme - you can change between light and dark themes.
Text size - you can set text size of detections to Small, Medium or Large.
Voice Support - if switched active app will read out all the toast messages you receive. It is mostly intended for small children.
Audio settings - you can adjust the pitch and the speed of the app's voice including speak mode and voice support.


