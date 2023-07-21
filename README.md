# CM3110 Mobile App Development - Resit
Name: Kieran Rennie

Student ID: 1513955

## App Name: Hygiene Rating App

## App Description

### Promotion Text
Words - 12

Ever wondered if your favourite take away is clean? Look no further!

### Description
Words - 100

Do you love eating out? Do you ever wonder how clean are the establishments you dine at? Then this is the app for you! The Hygiene Rating App uses the UK Governments data to check establishment health ratings make it clear for you just how clean your favorite dining areas are. This app gives users access to Government approved data and can offer the below functionality:
-	View dining establishments within any location you choose
-	Review their last health inspection
-	Review their inspection scores
-	View the establishments contact details
-	Save your favorite establishments in a list


## App Design
Word count - Wireframe descriptions: 243

Word count - Wireframe image text: 251

Total design words: *494*

### Use case diagram
![image](https://github.com/kren23/BookApp_Assessment/assets/113984223/2a115c2d-b4e9-4dbc-a30b-7b5a989e6ff1)

## User Flows

### User flow - find book store
![image](https://user-images.githubusercontent.com/113984223/205882870-0d263127-1c72-4e9d-8c73-9533a83fb904.png)

### User flow - Search for book
![image](https://user-images.githubusercontent.com/113984223/205882941-d522f6e2-5015-438c-be72-119ad9e879da.png)

### User flow - Book overview
![image](https://user-images.githubusercontent.com/113984223/205883051-0f3d7d3b-e216-4fec-a0ee-57260d529042.png)

## Wireframes
The aim for all wireframes were to ensure simplicity of design. As reading is more popular with an older demographic it is highly likely that users that are not good with technology will use this app.

### Wireframe - Home/Landing page
![image](https://user-images.githubusercontent.com/113984223/205883237-f7781e96-51e2-4fcf-804c-473d985ba0fb.png)
The focus of the homepage is to be a simple and easy to use landing page where the user can access all functions from. Every function should also lead back to this.

### Wireframe - Find a book store
![image](https://user-images.githubusercontent.com/113984223/205883319-0b4942af-de27-4ca2-a23f-46ed9eca680b.png)
The focus of the search for a bookstore is that the user will see a map view of the location they enter. Once the location is entered there would then be information displayed via API about various book stores around the area they entered.

### Wireframe - Book search
![image](https://user-images.githubusercontent.com/113984223/205883410-09366012-c8c1-4bac-b04f-a6cec32443f9.png)
The focus of the book search is to link up the app with the OpenLibrary API. Depending on what the user searches, the OpenLibrary will return book information to the app for the user to view. Additionally there will be an option to save a book into your book overview. This would be an automated process and the book would be automatically imported to the book overview.

### Wireframe - Book overview
![image](https://user-images.githubusercontent.com/113984223/205883579-9cbdd650-2525-4e63-9ee6-b06572e44ffc.png)
The book overview page would be a hub for all the saved books. The user will be able to scroll over all the different instances of saved books that is saved to their profile. 

### Wireframe - Book overview - Adding/Editing book
![image](https://user-images.githubusercontent.com/113984223/205883662-915d7619-f382-4681-bc26-7dc909743645.png)
This page is what the user will see when adding or editing a book. This will contain all information required about the book. The only required field is book name.






# Testing overview
Word count not applicable


## UI Testing (XML Layouts)
### Activity Main
- Portrait: Pass
- Landscape: Pass

Notes: Bottom button may be cut off if someones phone screen is really thin when in portrait.

### Loading screen
- Portrait: Pass
- Landscape: Pass

Notes: Image is a little funky when screen gets moved. Seems to be fine when I test it multiple times but have had occasions where it just dissappears. 

### Book store search
- Portrait: Pass
- Landscape: Pass

Notes: Button always sticks to top left hand corner. 

### Book search
- Portrait: Pass
- Landscape: Pass

Notes: Button always sticks to top left hand corner. 

### Book overview
- Portrait: Pass
- Landscape: Pass

Notes: Add book button always sticks to top right

### Add book search
- Portrait: Pass
- Landscape: Pass

Notes: Text view/button successfully adapts with screen

### Book list progress
- Portrait: Pass
- Landscape: Pass

Notes: Text view/progress bar successfully adapts with screen

## Functionality Test - Navigation buttons

### Book overview button
Status: Fail

Notes: Something wrong and trying to figure it out. App crashes when you try to press the button. 

### Search for books button
Status: Pass

### Search for book store button
Status: Pass

### Home button
Status: Pass

Notes: Sometimes crashes app if clickes too quickly? I'm not sure why. Does loading the main activity force the entire app to load again?

# Reflective statement
Words: 250

Unfortunately looking back, this project was not a great success for myself. As an NESCol alumni, I was not previously taught any Java or had any introduction to Android Studio.  

Having no knowledge in the language we were going to use, I decided throughout the semester to take some time to learn Java. As a result of the Universities fast paced environment, I found myself often falling behind with course work due to me having to put in the extra work out with class to learn Java along with the new Android Studio software. Due to the amount of learning required for this topic, and my slow understanding of Java it was a steep learning curve for myself. I would often find myself in Lectures struggling to keep up with what the lecturer was doing and why they were doing it. Not due to anything the lecturer done but just due to my slow understanding because of the steep learning curve. 

Using Android Studio, could be quite frustrating and I was slow to learn it’s different functions. I found the UI very frustrating and overwhelming making it quite difficult to learn. The combination of trying to learn a brand new language at the same time as this complex software, I found quite difficult. 

Reflecting back, I would definitely like to have had a more foundational knowledge within Java before beginning the class. Additionally some extra time to adjust to both the new language and complex software would have been beneficial.

# Total word count: *829*
