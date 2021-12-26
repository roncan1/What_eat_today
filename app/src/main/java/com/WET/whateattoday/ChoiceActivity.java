package com.WET.whateattoday;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class ChoiceActivity extends AppCompatActivity {

    CheckBox[] check;
    View btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        init();
        endChoose();
    }

    void endChoose() {
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChoiceActivity.this, ResultActivity3.class);
                startActivity(intent);
            }
        });
    }

    void init() {
        btn_next = (View) findViewById(R.id.btn_end_choose);

        check = new CheckBox[148];
        check[0] = (CheckBox) findViewById(R.id.check1);
        check[1] = (CheckBox) findViewById(R.id.check2);
        check[2] = (CheckBox) findViewById(R.id.check3);
        check[3] = (CheckBox) findViewById(R.id.check4);
        check[4] = (CheckBox) findViewById(R.id.check5);
        check[5] = (CheckBox) findViewById(R.id.check6);
        check[6] = (CheckBox) findViewById(R.id.check7);
        check[7] = (CheckBox) findViewById(R.id.check8);
        check[8] = (CheckBox) findViewById(R.id.check9);
        check[9] = (CheckBox) findViewById(R.id.check10);

        check[10] = (CheckBox) findViewById(R.id.check10);
        check[11] = (CheckBox) findViewById(R.id.check11);
        check[12] = (CheckBox) findViewById(R.id.check12);
        check[13] = (CheckBox) findViewById(R.id.check13);
        check[14] = (CheckBox) findViewById(R.id.check14);
        check[15] = (CheckBox) findViewById(R.id.check15);
        check[16] = (CheckBox) findViewById(R.id.check16);
        check[17] = (CheckBox) findViewById(R.id.check17);
        check[18] = (CheckBox) findViewById(R.id.check18);
        check[19] = (CheckBox) findViewById(R.id.check19);

        check[20] = (CheckBox) findViewById(R.id.check20);
        check[21] = (CheckBox) findViewById(R.id.check21);
        check[22] = (CheckBox) findViewById(R.id.check22);
        check[23] = (CheckBox) findViewById(R.id.check23);
        check[24] = (CheckBox) findViewById(R.id.check24);
        check[25] = (CheckBox) findViewById(R.id.check25);
        check[26] = (CheckBox) findViewById(R.id.check26);
        check[27] = (CheckBox) findViewById(R.id.check27);
        check[28] = (CheckBox) findViewById(R.id.check28);
        check[29] = (CheckBox) findViewById(R.id.check29);

        check[30] = (CheckBox) findViewById(R.id.check30);
        check[31] = (CheckBox) findViewById(R.id.check31);
        check[32] = (CheckBox) findViewById(R.id.check32);
        check[33] = (CheckBox) findViewById(R.id.check33);
        check[34] = (CheckBox) findViewById(R.id.check34);
        check[35] = (CheckBox) findViewById(R.id.check35);
        check[36] = (CheckBox) findViewById(R.id.check36);
        check[37] = (CheckBox) findViewById(R.id.check37);
        check[38] = (CheckBox) findViewById(R.id.check38);
        check[39] = (CheckBox) findViewById(R.id.check39);

        check[40] = (CheckBox) findViewById(R.id.check40);
        check[41] = (CheckBox) findViewById(R.id.check41);
        check[42] = (CheckBox) findViewById(R.id.check42);
        check[43] = (CheckBox) findViewById(R.id.check43);
        check[44] = (CheckBox) findViewById(R.id.check44);
        check[45] = (CheckBox) findViewById(R.id.check45);
        check[46] = (CheckBox) findViewById(R.id.check46);
        check[47] = (CheckBox) findViewById(R.id.check47);
        check[48] = (CheckBox) findViewById(R.id.check48);
        check[49] = (CheckBox) findViewById(R.id.check49);

        check[50] = (CheckBox) findViewById(R.id.check50);
        check[51] = (CheckBox) findViewById(R.id.check51);
        check[52] = (CheckBox) findViewById(R.id.check52);
        check[53] = (CheckBox) findViewById(R.id.check53);
        check[54] = (CheckBox) findViewById(R.id.check54);
        check[55] = (CheckBox) findViewById(R.id.check55);
        check[56] = (CheckBox) findViewById(R.id.check56);
        check[57] = (CheckBox) findViewById(R.id.check57);
        check[58] = (CheckBox) findViewById(R.id.check58);
        check[59] = (CheckBox) findViewById(R.id.check59);

        check[60] = (CheckBox) findViewById(R.id.check60);
        check[61] = (CheckBox) findViewById(R.id.check61);
        check[62] = (CheckBox) findViewById(R.id.check62);
        check[63] = (CheckBox) findViewById(R.id.check63);
        check[64] = (CheckBox) findViewById(R.id.check64);
        check[65] = (CheckBox) findViewById(R.id.check65);
        check[66] = (CheckBox) findViewById(R.id.check66);
        check[67] = (CheckBox) findViewById(R.id.check67);
        check[68] = (CheckBox) findViewById(R.id.check68);
        check[69] = (CheckBox) findViewById(R.id.check69);

        check[70] = (CheckBox) findViewById(R.id.check70);
        check[71] = (CheckBox) findViewById(R.id.check71);
        check[72] = (CheckBox) findViewById(R.id.check72);
        check[73] = (CheckBox) findViewById(R.id.check73);
        check[74] = (CheckBox) findViewById(R.id.check74);
        check[75] = (CheckBox) findViewById(R.id.check75);
        check[76] = (CheckBox) findViewById(R.id.check76);
        check[77] = (CheckBox) findViewById(R.id.check77);
        check[78] = (CheckBox) findViewById(R.id.check78);
        check[79] = (CheckBox) findViewById(R.id.check79);

        check[80] = (CheckBox) findViewById(R.id.check80);
        check[81] = (CheckBox) findViewById(R.id.check81);
        check[82] = (CheckBox) findViewById(R.id.check82);
        check[83] = (CheckBox) findViewById(R.id.check83);
        check[84] = (CheckBox) findViewById(R.id.check84);
        check[85] = (CheckBox) findViewById(R.id.check85);
        check[86] = (CheckBox) findViewById(R.id.check86);
        check[87] = (CheckBox) findViewById(R.id.check87);
        check[88] = (CheckBox) findViewById(R.id.check88);
        check[89] = (CheckBox) findViewById(R.id.check89);

        check[90] = (CheckBox) findViewById(R.id.check90);
        check[91] = (CheckBox) findViewById(R.id.check91);
        check[92] = (CheckBox) findViewById(R.id.check92);
        check[93] = (CheckBox) findViewById(R.id.check93);
        check[94] = (CheckBox) findViewById(R.id.check94);
        check[95] = (CheckBox) findViewById(R.id.check95);
        check[96] = (CheckBox) findViewById(R.id.check96);
        check[97] = (CheckBox) findViewById(R.id.check97);
        check[98] = (CheckBox) findViewById(R.id.check98);
        check[99] = (CheckBox) findViewById(R.id.check99);

        check[100] = (CheckBox) findViewById(R.id.check100);
        check[101] = (CheckBox) findViewById(R.id.check101);
        check[102] = (CheckBox) findViewById(R.id.check102);
        check[103] = (CheckBox) findViewById(R.id.check103);
        check[104] = (CheckBox) findViewById(R.id.check104);
        check[105] = (CheckBox) findViewById(R.id.check105);
        check[106] = (CheckBox) findViewById(R.id.check106);
        check[107] = (CheckBox) findViewById(R.id.check107);
        check[108] = (CheckBox) findViewById(R.id.check108);
        check[109] = (CheckBox) findViewById(R.id.check109);

        check[110] = (CheckBox) findViewById(R.id.check110);
        check[111] = (CheckBox) findViewById(R.id.check111);
        check[112] = (CheckBox) findViewById(R.id.check112);
        check[113] = (CheckBox) findViewById(R.id.check113);
        check[114] = (CheckBox) findViewById(R.id.check114);
        check[115] = (CheckBox) findViewById(R.id.check115);
        check[116] = (CheckBox) findViewById(R.id.check116);
        check[117] = (CheckBox) findViewById(R.id.check117);
        check[118] = (CheckBox) findViewById(R.id.check118);
        check[119] = (CheckBox) findViewById(R.id.check119);

        check[120] = (CheckBox) findViewById(R.id.check120);
        check[121] = (CheckBox) findViewById(R.id.check121);
        check[122] = (CheckBox) findViewById(R.id.check122);
        check[123] = (CheckBox) findViewById(R.id.check123);
        check[124] = (CheckBox) findViewById(R.id.check124);
        check[125] = (CheckBox) findViewById(R.id.check125);
        check[126] = (CheckBox) findViewById(R.id.check126);
        check[127] = (CheckBox) findViewById(R.id.check127);
        check[128] = (CheckBox) findViewById(R.id.check128);
        check[129] = (CheckBox) findViewById(R.id.check129);

        check[130] = (CheckBox) findViewById(R.id.check130);
        check[131] = (CheckBox) findViewById(R.id.check131);
        check[132] = (CheckBox) findViewById(R.id.check132);
        check[133] = (CheckBox) findViewById(R.id.check133);
        check[134] = (CheckBox) findViewById(R.id.check134);
        check[135] = (CheckBox) findViewById(R.id.check135);
        check[136] = (CheckBox) findViewById(R.id.check136);
        check[137] = (CheckBox) findViewById(R.id.check137);
        check[138] = (CheckBox) findViewById(R.id.check138);
        check[139] = (CheckBox) findViewById(R.id.check139);

        check[140] = (CheckBox) findViewById(R.id.check140);
        check[141] = (CheckBox) findViewById(R.id.check141);
        check[142] = (CheckBox) findViewById(R.id.check142);
        check[143] = (CheckBox) findViewById(R.id.check143);
        check[144] = (CheckBox) findViewById(R.id.check144);
        check[145] = (CheckBox) findViewById(R.id.check145);
        check[146] = (CheckBox) findViewById(R.id.check146);
        check[147] = (CheckBox) findViewById(R.id.check147);
        check[148] = (CheckBox) findViewById(R.id.check148);


    }
}
