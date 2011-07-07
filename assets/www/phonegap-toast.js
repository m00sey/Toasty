var Toasty = function() {
};

Toasty.prototype.showLong = function(message, win, fail) {
  PhoneGap.exec(win, fail, "Toasty", "show_long", [message]);
};

Toasty.prototype.showShort = function(message, win, fail) {
  PhoneGap.exec(win, fail, "Toasty", "show_short", [message]);
};

navigator.tp = new Toasty();