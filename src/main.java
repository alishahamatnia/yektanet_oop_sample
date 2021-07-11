public class main {
    public static void main(String[] args) {
        UI ui = new UI();

        BaseAdvertising baseAdvertising = new BaseAdvertising();
        Advertiser advertiser1 = new Advertiser("name1");
        Advertiser advertiser2 = new Advertiser("name2");


        ui.print_message(baseAdvertising.describeMe());
        ui.print_message(advertiser1.describeMe());
        advertiser2.setName("new name");
        ui.print_message(advertiser2.getName());
        ui.print_message(Integer.toString(advertiser2.getClicks()));
        ui.print_message(Integer.toString(Advertiser.getTotalClicks()));
        ui.print_message(Advertiser.help());

    }
}
