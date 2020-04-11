package com.example.game2048;

import android.content.Context;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Card extends FrameLayout {
    private TextView lb;
    private int num = 0;

    public Card(Context context) {
        super(context);
        lb = new TextView(getContext());
        lb.setTextSize(32);
        lb.setGravity(Gravity.CENTER);
        LayoutParams lp = new LayoutParams(-1, -1);
        setBackgroundColor(0xffbbdd); // 设置整体背景
        lb.setBackgroundColor(0xDDDDDD);
        lb.setGravity(Gravity.CENTER);
        lp.setMargins(10, 10, 0, 0);
        addView(lb, lp);
        setNum(0);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
        lb.setText(num + "");
    }

    public boolean equals(Card o) {
        return getNum() == o.getNum();
    }
}
