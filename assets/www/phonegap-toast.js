if (!PhoneGap.hasResource("tp")) {
PhoneGap.addResource("tp");

var ToastPlugin = function() {
};

ToastPlugin.prototype.show_long = function(message, win, fail) {
  PhoneGap.exec(win, fail, "ToastPlugin", "show_long", [message]);
};

ToastPlugin.prototype.show_short = function(message, win, fail) {
  PhoneGap.exec(win, fail, "ToastPlugin", "show_short", [message]);
};

/**
 * <ul>
 * <li>Register the ToastPlugin Javascript plugin.</li>
 * <li>Also register native call which will be called when this plugin runs</li>
 * </ul>
 */
PhoneGap.addConstructor(function() {   
    if (typeof navigator.tp === "undefined") {
        navigator.tp = new ToastPlugin();
    }
});
}