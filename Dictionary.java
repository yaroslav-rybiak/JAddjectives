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
                romaji.add("takai");
                english.add("expensive");
                romaji.add("yasui");
                english.add("cheap");
                romaji.add("atarashii");
                english.add("new");
                romaji.add("furui");
                english.add("old");
                romaji.add("ii");
                english.add("good");
                romaji.add("warui");
                english.add("bad");
                romaji.add("muzukashii");
                english.add("hard/difficult");
                romaji.add("yasashii");
                english.add("easy/gentle");
                romaji.add("tooi");
                english.add("far");
                romaji.add("chikai");
                english.add("near/close");
                romaji.add("oishii");
                english.add("tasty/delicious");
                romaji.add("mazui");
                english.add("bad-tasting");
                romaji.add("isogashii");
                english.add("busy");
                break;
            }
            case (2): {
                romaji.add("atsui");
                english.add("hot (weather)");
                romaji.add("samui");
                english.add("cold (weather)");
                romaji.add("tsumetai");
                english.add("cold (drink)");
                romaji.add("atatakai");
                english.add("warm (drink)");
                romaji.add("suzushii");
                english.add("cool (weather)");
                romaji.add("mushiatsui");
                english.add("humid (weather)");
                romaji.add("katai");
                english.add("hard (food)");
                romaji.add("yawarakai");
                english.add("soft (food)");
                romaji.add("omoshiroi");
                english.add("interesting/fun");
                romaji.add("tsumaranai");
                english.add("boring");
                romaji.add("asai");
                english.add("shallow");
                romaji.add("fukai");
                english.add("deep");
                romaji.add("hiroi");
                english.add("wide/spacious");
                romaji.add("semai");
                english.add("narrow");
                break;
            }
            case (3): {
                romaji.add("takai");
                english.add("high/tall");
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
