package com.example.concretemixcalculator.utils;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.concretemixcalculator.databinding.ActivityNConvertBinding;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.github.mikephil.charting.utils.Utils;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class NConvert extends AppCompatActivity {
    private AdView adView;
    Button button;
    TextView r_cement;
    TextView r_chemical;
    TextView r_coarse;
    TextView r_fine;
    TextView r_flyash;
    TextView r_ggbs;
    TextView r_matakaoline;
    TextView r_rice;
    TextView r_silica;
    TextView r_water;
    Double v_volume;
    double ve_cement;
    double ve_chemical;
    double ve_coarse;
    double ve_fine;
    double ve_flyash;
    double ve_ggbs;
    double ve_matakaoline;
    double ve_rice;
    double ve_silica;
    double ve_water;
    TextView volume;
    ActivityNConvertBinding binding;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        binding = ActivityNConvertBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        final DecimalFormat decimalFormat = new DecimalFormat("#.###");
        decimalFormat.setRoundingMode(RoundingMode.CEILING);
        AudienceNetworkAds.initialize(this);
        this.adView = new AdView((Context) this, "857183438410901_857187765077135", AdSize.BANNER_HEIGHT_50);
        ((LinearLayout) binding.banner5Container).addView(this.adView);
        this.adView.loadAd();
        ActionBar supportActionBar = getSupportActionBar();
        TextView textView = new TextView(this);
        textView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        textView.setText("Result of Ordinary Concrete");
        textView.setTextColor(-1);
        textView.setTextSize(22.0f);
        supportActionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        supportActionBar.setCustomView((View) textView);
        this.volume = (EditText) binding.ivolume;
        this.button = (Button) binding.nget;
        this.r_cement = (TextView) binding.conCement;
        this.r_ggbs = (TextView) binding.conGgbs;
        this.r_flyash = (TextView) binding.conFlyash;
        this.r_matakaoline = (TextView) binding.conMatakaoline;
        this.r_rice = (TextView) binding.conRice;
        this.r_silica = (TextView) binding.conSilica;
        this.r_water = (TextView) binding.conWater;
        this.r_fine = (TextView) binding.conFine;
        this.r_coarse = (TextView) binding.conCoarse;
        this.r_chemical = (TextView) binding.conChemical;
        double doubleExtra = getIntent().getDoubleExtra("ff_cemnet", Utils.DOUBLE_EPSILON);
        this.ve_cement = doubleExtra;
        this.ve_cement = Double.valueOf(decimalFormat.format(doubleExtra)).doubleValue();
        double doubleExtra2 = getIntent().getDoubleExtra("m_ggbs", Utils.DOUBLE_EPSILON);
        this.ve_ggbs = doubleExtra2;
        this.ve_ggbs = Double.valueOf(decimalFormat.format(doubleExtra2)).doubleValue();
        double doubleExtra3 = getIntent().getDoubleExtra("m_flyash", Utils.DOUBLE_EPSILON);
        this.ve_flyash = doubleExtra3;
        this.ve_flyash = Double.valueOf(decimalFormat.format(doubleExtra3)).doubleValue();
        double doubleExtra4 = getIntent().getDoubleExtra("m_matakaoline", Utils.DOUBLE_EPSILON);
        this.ve_matakaoline = doubleExtra4;
        this.ve_matakaoline = Double.valueOf(decimalFormat.format(doubleExtra4)).doubleValue();
        double doubleExtra5 = getIntent().getDoubleExtra("m_rice", Utils.DOUBLE_EPSILON);
        this.ve_rice = doubleExtra5;
        this.ve_rice = Double.valueOf(decimalFormat.format(doubleExtra5)).doubleValue();
        double doubleExtra6 = getIntent().getDoubleExtra("m_silica", Utils.DOUBLE_EPSILON);
        this.ve_silica = doubleExtra6;
        this.ve_silica = Double.valueOf(decimalFormat.format(doubleExtra6)).doubleValue();
        double doubleExtra7 = getIntent().getDoubleExtra("m_water", Utils.DOUBLE_EPSILON);
        this.ve_water = doubleExtra7;
        this.ve_water = Double.valueOf(decimalFormat.format(doubleExtra7)).doubleValue();
        double doubleExtra8 = getIntent().getDoubleExtra("m_of_fine", Utils.DOUBLE_EPSILON);
        this.ve_fine = doubleExtra8;
        this.ve_fine = Double.valueOf(decimalFormat.format(doubleExtra8)).doubleValue();
        double doubleExtra9 = getIntent().getDoubleExtra("m_of_coarse", Utils.DOUBLE_EPSILON);
        this.ve_coarse = doubleExtra9;
        this.ve_coarse = Double.valueOf(decimalFormat.format(doubleExtra9)).doubleValue();
        double doubleExtra10 = getIntent().getDoubleExtra("m_chemical", Utils.DOUBLE_EPSILON);
        this.ve_chemical = doubleExtra10;
        this.ve_chemical = Double.valueOf(decimalFormat.format(doubleExtra10)).doubleValue();
        this.r_cement.setText(String.valueOf(this.ve_cement));
        this.r_ggbs.setText(String.valueOf(this.ve_ggbs));
        this.r_flyash.setText(String.valueOf(this.ve_flyash));
        this.r_matakaoline.setText(String.valueOf(this.ve_matakaoline));
        this.r_rice.setText(String.valueOf(this.ve_rice));
        this.r_silica.setText(String.valueOf(this.ve_silica));
        this.r_water.setText(String.valueOf(this.ve_water));
        this.r_fine.setText(String.valueOf(this.ve_fine));
        this.r_coarse.setText(String.valueOf(this.ve_coarse));
        this.r_chemical.setText(String.valueOf(this.ve_chemical));
        this.button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (NConvert.this.volume.getText().toString().isEmpty()) {
                    NConvert.this.v_volume = Double.valueOf(1.0d);
                } else {
                    NConvert nConvert = NConvert.this;
                    nConvert.v_volume = Double.valueOf(nConvert.volume.getText().toString());
                    NConvert nConvert2 = NConvert.this;
                    nConvert2.v_volume = Double.valueOf(decimalFormat.format(nConvert2.v_volume));
                }
                NConvert.this.r_cement.setText(String.valueOf(NConvert.this.ve_cement * NConvert.this.v_volume.doubleValue()));
                NConvert.this.r_ggbs.setText(String.valueOf(NConvert.this.ve_ggbs * NConvert.this.v_volume.doubleValue()));
                NConvert.this.r_flyash.setText(String.valueOf(NConvert.this.ve_flyash * NConvert.this.v_volume.doubleValue()));
                NConvert.this.r_matakaoline.setText(String.valueOf(NConvert.this.ve_matakaoline * NConvert.this.v_volume.doubleValue()));
                NConvert.this.r_rice.setText(String.valueOf(NConvert.this.ve_rice * NConvert.this.v_volume.doubleValue()));
                NConvert.this.r_silica.setText(String.valueOf(NConvert.this.ve_silica * NConvert.this.v_volume.doubleValue()));
                NConvert.this.r_water.setText(String.valueOf(NConvert.this.ve_water * NConvert.this.v_volume.doubleValue()));
                NConvert.this.r_fine.setText(String.valueOf(NConvert.this.ve_fine * NConvert.this.v_volume.doubleValue()));
                NConvert.this.r_coarse.setText(String.valueOf(NConvert.this.ve_coarse * NConvert.this.v_volume.doubleValue()));
                NConvert.this.r_chemical.setText(String.valueOf(NConvert.this.ve_chemical * NConvert.this.v_volume.doubleValue()));
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        AdView adView2 = this.adView;
        if (adView2 != null) {
            adView2.destroy();
        }
        super.onDestroy();
    }
}
