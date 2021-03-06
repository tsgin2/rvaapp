package com.rvaapp;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.evollu.react.fa.FIRAnalyticsPackage;
import com.BV.LinearGradient.LinearGradientPackage;
import com.otomogroove.OGReactNativeWaveform.OGWavePackage;
import com.brentvatne.react.ReactVideoPackage;
import com.futurice.rctaudiotoolkit.AudioPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new FIRAnalyticsPackage(),
            new LinearGradientPackage(),
            new OGWavePackage(),
            new ReactVideoPackage(),
            new AudioPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
