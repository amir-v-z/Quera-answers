<h1 align="center" id=1>
<img src="https://media.giphy.com/media/clOgAGJ5iR1RVx5GUl/giphy.gif?cid=ecf05e47wx5oexkqui58zx1ua13127dyhaft8rjcyezpbosd&ep=v1_stickers_search&rid=giphy.gif&ct=s" width=40> quera answers <img src="https://media.giphy.com/media/StENQhZxBZkBqm8kcP/giphy.gif" width=25> جواب های کوئرا <img src="https://media.giphy.com/media/pzSPkg0mIdpSPO3sD5/giphy.gif?cid=ecf05e47aaxaq7f5naec8uwbq9af17lyr8e1qcwlfd7crref&ep=v1_stickers_search&rid=giphy.gif&ct=s" width=40>
</h1>

<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>GitHub amir-v-z</title>
        <style>
            .search-container {
                display: flex;
                align-items: center;
            }
            .search-input {
                width: 300px;
                padding: 8px;
                border: 1px solid #ccc;
                border-radius: 4px;
                font-size: 1.2rem;
                border-radius: 0.4rem;
                background-color: rgb(14, 14, 26);
                color: white;
                box-shadow: 0px 0px 60px #1f4c65;
            }
            .search-button {
                background-color: greenyellow;
                color: black;
                border: none;
                border-radius: 0.4rem;
                padding: 8px 12px;
                cursor: pointer;
                margin-left: 3px;
                font-size: 1.2rem;
                box-shadow: 0px 0px 60px #1f4c65;
            }
        </style>
    </head>
    <body>
        <div class="search-container" style="margin-left: 100px">
            <input type="text" id="searchInput" class="search-input" placeholder="نام سوال را مطابق کوئرا وارد کنید">
            <button id="searchButton" class="search-button">Search</button>
        </div>
        <div id="searchResults">
        </div>
        <script>
            const searchInput = document.getElementById('searchInput');
            const searchButton = document.getElementById('searchButton');
            const searchResults = document.getElementById('searchResults');
            const contentData = [
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/chap_bar_aks.java">چاپ بر عکس</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/ziny.java">زینی</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/kooler_ya_bokhari.java">کولر یا بخاری</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/reshteh_cheker.java">رشته چکر</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/online.java">آنلاین</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/dorbin_madar_baste.java">دوربین مداربسته</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/por_ghosht.java">پرگوشت</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/sade_tar.java">ساده تر</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/kalameh_kalameh.java">کلمه کلمه</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/khosh_amad.java">خوش آمد</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/do_shoghleh.java">دو شغله</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/khob_bagher_sarma_khordeh.java">خب باقر سرما خورده</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/sharzh_mobile.java">شارژ موبایل</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/reshteh_fibonachi.java">رشته فیبوناچی</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/namayeshgah_majazi.java">نمایشگاه مجازی</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/do_noghte_khat.java">دو نقطه خط</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/sedadar.java">صدا دار</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/om_sin.java">ام سین</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/pashmal_agha.java">پشمال آقا</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/yakhdarchi.java">یخدارچی</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/rezhim_sakht.java">رژیم سخت</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/farmandeh_bazneshasteh.java">فرمانده ی بازنشسته</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/komak_be_kapy.java">کمک به کاپی</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/roz_azadi_bayan_dar_barareh.java">روز آزادی در برره</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/behdasht_va_salamat.java">بهداشت و سلامت</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/mashgh_emshab_bagher.java">مشق امشب باقر</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/ramin_va_masaleh_riyazi.java">رامین و مسئله ریاضی</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/nobaraneh.java">نوبرانه</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/navahi_service_dehi.java">نواحی سرویس دهی</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/morabaha_va_moshkelat_eghtesadi.java">مربا و مشکلات اقتصادی</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/sope_sabzijat.java">سوپ سبزیجات</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/to_cheghdar_ezafeh_vazn_dari.java">تو چقدر اضافه وزن داری؟</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/soal_barname_nevisi_barname_nevisi_soal.java">سوال برنامه نویسی برنامه نویسی سوال</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/modaresan_sharif.java">مدرسان شریف</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/chapgar.java">چاپگر</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/sorakh_mosh.java">سوراخ موش</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/kaktos_hay_por_dardsar.java">کاکتوس های پردردسر</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/golbano_va_dogholo_hayash.java">غل بانو و دوقلوهایش</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/akh_jon_taraf_nist.java">آخ جون طرف نیست!</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/salam_salam_khodafez.java">سلام سلام خداحافظ</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/tak_raghami.java">تک رقمی</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/do_do_ei.java">2 2 ای</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/soal_zard.java">سوال زرد</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/yek_soal_sade.java">یک سوال ساده</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/mabnay_aynei.java">مبنای آینه ای</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/factoriel.java">فاکتوریل</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/chap_moraba.java">چاپ مربع</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/halazon_mokhtasati.java">حلزون مختصاتی</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/ramz_hay_jan_sakht.java">رمز های جان سخت</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/adad_khod_maghlob.java">عدد خود مقلوب</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/maximum.java">ماکزیمم</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/nardeboni.java">نردبونی</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/adad_chap_kon.java">عدد چاپ کن</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/tarikh_tavalod.java">تاریخ تولد</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/adad_fisaghoresi.java">اعداد فیثاغورثی</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/adad_aval.java">اعداد اول</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/moadeleh_khat.java">معادله خط</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/zojit.java">زوجیت</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/petrol.java">Petrol</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/khana_baraye_ensan.java">خوانا برای انسان</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/daroy_corona.java">داروی کرونا</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/kamel_bodan_ya_nabodan.java">کامل بودن یا نبودن</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/the_departed_2006.java">The Departed (2006)</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/cake_dar_quera.java">کیک در کوئرا</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/sadgan_khaste.java">صدگان خسته</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/khaneh_ye_dost.java">خانه ی دوست</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/name_bad.java">نامه بد</a>',
                '<a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/aval_biny.java">اول بینی</a>',
            ];
            searchButton.addEventListener('click', () => {
                const searchTerm = searchInput.value.toLowerCase();
                const filteredResults = contentData.filter(item =>
                    item.toLowerCase().includes(searchTerm)
                );
                searchResults.innerHTML = filteredResults.length > 0
                    ? filteredResults.map(result => `<p>${result}</p>`).join('')
                    : '<p>No results found.</p>';
            });
        </script>
    </body>
