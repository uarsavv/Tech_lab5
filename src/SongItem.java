
import java.util.Date;

public record SongItem(int itemId, String title, String artist, Date date, float listPrice, float price, int version) {
    @Override
    public String toString() {
        return String.format("[%s] %s by %s at %s (prices - %s, %s; version - %s)", itemId, title, artist, date, listPrice, price, version);
    }
    public static final class Builder {

        int itemId;
        String title;
        String artist;
        Date date;
        float listPrice;
        float price;
        int version;

        public Builder(int itemId, String title, String artist, Date date, float listPrice, float price, int version) {
            this.itemId = itemId;
            this.title = title;
            this.artist = artist;
            this.date = date;
            this.listPrice = listPrice;
            this.price = price;
            this.version = version;
        }

        public Builder(int itemId, String title, String artist) {
            this.itemId = itemId;
            this.title = title;
            this.artist = artist;
        }

        public Builder date(Date date) {
            this.date = date;
            return this;
        }

        public Builder listPrice(float listPrice) {
            this.listPrice = listPrice;
            return this;
        }

        public Builder price(float price) {
            this.price = price;
            return this;
        }

        public Builder version(int version) {
            this.version = version;
            return this;
        }

        public SongItem build() {
            return new SongItem(itemId, title, artist, date, listPrice, price, version);
        }
    }}
