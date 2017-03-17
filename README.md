# Android Homework Two
In this task, I create a simple application to study the differences between two intents(explicit intent and implicit intent) and four activity launch modes(standard, singletop, singletask and singleinstance)

## MainActivity
- There are five buttons in MainActivty.
- Click first button to open a website by an implicit intent.
- Click other buttons to start activities in different launch modes.
  Noticed that only the standard mode activity is started by implicit intent, other three acticities are started by explicit intents, you can see the differences in codes.
![](https://github.com/BIOTONIC/ActivityLaunchModeStudy/blob/master/Screenshots/Main.png)

## StandardActivity
- Every time you click the button, a new instance of standard activty will be created, which means that the same time of back button you need to click to return to MainActivity.
![](https://github.com/BIOTONIC/ActivityLaunchModeStudy/blob/master/Screenshots/Standard.png)

## SingleTopActivity
- When this activity is at the top, nothing will happen if you click the button.
![](https://github.com/BIOTONIC/ActivityLaunchModeStudy/blob/master/Screenshots/SingleTop.png)

## SingleTaskActivity
- Though it looks the same as singletop activity in the application, there is only one instance of this activity.
![](https://github.com/BIOTONIC/ActivityLaunchModeStudy/blob/master/Screenshots/SingleTask.png)

## SingleInstanceActivity
- It is obvious to see a singleinstance activity in the application. When this activity is created, the animation is easy to recognize: the blue toolbar together with the whole page will pop up from the bottom.
![](https://github.com/BIOTONIC/ActivityLaunchModeStudy/blob/master/Screenshots/SingleInstance.png)