</html>

<h2 align="right">
<img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExbDRlbm8wNHd2a3ZndGdqdzJiemFseWY0Z2N1eXNyb2ppam9ua2JhdyZlcD12MV9zdGlja2Vyc19zZWFyY2gmY3Q9cw/MelhioWPAo6k4Q6BTp/giphy.gif" width=60> همه جواب ها نمره <img src="https://media.giphy.com/media/3o7aDfuOPVroMTRjig/giphy.gif" width=30> گرفتند
</h2>

<table>

<th>جواب</th>
<th>سوال</th>
<th>اسم سوال</th>
<th>ردیف</th>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/chap_bar_aks.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/3405">سوال</td>
<td>چاپ برعکس</td>
<td>1</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/ziny.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/33023">سوال</td>
<td>زینی</td>
<td>2</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/kooler_ya_bokhari.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/147635">سوال</td>
<td>کولر یا بخاری</td>
<td>3</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/reshteh_cheker.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/106795">سوال</td>
<td>رشته چکر</td>
<td>4</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/online.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/140038">سوال</td>
<td>آنلاین</td>
<td>5</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/dorbin_madar_baste.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/2794">سوال</td>
<td>دوربین مداربسته</td>
<td>6</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/por_ghosht.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/72882">سوال</td>
<td>پرگوشت</td>
<td>7</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/sade_tar.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/3403">سوال</td>
<td>ساده تر</td>
<td>8</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/kalameh_kalameh.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/108665">سوال</td>
<td>کلمه کلمه</td>
<td>9</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/khosh_amad.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/123798">سوال</td>
<td>خوش آمد</td>
<td>10</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/do_shoghleh.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/111990">سوال</td>
<td>دو شغله</td>
<td>11</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/khob_bagher_sarma_khordeh.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/10231">سوال</td>
<td>خُب باقر سرما خورده</td>
<td>12</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/sharzh_mobile.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/17244">سوال</td>
<td>شارژ موبایل</td>
<td>13</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/reshteh_fibonachi.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/17675">سوال</td>
<td>رشته فیبوناچی</td>
<td>14</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/namayeshgah_majazi.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/110015">سوال</td>
<td>نمایشگاه مجازی</td>
<td>15</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/do_noghte_khat.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/3414">سوال</td>
<td>دو نقطه خط</td>
<td>16</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/sedadar.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/140033">سوال</td>
<td>صدا دار</td>
<td>17</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/om_sin.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/28947">سوال</td>
<td>ام سین</td>
<td>18</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/pashmal_agha.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/72877">سوال</td>
<td>پشمال آقا</td>
<td>19</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/yakhdarchi.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/3429">سوال</td>
<td>یخدارچی</td>
<td>20</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/rezhim_sakht.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/20256">سوال</td>
<td>رژیم سخت</td>
<td>21</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/farmandeh_bazneshasteh.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/72874">سوال</td>
<td>فرمانده ی بازنشسته</td>
<td>22</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/komak_be_kapy.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/8838">سوال</td>
<td>کمک به کاپی</td>
<td>23</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/roz_azadi_bayan_dar_barareh.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/10162">سوال</td>
<td>روز آزادی در برره</td>
<td>24</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/behdasht_va_salamat.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/51865">سوال</td>
<td>بهداشت و سلامت</td>
<td>25</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/mashgh_emshab_bagher.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/10230">سوال</td>
<td>مشق امشب باقر</td>
<td>26</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/ramin_va_masaleh_riyazi.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/102261">سوال</td>
<td>رامین و مسئله ی ریاضی</td>
<td>27</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/nobaraneh.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/104588">سوال</td>
<td>نوبرانه</td>
<td>28</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/navahi_service_dehi.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/136483">سوال</td>
<td>نواحی سرویس دهی</td>
<td>29</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/morabaha_va_moshkelat_eghtesadi.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/20249">سوال</td>
<td>مرباها و مشکلات اقتصادی</td>
<td>30</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/sope_sabzijat.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/72881">سوال</td>
<td>سوپ سبزیجات</td>
<td>31</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/to_cheghdar_ezafeh_vazn_dari.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/3404">سوال</td>
<td>تو چقدر اضافه وزن داری؟</td>
<td>32</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/soal_barname_nevisi_barname_nevisi_soal.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/3408">سوال</td>
<td>سوال برنامه نویسی برنامه نویسی سوال</td>
<td>33</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/modaresan_sharif.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/140039">سوال</td>
<td>مدرسان شریف</td>
<td>34</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/chapgar.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/64434">سوال</td>
<td>چاپگر</td>
<td>35</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/sorakh_mosh.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/91712">سوال</td>
<td>سوراخ موش</td>
<td>36</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/kaktos_hay_por_dardsar.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/52542">سوال</td>
<td>کاکتوس های پردردسر</td>
<td>37</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/golbano_va_dogholo_hayash.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/72876">سوال</td>
<td>غُل بانو و دوقلوهایش</td>
<td>38</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/akh_jon_taraf_nist.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/3538">سوال</td>
<td>آخ جون طرف نیست!</td>
<td>39</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/salam_salam_khodafez.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/31021">سوال</td>
<td>سلام سلام خداحافظ</td>
<td>40</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/tak_raghami.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/3539">سوال</td>
<td>تک رقمی</td>
<td>41</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/do_do_ei.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/140028">سوال</td>
<td>ای 2 2</td>
<td>42</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/soal_zard.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/3537">سوال</td>
<td>سوال زرد</td>
<td>43</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/yek_soal_sade.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/2885">سوال</td>
<td>یک سوال ساده</td>
<td>44</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/mabnay_aynei.java">جواب</td>
<td><a href="https://quera.org/problemset/university/651">سوال</td>
<td>مبنای آینه ای</td>
<td>45</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/factoriel.java">جواب</td>
<td><a href="https://quera.org/problemset/university/589">سوال</td>
<td>فاکتوریل</td>
<td>46</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/chap_moraba.java">جواب</td>
<td><a href="https://quera.org/problemset/university/591">سوال</td>
<td>چاپ مربع</td>
<td>47</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/halazon_mokhtasati.java">جواب</td>
<td><a href="https://quera.org/problemset/university/597">سوال</td>
<td>حلزون مختصاتی</td>
<td>48</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/ramz_hay_jan_sakht.java">جواب</td>
<td><a href="https://quera.org/problemset/university/9722">سوال</td>
<td>رمزهای جان سخت</td>
<td>49</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/adad_khod_maghlob.java">جواب</td>
<td><a href="https://quera.org/problemset/university/617">سوال</td>
<td>عدد خود مقلوب</td>
<td>50</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/maximum.java">جواب</td>
<td><a href="https://quera.org/problemset/university/588">سوال</td>
<td>ماکزیمم</td>
<td>51</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/nardeboni.java">جواب</td>
<td><a href="https://quera.org/problemset/university/640">سوال</td>
<td>نردبونی</td>
<td>52</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/adad_chap_kon.java">جواب</td>
<td><a href="https://quera.org/problemset/university/9774">سوال</td>
<td>عدد چاپ کن</td>
<td>53</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/tarikh_tavalod.java">جواب</td>
<td><a href="https://quera.org/problemset/university/615">سوال</td>
<td>تاریخ تولد</td>
<td>54</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/adad_fisaghoresi.java">جواب</td>
<td><a href="https://quera.org/problemset/university/280">سوال</td>
<td>اعداد فیثاغورثی</td>
<td>55</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/adad_aval.java">جواب</td>
<td><a href="https://quera.org/problemset/university/293">سوال</td>
<td>اعداد اول</td>
<td>56</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/moadeleh_khat.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/147193">سوال</td>
<td>معادله خط</td>
<td>57</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/zojit.java">جواب</td>
<td><a href="https://quera.org/problemset/contest/140035">سوال</td>
<td>زوجیت</td>
<td>58</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/petrol.java">جواب</td>
<td><a href="https://quera.org/problemset/82378/">سوال</td>
<td>Petrol</td>
<td>59</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/khana_baraye_ensan.java">جواب</td>
<td><a href="https://quera.org/problemset/158165/">سوال</td>
<td>خوانا برای انسان</td>
<td>60</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/daroy_corona.java">جواب</td>
<td><a href="https://quera.org/problemset/178600/">سوال</td>
<td>داروی کرونا</td>
<td>61</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/kamel_bodan_ya_nabodan.java">جواب</td>
<td><a href="https://quera.org/problemset/282/">سوال</td>
<td>کامل بودن یا نبودن</td>
<td>62</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/the_departed_2006.java">جواب</td>
<td><a href="https://quera.org/problemset/132251/">سوال</td>
<td>The Departed (2006)</td>
<td>63</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/cake_dar_quera.java">جواب</td>
<td><a href="https://quera.org/problemset/144082/">سوال</td>
<td>کیک در کوئرا</td>
<td>64</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/sadgan_khaste.java">جواب</td>
<td><a href="https://quera.org/problemset/3406/">سوال</td>
<td>صدگان خسته</td>
<td>65</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/khaneh_ye_dost.java">جواب</td>
<td><a href="https://quera.org/problemset/176782">سوال</td>
<td>خانه ی دوست</td>
<td>66</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/name_bad.java">جواب</td>
<td><a href="https://quera.org/problemset/7609/">سوال</td>
<td>نامه بد</td>
<td>67</td>
</tr>

