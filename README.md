Toasty - PhoneGap Toast Notification Plugin
===========================================

Shows an Android Toast Notification

* toast.showShort(message);
* toast.showLong(message);

Cancel an Android Toast Notification

* toast.cancel();

Supported Platforms
--------------------
* Android

Building
--------------------

### Setup
 * Apache Ant should be installed an on your path
 * The Android SDK must be installed installed.

Ant needs to know the location of the Android SDK.  The android tool will create a local.properties file.
	
	$ android update project -p .
	
### Build and install the Sample Application

    $ ant debug install

### Run the Sample Application

On the phone or simulator run **Toastify**

### Build the distribution

    $ ant dist

Adding Toasty to your project
------------------------------

These instructions assume your project is using PhoneGap-1.9

    $ cp dist/phonegap-toast.js into $YOUR_PROJECT/assets/www/
    $ cp dist/phonegap-toast.jar into $YOUR_PROJECT/lib

Add the following line to $YOUR_PROJECT/res/xml/plugins.xml

    <plugin name="Toasty" value="com.chariotsolutions.toast.plugin.ToastPlugin"/>

Include the JavaScript file in your HTML page

    <script type="text/javascript" charset="utf-8" src="phonegap-toast.js"></script>
	
Require the module in your code

    var toast = cordova.require('toast');
	