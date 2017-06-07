package ir.aligorji.persiandatetimepicker;


import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;


public class PersianDateTimePickerConfiguration
{

    private static int colorAccent = Color.WHITE;
    private static Typeface typefaceBold = Typeface.DEFAULT;

    public static Typeface getBoldFont()
    {
        return typefaceBold == null ? Typeface.DEFAULT : typefaceBold;
    }

    public static void setBoldFont(Context c, String path)
    {
        typefaceBold = Typeface.createFromAsset(c.getAssets(), path);
    }

    //=====

    private static Typeface typefaceNormal = Typeface.DEFAULT;

    public static Typeface getNormalFont()
    {
        return typefaceNormal == null ? Typeface.DEFAULT : typefaceNormal;
    }

    public static void setNormalFont(Context c, String path)
    {
        typefaceNormal = Typeface.createFromAsset(c.getAssets(), path);
    }

    public static int getColorAccent()
    {
        return colorAccent;
    }

    public static void setColorAccent(int colorAccent)
    {
        PersianDateTimePickerConfiguration.colorAccent = colorAccent;
    }
}
