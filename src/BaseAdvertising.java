public class BaseAdvertising {
    private static int objects_count;
    private final int id;
    private int views;
    private int clicks;

    public BaseAdvertising() {
        this.views = 0;
        this.clicks = 0;
        this.id = objects_count;
        objects_count++;

    }

    public int getId() {
        return id;
    }

    public int getViews() {
        return views;
    }

    public int getClicks() {
        return clicks;
    }

    public void incViews() {
        views++;
    }

    public void incClicks() {
        clicks++;
    }

    public String describeMe() {
        return "this is an object of BaseAdvertising class which has common " +
                "fields and methods of Ad and Advertiser classes, this class could be abstract";
    }
}
