package com.example.concretemixcalculator.ui.home;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.concretemixcalculator.R;
import com.example.concretemixcalculator.databinding.ActivityNormalconcreteBinding;
import com.example.concretemixcalculator.utils.Normal_result;
import com.example.concretemixcalculator.utils.Utils;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HomeFragment extends Fragment {

    String AGG_condition;
    double CA_free;
    double FA_free;
    ImageButton GGBS_popup;
    String G_concrete;
    double W_content;
    double X_value;

    /* renamed from: a */
    double f77a;
    double a_aggregate;
    private AdView adView;
    ImageButton aggregate_popup;
    double cementcontent;
    ImageButton cementitious_popup;
    EditText chemical_admixture;
    ImageButton chemical_popup;
    EditText content_GGBS;
    EditText content_RAH;
    EditText content_admixture;
    EditText content_flyash;
    EditText content_matakaoline;
    EditText content_silicafume;
    EditText corection;
    double density;
    EditText ecement_m;
    double en_air;
    String exp_condition;
    double extra_cement;
    double f_ck;
    double f_ckk;
    double f_wcratio = Utils.DOUBLE_EPSILON;
    double ff_cement;
    double fff_cement;
    double ffinal_wcratio;
    double final_cementcontent;
    double flyash_cement;
    ImageButton flyash_popup;
    Map<String, Integer> getMap_f = new HashMap();
    double ggbs_cement;
    double inc_slump;
    double m_aggregate;
    double m_cement;
    double m_chemical;
    double m_flyash;
    double m_ggbs;
    double m_matakaoline;
    double m_of_coarse;
    double m_of_fine;
    String m_placing;
    double m_rise;
    double m_silica;
    double m_water;
    Map<String, Integer> map_f = new HashMap();
    double matakaoline_cement;
    ImageButton metakaoline_popup;
    Dialog myDialog;
    Spinner myspinner1;
    Spinner myspinner2;
    Spinner myspinner3;
    Spinner myspinner4;
    Spinner myspinner5;
    Spinner myspinner6;
    String n_chemical_admixture;
    double require_water;
    ImageButton rice_popup;
    double rise_cement;
    Button run;
    String s_control;
    double silica_cement;
    ImageButton silicafume_popup;
    String size_aggregate;
    String slump;
    int slump_cal;
    String slump_v;
    EditText sp_CA;
    EditText sp_FA;
    EditText sp_GGBS;
    EditText sp_RAH;
    EditText sp_admixture;
    EditText sp_cement;
    EditText sp_flyash;
    EditText sp_matakaoline;
    EditText sp_silicafume;
    double standard_deviation;
    double target_ck;
    ToggleButton toggle;
    EditText total_moisture_CA;
    EditText total_moisture_FA;
    ImageButton tt_wc;
    String ty_aggregate;
    String ty_cement;
    String ty_concrete;
    double v_aggregate;
    double v_allaggregate;
    double v_cement;
    double v_chemical;
    double v_coarseaggregate;
    double v_content_GGBS;
    double v_content_RAH;
    double v_content_admixture;
    double v_content_flyash;
    double v_content_matakaoline;
    double v_content_silicafume;
    double v_correction = Utils.DOUBLE_EPSILON;
    double v_ecement_m;
    double v_flyash;
    double v_ggbs;
    double v_matakaoline;
    double v_rise;
    double v_silica;
    double v_slump;
    double v_sp_CA;
    double v_sp_FA;
    double v_sp_GGBS;
    double v_sp_RAH;
    double v_sp_admixture;
    double v_sp_cement;
    double v_sp_flyash;
    double v_sp_matakaoline;
    double v_sp_silicafume;
    double v_total;
    double v_total_moisture_CA = Utils.DOUBLE_EPSILON;
    double v_total_moisture_FA = Utils.DOUBLE_EPSILON;
    double v_wastage;
    double v_water;
    double v_water_ACA = Utils.DOUBLE_EPSILON;
    double v_water_AFA = Utils.DOUBLE_EPSILON;
    double v_waterreduce;
    double v_wc_ratio;
    int v_workability;
    double volume_cfaggregate;
    double volume_fineaggregate;
    double vv_wc_ratio = Utils.DOUBLE_EPSILON;
    TextView w_ca;
    double w_coarse;
    double w_content_coarse;
    double w_content_fine;
    TextView w_fa;
    double w_fine;
    TextView w_m_ca;
    TextView w_m_fa;
    TextView wastage;
    ImageButton wastage_popup;
    EditText water_ACA;
    EditText water_AFA;
    double water_reduce;
    EditText waterreduce;
    ImageButton waterreduced_popup;
    EditText wc_ratio;
    EditText workability;
    String z_aggregate;

    ActivityNormalconcreteBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = ActivityNormalconcreteBinding.inflate(inflater, container, false);


        code();


        return binding.getRoot();
    }

    private void code() {


        AudienceNetworkAds.initialize(requireContext());
//        ((LinearLayout) binding.banner_container)).addView(this.adView);
//        this.adView.loadAd();
        TextView textView = new TextView(requireContext());
        textView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        textView.setText("Ordinary Concrete");
        textView.setTextColor(-1);
        textView.setTextSize(22.0f);
//        setSupportActionBar();
//        supportActionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
//        supportActionBar.setCustomView((View) textView);
        this.myDialog = new Dialog(requireContext());
        this.run = binding.run;
        this.wc_ratio = binding.iWcRatio;
        this.content_admixture = binding.iContentAdmixture;
        this.sp_admixture = binding.iSpAdmixture;
        this.sp_cement = binding.iSpCement;
        this.ecement_m = binding.iEcementM;
        this.content_flyash = binding.iContentFlyash;
        this.sp_flyash = binding.iSpFlyash;
        this.content_GGBS = binding.iContentGGBS;
        this.sp_GGBS = binding.iSpGGBS;
        this.content_silicafume = binding.iContentSilicafume;
        this.sp_silicafume = binding.iSpSilicafume;
        this.content_matakaoline = binding.iContentMatakaoline;
        this.sp_matakaoline = binding.iSpMatakaoline;
        this.content_RAH = binding.iContentRAH;
        this.sp_RAH = binding.iSpRAH;
        this.sp_CA = binding.iSpCA;
        this.sp_FA = binding.iSpFA;
        this.water_ACA = binding.iWaterACA;
        this.water_AFA = binding.iWaterAFA;
        this.total_moisture_CA = binding.iTotalMoistureCA;
        this.total_moisture_FA = binding.iTotalMoistureFA;
        this.waterreduce = binding.waterReduce;
        this.corection = binding.correction;
        this.w_ca = binding.caT;
        this.w_fa = binding.faT;
        this.w_m_ca = binding.acaT;
        this.w_m_fa = binding.afaT;
        this.wastage = binding.iWastage;
        this.toggle = binding.manual;
        this.tt_wc = binding.ttWc;
        this.aggregate_popup = binding.naggcondition;
        this.cementitious_popup = binding.ncementitious;
        this.waterreduced_popup = binding.nwaterreduced;
        this.chemical_popup = binding.nchemicalPopup;
        this.flyash_popup = binding.nflyashPopup;
        this.GGBS_popup = binding.nggbsPopup;
        this.silicafume_popup = binding.nsilicaPopup;
        this.metakaoline_popup = binding.nmetakaolinePopup;
        this.rice_popup = binding.nricePopup;
        this.wastage_popup = binding.nwastagePopup;
        AudienceNetworkAds.initialize(requireContext());
        this.map_f.put("M10", 10);
        this.map_f.put("M15", 15);
        this.map_f.put("M20", 20);
        this.map_f.put("M25", 25);
        this.map_f.put("M30", 30);
        this.map_f.put("M35", 35);
        this.map_f.put("M40", 40);
        this.map_f.put("M45", 45);
        this.map_f.put("M50", 50);
        this.map_f.put("M55", 55);
        this.map_f.put("M60", 60);
        this.map_f.put("M65", 65);
        this.map_f.put("M70", 70);
        this.map_f.put("M75", 75);
        this.map_f.put("M80", 80);
        this.map_f.put("M90", 90);
        this.map_f.put("M100", 100);
        this.myspinner1 = binding.spinner1;
        ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.Exposurecodition));
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.myspinner1.setAdapter(arrayAdapter);
        this.myspinner2 = binding.spinner2;
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.TypesofConcrete));
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.myspinner2.setAdapter(arrayAdapter2);
        this.myspinner3 = binding.spinner3;
        ArrayAdapter arrayAdapter3 = new ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.Gradeofconcrete));
        arrayAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.myspinner3.setAdapter(arrayAdapter3);
        this.myspinner4 = binding.spinner4;
        ArrayAdapter arrayAdapter4 = new ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.TypesofCement));
        arrayAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.myspinner4.setAdapter(arrayAdapter4);
        this.myspinner5 = binding.spinner5;
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(10);
        a1.add(20);
        a1.add(40);
        ArrayAdapter arrayAdapter5 = new ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item, a1);
        arrayAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.myspinner5.setAdapter(arrayAdapter5);
        this.myspinner6 = binding.spinner6;
        ArrayAdapter arrayAdapter6 = new ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.TypesofAggregate));
        arrayAdapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.myspinner6.setAdapter(arrayAdapter6);
        final Spinner spinner = binding.spinner7;
        ArrayAdapter arrayAdapter7 = new ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.ZoneofAggregate));
        arrayAdapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter7);
        final Spinner spinner2 = binding.spinner8;
        ArrayAdapter arrayAdapter8 = new ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.MethodofPlacing));
        arrayAdapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(arrayAdapter8);
        final Spinner spinner3 = binding.spinner9;
        ArrayAdapter arrayAdapter9 = new ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.SiteControl));
        arrayAdapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(arrayAdapter9);
        final Spinner spinner4 = binding.spinner10;
        ArrayAdapter arrayAdapter10 = new ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.aggregate_condi));
        arrayAdapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(arrayAdapter10);
        final Spinner spinner5 = binding.spinner11;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int num : getResources().getIntArray(R.array.workability)){
            Log.i("SRB", String.valueOf(num));
            arrayList.add(num);
        }
        Log.i("SRB", String.valueOf(arrayList.size()));
        ArrayAdapter arrayAdapter11 = new ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item, arrayList);
        arrayAdapter11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(arrayAdapter11);
        this.myspinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onNothingSelected(AdapterView<?> adapterView) {
            }

            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                calculate();
            }
        });
        this.myspinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onNothingSelected(AdapterView<?> adapterView) {
            }

            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                calculate();
            }
        });
        this.myspinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onNothingSelected(AdapterView<?> adapterView) {
            }

            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                calculate();
            }
        });
        this.myspinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onNothingSelected(AdapterView<?> adapterView) {
            }

            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                calculate();
            }
        });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onNothingSelected(AdapterView<?> adapterView) {
            }

            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                if (adapterView.getItemAtPosition(i).toString().equals("No pumping")) {
                    corection.setVisibility(View.INVISIBLE);
                } else {
                    corection.setVisibility(View.VISIBLE);
                }
            }
        });
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onNothingSelected(AdapterView<?> adapterView) {
            }

            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                if (adapterView.getItemAtPosition(i).toString().equals("SSD")) {
                    water_ACA.setVisibility(View.INVISIBLE);
                    water_AFA.setVisibility(View.INVISIBLE);
                    total_moisture_CA.setVisibility(View.INVISIBLE);
                    total_moisture_FA.setVisibility(View.INVISIBLE);
                    w_ca.setVisibility(View.INVISIBLE);
                    w_fa.setVisibility(View.INVISIBLE);
                    w_m_ca.setVisibility(View.INVISIBLE);
                    w_m_fa.setVisibility(View.INVISIBLE);
                    CardView cardView = binding.card;
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) cardView.getLayoutParams();
                    layoutParams.height = 720;
                    layoutParams.width = -1;
                    cardView.setLayoutParams(layoutParams);
                    return;
                }
                water_ACA.setVisibility(View.VISIBLE);
                water_AFA.setVisibility(View.VISIBLE);
                total_moisture_CA.setVisibility(View.VISIBLE);
                total_moisture_FA.setVisibility(View.VISIBLE);
                w_ca.setVisibility(View.VISIBLE);
                w_fa.setVisibility(View.VISIBLE);
                w_m_ca.setVisibility(View.VISIBLE);
                w_m_fa.setVisibility(View.VISIBLE);
                CardView cardView2 = binding.card;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) cardView2.getLayoutParams();
                layoutParams2.height = -2;
                layoutParams2.width = -1;
                cardView2.setLayoutParams(layoutParams2);
            }
        });
        this.toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (z) {
                    wc_ratio.setClickable(true);
                    wc_ratio.setEnabled(true);
                    wc_ratio.setFocusableInTouchMode(true);
                    wc_ratio.setFocusable(true);
                    if (wc_ratio.getText().toString().isEmpty()) {
                        v_wc_ratio = Utils.DOUBLE_EPSILON;
                        return;
                    }
                    v_wc_ratio = Double.parseDouble(wc_ratio.getText().toString());
                    return;
                }
                wc_ratio.setClickable(false);
                wc_ratio.setEnabled(false);
                wc_ratio.setFocusableInTouchMode(false);
                wc_ratio.setFocusable(false);
                calculate();
            }
        });
        this.tt_wc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                myDialog.setContentView(R.layout.custom_popup);
                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                myDialog.show();
            }
        });
        this.aggregate_popup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                myDialog.setContentView(R.layout.haggregate_popup);
                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                myDialog.show();
            }
        });
        this.cementitious_popup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                myDialog.setContentView(R.layout.cemetitious_material);
                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                myDialog.show();
            }
        });
        this.waterreduced_popup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                myDialog.setContentView(R.layout.waterreduced);
                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                myDialog.show();
            }
        });
        this.chemical_popup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                myDialog.setContentView(R.layout.chemical_admixture);
                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                myDialog.show();
            }
        });
        this.flyash_popup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                myDialog.setContentView(R.layout.flyash_popup);
                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                myDialog.show();
            }
        });
        this.GGBS_popup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                myDialog.setContentView(R.layout.ggbs_popup);
                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                myDialog.show();
            }
        });
        this.silicafume_popup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                myDialog.setContentView(R.layout.silicafume_popup);
                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                myDialog.show();
            }
        });
        this.rice_popup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                myDialog.setContentView(R.layout.rice_popup);
                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                myDialog.show();
            }
        });
        this.metakaoline_popup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                myDialog.setContentView(R.layout.metakaoline_popoup);
                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                myDialog.show();
            }
        });
        this.wastage_popup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                myDialog.setContentView(R.layout.wastage_popup);
                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                myDialog.show();
            }
        });
        this.run.setOnClickListener(view -> {
            DecimalFormat decimalFormat = new DecimalFormat("#.###");
            decimalFormat.setRoundingMode(RoundingMode.CEILING);
            exp_condition = myspinner1.getSelectedItem().toString();
            ty_concrete = myspinner2.getSelectedItem().toString();
            G_concrete = myspinner3.getSelectedItem().toString();
            ty_cement = myspinner4.getSelectedItem().toString();
            size_aggregate = myspinner5.getSelectedItem().toString();
            ty_aggregate = myspinner6.getSelectedItem().toString();
            z_aggregate = spinner.getSelectedItem().toString();
            m_placing = spinner2.getSelectedItem().toString();
            s_control = spinner3.getSelectedItem().toString();
            slump = spinner5.getSelectedItem().toString();
            v_slump = (double) Integer.valueOf(slump).intValue();
            if (wc_ratio.getText().toString().isEmpty()) {
                v_wc_ratio = Utils.DOUBLE_EPSILON;
            } else {
                v_wc_ratio = Double.valueOf(wc_ratio.getText().toString()).doubleValue();
            }
            if (content_admixture.getText().toString().isEmpty()) {
                v_content_admixture = Utils.DOUBLE_EPSILON;
            } else {
                v_content_admixture = Double.valueOf(content_admixture.getText().toString()).doubleValue();
            }
            if (sp_admixture.getText().toString().isEmpty()) {
                v_sp_admixture = 1.145d;
            } else {
                v_sp_admixture = Double.valueOf(sp_admixture.getText().toString()).doubleValue();
            }
            if (sp_cement.getText().toString().isEmpty()) {
                v_sp_cement = 3.15d;
            } else {
                v_sp_cement = Double.valueOf(sp_cement.getText().toString()).doubleValue();
            }
            if (ecement_m.getText().toString().isEmpty()) {
                v_ecement_m = Utils.DOUBLE_EPSILON;
            } else {
                v_ecement_m = Double.valueOf(ecement_m.getText().toString()).doubleValue();
            }
            if (content_flyash.getText().toString().isEmpty()) {
                v_content_flyash = Utils.DOUBLE_EPSILON;
            } else {
                v_content_flyash = Double.valueOf(content_flyash.getText().toString()).doubleValue();
            }
            if (sp_flyash.getText().toString().isEmpty()) {
                v_sp_flyash = 2.2d;
            } else {
                v_sp_flyash = Double.valueOf(sp_flyash.getText().toString()).doubleValue();
            }
            if (content_GGBS.getText().toString().isEmpty()) {
                v_content_GGBS = Utils.DOUBLE_EPSILON;
            } else {
                v_content_GGBS = Double.valueOf(content_GGBS.getText().toString()).doubleValue();
            }
            if (sp_GGBS.getText().toString().isEmpty()) {
                v_sp_GGBS = 3.0d;
            } else {
                v_sp_GGBS = Double.valueOf(sp_GGBS.getText().toString()).doubleValue();
            }
            if (content_silicafume.getText().toString().isEmpty()) {
                v_content_silicafume = Utils.DOUBLE_EPSILON;
            } else {
                v_content_silicafume = Double.valueOf(content_silicafume.getText().toString()).doubleValue();
            }
            if (sp_silicafume.getText().toString().isEmpty()) {
                v_sp_silicafume = 2.2d;
            } else {
                v_sp_silicafume = Double.valueOf(sp_silicafume.getText().toString()).doubleValue();
            }
            if (content_matakaoline.getText().toString().isEmpty()) {
                v_content_matakaoline = Utils.DOUBLE_EPSILON;
            } else {
                v_content_matakaoline = Double.valueOf(content_matakaoline.getText().toString()).doubleValue();
            }
            if (sp_matakaoline.getText().toString().isEmpty()) {
                v_sp_matakaoline = 2.6d;
            } else {
                v_sp_matakaoline = Double.valueOf(sp_matakaoline.getText().toString()).doubleValue();
            }
            if (content_RAH.getText().toString().isEmpty()) {
                v_content_RAH = Utils.DOUBLE_EPSILON;
            } else {
                v_content_RAH = Double.valueOf(content_RAH.getText().toString()).doubleValue();
            }
            if (sp_RAH.getText().toString().isEmpty()) {
                v_sp_RAH = 2.36d;
            } else {
                v_sp_RAH = Double.valueOf(sp_RAH.getText().toString()).doubleValue();
            }
            if (sp_CA.getText().toString().isEmpty()) {
                v_sp_CA = 2.74d;
            } else {
                v_sp_CA = Double.valueOf(sp_CA.getText().toString()).doubleValue();
            }
            if (sp_FA.getText().toString().isEmpty()) {
                v_sp_FA = 2.65d;
            } else {
                v_sp_FA = Double.valueOf(sp_FA.getText().toString()).doubleValue();
            }
            if (water_ACA.getText().toString().isEmpty()) {
                v_water_ACA = Utils.DOUBLE_EPSILON;
            } else {
                v_water_ACA = Double.valueOf(water_ACA.getText().toString()).doubleValue();
            }
            if (water_AFA.getText().toString().isEmpty()) {
                v_water_AFA = Utils.DOUBLE_EPSILON;
            } else {
                v_water_AFA = Double.valueOf(water_AFA.getText().toString()).doubleValue();
            }
            if (total_moisture_CA.getText().toString().isEmpty()) {
                v_total_moisture_CA = Utils.DOUBLE_EPSILON;
            } else {
                v_total_moisture_CA = Double.valueOf(total_moisture_CA.getText().toString()).doubleValue();
            }
            if (total_moisture_FA.getText().toString().isEmpty()) {
                v_total_moisture_FA = Utils.DOUBLE_EPSILON;
            } else {
                v_total_moisture_FA = Double.valueOf(total_moisture_FA.getText().toString()).doubleValue();
            }
            if (waterreduce.getText().toString().isEmpty()) {
                water_reduce = Utils.DOUBLE_EPSILON;
            } else {
                water_reduce = Double.valueOf(waterreduce.getText().toString()).doubleValue();
            }
            if (wastage.getText().toString().isEmpty()) {
                v_wastage = Utils.DOUBLE_EPSILON;
            } else {
                v_wastage = Double.valueOf(wastage.getText().toString()).doubleValue();
            }
            AGG_condition = spinner4.getSelectedItem().toString();
            Integer num = map_f.get(G_concrete);
            if (spinner2.getSelectedItem().toString().equalsIgnoreCase("pumping")) {
                v_correction = Double.parseDouble(corection.getText().toString());
            }
            if (ty_aggregate.equals("Crushed angular")) {
                if (size_aggregate.equals("10")) {
                    W_content = 208.0d;
                } else if (size_aggregate.equals("20")) {
                    W_content = 186.0d;
                } else {
                    W_content = 165.0d;
                }
            } else if (ty_aggregate.equals("Sub angular")) {
                if (size_aggregate.equals("10")) {
                    W_content = 198.0d;
                } else if (size_aggregate.equals("20")) {
                    W_content = 176.0d;
                } else {
                    W_content = 155.0d;
                }
            } else if (ty_aggregate.equals("Gravel and Crused")) {
                if (size_aggregate.equals("10")) {
                    W_content = 193.0d;
                } else if (size_aggregate.equals("20")) {
                    W_content = 171.0d;
                } else {
                    W_content = 150.0d;
                }
            } else if (ty_aggregate.equals("Remould gravel")) {
                if (size_aggregate.equals("10")) {
                    W_content = 188.0d;
                } else if (size_aggregate.equals("20")) {
                    W_content = 166.0d;
                } else {
                    W_content = 145.0d;
                }
            }
            if (v_slump > 50.0d) {
                slump_cal = (int) (v_slump - 50.0d);
                inc_slump = (((double) slump_cal) * 0.03d) / 25.0d;
                W_content += W_content * inc_slump;
                W_content = (double) Math.round(W_content);
            } else if (v_slump < 50.0d) {
                slump_cal = (int) (50.0d - v_slump);
                inc_slump = (((double) slump_cal) * 0.03d) / 25.0d;
                W_content -= W_content * inc_slump;
                W_content = (double) Math.round(W_content);
            } else {
                slump_cal = 0;
            }
            v_waterreduce = (double) Math.round(W_content * ((100.0d - water_reduce) / 100.0d))
            ;
            f_wcratio = toggle.isChecked() ? v_wc_ratio : vv_wc_ratio;
            cementcontent = (double) Math.round(v_waterreduce / f_wcratio);
            extra_cement = cementcontent + ((v_ecement_m * cementcontent) / 100.0d);
            extra_cement = Double.valueOf(decimalFormat.format(extra_cement)).doubleValue();
            if (ty_concrete.equals("Plain Concrete")) {
                if (exp_condition.equals("Mild")) {
                    if (extra_cement > 220.0d) {
                        final_cementcontent = extra_cement;
                    } else {
                        final_cementcontent = 220.0d;
                    }
                } else if (exp_condition.equals("Moderate")) {
                    if (extra_cement > 240.0d) {
                        final_cementcontent = extra_cement;
                    } else {
                        final_cementcontent = 240.0d;
                    }
                } else if (exp_condition.equals("Severe")) {
                    if (extra_cement > 250.0d) {
                        final_cementcontent = extra_cement;
                    } else {
                        final_cementcontent = 250.0d;
                    }
                } else if (exp_condition.equals("VerySevere")) {
                    if (extra_cement > 260.0d) {
                        final_cementcontent = extra_cement;
                    } else {
                        final_cementcontent = 260.0d;
                    }
                } else if (extra_cement > 280.0d) {
                    final_cementcontent = extra_cement;
                } else {
                    final_cementcontent = 280.0d;
                }
            } else if (exp_condition.equals("Mild")) {
                if (extra_cement > 300.0d) {
                    final_cementcontent = extra_cement;
                } else {
                    final_cementcontent = 300.0d;
                }
            } else if (exp_condition.equals("Moderate")) {
                if (extra_cement > 300.0d) {
                    final_cementcontent = extra_cement;
                } else {
                    final_cementcontent = 300.0d;
                }
            } else if (exp_condition.equals("Severe")) {
                if (extra_cement > 320.0d) {
                    final_cementcontent = extra_cement;
                } else {
                    final_cementcontent = 320.0d;
                }
            } else if (exp_condition.equals("VerySevere")) {
                if (extra_cement > 340.0d) {
                    final_cementcontent = extra_cement;
                } else {
                    final_cementcontent = 340.0d;
                }
            } else if (extra_cement > 360.0d) {
                final_cementcontent = extra_cement;
            } else {
                final_cementcontent = 360.0d;
            }
            if (Double.isNaN(v_content_flyash)) {
                m_flyash = Utils.DOUBLE_EPSILON;
            } else {
                m_flyash = final_cementcontent * (v_content_flyash / 100.0d);
                m_flyash = Double.valueOf(decimalFormat.format(m_flyash)).doubleValue();
            }
            if (Double.isNaN(v_content_GGBS)) {
                m_ggbs = Utils.DOUBLE_EPSILON;
            } else {
                m_ggbs = final_cementcontent * (v_content_GGBS / 100.0d);
                m_ggbs = Double.valueOf(decimalFormat.format(m_ggbs)).doubleValue();
            }
            if (Double.isNaN(v_content_silicafume)) {
                m_silica = Utils.DOUBLE_EPSILON;
            } else {
                m_silica = final_cementcontent * (v_content_silicafume / 100.0d);
                m_silica = Double.valueOf(decimalFormat.format(m_silica)).doubleValue();
            }
            if (Double.isNaN(v_content_matakaoline)) {
                m_matakaoline = Utils.DOUBLE_EPSILON;
            } else {
                m_matakaoline = final_cementcontent * (v_content_matakaoline / 100.0d);
                m_matakaoline = Double.valueOf(decimalFormat.format(m_matakaoline)).doubleValue();
            }
            if (Double.isNaN(v_content_RAH)) {
                m_rise = Utils.DOUBLE_EPSILON;
            } else {
                m_rise = final_cementcontent * (v_content_RAH / 100.0d);
                m_rise = Double.valueOf(decimalFormat.format(m_rise)).doubleValue();
            }
            if (Double.isNaN(v_content_admixture)) {
                m_chemical = Utils.DOUBLE_EPSILON;
            } else {
                m_chemical = final_cementcontent * (v_content_admixture / 100.0d);
                m_chemical = Double.valueOf(decimalFormat.format(m_chemical)).doubleValue();

                ff_cement = final_cementcontent - ((((m_flyash + m_rise) + m_matakaoline) + m_silica) + m_ggbs);
                ff_cement = Double.valueOf(decimalFormat.format(ff_cement)).doubleValue();

                ffinal_wcratio = v_waterreduce /
                        final_cementcontent;
                ffinal_wcratio = Double.valueOf(decimalFormat.format(ffinal_wcratio)).doubleValue();
                if (ff_cement < 450.0d) {
                    fff_cement = ff_cement;
                } else {
                    fff_cement = 450.0d;
                }
                if (z_aggregate.equals("Zone 1") && size_aggregate.equals("10")) {
                    volume_cfaggregate = Double.valueOf(0.48d).doubleValue();
                } else if (z_aggregate.equals("Zone 1") && size_aggregate.equals("20")) {
                    volume_cfaggregate = Double.valueOf(0.6d).doubleValue();
                } else if (z_aggregate.equals("Zone 1") && size_aggregate.equals("40")) {
                    volume_cfaggregate = Double.valueOf(0.69d).doubleValue();
                } else if (z_aggregate.equals("Zone 2") && size_aggregate.equals("10")) {
                    volume_cfaggregate = Double.valueOf(0.5d).doubleValue();
                } else if (z_aggregate.equals("Zone 2") && size_aggregate.equals("20")) {
                    volume_cfaggregate = Double.valueOf(0.62d).doubleValue();
                } else if (z_aggregate.equals("Zone 2") && size_aggregate.equals("40")) {
                    volume_cfaggregate = Double.valueOf(0.71d).doubleValue();
                } else if (z_aggregate.equals("Zone 3") && size_aggregate.equals("10")) {
                    volume_cfaggregate = Double.valueOf(0.52d).doubleValue();
                } else if (z_aggregate.equals("Zone 3") && size_aggregate.equals("20")) {
                    volume_cfaggregate = Double.valueOf(0.64d).doubleValue();
                } else if (z_aggregate.equals("Zone 3") && size_aggregate.equals("40")) {
                    volume_cfaggregate = Double.valueOf(0.72d).doubleValue();
                } else if (z_aggregate.equals("Zone 4") && size_aggregate.equals("10")) {
                    volume_cfaggregate = Double.valueOf(0.54d).doubleValue();
                } else if (!z_aggregate.equals("Zone 4") || !size_aggregate.equals("20")) {
                    volume_cfaggregate = Double.valueOf(0.73d).doubleValue();
                } else {
                    volume_cfaggregate = Double.valueOf(0.66d).doubleValue();
                }
                if (ffinal_wcratio < 0.5d) {
                    a_aggregate = 0.5d -
                            ffinal_wcratio;
                    a_aggregate = (a_aggregate * 0.01d) / 0.05d;
                    this.v_coarseaggregate = volume_cfaggregate + a_aggregate;
                    this.v_coarseaggregate = Double.valueOf(decimalFormat.format(this.v_coarseaggregate)).doubleValue();
                } else if (ffinal_wcratio > 0.5d) {
                    a_aggregate = ffinal_wcratio - 0.5d;
                    a_aggregate = (a_aggregate * 0.01d) / 0.05d;
                    this.v_coarseaggregate = volume_cfaggregate - a_aggregate;
                    this.v_coarseaggregate = Double.valueOf(decimalFormat.format(this.v_coarseaggregate)).doubleValue();
                } else {
                    this.v_coarseaggregate = volume_cfaggregate;
                    this.v_coarseaggregate = Double.valueOf(decimalFormat.format(this.v_coarseaggregate)).doubleValue();
                }
                if (m_placing.equalsIgnoreCase("pumping")) {
                    this.v_coarseaggregate *= (100.0d - v_correction) / 100.0d;
                    this.v_coarseaggregate = Double.valueOf(decimalFormat.format(this.v_coarseaggregate)).doubleValue();

                    volume_fineaggregate = 1.0d - this.v_coarseaggregate;
                    volume_fineaggregate = Double.valueOf(decimalFormat.format(volume_fineaggregate)).doubleValue();
                    if (size_aggregate.equals("10")) {
                        en_air = Double.valueOf(0.015d).doubleValue();
                    } else if (size_aggregate.equals("20")) {
                        en_air = Double.valueOf(0.01d).doubleValue();
                    } else {
                        this.en_air = Double.valueOf(0.008d).doubleValue();
                    }
                    this.v_total = 1.0d;
                    this.v_cement = Double.valueOf((fff_cement / v_sp_cement) * 0.001d).doubleValue();
                    this.v_cement = Double.valueOf(decimalFormat.format(v_cement)).doubleValue();
                    if (this.m_flyash == Utils.DOUBLE_EPSILON) {
                        this.v_flyash = Utils.DOUBLE_EPSILON;
                    } else
                        this.v_flyash = (m_flyash / v_sp_flyash) * 0.001d;
                    this.v_flyash = Double.valueOf(decimalFormat.format(v_flyash)).doubleValue();
                }
                if (this.m_ggbs == Utils.DOUBLE_EPSILON) {
                    this.v_ggbs = Utils.DOUBLE_EPSILON;
                } else
                    this.v_ggbs = (m_ggbs / v_sp_GGBS) * 0.001d;
                this.v_ggbs = Double.valueOf(decimalFormat.format(v_ggbs)).doubleValue();
            }
            if (this.m_silica == Utils.DOUBLE_EPSILON) {
                this.v_silica = Utils.DOUBLE_EPSILON;
            } else {
                this.v_silica = (m_silica / v_sp_silicafume) * 0.001d;
                this.v_silica = Double.valueOf(decimalFormat.format(v_silica)).doubleValue();
            }
            if (this.m_rise == Utils.DOUBLE_EPSILON) {
                this.v_rise = Utils.DOUBLE_EPSILON;
            } else {
                this.v_content_RAH = (m_rise / v_sp_RAH) * 0.001d;
                this.v_content_RAH = Double.valueOf(decimalFormat.format(v_content_RAH)).doubleValue();
            }
            if (this.m_matakaoline == Utils.DOUBLE_EPSILON) {
                this.v_matakaoline = Utils.DOUBLE_EPSILON;
            } else {
                this.v_matakaoline = (m_matakaoline / v_sp_matakaoline) * 0.001d;
                this.v_matakaoline = Double.valueOf(decimalFormat.format(v_matakaoline)).doubleValue();
            }
            if (m_chemical == Utils.DOUBLE_EPSILON) {
                this.v_chemical = Utils.DOUBLE_EPSILON;
            } else
                this.v_chemical = (m_chemical / v_sp_admixture) * 0.001d;
            this.v_chemical = Double.valueOf(decimalFormat.format(v_chemical)).doubleValue();

            this.v_water = v_waterreduce * 0.001d;
            this.v_water = Double.valueOf(decimalFormat.format(v_water)).doubleValue();

            double doubleValue = Double.valueOf(decimalFormat.format(en_air + v_cement + v_flyash + v_ggbs + v_silica + v_content_RAH + v_matakaoline + v_water + v_chemical)).doubleValue();
            this.v_allaggregate = v_total - doubleValue;
            this.v_allaggregate = Double.valueOf(decimalFormat.format(v_allaggregate)).doubleValue();

            this.m_of_coarse = this.v_allaggregate * this.v_coarseaggregate * v_sp_CA * 1000.0d;
            this.m_of_coarse = Double.valueOf(decimalFormat.format(m_of_coarse)).doubleValue();

            this.m_of_fine = v_allaggregate * volume_fineaggregate * v_sp_FA * 1000.0d;
            this.m_of_fine = Double.valueOf(decimalFormat.format(m_of_fine)).doubleValue();

            this.CA_free = v_total_moisture_CA - v_water_ACA;
            this.CA_free = Double.valueOf(decimalFormat.format(CA_free)).doubleValue();

            this.FA_free = v_total_moisture_FA - v_water_AFA;
            this.FA_free = Double.valueOf(decimalFormat.format(FA_free)).doubleValue();

            this.w_coarse = m_of_coarse * ((CA_free / 100.0d) + 1.0d);
            this.w_coarse = Double.valueOf(decimalFormat.format(w_coarse)).doubleValue();

            this.w_fine = m_of_fine * ((FA_free / 100.0d) + 1.0d);
            this.w_fine = Double.valueOf(decimalFormat.format(w_fine)).doubleValue();

            this.w_content_coarse = w_coarse - m_of_coarse;
            this.w_content_coarse = Double.valueOf(decimalFormat.format(w_content_coarse)).doubleValue();

            this.w_content_fine = w_fine - m_of_fine;
            this.w_content_fine = Double.valueOf(decimalFormat.format(w_content_fine)).doubleValue();

            this.require_water = v_waterreduce - (w_content_coarse + w_content_fine);
            this.require_water = Double.valueOf(decimalFormat.format(require_water)).doubleValue();
            if (AGG_condition.equals("SSD")) {
                this. m_of_coarse = this.v_allaggregate * this.v_coarseaggregate * v_sp_CA * 1000.0d;
                this.m_of_coarse = Double.valueOf(decimalFormat.format(m_of_coarse)).doubleValue();
            } else {
                this.m_of_coarse = w_coarse;
            }
            if (AGG_condition.equals("SSD")) {
                this.m_of_fine = v_allaggregate * volume_fineaggregate * v_sp_FA * 1000.0d;
                this.m_of_fine = Double.valueOf(decimalFormat.format(m_of_fine)).doubleValue();
            } else {
                this.m_of_fine = w_fine;
            }
            if (AGG_condition.equals("SSD")) {
                this.v_water = v_waterreduce;
                this.v_water = Double.valueOf(decimalFormat.format(v_water)).doubleValue();
            } else {
                this.v_water = require_water;
            }

            fff_cement += fff_cement * (v_wastage / 100.0d);
            fff_cement = Double.valueOf(decimalFormat.format(fff_cement)).

                    doubleValue();

            m_ggbs += m_ggbs * (v_wastage / 100.0d);
            m_ggbs = Double.valueOf(decimalFormat.format(m_ggbs)).

                    doubleValue();

            m_flyash += m_flyash * (v_wastage / 100.0d);
            m_flyash = Double.valueOf(decimalFormat.format(m_flyash)).

                    doubleValue();

            m_matakaoline += m_matakaoline * (v_wastage / 100.0d);
            m_matakaoline = Double.valueOf(decimalFormat.format(m_matakaoline)).

                    doubleValue();

            m_rise += m_rise * (v_wastage / 100.0d);
            m_rise = Double.valueOf(decimalFormat.format(m_rise)).

                    doubleValue();

            m_silica += m_silica * (v_wastage / 100.0d);
            m_silica = Double.valueOf(decimalFormat.format(m_silica)).

                    doubleValue();

            v_water += v_water * (v_wastage / 100.0d);
            v_water = Double.valueOf(decimalFormat.format(v_water)).

                    doubleValue();

            m_of_fine += m_of_fine * (v_wastage / 100.0d);
            m_of_fine = Double.valueOf(decimalFormat.format(m_of_fine)).

                    doubleValue();

            m_of_coarse += m_of_coarse * (v_wastage / 100.0d);
            m_of_coarse = Double.valueOf(decimalFormat.format(m_of_coarse)).

                    doubleValue();

            m_chemical += m_chemical * (v_wastage / 100.0d);
            m_chemical = Double.valueOf(decimalFormat.format(m_chemical)).

                    doubleValue();

            density = fff_cement + m_ggbs + m_flyash + m_matakaoline + m_rise + m_silica + v_water + m_of_fine + m_of_coarse + m_chemical;
            density = Double.valueOf(decimalFormat.format(density)).

                    doubleValue();

                Intent intent = new Intent(requireActivity(), Normal_result.class);
                intent.putExtra("ff_cemnet", fff_cement);
                intent.putExtra("m_ggbs", m_ggbs);
                intent.putExtra("m_flyash", m_flyash);
                intent.putExtra("m_matakaoline", m_matakaoline);
                intent.putExtra("m_rice", m_rise);
                intent.putExtra("m_silica", m_silica);
                intent.putExtra("m_water", v_water);
                intent.putExtra("m_of_fine", m_of_fine);
                intent.putExtra("m_of_coarse", this.m_of_coarse);
                intent.putExtra("m_chemical", m_chemical);
                intent.putExtra("ffinal_wcratio", ffinal_wcratio);
                intent.putExtra("density", density);

                startActivity(intent);
        });


    }


    public void calculate() {
        this.exp_condition = this.myspinner1.getSelectedItem().toString();
        this.ty_cement = this.myspinner4.getSelectedItem().toString();
        this.G_concrete = this.myspinner3.getSelectedItem().toString();
        this.ty_concrete = this.myspinner2.getSelectedItem().toString();
        Integer num = this.map_f.get(this.G_concrete);
        boolean b = num.intValue() == 30 || num.intValue() == 35 || num.intValue() == 40 || num.intValue() == 45 || num.intValue() == 50 || num.intValue() == 55 || num.intValue() == 60;
        if (num.intValue() == 10 || num.intValue() == 15) {
            this.standard_deviation = 3.5d;
        } else if (num.intValue() == 20 || num.intValue() == 25) {
            this.standard_deviation = 4.0d;
        } else if (b) {
            this.standard_deviation = 5.0d;
        } else if (num.intValue() == 65 || num.intValue() == 70 || num.intValue() == 75 || num.intValue() == 80) {
            this.standard_deviation = 6.0d;
        } else if (num.intValue() == 40) {
            this.standard_deviation = 5.0d;
        } else {
            this.standard_deviation = 7.0d;
        }
        this.f_ck = ((double) this.map_f.get(this.G_concrete).intValue()) + (this.standard_deviation * 1.65d);
        if (num.intValue() == 10 || num.intValue() == 15) {
            this.X_value = 5.0d;
        } else if (num.intValue() == 20 || num.intValue() == 25) {
            this.X_value = 5.5d;
        } else if (b) {
            this.X_value = 6.5d;
        } else {
            this.X_value = 8.0d;
        }
        double intValue = ((double) this.map_f.get(this.G_concrete).intValue()) + this.X_value;
        this.f_ckk = intValue;
        double d = this.f_ck;
        if (d > intValue) {
            this.target_ck = d;
        } else {
            this.target_ck = intValue;
        }
        if (this.ty_cement.equals("PPC")) {
            this.vv_wc_ratio = (Math.log(this.target_ck) * -0.319d) + 1.5858d;
        } else if (this.ty_cement.equals("OPC 33")) {
            this.vv_wc_ratio = (Math.log(this.target_ck) * -0.282d) + 1.4105d;
        } else if (this.ty_cement.equals("OPC 43")) {
            this.vv_wc_ratio = (Math.log(this.target_ck) * -0.319d) + 1.5858d;
        } else {
            this.vv_wc_ratio = (Math.log(this.target_ck) * -0.368d) + 1.8336d;
        }
        if (this.ty_concrete.equals("Plain Concrete")) {
            if (this.exp_condition.equals("Mild")) {
                double d2 = this.vv_wc_ratio;
                if (d2 < 0.6d) {
                    this.f_wcratio = d2;
                } else {
                    this.f_wcratio = 0.6d;
                }
            } else if (this.exp_condition.equals("Moderate")) {
                double d3 = this.vv_wc_ratio;
                if (d3 < 0.6d) {
                    this.f_wcratio = d3;
                } else {
                    this.f_wcratio = 0.6d;
                }
            } else if (this.exp_condition.equals("Severe")) {
                double d4 = this.vv_wc_ratio;
                if (d4 < 0.5d) {
                    this.f_wcratio = d4;
                } else {
                    this.f_wcratio = 0.5d;
                }
            } else if (this.exp_condition.equals("VerySevere")) {
                double d5 = this.vv_wc_ratio;
                if (d5 < 0.45d) {
                    this.f_wcratio = d5;
                } else {
                    this.f_wcratio = 0.45d;
                }
            } else {
                double d6 = this.vv_wc_ratio;
                if (d6 < 0.4d) {
                    this.f_wcratio = d6;
                } else {
                    this.f_wcratio = 0.4d;
                }
            }
        } else if (this.exp_condition.equals("Mild")) {
            double d7 = this.vv_wc_ratio;
            if (d7 < 0.55d) {
                this.f_wcratio = d7;
            } else {
                this.f_wcratio = 0.55d;
            }
        } else if (this.exp_condition.equals("Moderate")) {
            double d8 = this.vv_wc_ratio;
            if (d8 < 0.5d) {
                this.f_wcratio = d8;
            } else {
                this.f_wcratio = 0.5d;
            }
        } else if (this.exp_condition.equals("Severe")) {
            double d9 = this.vv_wc_ratio;
            if (d9 < 0.45d) {
                this.f_wcratio = d9;
            } else {
                this.f_wcratio = 0.45d;
            }
        } else if (this.exp_condition.equals("VerySevere")) {
            double d10 = this.vv_wc_ratio;
            if (d10 < 0.45d) {
                this.f_wcratio = d10;
            } else {
                this.f_wcratio = 0.45d;
            }
        } else {
            double d11 = this.vv_wc_ratio;
            if (d11 < 0.4d) {
                this.f_wcratio = d11;
            } else {
                this.f_wcratio = 0.4d;
            }
        }
    }

}
