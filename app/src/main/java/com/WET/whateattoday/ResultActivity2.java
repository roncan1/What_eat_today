package com.WET.whateattoday;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

import de.hdodenhof.circleimageview.CircleImageView;

public class ResultActivity2 extends AppCompatActivity {

    Food[] food = new Food[183];
    CircleImageView iv_result;
    TextView tv_result;
    Food resultFood;
    View btn_home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);
        try {
            setFood();
            init();
            setResult();
            home();
        } catch (Exception e) {
            Toast.makeText(ResultActivity2.this, "조건에 해당하는 음식이 없습니다.", Toast.LENGTH_LONG);
            finish();
        }
    }

    void home() {
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        finish();
    }

    void setResult() {
        tv_result.setText(resultFood.getName());
        iv_result.setImageResource(resultFood.getImage());
    }




    Food choiceFood() {
        Random random = new Random();
        int resultNum = random.nextInt(food.length-1);

        return food[resultNum];
    }

    void init() {
        iv_result = (CircleImageView) findViewById(R.id.iv_result);
        tv_result = (TextView) findViewById(R.id.tv_result);
        btn_home = (View) findViewById(R.id.btn_home);
        resultFood = choiceFood();
    }

    void setFood() {
        food[0] = new Food("비빔밥", 0, 4, 1, 2, R.drawable.bibimbap);
        food[1] = new Food("김치볶음밥", 0, 4, 1, 2, R.drawable.gimchibokkumbob);
        food[2] = new Food("국밥", 0, 4, 1, 1, R.drawable.gukbap);
        food[3] = new Food("죽류", 0, 4, 1, 1, R.drawable.jukryu);
        food[4] = new Food("설렁탕", 0, 4, 1, 1, R.drawable.sulrungtang);
        food[5] = new Food("김밥", 0, 4, 0, 1, R.drawable.gimbap);
        food[6] = new Food("회덮밥", 0, 4, 1, 2, R.drawable.heuidupbap);
        food[7] = new Food("치킨마요덮밥", 0, 4, 1, 1, R.drawable.chikinmayodeopbap);
        food[8] = new Food("제육덮밥", 0, 4, 1, 2, R.drawable.jeyukdeopbap);
        food[9] = new Food("갈비탕", 0, 4, 1, 1, R.drawable.galbitang);

        food[10] = new Food("초빕", 0, 5, 2, 1, R.drawable.chobap);
        food[11] = new Food("규동", 0, 5, 1, 1, R.drawable.gyudong);
        food[12] = new Food("알밥", 0, 5, 1, 1, R.drawable.albap);
        food[13] = new Food("오야코동", 0, 5, 1, 1, R.drawable.oyakodong);
        food[14] = new Food("오므라이스", 0, 5, 1, 1, R.drawable.omurice);
        food[15] = new Food("사케동", 0, 5, 2, 1, R.drawable.sakedong);
        food[16] = new Food("장어덮밥", 0, 5, 2, 1, R.drawable.jangeodeopbap);
        food[17] = new Food("텐동", 0, 5, 1, 1, R.drawable.tandong);
        food[18] = new Food("가츠동", 0, 5, 1, 1, R.drawable.gacheudong);
        food[19] = new Food("하이라이스", 0, 5, 1, 1, R.drawable.omurice);

        food[20] = new Food("중식볶음밥", 0, 6, 1, 1, R.drawable.jungsikbokkeumbap);
        food[21] = new Food("짜장밥", 0, 6, 1, 1, R.drawable.jjajangbap);
        food[22] = new Food("중화비빔밥", 0, 6, 1, 2, R.drawable.junghwabibimbob);
        food[23] = new Food("잡채밥", 0, 6, 1, 1, R.drawable.jobchaebob);
        food[24] = new Food("짬뽕밥", 0, 6, 1, 1, R.drawable.jjambbongbob);

        food[25] = new Food("리조또", 0, 7, 1, 1, R.drawable.rijotto);

        food[26] = new Food("떡국", 2, 4, 1, 1, R.drawable.tteokguk);
        food[27] = new Food("떡볶이", 2, 4, 3, 2, R.drawable.tteokbokki);
        food[28] = new Food("수제비", 2, 4, 1, 1, R.drawable.sujevi);
        food[29] = new Food("라볶이", 2, 4, 1, 2, R.drawable.rabokki);

        food[30] = new Food("꽃빵", 2, 6, 1, 1, R.drawable.ggotbbang);

        food[31] = new Food("햄버거", 2, 7, 1, 1, R.drawable.haembeogeo);
        food[32] = new Food("토스트", 2, 7, 0, 1, R.drawable.toseuteu);
        food[33] = new Food("뇨끼", 2, 7, 1, 2, R.drawable.nyokki);
        food[34] = new Food("핫도그", 2, 7, 0, 1, R.drawable.hotdog);
        food[35] = new Food("피자", 2, 7, 4, 1, R.drawable.pija);
        food[36] = new Food("샌드위치", 2, 7, 1, 1, R.drawable.saendeuwichi);
        food[37] = new Food("시리얼", 2, 7, 0, 1, R.drawable.sirieol);
        food[38] = new Food("수제버거", 2, 7, 2, 2, R.drawable.sujebeogeo);

        food[39] = new Food("쫄면", 1, 4, 1, 2, R.drawable.jjolmyeon);
        food[40] = new Food("라면", 1, 4, 0, 2, R.drawable.ramyeon);
        food[41] = new Food("잡채", 1, 4, 1, 1, R.drawable.jobchae);
        food[42] = new Food("잔치국수", 1, 4, 1, 1, R.drawable.janchiguksu);
        food[43] = new Food("골뱅이소면", 1, 4, 2, 2, R.drawable.golbangiisomyeon);
        food[44] = new Food("물냉면", 1, 4, 1, 1, R.drawable.mulnaengmyeon);
        food[45] = new Food("비빔냉면", 1, 4, 1, 2, R.drawable.bibimnaengmyeon);
        food[46] = new Food("칼국수", 1, 4, 1, 1, R.drawable.kalguksu);
        food[47] = new Food("비빔국수", 1, 4, 1, 2, R.drawable.bibimguksu);
        food[48] = new Food("콩국수", 1, 4, 1, 1, R.drawable.kongguksu);

        food[49] = new Food("냉소바", 1, 5, 1, 1, R.drawable.naengsoba);
        food[50] = new Food("우동", 1, 5, 1, 1, R.drawable.udong);
        food[51] = new Food("온소바", 1, 5, 1, 1, R.drawable.onsoba);
        food[52] = new Food("쇼유라멘", 1, 5, 1, 1, R.drawable.ramen1);
        food[53] = new Food("미소라멘", 1, 5, 1, 1, R.drawable.ramen1);
        food[54] = new Food("돈코츠라멘", 1, 5, 1, 1, R.drawable.ramen2);
        food[55] = new Food("야끼소바", 1, 5, 1, 1, R.drawable.ramen2);
        food[56] = new Food("볶음우동", 1, 5, 1, 1, R.drawable.bokkeumudong);
        food[57] = new Food("시오라멘", 1, 5, 1, 1, R.drawable.ramen1);

        food[58] = new Food("짬뽕", 1, 6, 1, 2, R.drawable.jjamppong);
        food[59] = new Food("탄탄면", 1, 6, 1, 2, R.drawable.tantanmyeon);
        food[60] = new Food("쟁반짜장", 1, 6, 2, 2, R.drawable.jaengbanjjajang);
        food[61] = new Food("중식우동", 1, 6, 1, 1, R.drawable.jungsikudong);
        food[62] = new Food("짜장면", 1, 6, 1, 1, R.drawable.jjajangmyeon);
        food[63] = new Food("울면", 1, 6, 1, 1, R.drawable.ulmyeon);
        food[64] = new Food("간짜장", 1, 6, 1, 1, R.drawable.ganjjajang);
        food[65] = new Food("중식냉면", 1, 6, 1, 2, R.drawable.jungsiknangmyeon);

        food[66] = new Food("토마토파스타", 1, 7, 1, 1, R.drawable.tomatopaseuta);
        food[67] = new Food("오일파스타", 1, 7, 1, 1, R.drawable.oil_paseuta);
        food[68] = new Food("크림파스타", 1, 7, 1, 1, R.drawable.keurimpaseuta);
        food[69] = new Food("로제파스타", 1, 7, 1, 1, R.drawable.rojepaseuta);

        food[70] = new Food("김치찌개", 3, 4, 1, 2, R.drawable.gimchijjigae);
        food[71] = new Food("부대찌개", 3, 4, 3, 2, R.drawable.budaejjigae);
        food[72] = new Food("보쌈", 3, 4, 4, 1, R.drawable.bossam);
        food[73] = new Food("삼겹살", 3, 4, 2, 1, R.drawable.samgyeopsal);
        food[74] = new Food("곱창", 3, 4, 2, 1, R.drawable.gopchang);
        food[75] = new Food("된장찌개", 3, 4, 1, 1, R.drawable.doenjangjjigae);
        food[76] = new Food("족발", 3, 4, 4, 1, R.drawable.jokbal);
        food[77] = new Food("감자탕", 3, 4, 4, 2, R.drawable.gamjatang);
        food[78] = new Food("전", 3, 4, 2, 1, R.drawable.jeon);
        food[79] = new Food("수육", 3, 4, 4, 1, R.drawable.suyuk);
        food[80] = new Food("닭도리탕", 3, 4, 3, 2, R.drawable.talkdoritang);
        food[81] = new Food("삼계탕", 3, 4, 1, 1, R.drawable.samgyetang);
        food[82] = new Food("게장", 3, 4, 3, 1, R.drawable.gejang);
        food[83] = new Food("닭발", 3, 4, 3, 2, R.drawable.talkbal);
        food[84] = new Food("물회", 3, 4, 1, 2, R.drawable.mulhoe);

        food[85] = new Food("일식 돈까스", 3, 5, 1, 1, R.drawable.ilsikdonkkasseu);
        food[86] = new Food("일식 카레", 3, 5, 1, 1, R.drawable.ilsikkare);
        food[87] = new Food("오코노미야끼", 3, 5, 1, 1, R.drawable.okonomoyakki);
        food[88] = new Food("회", 3, 5, 4, 1, R.drawable.hoe);
        food[89] = new Food("교자", 3, 5, 1, 1, R.drawable.gyoja);
        food[90] = new Food("가라아게", 3, 5, 1, 1, R.drawable.garaage);
        food[91] = new Food("오댕탕", 3, 5, 1, 1, R.drawable.odengtang);
        food[92] = new Food("찜닭", 3, 5, 3, 1, R.drawable.jjimtalk);
        food[93] = new Food("샤브샤브", 3, 5, 4, 1, R.drawable.syabeusyabeu);
        food[94] = new Food("나베", 3, 5, 3, 1, R.drawable.nabe);

        food[96] = new Food("마라탕", 3, 6, 3, 2, R.drawable.maratang);
        food[97] = new Food("깐쇼새우", 3, 6, 3, 2, R.drawable.kkansyosaeu);
        food[98] = new Food("꿔바로우", 3, 6, 3, 1, R.drawable.gguabarow);
        food[99] = new Food("마파두부", 3, 6, 1, 2, R.drawable.mapadubu);
        food[100] = new Food("팔보채", 3, 6, 3, 1, R.drawable.palbochae);
        food[101] = new Food("훠궈", 3, 6, 4, 2, R.drawable.hwogwo);
        food[102] = new Food("탕수육", 3, 6, 3, 1, R.drawable.tangsuyuk);
        food[103] = new Food("양꼬치", 3, 6, 4, 1, R.drawable.yangkkochi);
        food[104] = new Food("고추잡채", 3, 6, 3, 2, R.drawable.gochujapchae);
        food[105] = new Food("만두", 3, 6, 3, 1, R.drawable.mandu);

        food[106] = new Food("경양식 돈까스", 3, 7, 1, 1, R.drawable.gyeongyangsik_donkkaseu);
        food[107] = new Food("라자냐", 3, 7, 1, 1, R.drawable.lajanya);
        food[108] = new Food("바베큐", 3, 7, 4, 1, R.drawable.babikyu);
        food[109] = new Food("오믈렛", 3, 7, 1, 1, R.drawable.omulet);
        food[110] = new Food("스테이크", 3, 7, 4, 1, R.drawable.seuteikeu);
        food[111] = new Food("그라탕", 3, 7, 2, 1, R.drawable.gratang);
        food[112] = new Food("샐러드", 3, 7, 1, 1, R.drawable.saelleodeu);

        food[113] = new Food("타코야끼", 8, 12, 0, 1, R.drawable.tacoyaggi);
        food[114] = new Food("과자", 8, 12, 0, 1, R.drawable.gwaja);
        food[115] = new Food("빵", 8, 12, 0, 1, R.drawable.ppang);
        food[116] = new Food("건어물", 8, 12, 0, 1, R.drawable.geoneomul);
        food[117] = new Food("젤리", 8, 12, 0, 1, R.drawable.jelly);
        food[118] = new Food("케이크", 8, 12, 2, 1, R.drawable.keikeu);
        food[119] = new Food("푸딩", 8, 12, 0, 1, R.drawable.puding);
        food[120] = new Food("육포", 8, 12, 1, 1, R.drawable.yukpo);
        food[121] = new Food("붕어빵", 8, 12, 0, 1, R.drawable.bungeoppang);
        food[122] = new Food("마카롱", 8, 12, 1, 1, R.drawable.makarong);
        food[123] = new Food("와플", 8, 12, 1, 1, R.drawable.wapeul);
        food[124] = new Food("견과류", 8, 12, 0, 1, R.drawable.gyeongwaryu);
        food[125] = new Food("사탕", 8, 12, 0, 1, R.drawable.satang);
        food[126] = new Food("머핀", 8, 12, 0, 1, R.drawable.meopin);
        food[127] = new Food("호떡", 8, 12, 0, 1, R.drawable.hotteok);
        food[128] = new Food("건조과일", 8, 12, 0, 1, R.drawable.geonjogwail);
        food[129] = new Food("아이스크림", 8, 12, 0, 1, R.drawable.aiseukeurim);
        food[130] = new Food("빙수", 8, 12, 1, 1, R.drawable.bingsu);
        food[131] = new Food("츄러스", 8, 12, 0, 1, R.drawable.chyureoseu);
        food[132] = new Food("과일", 8, 12, 1, 1, R.drawable.gwail);
        food[133] = new Food("삶은계란", 8, 12, 0, 1, R.drawable.salmeungyeran);
        food[134] = new Food("도너츠", 8, 12, 0, 1, R.drawable.doneocheu);
        food[135] = new Food("찐빵", 8, 12, 0, 1, R.drawable.jjinppang);
        food[136] = new Food("꽈베기", 8, 12, 0, 1, R.drawable.ggwabaegi);

        food[137] = new Food("아메리카노", 9, 12, 1, 1, R.drawable.amerikano);
        food[138] = new Food("바닐라라떼", 9, 12, 1, 1, R.drawable.banillaratte);
        food[139] = new Food("카라멜마끼아또", 9, 12, 1, 1, R.drawable.karamelmakkiyatto);
        food[140] = new Food("고구마라떼", 9, 12, 1, 1, R.drawable.gogumaratte);
        food[141] = new Food("딸기에이드", 9, 12, 1, 1, R.drawable.ttalgieideu);
        food[142] = new Food("아포같토", 9, 12, 1, 1, R.drawable.apogato);
        food[143] = new Food("얼그레이", 9, 12, 1, 1, R.drawable.eolgeurei);
        food[144] = new Food("자몽에이드", 9, 12, 1, 1, R.drawable.jamongeideu);
        food[145] = new Food("카페라떼", 9, 12, 1, 1, R.drawable.kaperatte);
        food[146] = new Food("연유라떼", 9, 12, 1, 1, R.drawable.yeonyuratte);
        food[147] = new Food("카페모카", 9, 12, 1, 1, R.drawable.kapemoka);
        food[148] = new Food("핫초코", 9, 12, 1, 1, R.drawable.hotchoko);
        food[149] = new Food("스무디", 9, 12, 1, 1, R.drawable.seumudi);
        food[150] = new Food("녹차", 9, 12, 1, 1, R.drawable.nokcha);
        food[151] = new Food("청포도에이드", 9, 12, 1, 1, R.drawable.cheongpodoeideu);
        food[152] = new Food("헤이즐넛커피", 9, 12, 1, 1, R.drawable.heijeulneoskeopi);
        food[153] = new Food("카푸치노", 9, 12, 1, 1, R.drawable.kapuchino);
        food[154] = new Food("녹차라떼", 9, 12, 1, 1, R.drawable.nokcharatte);
        food[155] = new Food("돌체라떼", 9, 12, 1, 1, R.drawable.dolcheratte);
        food[156] = new Food("아이스티", 9, 12, 1, 1, R.drawable.aiseuti);
        food[157] = new Food("에스프레소", 9, 12, 1, 1, R.drawable.eseupeureso);
        food[158] = new Food("홍차", 9, 12, 1, 1, R.drawable.hongcha);
        food[159] = new Food("망고에이드", 9, 12, 1, 1, R.drawable.manggoeideu);
        food[160] = new Food("더치커피", 9, 12, 1, 1, R.drawable.deochikeopi);

        food[161] = new Food("김밥", 10, 12, 0, 1, R.drawable.gimbap);
        food[162] = new Food("어묵", 10, 12, 0, 1, R.drawable.odeng);
        food[163] = new Food("쫄면", 10, 12, 1, 2, R.drawable.jjolmyeon);
        food[164] = new Food("핫도그", 10, 12, 0, 1, R.drawable.hotdog);
        food[165] = new Food("짜장떡볶이", 10, 12, 0, 1, R.drawable.jjajangtteokbokki);
        food[166] = new Food("잔치국수", 10, 12, 1, 1, R.drawable.janchiguksu);
        food[167] = new Food("떡볶이", 10, 12, 0, 2, R.drawable.tteokbokki);
        food[168] = new Food("튀김", 10, 12, 0, 1, R.drawable.twigim);
        food[169] = new Food("주먹밥", 10, 12, 0, 1, R.drawable.jumeokbap);
        food[170] = new Food("만두", 10, 12, 0, 1, R.drawable.mandu);
        food[171] = new Food("호떡", 10, 12, 0, 1, R.drawable.hotteok);
        food[172] = new Food("즉석떡볶이", 10, 12, 2, 2, R.drawable.jeukseoktteokbokki);
        food[173] = new Food("돈까스", 10, 12, 1, 1, R.drawable.donkkasseu);
        food[174] = new Food("라볶이", 10, 12, 0, 2, R.drawable.rabokki);
        food[175] = new Food("순대", 10, 12, 0, 1, R.drawable.sundae);
        food[176] = new Food("라면", 10, 12, 0, 2, R.drawable.ramyeon);
        food[177] = new Food("닭강정", 10, 12, 1, 2, R.drawable.chikin);
        food[178] = new Food("우동", 10, 12, 1, 1, R.drawable.udong);
        food[179] = new Food("꽃빵", 10, 12, 0, 1, R.drawable.ggotbbang);

        food[180] = new Food("치킨", 3, 7, 3, 1, R.drawable.chikin);
        food[181] = new Food("카레", 3, 11, 1, 1, R.drawable.kare);

    }
}
