# ViewModelDemo

When we are developing professional level android applications, One of the most common things we need to consider is configuration changes.

What are the configuration changes? Here are the few examples for configuration changes. 

* Screen Rotation
* Keyboard changes
* Language changes
* Multiwindow mode

When configuration change happens app has to destroy and recreate, as a result of that values created at running period of the activity also destroyed. ViewModel is best solution for this problem.

ViewModels creates in the memory when the activity creates and it lives until the activity cleared from the memory, Below is the lifecycle of the ViewModel.

# ViewModel Lifecycle

![diagram04_ViewModel](https://user-images.githubusercontent.com/10658016/66259702-ce7d2580-e7d1-11e9-9870-ca9515ba9a47.jpg)

## Dependencies

```
def lifecycle_ex_version = "2.1.0";

implementation "androidx.lifecycle:lifecycle-extensions:$lifecycle_ex_version"

```
# Demo
 
  <td>
    <p align="left">
  <img src="https://user-images.githubusercontent.com/10658016/66259768-0c2e7e00-e7d3-11e9-9870-c60099111058.gif?raw=true" alt="Home Page" width="300"/>
</p>

