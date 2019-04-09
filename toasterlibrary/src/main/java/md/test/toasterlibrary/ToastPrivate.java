package md.test.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class ToastPrivate {

    private void showToaster(Context ctx){
      //  Toast.makeText(ctx,ctx.getString(mylib_app_name),Toast.LENGTH_LONG).show();
    }

    private static byte[] encrypt(byte[] raw, byte[] clear) throws Exception {
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = cipher.doFinal(clear);
        return encrypted;
    }

    private static byte[] decrypt(byte[] raw, byte[] encrypted) throws Exception {
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, skeySpec);
        byte[] decrypted = cipher.doFinal(encrypted);
        return decrypted;
    }
}
