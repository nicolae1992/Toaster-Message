package md.test.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    public static void s1(Context c, String message) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
    }

    public static void sEncript(Context c ){
        String libString = c.getString(R.string.app_name);
        Toast.makeText(c, libString, Toast.LENGTH_SHORT).show();

    }
}
