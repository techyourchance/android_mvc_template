package com.techyourchance.android_mvc_tutorial.screens.smsdetails;

import com.techyourchance.android_mvc_tutorial.screens.common.ViewMvc;
import com.techyourchance.android_mvc_tutorial.sms.SmsMessage;

public interface SmsDetailsViewMvc extends ViewMvc {

    interface Listener {
        void onMarkAsReadClicked();
        void onNavigateUpClicked();
    }

    void hideMarkAsReadButton();

    void bindSmsMessage(SmsMessage smsMessage);

    void registerListener(Listener listener);
    void unregisterListener(Listener listener);

}