<tr>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Solved/aval_biny.java">جواب</td>
<td><a href="https://quera.org/problemset/649/">سوال</td>
<td>اول بینی</td>
<td>68</td>
</tr>

</table>

<h2 align="right">
<img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExb2J5am0xODNrNnh4d2N2OTR0MWpudmtwaWJwdGV2cW4yM2gzdXhrcSZlcD12MV9zdGlja2Vyc19zZWFyY2gmY3Q9cw/7VjzaRCDyQBnr1UKuF/giphy.gif" width=30> کامل نیست <img src="https://media.giphy.com/media/jSKBmKkvo2dPQQtsR1/giphy.gif" width="50">
</h2>

<table>

<th>توضیحات</th>
<th>نمره</th>
<th>جواب</th>
<th>سوال</th>
<th>اسم سوال</th>
<th>ردیف</th>

<tr>
<td>WRONG ANSWER : 6</td>
<td>60</td>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Unsolved/reshteh_mord_alagheh.java">جواب</td>
<td><a href="https://quera.org/problemset/52546/">سوال</td>
<td>رشته مورد علاقه</td>
<td>1</td>
</tr>

<tr>
<td>WRONG ANSWER : 6</td>
<td>81</td>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Unsolved/bazeh_azmoni.java">جواب</td>
<td><a href="https://quera.org/problemset/145639/">سوال</td>
<td>بازه آزمونی</td>
<td>2</td>
</tr>

