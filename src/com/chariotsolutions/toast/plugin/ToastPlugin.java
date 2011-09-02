package com.chariotsolutions.toast.plugin;

import android.util.Log;
import android.widget.Toast;
import com.phonegap.api.Plugin;
import com.phonegap.api.PluginResult;
import com.phonegap.api.PluginResult.Status;
import org.json.JSONArray;
import org.json.JSONException;

public class ToastPlugin extends Plugin {

    private static final String TAG = "ToastPlugin";
    private static final String LONG_TOAST_ACTION = "show_long";
    private static final String CANCEL_ACTION = "cancel";
    private static final int TOAST_MESSAGE_INDEX = 0;

    private Toast toast = null;
    private String toastMessage;
    @Override
    public PluginResult execute(String pluginAction, JSONArray data, String callbackId) {
        Log.d(TAG, pluginAction);
        if (pluginAction.equals(CANCEL_ACTION)) {

            this.ctx.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (toast != null) toast.cancel();
                }
            });
        } else {
            try {
                toastMessage = data.getString(TOAST_MESSAGE_INDEX);
            } catch (JSONException e) {
                Log.e(TAG, "Required parameter 'Toast Message' missing");
                return new PluginResult(Status.ERROR);
            }

            if (pluginAction.equals(LONG_TOAST_ACTION)) {
                Log.d(TAG, "long?");
                this.ctx.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        toast = Toast.makeText(ctx, toastMessage, Toast.LENGTH_LONG);
                        toast.show();
                    }
                });
            } else {
                this.ctx.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        toast = Toast.makeText(ctx, toastMessage, Toast.LENGTH_SHORT);
                        toast.show();
                    }
                });
            }
        }

        return new PluginResult(Status.OK);
    }
}