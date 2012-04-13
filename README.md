Toasty - PhoneGap Toast Notification Plugin
===========================================

Shows an Android Toast Notification

* navigator.toast.showShort(message);
* navigator.toast.showLong(message);

Cancel an Android Toast Notification

* navigator.toast.cancel();

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

These instructions assume your project is using PhoneGap-1.6

    $ cp dist/phonegap-toast.js into $YOUR_PROJECT/assets/www/
    $ cp dist/phonegap-toast.jar into $YOUR_PROJECT/lib

add the following line to $YOUR_PROJECT/res/xml/plugins.xml

    <plugin name="Toasty" value="com.chariotsolutions.toast.plugin.ToastPlugin"/>
