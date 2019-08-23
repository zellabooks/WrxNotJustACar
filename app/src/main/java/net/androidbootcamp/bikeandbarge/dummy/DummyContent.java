package net.androidbootcamp.bikeandbarge.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();


    static {
        // Add some sample items.

            addItem(new DummyItem("1", "Photos"));
            addItem(new DummyItem("2", "Buying a WRX"));
            addItem(new DummyItem("3","Web Site", "https://www.subaru.com"));
            addItem(new DummyItem("4", "Enlarged Photos"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public String item_url;
        public String item_name;



        public DummyItem(String id, String item_name, String item_url) {
            this.id = id;
            this.item_name = item_name;
            this.item_url = item_url;
        }

        public DummyItem(String id, String item_name) {
            this.id = id;
            this.item_name = item_name;
            this.item_url = item_name;
        }

        @Override
        public String toString() {
            return item_name;
        }
    }
}
