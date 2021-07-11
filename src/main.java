public class main {
    public static void main(String[] args) {
        UI ui = new UI();

        BaseAdvertising baseAdvertising = new BaseAdvertising();
        Advertiser advertiser1 = new Advertiser("name1");
        Advertiser advertiser2 = new Advertiser("name2");
        Ad ad1 = new Ad("title1", "img-url1", "link1", advertiser1);
        Ad ad2 = new Ad("title2", "img-url2", "link2", advertiser2);
        ui.print_message(baseAdvertising.describeMe());
        ui.print_message(ad2.describeMe());
        ui.print_message(advertiser1.describeMe());
        ad1.incViews();
        ad1.incViews();
        ad1.incViews();
        ad1.incViews();
        ad2.incViews();
        ad1.incClicks();
        ad1.incClicks();
        ad2.incClicks();
        ui.print_message(advertiser2.getName());
        advertiser2.setName("new name");
        ui.print_message(advertiser2.getName());
        ui.print_message(Integer.toString(ad1.getClicks()));
        ui.print_message(Integer.toString(advertiser2.getClicks()));
        ui.print_message(Integer.toString(Advertiser.getTotalClicks()));
        ui.print_message(Advertiser.help());

    }
}
