package funtionality_class;

import android.app.Activity;
import android.content.Context;

import com.actiontracker.mygoals.R;

public class Animationall {

    public void Animallforward(Context context) {
        ((Activity) context).overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_exit);;
    }

    public void Animallbackward(Context context) {
        ((Activity) context).overridePendingTransition(R.anim.trans_right_in, R.anim.trans_right_exit);
    }


}
