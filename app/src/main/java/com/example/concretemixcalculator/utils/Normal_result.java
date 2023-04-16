package com.example.concretemixcalculator.utils;

import static androidx.appcompat.app.ActionBar.DISPLAY_SHOW_CUSTOM;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import com.example.concretemixcalculator.R;
import com.example.concretemixcalculator.databinding.ActivityNormalResultBinding;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Normal_result extends AppCompatActivity {
    public int[] CHART_COLORFUL_COLORS = {Color.rgb(193, 37, 82), Color.rgb(255, 102, 0), Color.rgb(245, 199, 0), Color.rgb(106, 150, 31), Color.rgb(179, 100, 53), Color.rgb(215, 210, 79), Color.rgb(128, 128, 128), Color.rgb(255, 255, 51), Color.rgb(255, 128, 0), Color.rgb(106, 150, 31)};
    private AdView adView;
    Button normal;

    /* renamed from: r1 */
    TextView f76r1;
    TextView r_cement;
    TextView r_chemical;
    TextView r_coarse;
    TextView r_density;
    TextView r_fine;
    TextView r_flyash;
    TextView r_ggbs;
    TextView r_matakaoline;
    TextView r_rice;
    TextView r_silica;
    TextView r_water;
    TextView r_wc;
    double ve_cement;
    double ve_chemical;
    double ve_coarse;
    double ve_density;
    double ve_fine;
    double ve_flyash;
    double ve_ggbs;
    double ve_matakaoline;
    double ve_rice;
    double ve_silica;
    double ve_water;
    double ve_wc;

    ActivityNormalResultBinding binding;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        getSupportActionBar().setTitle((CharSequence) "Result of Standard Concrete");
        new DecimalFormat("#.###").setRoundingMode(RoundingMode.CEILING);
        super.onCreate(bundle);
        binding = ActivityNormalResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        AudienceNetworkAds.initialize(this);
        this.adView = new AdView((Context) this, "857183438410901_857187765077135", AdSize.BANNER_HEIGHT_50);
        ((LinearLayout) binding.nbannerContainer).addView(this.adView);
        this.adView.loadAd();
        ActionBar supportActionBar = getSupportActionBar();
        TextView textView = new TextView(this);
        textView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        textView.setText("Result of Ordinary Concrete");
        textView.setTextColor(-1);
        textView.setTextSize(22.0f);
        supportActionBar.setDisplayOptions(DISPLAY_SHOW_CUSTOM);
        supportActionBar.setCustomView((View) textView);
        PieChart pieChart = (PieChart) binding.mpiechart;
        ArrayList arrayList = new ArrayList();
        AudienceNetworkAds.initialize(this);
        this.r_cement = binding.cement;
        this.r_ggbs = binding.ggbs;
        this.r_flyash = binding.flyash;
        this.r_matakaoline = binding.matakaoline;
        this.r_rice = binding.rice;
        this.r_silica = binding.silica;
        this.r_water = binding.water;
        this.r_fine = binding.fine;
        this.r_coarse = binding.coarse;
        this.r_chemical = binding.chemical;
        this.r_wc = binding.rwcratio;
        this.r_density = binding.iDensity;
        this.ve_cement = getIntent().getDoubleExtra("ff_cemnet", Utils.DOUBLE_EPSILON);
        this.ve_ggbs = getIntent().getDoubleExtra("m_ggbs", Utils.DOUBLE_EPSILON);
        this.ve_flyash = getIntent().getDoubleExtra("m_flyash", Utils.DOUBLE_EPSILON);
        this.ve_matakaoline = getIntent().getDoubleExtra("m_matakaoline", Utils.DOUBLE_EPSILON);
        this.ve_rice = getIntent().getDoubleExtra("m_rice", Utils.DOUBLE_EPSILON);
        this.ve_silica = getIntent().getDoubleExtra("m_silica", Utils.DOUBLE_EPSILON);
        this.ve_water = getIntent().getDoubleExtra("m_water", Utils.DOUBLE_EPSILON);
        this.ve_fine = getIntent().getDoubleExtra("m_of_fine", Utils.DOUBLE_EPSILON);
        this.ve_coarse = getIntent().getDoubleExtra("m_of_coarse", Utils.DOUBLE_EPSILON);
        this.ve_chemical = getIntent().getDoubleExtra("m_chemical", Utils.DOUBLE_EPSILON);
        this.ve_wc = getIntent().getDoubleExtra("ffinal_wcratio", Utils.DOUBLE_EPSILON);
        this.ve_density = getIntent().getDoubleExtra("density", Utils.DOUBLE_EPSILON);
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
        this.r_wc.setText(String.valueOf(this.ve_wc));
        this.r_density.setText(String.valueOf(this.ve_density));
        arrayList.add(new PieEntry((float) this.ve_cement, "  "));
        arrayList.add(new PieEntry((float) this.ve_ggbs, "  "));
        arrayList.add(new PieEntry((float) this.ve_silica, "  "));
        arrayList.add(new PieEntry((float) this.ve_flyash, "  "));
        arrayList.add(new PieEntry((float) this.ve_matakaoline, "  "));
        arrayList.add(new PieEntry((float) this.ve_rice, "  "));
        arrayList.add(new PieEntry((float) this.ve_water, "  "));
        arrayList.add(new PieEntry((float) this.ve_chemical, "  "));
        arrayList.add(new PieEntry((float) this.ve_coarse, "  "));
        arrayList.add(new PieEntry((float) this.ve_fine, "  "));
        PieDataSet pieDataSet = new PieDataSet(arrayList, "ORDINARY MIX DESIGN");
        pieDataSet.setColors(this.CHART_COLORFUL_COLORS);
        pieDataSet.setValueTextColor(ViewCompat.MEASURED_STATE_MASK);
        pieDataSet.setValueTextSize(16.0f);
        pieChart.setData(new PieData(pieDataSet));
        pieChart.getDescription().setEnabled(false);
        pieChart.setCenterText("ORDINARY MIX DESIGN");
        pieChart.animateY(1000);
        Button button = binding.nbutton;
        this.normal = button;
        button.setOnClickListener(view -> {
            Intent intent = new Intent(Normal_result.this.getApplicationContext(), NConvert.class);
            intent.putExtra("ff_cemnet", Normal_result.this.ve_cement);
            intent.putExtra("m_ggbs", Normal_result.this.ve_ggbs);
            intent.putExtra("m_flyash", Normal_result.this.ve_flyash);
            intent.putExtra("m_matakaoline", Normal_result.this.ve_matakaoline);
            intent.putExtra("m_rice", Normal_result.this.ve_rice);
            intent.putExtra("m_silica", Normal_result.this.ve_silica);
            intent.putExtra("m_water", Normal_result.this.ve_water);
            intent.putExtra("m_of_fine", Normal_result.this.ve_fine);
            intent.putExtra("m_of_coarse", Normal_result.this.ve_coarse);
            intent.putExtra("m_chemical", Normal_result.this.ve_chemical);
            Normal_result.this.startActivity(intent);
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
