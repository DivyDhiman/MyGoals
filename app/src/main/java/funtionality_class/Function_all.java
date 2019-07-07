package funtionality_class;

import android.widget.EditText;

/**
 * Created by Abhay dhiman
 */

public class Function_all {
    public boolean EmptyCheck_edittext(EditText editText) {
        if (editText.getText().toString().trim().length() > 0) {
            return false;
        } else {
            return true;
        }
    }
}
