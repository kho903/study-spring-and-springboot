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

# Understading React Components
- First component typically loaded in React Apps : App Component
- Parts of a Component
	- View (JSX or JavaScript)
	- Logic (JavaScript)
	- Styling (CSS)
	- State (Internal Data Store)
	- Props (Pass Data)
- (Remember) React component names must always start with a capital letter

# Understanding State in React
- State : Build-in React object used to contain data or information about the component
- (REMEBER) In earlier versions of React, ONLY Class Components can have state
	- AND implementing state was very complex!
- Hooks were introduced in React 16.8
	- Hooks are very easy to use
	- useState hook allows adding state to Function Components

# Getting Started with JSX - Views with React
- React project use JSX for presentation
- Stricter than HTML
	- Close tags are mandatory
	- Only one top-level tag allowed:
		- Cannot return multiple top-level JSX tags
		- Wrap into a shared parent
			- `<div>...</div>` or `<>...</>` (empty wrapper)
- How is JSX enabled in a React project?
	- Different browsers have different support levels modern JS features (ES2015, ..., ES2022, ...)
		- How to ensure backward compatibility for your JS code?
		- Solution : Babel
		- Babel alse converts JSX to JS

# Let's play with Babel and JSX
- Let's try Babel : https://babeljs.io/
- Let's try JSX in our components
	- Parentheses () make returning complex JSX values easier
	- Custom Components should start with upper case letter
		- For HTML you should use small case
	- Specify CSS class - className
		- Simililar to HTML class attribute

# Let's follow JavaScript Best Practices
1. Each component in its own file (or module)
- src\components\learning-examples\FirstComponent.jsx
- Exercise: Move SecondComponent, ThirdComponent & FourthComponent to their own modules
- To use a class from a different module, you need to import it
	- Default import
		- import FirstComponent from './components/learning-examples/FirstComponent';
	- Named import
		- import { FifthComponent } from './components/learning-examples/FirstComponent';
2. Exercise: Create LearningComponent and move all code in App component to it!

# Digging Deeper into Components - Counter
- Parts of a Component
	- View (JSX or JavaScript)
	- Logic (JavaScript)
	- Styling (CSS)
	- State (Internal Data Store)
	- Props (Pass Data)
- Let's learn more about each of these building another simple example
	- A Counter App

# Understanding State in React
- State : Built-in React object used to contain data or information about the component
- (REMEMBER) In earlier versions of React, ONLY Class Components can have state
	- AND implementing state was very complex!
- Hooks were introduced in React 16.8
	- Hooks are very easy to use
	- useState hook allows adding state to Function Components
		- useState returns two things
			- 1. Current state
			- 2. A function to update state
	- Each instance of component has it's own state
	- How to share state between components?
		- Move state "upwards" (to a parent component)

# What's happening in the background with React?
- We updated the state => React updated the view
	- How can you update an HTML element?
		- A HTML page is represented by DOM (Document Object Model)
		- Each element in a HTML page is a node in the DOM
		- HOWEVER, writing code to update the DOM can be complex and slow!
	- React takes a different approach:
		- Virtual DOM : "virtual" representation of a UI (kept in memory)
			- React code updates Virtual DOM
		- React identifies changes and synchronizes them to HTML page
			- 1. React creates Virtual DOM v1 on load of page
			- 2. You perform an action
				- 3. React creates Virtual DOM v2 as a result of your action
				- 4. React performs a diff between v1 and v2
				- 5. React synchronizes changes (update HTML page)
- Summary : We are NOT updating the DOM directly!
	- React identifies changes and efficiently updates the DOM

# Exploring React props
- You can pass "props" (short for properties) object to a React Component
- Used for things that remain a constant during lifetime of a Component
	- Example increment Value of a specific component

