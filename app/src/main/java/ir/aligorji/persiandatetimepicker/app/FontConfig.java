package ir.aligorji.persiandatetimepicker.app;

import android.content.Context;
import android.support.v4.content.ContextCompat;

import ir.aligorji.persiandatetimepicker.PersianDateTimePickerTypeface;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

class FontConfig
{

    static void config(Context context)
    {
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                                              //.setDefaultFontPath("fonts/iran.sans.light.ttf")
                                              .setFontAttrId(R.attr.fontPath).build());

        PersianDateTimePickerTypeface.setDayHeader(context, context.getString(R.string.iran_sans_light));
        PersianDateTimePickerTypeface.setColorAccent(ContextCompat.getColor(context,R.color.colorAccent));

    }
}
