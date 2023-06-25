# Full Stack Architecture
- Fron-end : React Framework
	- Modern JavaScript
- Backend REST API : Spring Boot
- Database
	- H2 > MySQL
- Authentication
	- Spring Security (Basic > JWT)

# Why Full-Stack Architecture?
- Full Stack Architecture are complex to build
	- You need to understand different languages
	- You need to understand a variety of frameworks
	- You need to use a variety of tools
- Why Full-Stack?
	- Because they give you fleexibility and allow reuse of REST API
		- OPTION : Create a Mobile App talking to REST API
		- OPTION : Create an IOT App talking to REST API

# Quick Look into JavaScript History
- JavaScript evolved considerably in the last decade or so
	- (EARLIER JS Versions) Very difficult to write maintainable JavaScript code
	- Improved drastically in the last decade
		- ES5 - 2009
		- ES6 - 2015 - ES2015
		- ES7 - 2016 - ES2016
		- ...
		- ES13 - 2022 - ES2022
		- ES14 - 2023 - ES2023
	- ES : ECMASCRIPT
		- EcmaScript is standard
		- JavaScript is implementation
- GOOD NEWS : Writing Good JavaScript code is not so difficult :)

# Installing Node.js and npm
- Download node.js
	- Install latest version of Node.js
		- node --version
		- npm --version
	- Troubleshooting:
		- Google for "npm troubleshooting"
- npm : Package Manager for JavaScript
	- Similar to Maven/Gradle in Java world
	- npm init : Create new project
	- package.json : Your dependency definitions
	- Add a dependency:
		- npm install jquery
		- You don't need to download and manage versions
	- node_modules : Downloded dependencies (temp)

# What is React?
- React : One of the most popular JavaScript libraries to build SPA (Single Page Applications)
	- Popular alternatives : Angular, VueJS
- Open-source project created by Facebook
- Component-Based
- Mostly used to build front-end web SPA applications
	- Can also be used to create native apps for Android, iOS (React Native)

# Creating React App with Create React App
- Create Reace App : Recommended way to create a new single-page application(SPA) using React
	- Compatiable with macOS, Windows, Linux
	- Prerequisite : Latest version of Node JS
		- NPM - package manager : Install, delete, and update JS package (npm --version)
		- NPX - package executer : Execute JS packages directly, without installing
	- Let's start
		- cd frontend
		- npx create-react-app todo-app
		- cd todo-app
		- npm start

# Important Command
- npm start : Runs the app in development mode
	- Recommendation : Use Google Chrome
- npm test : Run unit tests
- npm run build : Build a production deployable unit
	- Minified
	- Optimized for performance
- npm install --save react-router-dom : Add a dependency to my project

# Visual Studio Code - Tips
- Toggle Explorer
	- Cmd B
- Explore Left Hand Side Bar
	- Search etc
- Make a change to index.html
	- Change Title
- Make a change to App.js
	- Remove everything in App div
	- Add My Todo Application
- How is the magic happening?
	- Create React App
	- Automatically builds and renders in the browser

# Exploring Create React App Folder Structure
- Goal : Get a 10,000 feet overview of folder structure
	- README.md : Documentation
	- package.json : Define dependencies (similar to Maven pom.xml)
	- node_modules : Folder where all dependencies are downloaded to
	- React Initialization
		- public/index.html : Contains root div
		- src/index.js : Initializes React App. Loads App Component.
			- src/index.css - styling for entire application
		- src/App.js : Code for App component
			- src/App.css - Styling for App component
			- src/App.test.js - Unit tests for App component
				- Unit test is right along side production code (Different to Java approach)

