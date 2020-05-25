package project.chris.news.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

class TopHeadlinesBean {

    /**
     * status : ok
     * totalResults : 34
     * articles : [{"source":{"id":null,"name":"Udn.com"},"author":"記者林士傑／即時報導","title":"懺情文被周揚青打臉 羅志祥的她喊話「我們都很好」 - udn 聯合新聞網","description":"羅志祥（小豬）上月飛往大陸開工，但遭周揚青丟出核彈級爆料起底，重挫形象，在大陸要參與的3個節目全都飛了。本月初他低調返台...","url":"https://stars.udn.com/star/story/10088/4588575","urlToImage":"https://pgw.udn.com.tw/gw/photo.php?u=https://uc.udn.com.tw/photo/2020/05/25/realtime/7930555.jpg&s=Y&x=0&y=9&sw=640&sh=426","publishedAt":"2020-05-25T04:12:11Z","content":null},{"source":{"id":null,"name":"Udn.com"},"author":"https://www.facebook.com/udngame","title":"中國PS4暫關商店、XboxOne禁走後門 Switch會是下一個嗎？ - udn 聯合新聞網","description":"大家都知道中國SONY PSN在5月10號開始停止了商店（Store）服務，最近另一邊廂的Microsoft也為Xbox One進行更新，令中國玩家再無法前往其他地區下載未經審查的遊戲。而最弔詭的是，","url":"https://game.udn.com/game/story/10453/4588301","urlToImage":"https://pgw.udn.com.tw/gw/photo.php?u=https://uc.udn.com.tw/photo/2020/05/25/99/7930461.jpg&x=0&y=0&sw=0&sh=0&sl=W&fw=800","publishedAt":"2020-05-25T04:05:00Z","content":"SONY PSN510StoreMicrosoftXbox One\r\nPlayStation510PS45107bugbug\r\nPlayStation510\r\nXbox One2493\r\nXbox One2493\r\nXbox One\r\nPS4\r\nPS4FansXbox OnePS4PS4bugbugSteamSony\r\nSONY HaterPS4HashtagPS4Xbox Onebug\r\nXb\u2026 [+119 chars]"},{"source":{"id":"engadget","name":"Engadget"},"author":null,"title":"Samsung Galaxy Note 20 渲染圖曝光， 吸收多項S20 Ultra 的特點 - Engadget 中文版","description":"慣例在下半年推出的 Galaxy Note 系列，一般也會吸收 Galaxy S 系列的新功能。這回 OnLeaks 和 Pigtou 就上載了聲稱是以他們所知的爆料而繪製的 Galaxy Note 20 和 Note 20+ 渲染圖。乍看之下，還是有點 S20 系列的影子，包括 Note 20+ 將會有與 S20 Ultra 同級、達 6.9 吋大的螢幕；基本版的 Note 20 也至少會有 6.7 吋的螢幕，畢竟不比 S 系列大台，怎能算是 Note 呢？","url":"https://chinese.engadget.com/chinese-2020-05-25-samsung-galaxy-note-20-plus-design-leak.html","urlToImage":"https://s.yimg.com/uu/api/res/1.2/.9xn3dMn8.o6Pijv_9S1dw--~B/aD00Mjc7dz02NDA7YXBwaWQ9eXRhY2h5b24-/https://o.aolcdn.com/images/dimse/5845cadfecd996e0372f/0fbe80a26749d4b824ae9fe09015149edfa9a57a/dGh1bWJuYWlsPTY0MCUyQyZxdWFsaXR5PTgwJmltYWdlX3VyaT1odHRwcyUzQSUyRiUyRnMueWltZy5jb20lMkZvcyUyRmNyZWF0ci11cGxvYWRlZC1pbWFnZXMlMkYyMDIwLTA1JTJGMTc2YTE3ZDAtOWUwNy0xMWVhLWFmZTctYzg3MDllNDg3OTljJmNsaWVudD1hbXAtYmxvZ3NpZGUtdjImc2lnbmF0dXJlPWY1ODZkY2ZjZjIwNDQxNDU2NDkzZDRkOTI0MzZkMWRkM2MxOTAwNWU=","publishedAt":"2020-05-25T04:04:36Z","content":":Android, Galaxy Note 20, Galaxy Note 20 Plus, gear, leak, mobile, news, OnLeaks, Samsung, smartphone"},{"source":{"id":null,"name":"Tvbs.com.tw"},"author":"王雅惠","title":"千字文挺何如芸！丁寧「全台女人都站妳這」狠酸男有小三 TVBS新聞網 - TVBS新聞","description":"51歲女星何如芸近期和花蓮美侖飯店董事王敏錡鬧婚變，上周五(22日)凌晨她突然在臉書發表「不自殺宣言」，令人震驚。昨天(24日)和她一起拍攝本土劇的女星丁寧在臉書發千字文力挺何如芸，她也奉勸女人「千萬不要太懂事，不然你的人生會很多事。」","url":"https://news.tvbs.com.tw/life/1329107","urlToImage":"https://cc.tvbs.com.tw/img/upload/2020/05/25/20200525083330-2ef7b4b0.jpg","publishedAt":"2020-05-25T03:49:04Z","content":null},{"source":{"id":null,"name":"Gamer.com.tw"},"author":"Jessica","title":"《螢幕判官》開發團隊新作《棄海：波弟大冒險》正式揭曉即日起開放預先登錄 - 巴哈姆特電玩資訊站","description":"《螢幕判官》臺灣獨立遊戲團隊光穹遊戲（18Light Game Ltd.）睽違許久再度公開新作《棄海：波弟大冒險》消息與遊戲截圖，今（25）日開發團隊公開遊戲網站，並開放預先登錄。 《棄海：波弟大冒險》 預先登錄 《螢幕判官》開發團隊光穹遊戲於 4 月初透過《集合啦！動物森友會》連續舉辦了三天的「光穹森友會」，利用遊戲中機制揭露新","url":"https://gnn.gamer.com.tw/detail.php?sn=197356","urlToImage":"https://p2.bahamut.com.tw/B/2KU/86/8b6b2b741ec008b18ac758375c18nea5.JPG","publishedAt":"2020-05-25T03:29:20Z","content":"GNN Jessica 2020-05-25 11:29:20"},{"source":{"id":null,"name":"Udn.com"},"author":"記者蔡敏姿／即時報導","title":"港版國安法衝擊 港股一度跌逾400點 傳富豪從港撤資 - udn 聯合新聞網","description":"「港版國安法」將在本周四表決，港股今（25日）早盤跌逾400點後，呈現震盪走勢，而港幣匯率續偏軟，曾低見7.7575，最...","url":"https://udn.com/news/story/7333/4588430","urlToImage":"https://pgw.udn.com.tw/gw/photo.php?u=https://uc.udn.com.tw/photo/2020/05/25/realtime/7930218.png&s=Y&x=0&y=5&sw=674&sh=448&exp=3600","publishedAt":"2020-05-25T03:22:14Z","content":"254007.75757.7567\r\n270CNH\r\nCNY7.13837.13707.15677.1505\r\n5.56%1,40020158"},{"source":{"id":null,"name":"Setn.com"},"author":"三立新聞網","title":"封關民調／恁爸等你！韓國瑜掰？57.3%高雄人堅定罷韓 - 三立新聞網","description":"高雄市長韓國瑜罷免投票將在6月6日舉行，按照高雄市選委會初步統計投票人數約為230萬人，依照25％的罷免門檻，達到57萬5091票以上，才能通過罷免案。而封關民調也陸續揭曉，根據寶島通訊社委託展欣科技民調公司做的調查顯示，有57.3%的高雄市民堅定罷韓！","url":"https://www.setn.com/News.aspx?NewsID=748841","urlToImage":"https://attach.setn.com/newsimages/2020/01/05/2342695-PH.jpg","publishedAt":"2020-05-25T02:55:46Z","content":null},{"source":{"id":null,"name":"Newtalk.tw"},"author":"新頭殼 newtalk","title":"時力民調》蓋牌無效！56％同意韓國瑜罷免罷韓通過要看2關鍵| 政治 - 新頭殼","description":"高雄市長韓國瑜罷免案將在6月6日投票，韓國瑜日前呼籲支持者不投票，再度祭出「蓋牌」作法，不過，根據時代力量今天公佈最新民調顯示，仍有56.4%市民同意罷免案、不同意則為28.9%，時力黨主席徐永明指出，結果顯示韓國瑜蓋牌策略影響不大，主要影響因素受到疫情、青年是否返鄉投票影響；另，也有59.5%的高","url":"https://newtalk.tw/news/view/2020-05-25/411567","urlToImage":"https://s.newtalk.tw/album/news/412/5ecb31ec55b18.jpg","publishedAt":"2020-05-25T02:48:34Z","content":"6656.4%28.9%59.5%\r\n56.444.328.96.357.431.8202971.479.6303920.127.8\r\n202089.875.816.1\r\n6659.5465.66.158.455.5\r\n2029303939.3%29.9%43\r\n2051983095%3.40%"},{"source":{"id":null,"name":"Cna.com.tw"},"author":"https://www.facebook.com/cnanewstaiwan","title":"龔明鑫：振興券初步規劃 付1000換3000元 - 中央社即時新聞","description":"國發會主委龔明鑫今天表示，初步規劃方向是每人支付新台幣1000元換3000元振興券，也沒有排富及年齡限制，在實體通路使用，雖然還未定案，但的確是往規模擴大的方向研議。","url":"https://www.cna.com.tw/news/firstnews/202005250030.aspx","urlToImage":"https://imgcdn.cna.com.tw/www/webphotos/WebOg/600/20200525/1055x554_234310091053.jpg","publishedAt":"2020-05-25T02:25:08Z","content":null},{"source":{"id":null,"name":"Chinatimes.com"},"author":"周郁蘋","title":"米可白嫁尾牙大王爆婚變..被問夫妻日常 她想半天回應驚人 - 中時電子報 Chinatimes.com","description":"女星米可白（趙亦瑄）與「尾牙大王」謝銘杰的6年婚姻狀態備受矚目，米可白日前在新戲《生生世世》記者會上，以「和老公還住一起」撇婚變，而這回米可白被問到和老公平時的談話主題時，她思考許久後，也難得吐出夫妻日常。米可白近年鮮少在臉書談到老公，也讓她的婚姻狀態成為關注焦點，對此，米可白看了相關新聞後，日前還感慨發文：「默默的想⋯唉一聲」，她表示，自己本來就不愛談私事，並希望外界把焦點放在她的工作表現上。米女星米可白（趙亦瑄）與「尾牙大王」謝銘杰的6年婚姻狀態備受矚目，米可白日前在新戲《生生世世》記者會上，以「和老公還住一\u2026","url":"https://www.chinatimes.com/realtimenews/20200525001403-260404","urlToImage":"https://images.chinatimes.com/newsphoto/2020-05-25/900/20200525001404.jpg","publishedAt":"2020-05-25T02:18:42Z","content":" 1. <\/li> 1. <\/li> 1. <\/li> 1. <\/li> 1. <\/li><\/ol>"},{"source":{"id":null,"name":"Cna.com.tw"},"author":"https://www.facebook.com/cnanewstaiwan","title":"日本各界悼念木村花 籲嚴懲網路霸凌者 - cna.com","description":"參與人氣實境節目「雙層公寓」演出的日本女子摔角選手木村花昨天離世，所屬摔角團體並未說明死因，但外界揣測跟網路霸凌有關，霸凌者紛紛刪帳號，各界悼念之餘也籲嚴懲霸凌。","url":"https://www.cna.com.tw/news/amov/202005240110.aspx","urlToImage":"https://imgcdn.cna.com.tw/www/website/img/pic_fb.jpg","publishedAt":"2020-05-25T02:07:52Z","content":null},{"source":{"id":null,"name":"Yahoo.com"},"author":"編輯中心/綜合報導","title":"武統奪島照曝光！中國小粉紅嗨翻天 專家「一理由」笑了 - Yahoo奇摩","description":"中國四川美術學院有學生日前製作18張「解放軍奪島圖」，聲稱是為表達「對台獨勢力所不齒的專題創作」，在台灣也引起熱議。不過台灣軍事專家、《全球防衛雜誌》採訪主任陳國銘笑說，我們不妨放大器一點，「讓他們去...","url":"https://tw.news.yahoo.com/%E6%AD%A6%E7%B5%B1%E5%A5%AA%E5%B3%B6%E7%85%A7%E6%9B%9D%E5%85%89-%E4%B8%AD%E5%9C%8B%E5%B0%8F%E7%B2%89%E7%B4%85%E5%97%A8%E7%BF%BB%E5%A4%A9-%E5%B0%88%E5%AE%B6-%E7%90%86%E7%94%B1-%E7%AC%91%E4%BA%86-020457814.html","urlToImage":"https://s.yimg.com/ny/api/res/1.2/OW.YhZVoLV9UYWJIVH7HJQ--/YXBwaWQ9aGlnaGxhbmRlcjt3PTEyODA7aD03MTMuNg--/https://s.yimg.com/uu/api/res/1.2/3.lrvZwAqTROmLVEMRm5rQ--~B/aD00NDY7dz04MDA7c209MTthcHBpZD15dGFjaHlvbg--/https://media.zenfs.com/zh-tw/nownews.com/6012180c0845aa5acc6d356d1cbe5697","publishedAt":"2020-05-25T02:04:00Z","content":null},{"source":{"id":null,"name":"Newtalk.tw"},"author":"新頭殼 newtalk","title":"鄧小平保證香港不變影片瘋傳網：中共連標點符號都不能信| 中國 - 新頭殼","description":"影片出處：YouTube/CAT CHANNEL中國打算強推「港版國安法」，引起國際譁然。有網友翻出香港富商李嘉誠30年前、1990年1月18日與當時中國領導人鄧小平會面的影片，影片中鄧小平清楚宣示香港「不會變、不可能變、不是說短期不變，是長期不變\u2026\u2026就是說五十年不變，五十年後更沒有變的道理\u2026\u2026」，","url":"https://newtalk.tw/news/view/2020-05-25/411531","urlToImage":"https://s.newtalk.tw/album/news/412/5ecb25e274d4f.jpg","publishedAt":"2020-05-25T01:59:43Z","content":null},{"source":{"id":null,"name":"Chinatimes.com"},"author":"李慈音","title":"高雄大雨後這畫面 網驚：神奇的事發生了！ - 中時電子報 Chinatimes.com","description":"高雄大雨不斷，正是檢驗韓市府一年多來，積極推動清淤、清水溝等市政是否真的改善高雄淹水情況。對此，一名網友表示，以往愛河總在大雨過後總會飄滿垃圾，但這次雨後竟帶點美感，證明韓市府治水有成。雨彈狂襲高雄，許多地方都傳出水患，高雄市長韓國瑜忙著在各地奔波視察，並在臉書回報各地的處理狀況，高雄市環保局清潔隊也無畏風雨出勤，甚至徒手挖水溝，以維持排水暢通。網友在臉書社團「韓家軍 市政宣揚」指出，記得以往愛高雄大雨不斷，正是檢驗韓市府一年多來，積極推動清淤、清水溝等市政是否真的改善高雄淹水情況。對此，一名網友表示，以往愛河總\u2026","url":"https://www.chinatimes.com/realtimenews/20200525001239-260407","urlToImage":"https://images.chinatimes.com/newsphoto/2020-05-25/900/20200525001240.jpg","publishedAt":"2020-05-25T01:48:45Z","content":"()\r\n 1. <\/li> 1. <\/li> 1. <\/li> 1. <\/li> 1. <\/li><\/ol>"},{"source":{"id":null,"name":"Ltn.com.tw"},"author":"自由時報","title":"中職》兄弟終結者義舉曝光！ 球迷感動：不是每個人都會如此 - 自由時報電子報","description":"網友在PTT發文分享兄弟終結者李振昌私下不為人知的一面，他指出，因連日梅雨球賽都打不成，昨日台中好不容易放晴，但工作人員也是在開打前辛苦整理場地，結果李振昌也提早到球場，一起加入吸水的工作，才讓球迷最後能有球看。該網友表示：「李振昌都是最早到球場","url":"https://sports.ltn.com.tw/news/breakingnews/3176248","urlToImage":"https://img.ltn.com.tw/Upload/sports/page/800/2020/05/25/phpvlEZk3.jpg","publishedAt":"2020-05-25T01:11:45Z","content":"PTT\r\n...\r\nPTT\r\n21112.17.30\r\nAPP \r\n APP"},{"source":{"id":null,"name":"Udn.com"},"author":"記者曹悅華／台北即時報導","title":"紅龍事件翻版？北車大廳昨晚拉封鎖線 台鐵指為消毒 - udn 聯合新聞網","description":"台鐵擬在疫情後永久禁止民眾於台北車站大廳席地而坐的消息傳出後，各界議論紛紛，隨後台鐵立場轉彎，說本周會召集專家、學者及相...","url":"https://udn.com/news/story/7266/4588186","urlToImage":"https://pgw.udn.com.tw/gw/photo.php?u=https://uc.udn.com.tw/photo/2020/05/25/realtime/7929642.jpg&s=Y&x=0&y=9&sw=1280&sh=852&exp=3600","publishedAt":"2020-05-25T01:09:15Z","content":null},{"source":{"id":null,"name":"Cna.com.tw"},"author":"https://www.facebook.com/cnanewstaiwan","title":"中國強推制定港版國安法 彭定康：應納入G7議程 - cna.com","description":"末代香港總督彭定康今天投書「金融時報」（Financial Times），呼籲英國必須確保中國欲對香港推行制定新版國安法一事納入6月的七大工業國集團（G7）峰會議程。","url":"https://www.cna.com.tw/news/firstnews/202005250013.aspx","urlToImage":"https://imgcdn.cna.com.tw/www/webphotos/WebOg/600/20200525/960x504_551828116732.jpg","publishedAt":"2020-05-25T00:49:06Z","content":"24Financial Times6G7\r\nChris PattenG7\r\n2019COVID-192047Sino-British Joint Declaration\r\n286/1090525"},{"source":{"id":null,"name":"Setn.com"},"author":"三立新聞網","title":"中國準備開戰？印度步兵師「進駐戰備」爆：解放軍集結兵力 - 三立新聞網","description":"中國與印度邊界5月以來士兵發生衝突，雙方士兵多次發生衝突，拳腳相向、互丟石塊等，兩國軍隊指揮官甚至直接進行溝通，中印雙方共同邊界有近2000公里，並有超過12萬平方公里的領土爭議區域，5月以來雙方2度發生鬥毆，經過協調後卻破局，最新消息是印度開始調兵進駐，中國解放軍同樣重兵集結。","url":"https://www.setn.com/News.aspx?NewsID=748767","urlToImage":"https://attach.setn.com/newsimages/2020/04/18/2511467-PH.jpg","publishedAt":"2020-05-24T23:59:16Z","content":"520001252\r\nSikkim59150\r\n1820LACManoj Mukund Naravane\r\n1962"},{"source":{"id":null,"name":"Ltn.com.tw"},"author":"自由時報","title":"中職》不再恐猿？ 墊底獅成本季對龍頭唯一勝率5成球隊 - 自由時報電子報","description":"去年獅隊曾在桃園棒球場面對Lamigo桃猿隊吞下12連敗，追平聯盟單季單一球場最多連敗的難堪紀錄，不過在本季桃猿更換東家為樂天集團後，獅隊貌似不再「恐猿」，本季對龍頭樂天桃猿勝率達到五成。獅隊昨天靠著蘇智傑雙","url":"https://sports.ltn.com.tw/news/breakingnews/3176151","urlToImage":"https://img.ltn.com.tw/Upload/sports/page/800/2020/05/24/php7RlOuM.jpg","publishedAt":"2020-05-24T23:13:57Z","content":"5\r\nLamigo12\r\n3741116\r\n...\r\n401212712200612\r\n1674316\r\n1504633856\r\n12\r\nAPP \r\n APP"},{"source":{"id":null,"name":"Udn.com"},"author":"編譯葉亭均／綜合外電","title":"今天開盤前 五件國際事不可不知 - udn 聯合新聞網","description":"●華為要求三星電子和SK海力士維持穩定記憶體晶片供應","url":"https://udn.com/news/story/6811/4588142","urlToImage":"https://pgw.udn.com.tw/gw/photo.php?u=https://uc.udn.com.tw/photo/2020/05/25/realtime/7929450.jpg&s=Y&x=0&y=8&sw=1280&sh=852&exp=3600","publishedAt":"2020-05-24T22:54:13Z","content":"SK\r\nSK\r\nSK10\r\n81DRAMNAND\r\n1009,290\r\n1009,290\r\n601215\r\n2,000\r\n12%1,8912,000\r\n22\r\n60.8%1,735.500.4%1,734.68\r\nDaniel Briesemann\r\nUBS\r\n56EMU\r\n5612\r\n3524.1"}]
     */
    private var status: String? = null
    private var totalResults = 0
    private var articles: List<ArticlesBean?>? = null

