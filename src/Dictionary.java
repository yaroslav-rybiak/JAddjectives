import java.util.ArrayList;

class Dictionary {

    private ArrayList<String> romaji = new ArrayList<>();
    private ArrayList<String> english = new ArrayList<>();
    private ArrayList<String> kana = new ArrayList<>();

    void addLevel(int level) {
        switch (level) {
            case (1): {
                kana.add("大きい");
                romaji.add("ookii");
                english.add("big");

                kana.add("小さい");
                romaji.add("chiisai");
                english.add("small");

                kana.add("高い");
                romaji.add("takai");
                english.add("high/tall/expensive");

                kana.add("安い");
                romaji.add("yasui");
                english.add("cheap");

                kana.add("新しい");
                romaji.add("atarashii");
                english.add("new");

                kana.add("ふるい");
                romaji.add("furui");
                english.add("old");

                kana.add("いい");
                romaji.add("ii");
                english.add("good");

                kana.add("わるい");
                romaji.add("warui");
                english.add("bad");

                kana.add("むずかしい");
                romaji.add("muzukashii");
                english.add("hard/difficult");

                kana.add("やさしい");
                romaji.add("yasashii");
                english.add("easy/gentle");

                kana.add("とおい");
                romaji.add("tooi");
                english.add("far");

                kana.add("ちかい");
                romaji.add("chikai");
                english.add("near/close");

                kana.add("おいしい");
                romaji.add("oishii");
                english.add("tasty/delicious");

                kana.add("まずい");
                romaji.add("mazui");
                english.add("bad-tasting");

                kana.add("いそがしい");
                romaji.add("isogashii");
                english.add("busy");
                break;
            }
            case (2): {
                kana.add("あつい");
                romaji.add("atsui");
                english.add("hot (weather)");

                kana.add("さむい");
                romaji.add("samui");
                english.add("cold (weather)");

                kana.add("つめたい");
                romaji.add("tsumetai");
                english.add("cold (drink)");

                kana.add("あたたかい");
                romaji.add("atatakai");
                english.add("warm (drink)");

                kana.add("すずしい");
                romaji.add("suzushii");
                english.add("cool (weather)");

                kana.add("むしあつい");
                romaji.add("mushiatsui");
                english.add("humid (weather)");

                kana.add("かたい");
                romaji.add("katai");
                english.add("hard (food)");

                kana.add("やわらかい");
                romaji.add("yawarakai");
                english.add("soft (food)");

                kana.add("おもしろい");
                romaji.add("omoshiroi");
                english.add("interesting/fun");

                kana.add("つまらない");
                romaji.add("tsumaranai");
                english.add("boring");

                kana.add("あさい");
                romaji.add("asai");
                english.add("shallow");

                kana.add("ふかい");
                romaji.add("fukai");
                english.add("deep");

                kana.add("ひろい");
                romaji.add("hiroi");
                english.add("wide/spacious");

                kana.add("せまい");
                romaji.add("semai");
                english.add("narrow");
                break;
            }
            case (3): {
                kana.add("高い");
                romaji.add("takai");
                english.add("high/tall/expensive");

                romaji.add("hikui");
                english.add("low");
                romaji.add("nagai");
                english.add("long");
                romaji.add("mijikai");
                english.add("short");
                romaji.add("hayai");
                english.add("fast/early");
                romaji.add("osoi");
                english.add("slow/late");
                romaji.add("omoi");
                english.add("heavy (object)");
                romaji.add("karui");
                english.add("light (object)");
                romaji.add("tsuyoi");
                english.add("strong");
                romaji.add("yowai");
                english.add("weak");
                romaji.add("kurai");
                english.add("dark");
                romaji.add("akarui");
                english.add("bright/cheerful");
                romaji.add("kowai");
                english.add("scary");
                romaji.add("kawai");
                english.add("cute");
                romaji.add("nemui");
                english.add("sleepy");
                romaji.add("kusai");
                english.add("stinky");
                break;
            }
            default: {
                romaji.add("karappo");
                english.add("empty");
                break;
            }
        }
    }

    ArrayList<String> getEnglishDictionary() {
        return english;
    }

    ArrayList<String> getRomajiDictionary() {
        return romaji;
    }

    ArrayList<String> getKanaDictionary() {
        return kana;
    }
}
