//package com.example.concretemixcalculator;
//
//import android.app.Dialog;
//import android.content.Context;
//import android.content.Intent;
//import android.graphics.drawable.ColorDrawable;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
//import android.widget.Button;
//import android.widget.CompoundButton;
//import android.widget.EditText;
//import android.widget.ImageButton;
//import android.widget.LinearLayout;
//import android.widget.RelativeLayout;
//import android.widget.Spinner;
//import android.widget.TextView;
//import android.widget.ToggleButton;
//
//import androidx.appcompat.app.ActionBar;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.cardview.widget.CardView;
//
//import com.example.concretemixcalculator.utils.Normal_result;
//import com.example.concretemixcalculator.utils.Utils;
//import com.facebook.ads.AdSize;
//import com.facebook.ads.AdView;
//import com.facebook.ads.AudienceNetworkAds;
//
//import java.math.RoundingMode;
//import java.text.DecimalFormat;
//import java.util.HashMap;
//import java.util.Map;
//
//public class NormalConcrete extends AppCompatActivity {
//    String AGG_condition;
//    double CA_free;
//    double FA_free;
//    ImageButton GGBS_popup;
//    String G_concrete;
//    double W_content;
//    double X_value;
//
//    /* renamed from: a */
//    double f77a;
//    double a_aggregate;
//    private AdView adView;
//    ImageButton aggregate_popup;
//    double cementcontent;
//    ImageButton cementitious_popup;
//    EditText chemical_admixture;
//    ImageButton chemical_popup;
//    EditText content_GGBS;
//    EditText content_RAH;
//    EditText content_admixture;
//    EditText content_flyash;
//    EditText content_matakaoline;
//    EditText content_silicafume;
//    EditText corection;
//    double density;
//    EditText ecement_m;
//    double en_air;
//    String exp_condition;
//    double extra_cement;
//    double f_ck;
//    double f_ckk;
//    double f_wcratio = Utils.DOUBLE_EPSILON;
//    double ff_cement;
//    double fff_cement;
//    double ffinal_wcratio;
//    double final_cementcontent;
//    double flyash_cement;
//    ImageButton flyash_popup;
//    Map<String, Integer> getMap_f = new HashMap();
//    double ggbs_cement;
//    double inc_slump;
//    double m_aggregate;
//    double m_cement;
//    double m_chemical;
//    double m_flyash;
//    double m_ggbs;
//    double m_matakaoline;
//    double m_of_coarse;
//    double m_of_fine;
//    String m_placing;
//    double m_rise;
//    double m_silica;
//    double m_water;
//    Map<String, Integer> map_f = new HashMap();
//    double matakaoline_cement;
//    ImageButton metakaoline_popup;
//    Dialog myDialog;
//    Spinner myspinner1;
//    Spinner myspinner2;
//    Spinner myspinner3;
//    Spinner myspinner4;
//    Spinner myspinner5;
//    Spinner myspinner6;
//    String n_chemical_admixture;
//    double require_water;
//    ImageButton rice_popup;
//    double rise_cement;
//    Button run;
//    String s_control;
//    double silica_cement;
//    ImageButton silicafume_popup;
//    String size_aggregate;
//    String slump;
//    int slump_cal;
//    String slump_v;
//    EditText sp_CA;
//    EditText sp_FA;
//    EditText sp_GGBS;
//    EditText sp_RAH;
//    EditText sp_admixture;
//    EditText sp_cement;
//    EditText sp_flyash;
//    EditText sp_matakaoline;
//    EditText sp_silicafume;
//    double standard_deviation;
//    double target_ck;
//    ToggleButton toggle;
//    EditText total_moisture_CA;
//    EditText total_moisture_FA;
//    ImageButton tt_wc;
//    String ty_aggregate;
//    String ty_cement;
//    String ty_concrete;
//    double v_aggregate;
//    double v_allaggregate;
//    double v_cement;
//    double v_chemical;
//    double v_coarseaggregate;
//    double v_content_GGBS;
//    double v_content_RAH;
//    double v_content_admixture;
//    double v_content_flyash;
//    double v_content_matakaoline;
//    double v_content_silicafume;
//    double v_correction = Utils.DOUBLE_EPSILON;
//    double v_ecement_m;
//    double v_flyash;
//    double v_ggbs;
//    double v_matakaoline;
//    double v_rise;
//    double v_silica;
//    double v_slump;
//    double v_sp_CA;
//    double v_sp_FA;
//    double v_sp_GGBS;
//    double v_sp_RAH;
//    double v_sp_admixture;
//    double v_sp_cement;
//    double v_sp_flyash;
//    double v_sp_matakaoline;
//    double v_sp_silicafume;
//    double v_total;
//    double v_total_moisture_CA = Utils.DOUBLE_EPSILON;
//    double v_total_moisture_FA = Utils.DOUBLE_EPSILON;
//    double v_wastage;
//    double v_water;
//    double v_water_ACA = Utils.DOUBLE_EPSILON;
//    double v_water_AFA = Utils.DOUBLE_EPSILON;
//    double v_waterreduce;
//    double v_wc_ratio;
//    int v_workability;
//    double volume_cfaggregate;
//    double volume_fineaggregate;
//    double vv_wc_ratio = Utils.DOUBLE_EPSILON;
//    TextView w_ca;
//    double w_coarse;
//    double w_content_coarse;
//    double w_content_fine;
//    TextView w_fa;
//    double w_fine;
//    TextView w_m_ca;
//    TextView w_m_fa;
//    TextView wastage;
//    ImageButton wastage_popup;
//    EditText water_ACA;
//    EditText water_AFA;
//    double water_reduce;
//    EditText waterreduce;
//    ImageButton waterreduced_popup;
//    EditText wc_ratio;
//    EditText workability;
//    String z_aggregate;
//
//    /* access modifiers changed from: protected */
//    public void onCreate(Bundle bundle) {
//        new DecimalFormat("#.###").setRoundingMode(RoundingMode.CEILING);
//        super.onCreate(bundle);
//        setContentView(R.layout.activity_normalconcrete);
//        AudienceNetworkAds.initialize(this);
//        this.adView = new AdView((Context) this, "857183438410901_857187765077135", AdSize.BANNER_HEIGHT_50);
////        ((LinearLayout) findViewById(C0665R.C0668id.banner_container)).addView(this.adView);
////        this.adView.loadAd();
//        ActionBar supportActionBar = getSupportActionBar();
//        TextView textView = new TextView(this);
//        textView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
//        textView.setText("Ordinary Concrete");
//        textView.setTextColor(-1);
//        textView.setTextSize(22.0f);
////        setSupportActionBar();
////        supportActionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
////        supportActionBar.setCustomView((View) textView);
//        this.myDialog = new Dialog(this);
//        this.run = (Button) findViewById(C0665R.C0668id.run);
//        this.wc_ratio = (EditText) findViewById(C0665R.C0668id.i_wc_ratio);
//        this.content_admixture = (EditText) findViewById(C0665R.C0668id.i_content_admixture);
//        this.sp_admixture = (EditText) findViewById(C0665R.C0668id.i_sp_admixture);
//        this.sp_cement = (EditText) findViewById(C0665R.C0668id.i_sp_cement);
//        this.ecement_m = (EditText) findViewById(C0665R.C0668id.i_ecement_m);
//        this.content_flyash = (EditText) findViewById(C0665R.C0668id.i_content_flyash);
//        this.sp_flyash = (EditText) findViewById(C0665R.C0668id.i_sp_flyash);
//        this.content_GGBS = (EditText) findViewById(C0665R.C0668id.i_content_GGBS);
//        this.sp_GGBS = (EditText) findViewById(C0665R.C0668id.i_sp_GGBS);
//        this.content_silicafume = (EditText) findViewById(C0665R.C0668id.i_content_silicafume);
//        this.sp_silicafume = (EditText) findViewById(C0665R.C0668id.i_sp_silicafume);
//        this.content_matakaoline = (EditText) findViewById(C0665R.C0668id.i_content_matakaoline);
//        this.sp_matakaoline = (EditText) findViewById(C0665R.C0668id.i_sp_matakaoline);
//        this.content_RAH = (EditText) findViewById(C0665R.C0668id.i_content_RAH);
//        this.sp_RAH = (EditText) findViewById(C0665R.C0668id.i_sp_RAH);
//        this.sp_CA = (EditText) findViewById(C0665R.C0668id.i_sp_CA);
//        this.sp_FA = (EditText) findViewById(C0665R.C0668id.i_sp_FA);
//        this.water_ACA = (EditText) findViewById(C0665R.C0668id.i_water_ACA);
//        this.water_AFA = (EditText) findViewById(C0665R.C0668id.i_water_AFA);
//        this.total_moisture_CA = (EditText) findViewById(C0665R.C0668id.i_total_moisture_CA);
//        this.total_moisture_FA = (EditText) findViewById(C0665R.C0668id.i_total_moisture_FA);
//        this.waterreduce = (EditText) findViewById(C0665R.C0668id.water_reduce);
//        this.corection = (EditText) findViewById(C0665R.C0668id.correction);
//        this.w_ca = (TextView) findViewById(C0665R.C0668id.ca_t);
//        this.w_fa = (TextView) findViewById(C0665R.C0668id.fa_t);
//        this.w_m_ca = (TextView) findViewById(C0665R.C0668id.aca_t);
//        this.w_m_fa = (TextView) findViewById(C0665R.C0668id.afa_t);
//        this.wastage = (TextView) findViewById(C0665R.C0668id.i_wastage);
//        this.toggle = (ToggleButton) findViewById(C0665R.C0668id.manual);
//        this.tt_wc = (ImageButton) findViewById(C0665R.C0668id.tt_wc);
//        this.aggregate_popup = (ImageButton) findViewById(C0665R.C0668id.naggcondition);
//        this.cementitious_popup = (ImageButton) findViewById(C0665R.C0668id.ncementitious);
//        this.waterreduced_popup = (ImageButton) findViewById(C0665R.C0668id.nwaterreduced);
//        this.chemical_popup = (ImageButton) findViewById(C0665R.C0668id.nchemical_popup);
//        this.flyash_popup = (ImageButton) findViewById(C0665R.C0668id.nflyash_popup);
//        this.GGBS_popup = (ImageButton) findViewById(C0665R.C0668id.nggbs_popup);
//        this.silicafume_popup = (ImageButton) findViewById(C0665R.C0668id.nsilica_popup);
//        this.metakaoline_popup = (ImageButton) findViewById(C0665R.C0668id.nmetakaoline_popup);
//        this.rice_popup = (ImageButton) findViewById(C0665R.C0668id.nrice_popup);
//        this.wastage_popup = (ImageButton) findViewById(C0665R.C0668id.nwastage_popup);
//        AudienceNetworkAds.initialize(this);
//        this.map_f.put("M10", 10);
//        this.map_f.put("M15", 15);
//        this.map_f.put("M20", 20);
//        this.map_f.put("M25", 25);
//        this.map_f.put("M30", 30);
//        this.map_f.put("M35", 35);
//        this.map_f.put("M40", 40);
//        this.map_f.put("M45", 45);
//        this.map_f.put("M50", 50);
//        this.map_f.put("M55", 55);
//        this.map_f.put("M60", 60);
//        this.map_f.put("M65", 65);
//        this.map_f.put("M70", 70);
//        this.map_f.put("M75", 75);
//        this.map_f.put("M80", 80);
//        this.map_f.put("M90", 90);
//        this.map_f.put("M100", 100);
//        this.myspinner1 = (Spinner) findViewById(C0665R.C0668id.spinner1);
//        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(C0665R.array.Exposurecodition));
//        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        this.myspinner1.setAdapter(arrayAdapter);
//        this.myspinner2 = (Spinner) findViewById(C0665R.C0668id.spinner2);
//        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(C0665R.array.TypesofConcrete));
//        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        this.myspinner2.setAdapter(arrayAdapter2);
//        this.myspinner3 = (Spinner) findViewById(C0665R.C0668id.spinner3);
//        ArrayAdapter arrayAdapter3 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(C0665R.array.Gradeofconcrete));
//        arrayAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        this.myspinner3.setAdapter(arrayAdapter3);
//        this.myspinner4 = (Spinner) findViewById(C0665R.C0668id.spinner4);
//        ArrayAdapter arrayAdapter4 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(C0665R.array.TypesofCement));
//        arrayAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        this.myspinner4.setAdapter(arrayAdapter4);
//        this.myspinner5 = (Spinner) findViewById(C0665R.C0668id.spinner5);
//        ArrayAdapter arrayAdapter5 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(C0665R.array.NominalSizeofAggregate));
//        arrayAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        this.myspinner5.setAdapter(arrayAdapter5);
//        this.myspinner6 = (Spinner) findViewById(C0665R.C0668id.spinner6);
//        ArrayAdapter arrayAdapter6 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(C0665R.array.TypesofAggregate));
//        arrayAdapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        this.myspinner6.setAdapter(arrayAdapter6);
//        final Spinner spinner = (Spinner) findViewById(C0665R.C0668id.spinner7);
//        ArrayAdapter arrayAdapter7 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(C0665R.array.ZoneofAggregate));
//        arrayAdapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(arrayAdapter7);
//        final Spinner spinner2 = (Spinner) findViewById(C0665R.C0668id.spinner8);
//        ArrayAdapter arrayAdapter8 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(C0665R.array.MethodofPlacing));
//        arrayAdapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner2.setAdapter(arrayAdapter8);
//        final Spinner spinner3 = (Spinner) findViewById(C0665R.C0668id.spinner9);
//        ArrayAdapter arrayAdapter9 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(C0665R.array.SiteControl));
//        arrayAdapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner3.setAdapter(arrayAdapter9);
//        final Spinner spinner4 = (Spinner) findViewById(C0665R.C0668id.spinner10);
//        ArrayAdapter arrayAdapter10 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(C0665R.array.aggregate_condi));
//        arrayAdapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner4.setAdapter(arrayAdapter10);
//        final Spinner spinner5 = (Spinner) findViewById(C0665R.C0668id.spinner11);
//        ArrayAdapter arrayAdapter11 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(C0665R.array.workability));
//        arrayAdapter11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner5.setAdapter(arrayAdapter11);
//        this.myspinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            public void onNothingSelected(AdapterView<?> adapterView) {
//            }
//
//            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
//                NormalConcrete.this.calculate();
//            }
//        });
//        this.myspinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            public void onNothingSelected(AdapterView<?> adapterView) {
//            }
//
//            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
//                NormalConcrete.this.calculate();
//            }
//        });
//        this.myspinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            public void onNothingSelected(AdapterView<?> adapterView) {
//            }
//
//            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
//                NormalConcrete.this.calculate();
//            }
//        });
//        this.myspinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            public void onNothingSelected(AdapterView<?> adapterView) {
//            }
//
//            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
//                NormalConcrete.this.calculate();
//            }
//        });
//        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            public void onNothingSelected(AdapterView<?> adapterView) {
//            }
//
//            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
//                if (adapterView.getItemAtPosition(i).toString().equals("No pumping")) {
//                    NormalConcrete.this.corection.setVisibility(View.INVISIBLE);
//                } else {
//                    NormalConcrete.this.corection.setVisibility(View.VISIBLE);
//                }
//            }
//        });
//        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            public void onNothingSelected(AdapterView<?> adapterView) {
//            }
//
//            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
//                if (adapterView.getItemAtPosition(i).toString().equals("SSD")) {
//                    NormalConcrete.this.water_ACA.setVisibility(View.INVISIBLE);
//                    NormalConcrete.this.water_AFA.setVisibility(View.INVISIBLE);
//                    NormalConcrete.this.total_moisture_CA.setVisibility(View.INVISIBLE);
//                    NormalConcrete.this.total_moisture_FA.setVisibility(View.INVISIBLE);
//                    NormalConcrete.this.w_ca.setVisibility(View.INVISIBLE);
//                    NormalConcrete.this.w_fa.setVisibility(View.INVISIBLE);
//                    NormalConcrete.this.w_m_ca.setVisibility(View.INVISIBLE);
//                    NormalConcrete.this.w_m_fa.setVisibility(View.INVISIBLE);
//                    CardView cardView = (CardView) NormalConcrete.this.findViewById(C0665R.C0668id.card);
//                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) cardView.getLayoutParams();
//                    layoutParams.height = 720;
//                    layoutParams.width = -1;
//                    cardView.setLayoutParams(layoutParams);
//                    return;
//                }
//                NormalConcrete.this.water_ACA.setVisibility(View.VISIBLE);
//                NormalConcrete.this.water_AFA.setVisibility(View.VISIBLE);
//                NormalConcrete.this.total_moisture_CA.setVisibility(View.VISIBLE);
//                NormalConcrete.this.total_moisture_FA.setVisibility(View.VISIBLE);
//                NormalConcrete.this.w_ca.setVisibility(View.VISIBLE);
//                NormalConcrete.this.w_fa.setVisibility(View.VISIBLE);
//                NormalConcrete.this.w_m_ca.setVisibility(View.VISIBLE);
//                NormalConcrete.this.w_m_fa.setVisibility(View.VISIBLE);
//                CardView cardView2 = (CardView) NormalConcrete.this.findViewById(C0665R.C0668id.card);
//                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) cardView2.getLayoutParams();
//                layoutParams2.height = -2;
//                layoutParams2.width = -1;
//                cardView2.setLayoutParams(layoutParams2);
//            }
//        });
//        this.toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
//                if (z) {
//                    NormalConcrete.this.wc_ratio.setClickable(true);
//                    NormalConcrete.this.wc_ratio.setEnabled(true);
//                    NormalConcrete.this.wc_ratio.setFocusableInTouchMode(true);
//                    NormalConcrete.this.wc_ratio.setFocusable(true);
//                    if (NormalConcrete.this.wc_ratio.getText().toString().isEmpty()) {
//                        NormalConcrete.this.v_wc_ratio = Utils.DOUBLE_EPSILON;
//                        return;
//                    }
//                    NormalConcrete normalconcrete = NormalConcrete.this;
//                    normalconcrete.v_wc_ratio = Double.parseDouble(normalconcrete.wc_ratio.getText().toString());
//                    return;
//                }
//                NormalConcrete.this.wc_ratio.setClickable(false);
//                NormalConcrete.this.wc_ratio.setEnabled(false);
//                NormalConcrete.this.wc_ratio.setFocusableInTouchMode(false);
//                NormalConcrete.this.wc_ratio.setFocusable(false);
//                NormalConcrete.this.calculate();
//            }
//        });
//        this.tt_wc.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                NormalConcrete.this.myDialog.setContentView(C0665R.layout.custom_popup);
//                NormalConcrete.this.myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
//                NormalConcrete.this.myDialog.show();
//            }
//        });
//        this.aggregate_popup.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                NormalConcrete.this.myDialog.setContentView(C0665R.layout.haggregate_popup);
//                NormalConcrete.this.myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
//                NormalConcrete.this.myDialog.show();
//            }
//        });
//        this.cementitious_popup.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                NormalConcrete.this.myDialog.setContentView(C0665R.layout.cemetitious_material);
//                NormalConcrete.this.myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
//                NormalConcrete.this.myDialog.show();
//            }
//        });
//        this.waterreduced_popup.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                NormalConcrete.this.myDialog.setContentView(C0665R.layout.waterreduced);
//                NormalConcrete.this.myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
//                NormalConcrete.this.myDialog.show();
//            }
//        });
//        this.chemical_popup.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                NormalConcrete.this.myDialog.setContentView(C0665R.layout.chemical_admixture);
//                NormalConcrete.this.myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
//                NormalConcrete.this.myDialog.show();
//            }
//        });
//        this.flyash_popup.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                NormalConcrete.this.myDialog.setContentView(C0665R.layout.flyash_popup);
//                NormalConcrete.this.myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
//                NormalConcrete.this.myDialog.show();
//            }
//        });
//        this.GGBS_popup.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                NormalConcrete.this.myDialog.setContentView(C0665R.layout.ggbs_popup);
//                NormalConcrete.this.myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
//                NormalConcrete.this.myDialog.show();
//            }
//        });
//        this.silicafume_popup.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                NormalConcrete.this.myDialog.setContentView(C0665R.layout.silicafume_popup);
//                NormalConcrete.this.myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
//                NormalConcrete.this.myDialog.show();
//            }
//        });
//        this.rice_popup.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                NormalConcrete.this.myDialog.setContentView(C0665R.layout.rice_popup);
//                NormalConcrete.this.myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
//                NormalConcrete.this.myDialog.show();
//            }
//        });
//        this.metakaoline_popup.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                NormalConcrete.this.myDialog.setContentView(C0665R.layout.metakaoline_popoup);
//                NormalConcrete.this.myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
//                NormalConcrete.this.myDialog.show();
//            }
//        });
//        this.wastage_popup.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                NormalConcrete.this.myDialog.setContentView(C0665R.layout.wastage_popup);
//                NormalConcrete.this.myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
//                NormalConcrete.this.myDialog.show();
//            }
//        });
//        this.run.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                DecimalFormat decimalFormat = new DecimalFormat("#.###");
//                decimalFormat.setRoundingMode(RoundingMode.CEILING);
//                NormalConcrete normalconcrete = NormalConcrete.this;
//                normalconcrete.exp_condition = normalconcrete.myspinner1.getSelectedItem().toString();
//                NormalConcrete normalconcrete2 = NormalConcrete.this;
//                normalconcrete2.ty_concrete = normalconcrete2.myspinner2.getSelectedItem().toString();
//                NormalConcrete normalconcrete3 = NormalConcrete.this;
//                normalconcrete3.G_concrete = normalconcrete3.myspinner3.getSelectedItem().toString();
//                NormalConcrete normalconcrete4 = NormalConcrete.this;
//                normalconcrete4.ty_cement = normalconcrete4.myspinner4.getSelectedItem().toString();
//                NormalConcrete normalconcrete5 = NormalConcrete.this;
//                normalconcrete5.size_aggregate = normalconcrete5.myspinner5.getSelectedItem().toString();
//                NormalConcrete normalconcrete6 = NormalConcrete.this;
//                normalconcrete6.ty_aggregate = normalconcrete6.myspinner6.getSelectedItem().toString();
//                NormalConcrete.this.z_aggregate = spinner.getSelectedItem().toString();
//                NormalConcrete.this.m_placing = spinner2.getSelectedItem().toString();
//                NormalConcrete.this.s_control = spinner3.getSelectedItem().toString();
//                NormalConcrete.this.slump = spinner5.getSelectedItem().toString();
//                NormalConcrete normalconcrete7 = NormalConcrete.this;
//                normalconcrete7.v_slump = (double) Integer.valueOf(normalconcrete7.slump).intValue();
//                if (NormalConcrete.this.wc_ratio.getText().toString().isEmpty()) {
//                    NormalConcrete.this.v_wc_ratio = Utils.DOUBLE_EPSILON;
//                } else {
//                    NormalConcrete normalconcrete8 = NormalConcrete.this;
//                    normalconcrete8.v_wc_ratio = Double.valueOf(normalconcrete8.wc_ratio.getText().toString()).doubleValue();
//                }
//                if (NormalConcrete.this.content_admixture.getText().toString().isEmpty()) {
//                    NormalConcrete.this.v_content_admixture = Utils.DOUBLE_EPSILON;
//                } else {
//                    NormalConcrete normalconcrete9 = NormalConcrete.this;
//                    normalconcrete9.v_content_admixture = Double.valueOf(normalconcrete9.content_admixture.getText().toString()).doubleValue();
//                }
//                if (NormalConcrete.this.sp_admixture.getText().toString().isEmpty()) {
//                    NormalConcrete.this.v_sp_admixture = 1.145d;
//                } else {
//                    NormalConcrete normalconcrete10 = NormalConcrete.this;
//                    normalconcrete10.v_sp_admixture = Double.valueOf(normalconcrete10.sp_admixture.getText().toString()).doubleValue();
//                }
//                if (NormalConcrete.this.sp_cement.getText().toString().isEmpty()) {
//                    NormalConcrete.this.v_sp_cement = 3.15d;
//                } else {
//                    NormalConcrete normalconcrete11 = NormalConcrete.this;
//                    normalconcrete11.v_sp_cement = Double.valueOf(normalconcrete11.sp_cement.getText().toString()).doubleValue();
//                }
//                if (NormalConcrete.this.ecement_m.getText().toString().isEmpty()) {
//                    NormalConcrete.this.v_ecement_m = Utils.DOUBLE_EPSILON;
//                } else {
//                    NormalConcrete normalconcrete12 = NormalConcrete.this;
//                    normalconcrete12.v_ecement_m = Double.valueOf(normalconcrete12.ecement_m.getText().toString()).doubleValue();
//                }
//                if (NormalConcrete.this.content_flyash.getText().toString().isEmpty()) {
//                    NormalConcrete.this.v_content_flyash = Utils.DOUBLE_EPSILON;
//                } else {
//                    NormalConcrete normalconcrete13 = NormalConcrete.this;
//                    normalconcrete13.v_content_flyash = Double.valueOf(normalconcrete13.content_flyash.getText().toString()).doubleValue();
//                }
//                if (NormalConcrete.this.sp_flyash.getText().toString().isEmpty()) {
//                    NormalConcrete.this.v_sp_flyash = 2.2d;
//                } else {
//                    NormalConcrete normalconcrete14 = NormalConcrete.this;
//                    normalconcrete14.v_sp_flyash = Double.valueOf(normalconcrete14.sp_flyash.getText().toString()).doubleValue();
//                }
//                if (NormalConcrete.this.content_GGBS.getText().toString().isEmpty()) {
//                    NormalConcrete.this.v_content_GGBS = Utils.DOUBLE_EPSILON;
//                } else {
//                    NormalConcrete normalconcrete15 = NormalConcrete.this;
//                    normalconcrete15.v_content_GGBS = Double.valueOf(normalconcrete15.content_GGBS.getText().toString()).doubleValue();
//                }
//                if (NormalConcrete.this.sp_GGBS.getText().toString().isEmpty()) {
//                    NormalConcrete.this.v_sp_GGBS = 3.0d;
//                } else {
//                    NormalConcrete normalconcrete16 = NormalConcrete.this;
//                    normalconcrete16.v_sp_GGBS = Double.valueOf(normalconcrete16.sp_GGBS.getText().toString()).doubleValue();
//                }
//                if (NormalConcrete.this.content_silicafume.getText().toString().isEmpty()) {
//                    NormalConcrete.this.v_content_silicafume = Utils.DOUBLE_EPSILON;
//                } else {
//                    NormalConcrete normalconcrete17 = NormalConcrete.this;
//                    normalconcrete17.v_content_silicafume = Double.valueOf(normalconcrete17.content_silicafume.getText().toString()).doubleValue();
//                }
//                if (NormalConcrete.this.sp_silicafume.getText().toString().isEmpty()) {
//                    NormalConcrete.this.v_sp_silicafume = 2.2d;
//                } else {
//                    NormalConcrete normalconcrete18 = NormalConcrete.this;
//                    normalconcrete18.v_sp_silicafume = Double.valueOf(normalconcrete18.sp_silicafume.getText().toString()).doubleValue();
//                }
//                if (NormalConcrete.this.content_matakaoline.getText().toString().isEmpty()) {
//                    NormalConcrete.this.v_content_matakaoline = Utils.DOUBLE_EPSILON;
//                } else {
//                    NormalConcrete normalconcrete19 = NormalConcrete.this;
//                    normalconcrete19.v_content_matakaoline = Double.valueOf(normalconcrete19.content_matakaoline.getText().toString()).doubleValue();
//                }
//                if (NormalConcrete.this.sp_matakaoline.getText().toString().isEmpty()) {
//                    NormalConcrete.this.v_sp_matakaoline = 2.6d;
//                } else {
//                    NormalConcrete normalconcrete20 = NormalConcrete.this;
//                    normalconcrete20.v_sp_matakaoline = Double.valueOf(normalconcrete20.sp_matakaoline.getText().toString()).doubleValue();
//                }
//                if (NormalConcrete.this.content_RAH.getText().toString().isEmpty()) {
//                    NormalConcrete.this.v_content_RAH = Utils.DOUBLE_EPSILON;
//                } else {
//                    NormalConcrete normalconcrete21 = NormalConcrete.this;
//                    normalconcrete21.v_content_RAH = Double.valueOf(normalconcrete21.content_RAH.getText().toString()).doubleValue();
//                }
//                if (NormalConcrete.this.sp_RAH.getText().toString().isEmpty()) {
//                    NormalConcrete.this.v_sp_RAH = 2.36d;
//                } else {
//                    NormalConcrete normalconcrete22 = NormalConcrete.this;
//                    normalconcrete22.v_sp_RAH = Double.valueOf(normalconcrete22.sp_RAH.getText().toString()).doubleValue();
//                }
//                if (NormalConcrete.this.sp_CA.getText().toString().isEmpty()) {
//                    NormalConcrete.this.v_sp_CA = 2.74d;
//                } else {
//                    NormalConcrete normalconcrete23 = NormalConcrete.this;
//                    normalconcrete23.v_sp_CA = Double.valueOf(normalconcrete23.sp_CA.getText().toString()).doubleValue();
//                }
//                if (NormalConcrete.this.sp_FA.getText().toString().isEmpty()) {
//                    NormalConcrete.this.v_sp_FA = 2.65d;
//                } else {
//                    NormalConcrete normalconcrete24 = NormalConcrete.this;
//                    normalconcrete24.v_sp_FA = Double.valueOf(normalconcrete24.sp_FA.getText().toString()).doubleValue();
//                }
//                if (NormalConcrete.this.water_ACA.getText().toString().isEmpty()) {
//                    NormalConcrete.this.v_water_ACA = Utils.DOUBLE_EPSILON;
//                } else {
//                    NormalConcrete normalconcrete25 = NormalConcrete.this;
//                    normalconcrete25.v_water_ACA = Double.valueOf(normalconcrete25.water_ACA.getText().toString()).doubleValue();
//                }
//                if (NormalConcrete.this.water_AFA.getText().toString().isEmpty()) {
//                    NormalConcrete.this.v_water_AFA = Utils.DOUBLE_EPSILON;
//                } else {
//                    NormalConcrete normalconcrete26 = NormalConcrete.this;
//                    normalconcrete26.v_water_AFA = Double.valueOf(normalconcrete26.water_AFA.getText().toString()).doubleValue();
//                }
//                if (NormalConcrete.this.total_moisture_CA.getText().toString().isEmpty()) {
//                    NormalConcrete.this.v_total_moisture_CA = Utils.DOUBLE_EPSILON;
//                } else {
//                    NormalConcrete normalconcrete27 = NormalConcrete.this;
//                    normalconcrete27.v_total_moisture_CA = Double.valueOf(normalconcrete27.total_moisture_CA.getText().toString()).doubleValue();
//                }
//                if (NormalConcrete.this.total_moisture_FA.getText().toString().isEmpty()) {
//                    NormalConcrete.this.v_total_moisture_FA = Utils.DOUBLE_EPSILON;
//                } else {
//                    NormalConcrete normalconcrete28 = NormalConcrete.this;
//                    normalconcrete28.v_total_moisture_FA = Double.valueOf(normalconcrete28.total_moisture_FA.getText().toString()).doubleValue();
//                }
//                if (NormalConcrete.this.waterreduce.getText().toString().isEmpty()) {
//                    NormalConcrete.this.water_reduce = Utils.DOUBLE_EPSILON;
//                } else {
//                    NormalConcrete normalconcrete29 = NormalConcrete.this;
//                    normalconcrete29.water_reduce = Double.valueOf(normalconcrete29.waterreduce.getText().toString()).doubleValue();
//                }
//                if (NormalConcrete.this.wastage.getText().toString().isEmpty()) {
//                    NormalConcrete.this.v_wastage = Utils.DOUBLE_EPSILON;
//                } else {
//                    NormalConcrete normalconcrete30 = NormalConcrete.this;
//                    normalconcrete30.v_wastage = Double.valueOf(normalconcrete30.wastage.getText().toString()).doubleValue();
//                }
//                NormalConcrete.this.AGG_condition = spinner4.getSelectedItem().toString();
//                Integer num = NormalConcrete.this.map_f.get(NormalConcrete.this.G_concrete);
//                if (spinner2.getSelectedItem().toString().equalsIgnoreCase("pumping")) {
//                    NormalConcrete normalconcrete31 = NormalConcrete.this;
//                    normalconcrete31.v_correction = Double.parseDouble(normalconcrete31.corection.getText().toString());
//                }
//                if (NormalConcrete.this.ty_aggregate.equals("Crushed angular")) {
//                    if (NormalConcrete.this.size_aggregate.equals("10")) {
//                        NormalConcrete.this.W_content = 208.0d;
//                    } else if (NormalConcrete.this.size_aggregate.equals("20")) {
//                        NormalConcrete.this.W_content = 186.0d;
//                    } else {
//                        NormalConcrete.this.W_content = 165.0d;
//                    }
//                } else if (NormalConcrete.this.ty_aggregate.equals("Sub angular")) {
//                    if (NormalConcrete.this.size_aggregate.equals("10")) {
//                        NormalConcrete.this.W_content = 198.0d;
//                    } else if (NormalConcrete.this.size_aggregate.equals("20")) {
//                        NormalConcrete.this.W_content = 176.0d;
//                    } else {
//                        NormalConcrete.this.W_content = 155.0d;
//                    }
//                } else if (NormalConcrete.this.ty_aggregate.equals("Gravel and Crused")) {
//                    if (NormalConcrete.this.size_aggregate.equals("10")) {
//                        NormalConcrete.this.W_content = 193.0d;
//                    } else if (NormalConcrete.this.size_aggregate.equals("20")) {
//                        NormalConcrete.this.W_content = 171.0d;
//                    } else {
//                        NormalConcrete.this.W_content = 150.0d;
//                    }
//                } else if (NormalConcrete.this.ty_aggregate.equals("Remould gravel")) {
//                    if (NormalConcrete.this.size_aggregate.equals("10")) {
//                        NormalConcrete.this.W_content = 188.0d;
//                    } else if (NormalConcrete.this.size_aggregate.equals("20")) {
//                        NormalConcrete.this.W_content = 166.0d;
//                    } else {
//                        NormalConcrete.this.W_content = 145.0d;
//                    }
//                }
//                if (NormalConcrete.this.v_slump > 50.0d) {
//                    NormalConcrete normalconcrete32 = NormalConcrete.this;
//                    normalconcrete32.slump_cal = (int) (normalconcrete32.v_slump - 50.0d);
//                    NormalConcrete normalconcrete33 = NormalConcrete.this;
//                    normalconcrete33.inc_slump = (((double) normalconcrete33.slump_cal) * 0.03d) / 25.0d;
//                    NormalConcrete.this.W_content += NormalConcrete.this.W_content * NormalConcrete.this.inc_slump;
//                    NormalConcrete normalconcrete34 = NormalConcrete.this;
//                    normalconcrete34.W_content = (double) Math.round(normalconcrete34.W_content);
//                } else if (NormalConcrete.this.v_slump < 50.0d) {
//                    NormalConcrete normalconcrete35 = NormalConcrete.this;
//                    normalconcrete35.slump_cal = (int) (50.0d - normalconcrete35.v_slump);
//                    NormalConcrete normalconcrete36 = NormalConcrete.this;
//                    normalconcrete36.inc_slump = (((double) normalconcrete36.slump_cal) * 0.03d) / 25.0d;
//                    NormalConcrete.this.W_content -= NormalConcrete.this.W_content * NormalConcrete.this.inc_slump;
//                    NormalConcrete normalconcrete37 = NormalConcrete.this;
//                    normalconcrete37.W_content = (double) Math.round(normalconcrete37.W_content);
//                } else {
//                    NormalConcrete.this.slump_cal = 0;
//                }
//                NormalConcrete normalconcrete38 = NormalConcrete.this;
//                normalconcrete38.v_waterreduce = (double) Math.round(normalconcrete38.W_content * ((100.0d - NormalConcrete.this.water_reduce) / 100.0d));
//                NormalConcrete normalconcrete39 = NormalConcrete.this;
//                normalconcrete39.f_wcratio = normalconcrete39.toggle.isChecked() ? NormalConcrete.this.v_wc_ratio : NormalConcrete.this.vv_wc_ratio;
//                NormalConcrete normalconcrete40 = NormalConcrete.this;
//                normalconcrete40.cementcontent = (double) Math.round(normalconcrete40.v_waterreduce / NormalConcrete.this.f_wcratio);
//                NormalConcrete normalconcrete41 = NormalConcrete.this;
//                normalconcrete41.extra_cement = normalconcrete41.cementcontent + ((NormalConcrete.this.v_ecement_m * NormalConcrete.this.cementcontent) / 100.0d);
//                NormalConcrete normalconcrete42 = NormalConcrete.this;
//                normalconcrete42.extra_cement = Double.valueOf(decimalFormat.format(normalconcrete42.extra_cement)).doubleValue();
//                if (NormalConcrete.this.ty_concrete.equals("Plain Concrete")) {
//                    if (NormalConcrete.this.exp_condition.equals("Mild")) {
//                        if (NormalConcrete.this.extra_cement > 220.0d) {
//                            NormalConcrete normalconcrete43 = NormalConcrete.this;
//                            normalconcrete43.final_cementcontent = normalconcrete43.extra_cement;
//                        } else {
//                            NormalConcrete.this.final_cementcontent = 220.0d;
//                        }
//                    } else if (NormalConcrete.this.exp_condition.equals("Moderate")) {
//                        if (NormalConcrete.this.extra_cement > 240.0d) {
//                            NormalConcrete normalconcrete44 = NormalConcrete.this;
//                            normalconcrete44.final_cementcontent = normalconcrete44.extra_cement;
//                        } else {
//                            NormalConcrete.this.final_cementcontent = 240.0d;
//                        }
//                    } else if (NormalConcrete.this.exp_condition.equals("Severe")) {
//                        if (NormalConcrete.this.extra_cement > 250.0d) {
//                            NormalConcrete normalconcrete45 = NormalConcrete.this;
//                            normalconcrete45.final_cementcontent = normalconcrete45.extra_cement;
//                        } else {
//                            NormalConcrete.this.final_cementcontent = 250.0d;
//                        }
//                    } else if (NormalConcrete.this.exp_condition.equals("VerySevere")) {
//                        if (NormalConcrete.this.extra_cement > 260.0d) {
//                            NormalConcrete normalconcrete46 = NormalConcrete.this;
//                            normalconcrete46.final_cementcontent = normalconcrete46.extra_cement;
//                        } else {
//                            NormalConcrete.this.final_cementcontent = 260.0d;
//                        }
//                    } else if (NormalConcrete.this.extra_cement > 280.0d) {
//                        NormalConcrete normalconcrete47 = NormalConcrete.this;
//                        normalconcrete47.final_cementcontent = normalconcrete47.extra_cement;
//                    } else {
//                        NormalConcrete.this.final_cementcontent = 280.0d;
//                    }
//                } else if (NormalConcrete.this.exp_condition.equals("Mild")) {
//                    if (NormalConcrete.this.extra_cement > 300.0d) {
//                        NormalConcrete normalconcrete48 = NormalConcrete.this;
//                        normalconcrete48.final_cementcontent = normalconcrete48.extra_cement;
//                    } else {
//                        NormalConcrete.this.final_cementcontent = 300.0d;
//                    }
//                } else if (NormalConcrete.this.exp_condition.equals("Moderate")) {
//                    if (NormalConcrete.this.extra_cement > 300.0d) {
//                        NormalConcrete normalconcrete49 = NormalConcrete.this;
//                        normalconcrete49.final_cementcontent = normalconcrete49.extra_cement;
//                    } else {
//                        NormalConcrete.this.final_cementcontent = 300.0d;
//                    }
//                } else if (NormalConcrete.this.exp_condition.equals("Severe")) {
//                    if (NormalConcrete.this.extra_cement > 320.0d) {
//                        NormalConcrete normalconcrete50 = NormalConcrete.this;
//                        normalconcrete50.final_cementcontent = normalconcrete50.extra_cement;
//                    } else {
//                        NormalConcrete.this.final_cementcontent = 320.0d;
//                    }
//                } else if (NormalConcrete.this.exp_condition.equals("VerySevere")) {
//                    if (NormalConcrete.this.extra_cement > 340.0d) {
//                        NormalConcrete normalconcrete51 = NormalConcrete.this;
//                        normalconcrete51.final_cementcontent = normalconcrete51.extra_cement;
//                    } else {
//                        NormalConcrete.this.final_cementcontent = 340.0d;
//                    }
//                } else if (NormalConcrete.this.extra_cement > 360.0d) {
//                    NormalConcrete normalconcrete52 = NormalConcrete.this;
//                    normalconcrete52.final_cementcontent = normalconcrete52.extra_cement;
//                } else {
//                    NormalConcrete.this.final_cementcontent = 360.0d;
//                }
//                if (Double.isNaN(NormalConcrete.this.v_content_flyash)) {
//                    NormalConcrete.this.m_flyash = Utils.DOUBLE_EPSILON;
//                } else {
//                    NormalConcrete normalconcrete53 = NormalConcrete.this;
//                    normalconcrete53.m_flyash = normalconcrete53.final_cementcontent * (NormalConcrete.this.v_content_flyash / 100.0d);
//                    NormalConcrete normalconcrete54 = NormalConcrete.this;
//                    normalconcrete54.m_flyash = Double.valueOf(decimalFormat.format(normalconcrete54.m_flyash)).doubleValue();
//                }
//                if (Double.isNaN(NormalConcrete.this.v_content_GGBS)) {
//                    NormalConcrete.this.m_ggbs = Utils.DOUBLE_EPSILON;
//                } else {
//                    NormalConcrete normalconcrete55 = NormalConcrete.this;
//                    normalconcrete55.m_ggbs = normalconcrete55.final_cementcontent * (NormalConcrete.this.v_content_GGBS / 100.0d);
//                    NormalConcrete normalconcrete56 = NormalConcrete.this;
//                    normalconcrete56.m_ggbs = Double.valueOf(decimalFormat.format(normalconcrete56.m_ggbs)).doubleValue();
//                }
//                if (Double.isNaN(NormalConcrete.this.v_content_silicafume)) {
//                    NormalConcrete.this.m_silica = Utils.DOUBLE_EPSILON;
//                } else {
//                    NormalConcrete normalconcrete57 = NormalConcrete.this;
//                    normalconcrete57.m_silica = normalconcrete57.final_cementcontent * (NormalConcrete.this.v_content_silicafume / 100.0d);
//                    NormalConcrete normalconcrete58 = NormalConcrete.this;
//                    normalconcrete58.m_silica = Double.valueOf(decimalFormat.format(normalconcrete58.m_silica)).doubleValue();
//                }
//                if (Double.isNaN(NormalConcrete.this.v_content_matakaoline)) {
//                    NormalConcrete.this.m_matakaoline = Utils.DOUBLE_EPSILON;
//                } else {
//                    NormalConcrete normalconcrete59 = NormalConcrete.this;
//                    normalconcrete59.m_matakaoline = normalconcrete59.final_cementcontent * (NormalConcrete.this.v_content_matakaoline / 100.0d);
//                    NormalConcrete normalconcrete60 = NormalConcrete.this;
//                    normalconcrete60.m_matakaoline = Double.valueOf(decimalFormat.format(normalconcrete60.m_matakaoline)).doubleValue();
//                }
//                if (Double.isNaN(NormalConcrete.this.v_content_RAH)) {
//                    NormalConcrete.this.m_rise = Utils.DOUBLE_EPSILON;
//                } else {
//                    NormalConcrete normalconcrete61 = NormalConcrete.this;
//                    normalconcrete61.m_rise = normalconcrete61.final_cementcontent * (NormalConcrete.this.v_content_RAH / 100.0d);
//                    NormalConcrete normalconcrete62 = NormalConcrete.this;
//                    normalconcrete62.m_rise = Double.valueOf(decimalFormat.format(normalconcrete62.m_rise)).doubleValue();
//                }
//                if (Double.isNaN(NormalConcrete.this.v_content_admixture)) {
//                    NormalConcrete.this.m_chemical = Utils.DOUBLE_EPSILON;
//                } else {
//                    NormalConcrete normalconcrete63 = NormalConcrete.this;
//                    normalconcrete63.m_chemical = normalconcrete63.final_cementcontent * (NormalConcrete.this.v_content_admixture / 100.0d);
//                    NormalConcrete normalconcrete64 = NormalConcrete.this;
//                    normalconcrete64.m_chemical = Double.valueOf(decimalFormat.format(normalconcrete64.m_chemical)).doubleValue();
//                }
//                NormalConcrete normalconcrete65 = NormalConcrete.this;
//                normalconcrete65.ff_cement = normalconcrete65.final_cementcontent - ((((NormalConcrete.this.m_flyash + NormalConcrete.this.m_rise) + NormalConcrete.this.m_matakaoline) + NormalConcrete.this.m_silica) + NormalConcrete.this.m_ggbs);
//                NormalConcrete normalconcrete66 = NormalConcrete.this;
//                normalconcrete66.ff_cement = Double.valueOf(decimalFormat.format(normalconcrete66.ff_cement)).doubleValue();
//                NormalConcrete normalconcrete67 = NormalConcrete.this;
//                normalconcrete67.ffinal_wcratio = normalconcrete67.v_waterreduce / NormalConcrete.this.final_cementcontent;
//                NormalConcrete normalconcrete68 = NormalConcrete.this;
//                normalconcrete68.ffinal_wcratio = Double.valueOf(decimalFormat.format(normalconcrete68.ffinal_wcratio)).doubleValue();
//                if (NormalConcrete.this.ff_cement < 450.0d) {
//                    NormalConcrete normalconcrete69 = NormalConcrete.this;
//                    normalconcrete69.fff_cement = normalconcrete69.ff_cement;
//                } else {
//                    NormalConcrete.this.fff_cement = 450.0d;
//                }
//                if (NormalConcrete.this.z_aggregate.equals("Zone 1") && NormalConcrete.this.size_aggregate.equals("10")) {
//                    NormalConcrete.this.volume_cfaggregate = Double.valueOf(0.48d).doubleValue();
//                } else if (NormalConcrete.this.z_aggregate.equals("Zone 1") && NormalConcrete.this.size_aggregate.equals("20")) {
//                    NormalConcrete.this.volume_cfaggregate = Double.valueOf(0.6d).doubleValue();
//                } else if (NormalConcrete.this.z_aggregate.equals("Zone 1") && NormalConcrete.this.size_aggregate.equals("40")) {
//                    NormalConcrete.this.volume_cfaggregate = Double.valueOf(0.69d).doubleValue();
//                } else if (NormalConcrete.this.z_aggregate.equals("Zone 2") && NormalConcrete.this.size_aggregate.equals("10")) {
//                    NormalConcrete.this.volume_cfaggregate = Double.valueOf(0.5d).doubleValue();
//                } else if (NormalConcrete.this.z_aggregate.equals("Zone 2") && NormalConcrete.this.size_aggregate.equals("20")) {
//                    NormalConcrete.this.volume_cfaggregate = Double.valueOf(0.62d).doubleValue();
//                } else if (NormalConcrete.this.z_aggregate.equals("Zone 2") && NormalConcrete.this.size_aggregate.equals("40")) {
//                    NormalConcrete.this.volume_cfaggregate = Double.valueOf(0.71d).doubleValue();
//                } else if (NormalConcrete.this.z_aggregate.equals("Zone 3") && NormalConcrete.this.size_aggregate.equals("10")) {
//                    NormalConcrete.this.volume_cfaggregate = Double.valueOf(0.52d).doubleValue();
//                } else if (NormalConcrete.this.z_aggregate.equals("Zone 3") && NormalConcrete.this.size_aggregate.equals("20")) {
//                    NormalConcrete.this.volume_cfaggregate = Double.valueOf(0.64d).doubleValue();
//                } else if (NormalConcrete.this.z_aggregate.equals("Zone 3") && NormalConcrete.this.size_aggregate.equals("40")) {
//                    NormalConcrete.this.volume_cfaggregate = Double.valueOf(0.72d).doubleValue();
//                } else if (NormalConcrete.this.z_aggregate.equals("Zone 4") && NormalConcrete.this.size_aggregate.equals("10")) {
//                    NormalConcrete.this.volume_cfaggregate = Double.valueOf(0.54d).doubleValue();
//                } else if (!NormalConcrete.this.z_aggregate.equals("Zone 4") || !NormalConcrete.this.size_aggregate.equals("20")) {
//                    NormalConcrete.this.volume_cfaggregate = Double.valueOf(0.73d).doubleValue();
//                } else {
//                    NormalConcrete.this.volume_cfaggregate = Double.valueOf(0.66d).doubleValue();
//                }
//                if (NormalConcrete.this.ffinal_wcratio < 0.5d) {
//                    NormalConcrete normalconcrete70 = NormalConcrete.this;
//                    normalconcrete70.a_aggregate = 0.5d - normalconcrete70.ffinal_wcratio;
//                    NormalConcrete normalconcrete71 = NormalConcrete.this;
//                    normalconcrete71.a_aggregate = (normalconcrete71.a_aggregate * 0.01d) / 0.05d;
//                    NormalConcrete normalconcrete72 = NormalConcrete.this;
//                    normalconcrete72.v_coarseaggregate = normalconcrete72.volume_cfaggregate + NormalConcrete.this.a_aggregate;
//                    NormalConcrete normalconcrete73 = NormalConcrete.this;
//                    normalconcrete73.v_coarseaggregate = Double.valueOf(decimalFormat.format(normalconcrete73.v_coarseaggregate)).doubleValue();
//                } else if (NormalConcrete.this.ffinal_wcratio > 0.5d) {
//                    NormalConcrete normalconcrete74 = NormalConcrete.this;
//                    normalconcrete74.a_aggregate = normalconcrete74.ffinal_wcratio - 0.5d;
//                    NormalConcrete normalconcrete75 = NormalConcrete.this;
//                    normalconcrete75.a_aggregate = (normalconcrete75.a_aggregate * 0.01d) / 0.05d;
//                    NormalConcrete normalconcrete76 = NormalConcrete.this;
//                    normalconcrete76.v_coarseaggregate = normalconcrete76.volume_cfaggregate - NormalConcrete.this.a_aggregate;
//                    NormalConcrete normalconcrete77 = NormalConcrete.this;
//                    normalconcrete77.v_coarseaggregate = Double.valueOf(decimalFormat.format(normalconcrete77.v_coarseaggregate)).doubleValue();
//                } else {
//                    NormalConcrete normalconcrete78 = NormalConcrete.this;
//                    normalconcrete78.v_coarseaggregate = normalconcrete78.volume_cfaggregate;
//                    NormalConcrete normalconcrete79 = NormalConcrete.this;
//                    normalconcrete79.v_coarseaggregate = Double.valueOf(decimalFormat.format(normalconcrete79.v_coarseaggregate)).doubleValue();
//                }
//                if (NormalConcrete.this.m_placing.equalsIgnoreCase("pumping")) {
//                    NormalConcrete.this.v_coarseaggregate *= (100.0d - NormalConcrete.this.v_correction) / 100.0d;
//                    NormalConcrete normalconcrete80 = NormalConcrete.this;
//                    normalconcrete80.v_coarseaggregate = Double.valueOf(decimalFormat.format(normalconcrete80.v_coarseaggregate)).doubleValue();
//                }
//                NormalConcrete normalconcrete81 = NormalConcrete.this;
//                normalconcrete81.volume_fineaggregate = 1.0d - normalconcrete81.v_coarseaggregate;
//                NormalConcrete normalconcrete82 = NormalConcrete.this;
//                normalconcrete82.volume_fineaggregate = Double.valueOf(decimalFormat.format(normalconcrete82.volume_fineaggregate)).doubleValue();
//                if (NormalConcrete.this.size_aggregate.equals("10")) {
//                    NormalConcrete.this.en_air = Double.valueOf(0.015d).doubleValue();
//                } else if (NormalConcrete.this.size_aggregate.equals("20")) {
//                    NormalConcrete.this.en_air = Double.valueOf(0.01d).doubleValue();
//                } else {
//                    NormalConcrete.this.en_air = Double.valueOf(0.008d).doubleValue();
//                }
//                NormalConcrete.this.v_total = 1.0d;
//                NormalConcrete normalconcrete83 = NormalConcrete.this;
//                normalconcrete83.v_cement = Double.valueOf((normalconcrete83.fff_cement / NormalConcrete.this.v_sp_cement) * 0.001d).doubleValue();
//                NormalConcrete normalconcrete84 = NormalConcrete.this;
//                normalconcrete84.v_cement = Double.valueOf(decimalFormat.format(normalconcrete84.v_cement)).doubleValue();
//                if (NormalConcrete.this.m_flyash == Utils.DOUBLE_EPSILON) {
//                    NormalConcrete.this.v_flyash = Utils.DOUBLE_EPSILON;
//                } else {
//                    NormalConcrete normalconcrete85 = NormalConcrete.this;
//                    normalconcrete85.v_flyash = (normalconcrete85.m_flyash / NormalConcrete.this.v_sp_flyash) * 0.001d;
//                    NormalConcrete normalconcrete86 = NormalConcrete.this;
//                    normalconcrete86.v_flyash = Double.valueOf(decimalFormat.format(normalconcrete86.v_flyash)).doubleValue();
//                }
//                if (NormalConcrete.this.m_ggbs == Utils.DOUBLE_EPSILON) {
//                    NormalConcrete.this.v_ggbs = Utils.DOUBLE_EPSILON;
//                } else {
//                    NormalConcrete normalconcrete87 = NormalConcrete.this;
//                    normalconcrete87.v_ggbs = (normalconcrete87.m_ggbs / NormalConcrete.this.v_sp_GGBS) * 0.001d;
//                    NormalConcrete normalconcrete88 = NormalConcrete.this;
//                    normalconcrete88.v_ggbs = Double.valueOf(decimalFormat.format(normalconcrete88.v_ggbs)).doubleValue();
//                }
//                if (NormalConcrete.this.m_silica == Utils.DOUBLE_EPSILON) {
//                    NormalConcrete.this.v_silica = Utils.DOUBLE_EPSILON;
//                } else {
//                    NormalConcrete normalconcrete89 = NormalConcrete.this;
//                    normalconcrete89.v_silica = (normalconcrete89.m_silica / NormalConcrete.this.v_sp_silicafume) * 0.001d;
//                    NormalConcrete normalconcrete90 = NormalConcrete.this;
//                    normalconcrete90.v_silica = Double.valueOf(decimalFormat.format(normalconcrete90.v_silica)).doubleValue();
//                }
//                if (NormalConcrete.this.m_rise == Utils.DOUBLE_EPSILON) {
//                    NormalConcrete.this.v_rise = Utils.DOUBLE_EPSILON;
//                } else {
//                    NormalConcrete normalconcrete91 = NormalConcrete.this;
//                    normalconcrete91.v_content_RAH = (normalconcrete91.m_rise / NormalConcrete.this.v_sp_RAH) * 0.001d;
//                    NormalConcrete normalconcrete92 = NormalConcrete.this;
//                    normalconcrete92.v_content_RAH = Double.valueOf(decimalFormat.format(normalconcrete92.v_content_RAH)).doubleValue();
//                }
//                if (NormalConcrete.this.m_matakaoline == Utils.DOUBLE_EPSILON) {
//                    NormalConcrete.this.v_matakaoline = Utils.DOUBLE_EPSILON;
//                } else {
//                    NormalConcrete normalconcrete93 = NormalConcrete.this;
//                    normalconcrete93.v_matakaoline = (normalconcrete93.m_matakaoline / NormalConcrete.this.v_sp_matakaoline) * 0.001d;
//                    NormalConcrete normalconcrete94 = NormalConcrete.this;
//                    normalconcrete94.v_matakaoline = Double.valueOf(decimalFormat.format(normalconcrete94.v_matakaoline)).doubleValue();
//                }
//                if (NormalConcrete.this.m_chemical == Utils.DOUBLE_EPSILON) {
//                    NormalConcrete.this.v_chemical = Utils.DOUBLE_EPSILON;
//                } else {
//                    NormalConcrete normalconcrete95 = NormalConcrete.this;
//                    normalconcrete95.v_chemical = (normalconcrete95.m_chemical / NormalConcrete.this.v_sp_admixture) * 0.001d;
//                    NormalConcrete normalconcrete96 = NormalConcrete.this;
//                    normalconcrete96.v_chemical = Double.valueOf(decimalFormat.format(normalconcrete96.v_chemical)).doubleValue();
//                }
//                NormalConcrete normalconcrete97 = NormalConcrete.this;
//                normalconcrete97.v_water = normalconcrete97.v_waterreduce * 0.001d;
//                NormalConcrete normalconcrete98 = NormalConcrete.this;
//                normalconcrete98.v_water = Double.valueOf(decimalFormat.format(normalconcrete98.v_water)).doubleValue();
//                double doubleValue = Double.valueOf(decimalFormat.format(NormalConcrete.this.en_air + NormalConcrete.this.v_cement + NormalConcrete.this.v_flyash + NormalConcrete.this.v_ggbs + NormalConcrete.this.v_silica + NormalConcrete.this.v_content_RAH + NormalConcrete.this.v_matakaoline + NormalConcrete.this.v_water + NormalConcrete.this.v_chemical)).doubleValue();
//                NormalConcrete normalconcrete99 = NormalConcrete.this;
//                normalconcrete99.v_allaggregate = normalconcrete99.v_total - doubleValue;
//                NormalConcrete normalconcrete100 = NormalConcrete.this;
//                normalconcrete100.v_allaggregate = Double.valueOf(decimalFormat.format(normalconcrete100.v_allaggregate)).doubleValue();
//                NormalConcrete normalconcrete101 = NormalConcrete.this;
//                normalconcrete101.m_of_coarse = normalconcrete101.v_allaggregate * NormalConcrete.this.v_coarseaggregate * NormalConcrete.this.v_sp_CA * 1000.0d;
//                NormalConcrete normalconcrete102 = NormalConcrete.this;
//                normalconcrete102.m_of_coarse = Double.valueOf(decimalFormat.format(normalconcrete102.m_of_coarse)).doubleValue();
//                NormalConcrete normalconcrete103 = NormalConcrete.this;
//                normalconcrete103.m_of_fine = normalconcrete103.v_allaggregate * NormalConcrete.this.volume_fineaggregate * NormalConcrete.this.v_sp_FA * 1000.0d;
//                NormalConcrete normalconcrete104 = NormalConcrete.this;
//                normalconcrete104.m_of_fine = Double.valueOf(decimalFormat.format(normalconcrete104.m_of_fine)).doubleValue();
//                NormalConcrete normalconcrete105 = NormalConcrete.this;
//                normalconcrete105.CA_free = normalconcrete105.v_total_moisture_CA - NormalConcrete.this.v_water_ACA;
//                NormalConcrete normalconcrete106 = NormalConcrete.this;
//                normalconcrete106.CA_free = Double.valueOf(decimalFormat.format(normalconcrete106.CA_free)).doubleValue();
//                NormalConcrete normalconcrete107 = NormalConcrete.this;
//                normalconcrete107.FA_free = normalconcrete107.v_total_moisture_FA - NormalConcrete.this.v_water_AFA;
//                NormalConcrete normalconcrete108 = NormalConcrete.this;
//                normalconcrete108.FA_free = Double.valueOf(decimalFormat.format(normalconcrete108.FA_free)).doubleValue();
//                NormalConcrete normalconcrete109 = NormalConcrete.this;
//                normalconcrete109.w_coarse = normalconcrete109.m_of_coarse * ((NormalConcrete.this.CA_free / 100.0d) + 1.0d);
//                NormalConcrete normalconcrete110 = NormalConcrete.this;
//                normalconcrete110.w_coarse = Double.valueOf(decimalFormat.format(normalconcrete110.w_coarse)).doubleValue();
//                NormalConcrete normalconcrete111 = NormalConcrete.this;
//                normalconcrete111.w_fine = normalconcrete111.m_of_fine * ((NormalConcrete.this.FA_free / 100.0d) + 1.0d);
//                NormalConcrete normalconcrete112 = NormalConcrete.this;
//                normalconcrete112.w_fine = Double.valueOf(decimalFormat.format(normalconcrete112.w_fine)).doubleValue();
//                NormalConcrete normalconcrete113 = NormalConcrete.this;
//                normalconcrete113.w_content_coarse = normalconcrete113.w_coarse - NormalConcrete.this.m_of_coarse;
//                NormalConcrete normalconcrete114 = NormalConcrete.this;
//                normalconcrete114.w_content_coarse = Double.valueOf(decimalFormat.format(normalconcrete114.w_content_coarse)).doubleValue();
//                NormalConcrete normalconcrete115 = NormalConcrete.this;
//                normalconcrete115.w_content_fine = normalconcrete115.w_fine - NormalConcrete.this.m_of_fine;
//                NormalConcrete normalconcrete116 = NormalConcrete.this;
//                normalconcrete116.w_content_fine = Double.valueOf(decimalFormat.format(normalconcrete116.w_content_fine)).doubleValue();
//                NormalConcrete normalconcrete117 = NormalConcrete.this;
//                normalconcrete117.require_water = normalconcrete117.v_waterreduce - (NormalConcrete.this.w_content_coarse + NormalConcrete.this.w_content_fine);
//                NormalConcrete normalconcrete118 = NormalConcrete.this;
//                normalconcrete118.require_water = Double.valueOf(decimalFormat.format(normalconcrete118.require_water)).doubleValue();
//                if (NormalConcrete.this.AGG_condition.equals("SSD")) {
//                    NormalConcrete normalconcrete119 = NormalConcrete.this;
//                    normalconcrete119.m_of_coarse = normalconcrete119.v_allaggregate * NormalConcrete.this.v_coarseaggregate * NormalConcrete.this.v_sp_CA * 1000.0d;
//                    NormalConcrete normalconcrete120 = NormalConcrete.this;
//                    normalconcrete120.m_of_coarse = Double.valueOf(decimalFormat.format(normalconcrete120.m_of_coarse)).doubleValue();
//                } else {
//                    NormalConcrete normalconcrete121 = NormalConcrete.this;
//                    normalconcrete121.m_of_coarse = normalconcrete121.w_coarse;
//                }
//                if (NormalConcrete.this.AGG_condition.equals("SSD")) {
//                    NormalConcrete normalconcrete122 = NormalConcrete.this;
//                    normalconcrete122.m_of_fine = normalconcrete122.v_allaggregate * NormalConcrete.this.volume_fineaggregate * NormalConcrete.this.v_sp_FA * 1000.0d;
//                    NormalConcrete normalconcrete123 = NormalConcrete.this;
//                    normalconcrete123.m_of_fine = Double.valueOf(decimalFormat.format(normalconcrete123.m_of_fine)).doubleValue();
//                } else {
//                    NormalConcrete normalconcrete124 = NormalConcrete.this;
//                    normalconcrete124.m_of_fine = normalconcrete124.w_fine;
//                }
//                if (NormalConcrete.this.AGG_condition.equals("SSD")) {
//                    NormalConcrete normalconcrete125 = NormalConcrete.this;
//                    normalconcrete125.v_water = normalconcrete125.v_waterreduce;
//                    NormalConcrete normalconcrete126 = NormalConcrete.this;
//                    normalconcrete126.v_water = Double.valueOf(decimalFormat.format(normalconcrete126.v_water)).doubleValue();
//                } else {
//                    NormalConcrete normalconcrete127 = NormalConcrete.this;
//                    normalconcrete127.v_water = normalconcrete127.require_water;
//                }
//                NormalConcrete.this.fff_cement += NormalConcrete.this.fff_cement * (NormalConcrete.this.v_wastage / 100.0d);
//                NormalConcrete normalconcrete128 = NormalConcrete.this;
//                normalconcrete128.fff_cement = Double.valueOf(decimalFormat.format(normalconcrete128.fff_cement)).doubleValue();
//                NormalConcrete.this.m_ggbs += NormalConcrete.this.m_ggbs * (NormalConcrete.this.v_wastage / 100.0d);
//                NormalConcrete normalconcrete129 = NormalConcrete.this;
//                normalconcrete129.m_ggbs = Double.valueOf(decimalFormat.format(normalconcrete129.m_ggbs)).doubleValue();
//                NormalConcrete.this.m_flyash += NormalConcrete.this.m_flyash * (NormalConcrete.this.v_wastage / 100.0d);
//                NormalConcrete normalconcrete130 = NormalConcrete.this;
//                normalconcrete130.m_flyash = Double.valueOf(decimalFormat.format(normalconcrete130.m_flyash)).doubleValue();
//                NormalConcrete.this.m_matakaoline += NormalConcrete.this.m_matakaoline * (NormalConcrete.this.v_wastage / 100.0d);
//                NormalConcrete normalconcrete131 = NormalConcrete.this;
//                normalconcrete131.m_matakaoline = Double.valueOf(decimalFormat.format(normalconcrete131.m_matakaoline)).doubleValue();
//                NormalConcrete.this.m_rise += NormalConcrete.this.m_rise * (NormalConcrete.this.v_wastage / 100.0d);
//                NormalConcrete normalconcrete132 = NormalConcrete.this;
//                normalconcrete132.m_rise = Double.valueOf(decimalFormat.format(normalconcrete132.m_rise)).doubleValue();
//                NormalConcrete.this.m_silica += NormalConcrete.this.m_silica * (NormalConcrete.this.v_wastage / 100.0d);
//                NormalConcrete normalconcrete133 = NormalConcrete.this;
//                normalconcrete133.m_silica = Double.valueOf(decimalFormat.format(normalconcrete133.m_silica)).doubleValue();
//                NormalConcrete.this.v_water += NormalConcrete.this.v_water * (NormalConcrete.this.v_wastage / 100.0d);
//                NormalConcrete normalconcrete134 = NormalConcrete.this;
//                normalconcrete134.v_water = Double.valueOf(decimalFormat.format(normalconcrete134.v_water)).doubleValue();
//                NormalConcrete.this.m_of_fine += NormalConcrete.this.m_of_fine * (NormalConcrete.this.v_wastage / 100.0d);
//                NormalConcrete normalconcrete135 = NormalConcrete.this;
//                normalconcrete135.m_of_fine = Double.valueOf(decimalFormat.format(normalconcrete135.m_of_fine)).doubleValue();
//                NormalConcrete.this.m_of_coarse += NormalConcrete.this.m_of_coarse * (NormalConcrete.this.v_wastage / 100.0d);
//                NormalConcrete normalconcrete136 = NormalConcrete.this;
//                normalconcrete136.m_of_coarse = Double.valueOf(decimalFormat.format(normalconcrete136.m_of_coarse)).doubleValue();
//                NormalConcrete.this.m_chemical += NormalConcrete.this.m_chemical * (NormalConcrete.this.v_wastage / 100.0d);
//                NormalConcrete normalconcrete137 = NormalConcrete.this;
//                normalconcrete137.m_chemical = Double.valueOf(decimalFormat.format(normalconcrete137.m_chemical)).doubleValue();
//                NormalConcrete normalconcrete138 = NormalConcrete.this;
//                normalconcrete138.density = normalconcrete138.fff_cement + NormalConcrete.this.m_ggbs + NormalConcrete.this.m_flyash + NormalConcrete.this.m_matakaoline + NormalConcrete.this.m_rise + NormalConcrete.this.m_silica + NormalConcrete.this.v_water + NormalConcrete.this.m_of_fine + NormalConcrete.this.m_of_coarse + NormalConcrete.this.m_chemical;
//                NormalConcrete normalconcrete139 = NormalConcrete.this;
//                normalconcrete139.density = Double.valueOf(decimalFormat.format(normalconcrete139.density)).doubleValue();
//                Intent intent = new Intent(NormalConcrete.this, Normal_result.class);
//                intent.putExtra("ff_cemnet", NormalConcrete.this.fff_cement);
//                intent.putExtra("m_ggbs", NormalConcrete.this.m_ggbs);
//                intent.putExtra("m_flyash", NormalConcrete.this.m_flyash);
//                intent.putExtra("m_matakaoline", NormalConcrete.this.m_matakaoline);
//                intent.putExtra("m_rice", NormalConcrete.this.m_rise);
//                intent.putExtra("m_silica", NormalConcrete.this.m_silica);
//                intent.putExtra("m_water", NormalConcrete.this.v_water);
//                intent.putExtra("m_of_fine", NormalConcrete.this.m_of_fine);
//                intent.putExtra("m_of_coarse", NormalConcrete.this.m_of_coarse);
//                intent.putExtra("m_chemical", NormalConcrete.this.m_chemical);
//                intent.putExtra("ffinal_wcratio", NormalConcrete.this.ffinal_wcratio);
//                intent.putExtra("density", NormalConcrete.this.density);
//                NormalConcrete.this.startActivity(intent);
//            }
//        });
//    }
//
//    /* access modifiers changed from: protected */
//    public void onDestroy() {
//        AdView adView2 = this.adView;
//        if (adView2 != null) {
//            adView2.destroy();
//        }
//        super.onDestroy();
//    }
//
//    /* access modifiers changed from: package-private */
//    public void calculate() {
//        this.exp_condition = this.myspinner1.getSelectedItem().toString();
//        this.ty_cement = this.myspinner4.getSelectedItem().toString();
//        this.G_concrete = this.myspinner3.getSelectedItem().toString();
//        this.ty_concrete = this.myspinner2.getSelectedItem().toString();
//        Integer num = this.map_f.get(this.G_concrete);
//        if (num.intValue() == 10 || num.intValue() == 15) {
//            this.standard_deviation = 3.5d;
//        } else if (num.intValue() == 20 || num.intValue() == 25) {
//            this.standard_deviation = 4.0d;
//        } else if (num.intValue() == 30 || num.intValue() == 35 || num.intValue() == 40 || num.intValue() == 45 || num.intValue() == 50 || num.intValue() == 55 || num.intValue() == 60) {
//            this.standard_deviation = 5.0d;
//        } else if (num.intValue() == 65 || num.intValue() == 70 || num.intValue() == 75 || num.intValue() == 80) {
//            this.standard_deviation = 6.0d;
//        } else if (num.intValue() == 40) {
//            this.standard_deviation = 5.0d;
//        } else {
//            this.standard_deviation = 7.0d;
//        }
//        this.f_ck = ((double) this.map_f.get(this.G_concrete).intValue()) + (this.standard_deviation * 1.65d);
//        if (num.intValue() == 10 || num.intValue() == 15) {
//            this.X_value = 5.0d;
//        } else if (num.intValue() == 20 || num.intValue() == 25) {
//            this.X_value = 5.5d;
//        } else if (num.intValue() == 30 || num.intValue() == 35 || num.intValue() == 40 || num.intValue() == 45 || num.intValue() == 50 || num.intValue() == 55 || num.intValue() == 60) {
//            this.X_value = 6.5d;
//        } else {
//            this.X_value = 8.0d;
//        }
//        double intValue = ((double) this.map_f.get(this.G_concrete).intValue()) + this.X_value;
//        this.f_ckk = intValue;
//        double d = this.f_ck;
//        if (d > intValue) {
//            this.target_ck = d;
//        } else {
//            this.target_ck = intValue;
//        }
//        if (this.ty_cement.equals("PPC")) {
//            this.vv_wc_ratio = (Math.log(this.target_ck) * -0.319d) + 1.5858d;
//        } else if (this.ty_cement.equals("OPC 33")) {
//            this.vv_wc_ratio = (Math.log(this.target_ck) * -0.282d) + 1.4105d;
//        } else if (this.ty_cement.equals("OPC 43")) {
//            this.vv_wc_ratio = (Math.log(this.target_ck) * -0.319d) + 1.5858d;
//        } else {
//            this.vv_wc_ratio = (Math.log(this.target_ck) * -0.368d) + 1.8336d;
//        }
//        if (this.ty_concrete.equals("Plain Concrete")) {
//            if (this.exp_condition.equals("Mild")) {
//                double d2 = this.vv_wc_ratio;
//                if (d2 < 0.6d) {
//                    this.f_wcratio = d2;
//                } else {
//                    this.f_wcratio = 0.6d;
//                }
//            } else if (this.exp_condition.equals("Moderate")) {
//                double d3 = this.vv_wc_ratio;
//                if (d3 < 0.6d) {
//                    this.f_wcratio = d3;
//                } else {
//                    this.f_wcratio = 0.6d;
//                }
//            } else if (this.exp_condition.equals("Severe")) {
//                double d4 = this.vv_wc_ratio;
//                if (d4 < 0.5d) {
//                    this.f_wcratio = d4;
//                } else {
//                    this.f_wcratio = 0.5d;
//                }
//            } else if (this.exp_condition.equals("VerySevere")) {
//                double d5 = this.vv_wc_ratio;
//                if (d5 < 0.45d) {
//                    this.f_wcratio = d5;
//                } else {
//                    this.f_wcratio = 0.45d;
//                }
//            } else {
//                double d6 = this.vv_wc_ratio;
//                if (d6 < 0.4d) {
//                    this.f_wcratio = d6;
//                } else {
//                    this.f_wcratio = 0.4d;
//                }
//            }
//        } else if (this.exp_condition.equals("Mild")) {
//            double d7 = this.vv_wc_ratio;
//            if (d7 < 0.55d) {
//                this.f_wcratio = d7;
//            } else {
//                this.f_wcratio = 0.55d;
//            }
//        } else if (this.exp_condition.equals("Moderate")) {
//            double d8 = this.vv_wc_ratio;
//            if (d8 < 0.5d) {
//                this.f_wcratio = d8;
//            } else {
//                this.f_wcratio = 0.5d;
//            }
//        } else if (this.exp_condition.equals("Severe")) {
//            double d9 = this.vv_wc_ratio;
//            if (d9 < 0.45d) {
//                this.f_wcratio = d9;
//            } else {
//                this.f_wcratio = 0.45d;
//            }
//        } else if (this.exp_condition.equals("VerySevere")) {
//            double d10 = this.vv_wc_ratio;
//            if (d10 < 0.45d) {
//                this.f_wcratio = d10;
//            } else {
//                this.f_wcratio = 0.45d;
//            }
//        } else {
//            double d11 = this.vv_wc_ratio;
//            if (d11 < 0.4d) {
//                this.f_wcratio = d11;
//            } else {
//                this.f_wcratio = 0.4d;
//            }
//        }
//    }
//}
