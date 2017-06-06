package ir.aligorji.persiandatetimepicker;


import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;

/*
    Each call to Typeface.createFromAsset will load a new instance of the typeface into memory,
    and this memory is not consistently get garbage collected
    http://code.google.com/p/android/issues/detail?id=9904
    (It states released but even on Lollipop you can see the typefaces accumulate even after
    multiple GC passes)
    You can detect this by running:
    adb shell dumpsys meminfo com.your.packagenage
    You will see output like:
     Asset Allocations
        zip:/data/app/com.your.packagenage-1.apk:/assets/Roboto-Medium.ttf: 125K
        zip:/data/app/com.your.packagenage-1.apk:/assets/Roboto-Medium.ttf: 125K
        zip:/data/app/com.your.packagenage-1.apk:/assets/Roboto-Medium.ttf: 125K
        zip:/data/app/com.your.packagenage-1.apk:/assets/Roboto-Regular.ttf: 123K
        zip:/data/app/com.your.packagenage-1.apk:/assets/Roboto-Medium.ttf: 125K
*/
public class PersianDateTimePickerTypeface
{

    private static int colorAccent = Color.WHITE;
    private static Typeface typefaceDay = Typeface.DEFAULT;

    public static Typeface getDay()
    {
        return typefaceDay == null ? Typeface.DEFAULT : typefaceDay;
    }

    public static void setDay(Context c, String path)
    {
        typefaceDay = Typeface.createFromAsset(c.getAssets(), path);
    }

    //=====

    private static Typeface typefaceDayHeader = Typeface.DEFAULT;

    public static Typeface getDayHeader()
    {
        return typefaceDayHeader == null ? Typeface.DEFAULT : typefaceDayHeader;
    }

    public static void setDayHeader(Context c, String path)
    {
        typefaceDayHeader = Typeface.createFromAsset(c.getAssets(), path);
    }

    public static int getColorAccent()
    {
        return colorAccent;
    }

    public static void setColorAccent(int colorAccent)
    {
        PersianDateTimePickerTypeface.colorAccent = colorAccent;
    }
}
