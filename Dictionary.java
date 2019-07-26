import java.util.ArrayList;

class Dictionary {

    private ArrayList<String> japanese = new ArrayList<>();
    private ArrayList<String> english = new ArrayList<>();

    void addLevel(int level) {
        switch (level) {
            case (1): {
                japanese.add("ookii");
                english.add("big");
                japanese.add("chiisai");
                english.add("small");
                japanese.add("takai");
                english.add("expensive");
                japanese.add("yasui");
                english.add("cheap");
                japanese.add("atarashii");
                english.add("new");
                japanese.add("furui");
                english.add("old");
                japanese.add("ii");
                english.add("good");
                japanese.add("warui");
                english.add("bad");
                japanese.add("muzukashii");
                english.add("hard/difficult");
                japanese.add("yasashii");
                english.add("easy/gentle");
                japanese.add("tooi");
                english.add("far");
                japanese.add("chikai");
                english.add("near/close");
                japanese.add("oishii");
                english.add("tasty");
                japanese.add("mazui");
                english.add("bad-tasting");
                japanese.add("isogashii");
                english.add("busy");
                break;
            }
            case (2): {
                japanese.add("atsui");
                english.add("hot (weather)");
                japanese.add("samui");
                english.add("cold (weather)");
                japanese.add("tsumetai");
                english.add("cold (drink)");
                japanese.add("atatakai");
                english.add("warm (drink)");
                japanese.add("suzushii");
                english.add("cool (weather)");
                japanese.add("mushiatsui");
                english.add("humid (weather)");
                japanese.add("katai");
                english.add("hard (food)");
                japanese.add("yawarakai");
                english.add("soft (food)");
                japanese.add("omoshiroi");
                english.add("interesting/fun");
                japanese.add("tsumaranai");
                english.add("boring");
                japanese.add("asai");
                english.add("shallow");
                japanese.add("fukai");
                english.add("deep");
                japanese.add("hiroi");
                english.add("wide/spacious");
                japanese.add("semai");
                english.add("narrow");
                break;
            }
            case (3): {
                japanese.add("takai");
                english.add("high/tall");
                japanese.add("hikui");
                english.add("low");
                japanese.add("nagai");
                english.add("long");
                japanese.add("mijikai");
                english.add("short");
                japanese.add("hayai");
                english.add("fast/early");
                japanese.add("osoi");
                english.add("slow/late");
                japanese.add("omoi");
                english.add("heavy (object)");
                japanese.add("karui");
                english.add("light (object)");
                japanese.add("tsuyoi");
                english.add("strong");
                japanese.add("yowai");
                english.add("weak");
                japanese.add("kurai");
                english.add("dark");
                japanese.add("akarui");
                english.add("bright/cheerful");
                japanese.add("kowai");
                english.add("scary");
                japanese.add("kawai");
                english.add("cute");
                japanese.add("nemui");
                english.add("sleepy");
                japanese.add("kusai");
                english.add("stinky");
                break;
            }
            default: {
                japanese.add("karappo");
                english.add("empty");
                break;
            }
        }
    }

    ArrayList<String> getEnglishDictionary() {
        return english;
    }

    ArrayList<String> getJapaneseDictionary() {
        return japanese;
    }
}
