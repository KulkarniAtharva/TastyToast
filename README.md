# 😋TastyToast 🍞 for Android 📱

📱 Android Library to implement Rich, Beautiful Toasts for your project with all Guidelines. Easy to use.

<a name="introduction"></a>
## Introduction
**TastyToast** library is built to implement fancy toasts in any Android app. This API will be useful to create rich, animated, beautiful Toasts in Android app easily. 

<a name="requirements"></a>
## Requirements
- AndroidX
- Minimum SDK API 19

<a name="implementation"></a>
## Implementation
Implementation of TastyToast 😋 library is so easy. You can check [/app](/app) directory for demo. Let's have look on basic steps of implementation.
In this demo, we will populate the menu contents by a menu resource file.
<a name="prerequisite"></a>
### Prerequisite
#### Gradle
In `build.gradle` of app module, include these dependencies.
```groovy
dependencies 
{
    // TastyToast library
    implementation 'dev.atharvakulkarni:TastyToast:1.1'
}
```

## Usage

All the programmatic way of implementation of TastyToast library is here.

<table style="width:100%">
  <tr>
    <th>Toast type</th>
    <th>Code</th> 
    <th>Preview</th>
  </tr>
  <tr>
    <td>Normal</td>
    <td>`TastyToast.normal(this,"This is a Normal Toast w/o icon",TastyToast.LENGTH_LONG); <BR><BR> 
         TastyToast.normal(this,"This is a Normal Toast w/o icon",R.drawable.android,TastyToast.LENGTH_LONG);`</td> 
    <td><img src="images/Normal.jpg" width="150" alt="normal toast"/></td>
  </tr>    
  <tr>
    <td>Simple</td>
    <td>This flag sets design to menu item of Navigation drawer as <b>Rounded Corners at right</b></td> 
    <td><img src="Images/RoundRightFull.png"/></td>
  </tr>
  <tr>
    <td>Success</td>
    <td>This flag sets design to menu item of Navigation drawer as <b>Rounded Rectangular Corners</b></td> 
    <td><img src="Images/RoundRectFull.png"/></td>
  </tr>  
  <tr>
    <td>Info</td>
    <td>This flag sets design to menu item of Navigation drawer as <b>Rounded Rectangular Corners</b></td> 
    <td><img src="Images/RoundRectFull.png"/></td>
  </tr>
  <tr>
    <td>Warning</td>
    <td>This flag sets design to menu item of Navigation drawer as <b>Rounded Rectangular Corners</b></td> 
    <td><img src="Images/RoundRectFull.png"/></td>
  </tr>
  <tr>
    <td>Confusing</td>
    <td>This flag sets design to menu item of Navigation drawer as <b>Rounded Rectangular Corners</b></td> 
    <td><img src="Images/RoundRectFull.png"/></td>
  </tr>
  <tr>
    <td>Error</td>
    <td>This flag sets design to menu item of Navigation drawer as <b>Rounded Rectangular Corners</b></td> 
    <td><img src="Images/RoundRectFull.png"/></td>
  </tr>  
</table>


<a name="contributing"></a>
## Contributing
Please fork this repository and contribute back using pull requests. <BR>
If you like this library, please do share with someone who need it.

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated but will be thoroughly reviewed .

<a name="contact"></a>
### Contact - Lets become friend

<ul>
  <li><a href = "https://kulkarniatharva.github.io/">Portfolio Website </a></li>
  <li><a href = "https://github.com/KulkarniAtharva">Github</a></li>
  <li><a href = "https://www.linkedin.com/in/atharva-kulkarni-146279187/">LinkedIn</a></li>
  <li><a href = "https://www.facebook.com/atharva.kulkarni.96343/">Facebook</a></li>
</ul>

Don't forget to star ⭐ the repo it motivates me to share more open source


<a name="donation"></a>
## Donation
If this project help you reduce time to develop, you can give me a cup of coffee :) or dinner 🍕 🍔 will also do 😜





<a name="license"></a>
## License
Project is published under the GPL-3.0 license. Feel free to clone and modify repo as you want, but don't forget to add reference to authors :)
