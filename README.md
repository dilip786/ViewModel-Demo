# ViewModelDemo

When we are developing professional level android applications, One of the most common things we need to consider is configuration changes.

What are the configuration changes? Here are the few examples for configuration changes. 

* Screen Rotation
* Keyboard changes
* Language changes
* Multiwindow mode

When configuration change happens app has to destroy and recreate, as a result of that values created at running period of the activity also destroyed. ViewModel is best solution for this problem.

ViewModels creates in the memory when the activity creates and it lives until the activity cleared from the memory, Please see the lifecycle of the ViewModel.

# ViewModel Lifecycle

![diagram04_ViewModel](https://user-images.githubusercontent.com/10658016/66259702-ce7d2580-e7d1-11e9-9870-ca9515ba9a47.jpg)




 