    fun getStatus(): String? {
        return status
    }

    fun setStatus(status: String?) {
        this.status = status
    }

    fun getTotalResults(): Int {
        return totalResults
    }

    fun setTotalResults(totalResults: Int) {
        this.totalResults = totalResults
    }

    fun getArticles(): List<ArticlesBean?>? {
        return articles
    }

    fun setArticles(articles: List<ArticlesBean?>?) {
        this.articles = articles
    }

    @Entity(tableName = "ARTICLES_TABLE")
    data class ArticlesBean (
        /**
         * source : {"id":null,"name":"Udn.com"}
         * author : 記者林士傑／即時報導
         * title : 懺情文被周揚青打臉 羅志祥的她喊話「我們都很好」 - udn 聯合新聞網
         * description : 羅志祥（小豬）上月飛往大陸開工，但遭周揚青丟出核彈級爆料起底，重挫形象，在大陸要參與的3個節目全都飛了。本月初他低調返台...
         * url : https://stars.udn.com/star/story/10088/4588575
         * urlToImage : https://pgw.udn.com.tw/gw/photo.php?u=https://uc.udn.com.tw/photo/2020/05/25/realtime/7930555.jpg&s=Y&x=0&y=9&sw=640&sh=426
         * publishedAt : 2020-05-25T04:12:11Z
         * content : null
         */
        @PrimaryKey @ColumnInfo(name="id") val title: String,
        val  url: String? = null,val author: String? = null,
        val  description: String? = null,
        val  urlToImage: String? = null,
        val  publishedAt: String? = null

    )
}