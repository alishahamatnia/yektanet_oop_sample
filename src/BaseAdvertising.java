public class BaseAdvertising {
    private int id;
    private int views;
    private int clicks;

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
    public String describeMe(){
        return "this is an object of BaseAdvertising class which has common " +
                "fields and methods of Ad and Advertiser classes, this class could be abstract";
    }
}
