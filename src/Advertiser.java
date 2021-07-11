public class Advertiser extends BaseAdvertising {
    private String name;
    private static int totalClicks;

    public Advertiser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int getTotalClicks() {
        return totalClicks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String help() {
        return "advertiser class has name, id, views, clicks " +
                "you can interact with an object of this claas by calling its methods";
    }

    @Override
    public void incClicks() {
        super.incClicks();
        totalClicks++;
    }

    @Override
    public String describeMe() {
        return "this is an object of Advertiser class, you can interact with it by calling its methods";
    }
}
