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

If your Android SDK is in /usr/local/android, create build.properties and set sdk.dir=/path/to/your/sdk

### Build and install the Sample Application

    $ ant install

### Run the Sample Application

On the phone or simulator run **Toastify**

### Build the distribution

    $ ant dist

Adding Toasty to your project
------------------------------

These instructions assume your project is using PhoneGap-1.0.

phonegap-toast.js can be modified to work with older version of PhoneGap if necessary. This is an exercise left to the reader.

    $ cp dist/phonegap-toast.js into $YOUR_PROJECT/assets/www/
    $ cp dist/phonegap-toast.jar into $YOUR_PROJECT/lib

add the following line to $YOUR_PROJECT/res/xml/plugins.xml

    <plugin name="Toasty" value="com.chariotsolutions.toast.plugin.ToastPlugin"/>
