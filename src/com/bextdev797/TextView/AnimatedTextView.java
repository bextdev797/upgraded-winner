package com.bextdev797.AnimatedTextView;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.AndroidViewComponent;
import com.google.appinventor.components.runtime.util.MediaUtil;
import android.view.View;
import android.widget.TextView;
import android.widget.FrameLayout;
import android.graphics.Typeface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ImageView;

public class AnimatedTextView extends AndroidNonvisibleComponent {
  private Context context;

  public AnimatedTextView(ComponentContainer container) {
    super(container.$form());
    context = container.$context();
  }

  @SimpleFunction
  public void CreateAnimatedTextView(AndroidViewComponent fLayout, String text, String typeface, String image, boolean imageWithTextView, float textSize, int textColor) throws Exception {
    View view = fLayout.getView();
    TextView tv = new TextView(context);
    Typeface t = Typeface.DEFAULT;
    tv.setText(text);
    tv.setTextSize(textSize);
    tv.setTextColor(textColor);
    switch(typeface){
      case "Default":
        t = Typeface.DEFAULT; 
        tv.setTypeface(t, Typeface.NORMAL);
        break;
      case "Serif":
        t = Typeface.SERIF;
        tv.setTypeface(t, Typeface.NORMAL);
        break;
      case "SansSerif":
        t = Typeface.SANS_SERIF;
        tv.setTypeface(t, Typeface.NORMAL);
        break;
      case "Monospace":
        t = Typeface.MONOSPACE;
        tv.setTypeface(t, Typeface.NORMAL);
        break;
      case "DefaultBold":
        t = Typeface.DEFAULT; 
        tv.setTypeface(t, Typeface.BOLD);
        break;
      case "SerifBold":
        t = Typeface.SERIF;
        tv.setTypeface(t, Typeface.BOLD);
        break;
      case "SansSerifBold":
        t = Typeface.SANS_SERIF;
        tv.setTypeface(t, Typeface.BOLD);
        break;
      case "MonospaceBold":
        t = Typeface.MONOSPACE;
        tv.setTypeface(t, Typeface.BOLD);
        break;
      case "DefaultItalic":
        t = Typeface.DEFAULT; 
        tv.setTypeface(t, Typeface.ITALIC);
        break;
      case "SerifItalic":
        t = Typeface.SERIF;
        tv.setTypeface(t, Typeface.ITALIC);
        break;
      case "SansSerifItalic":
        t = Typeface.SANS_SERIF;
        tv.setTypeface(t, Typeface.ITALIC);
        break;
      case "MonospaceItalic":
        t = Typeface.MONOSPACE;
        tv.setTypeface(t, Typeface.ITALIC);
        break;
      default:
        break;
    }

    if (imageWithTextView) {
      LinearLayout linearLayout = (LinearLayout) view;
      linearLayout.setOrientation(LinearLayout.HORIZONTAL);
      linearLayout.addView(tv);
      ImageView imageView = new ImageView(this.context);
      BitmapDrawable bitmapDrawable = MediaUtil.getBitmapDrawable(form, image);
      Bitmap bitmap = bitmapDrawable.getBitmap();  
      imageView.setImageBitmap(bitmap);
      linearLayout.addView(imageView);
    } else {
      FrameLayout frameLayout = (FrameLayout) view;
      frameLayout.addView(tv);
    }
  }

  @SimpleProperty
  public String DEFAULT(){
    return "Default";
  }

  @SimpleProperty
  public String SERIF(){
    return "Serif";
  }

  @SimpleProperty
  public String SANS_SERIF(){
    return "SansSerif";
  }

  @SimpleProperty
  public String MONOSPACE(){
    return "Monospace";
  }

  @SimpleProperty
  public String DEFAULT_BOLD(){
    return "DefaultBold";
  }

  @SimpleProperty
  public String SERIF_BOLD(){
    return "SerifBold";
  }

  @SimpleProperty
  public String SANS_SERIF_BOLD(){
    return "SansSerifBold";
  }

  @SimpleProperty
  public String MONOSPACE_BOLD(){
    return "MonospaceBold";
  }

  @SimpleProperty
  public String DEFAULT_ITALIC(){
    return "DefaultItalic";
  }

  @SimpleProperty
  public String SERIF_ITALIC(){
    return "SerifItalic";
  }

  @SimpleProperty
  public String SANS_SERIF_ITALIC(){
    return "SansSerifItalic";
  }

  @SimpleProperty
  public String MONOSPACE_ITALIC(){
    return "MonospaceItalic";
  }
}