<tr>
<td>Runtime Error : 5</td>
<td>50</td>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Unsolved/jame_bozorgan.java">جواب</td>
<td><a href="https://quera.org/problemset/2551/">سوال</td>
<td>جمع بزرگان</td>
<td>3</td>
</tr>

<tr>
<td>Runtime Error : 7</td>
<td>30</td>
<td><a href="https://github.com/amir-v-z/Quera-answers/blob/main/Quera_Unsolved/jame_adad.java">جواب</td>
<td><a href="https://quera.org/problemset/637/">سوال</td>
<td>جمع اعداد</td>
<td>4</td>
</tr>

</table>

<h1 align="right">
<a href="#1"><img src="https://media.giphy.com/media/ymCebclx2zffNOn6Io/giphy.gif?cid=ecf05e478065pis0nugeyo8eg2tpugm5rae9sy8bst4jjo9w&ep=v1_stickers_search&rid=giphy.gif&ct=s" width=70></a>
</h1>

> *اگه لذت بردید...<img src="https://media.giphy.com/media/ewh4ipgPw1bBVj4HI5/giphy.gif" width=25>*

> *لطفا ستاره دادن <img src="https://media.giphy.com/media/bGuxrqcjKymVlfVaix/giphy.gif" width=20> را فراموش نکنید😉🙏🏻*