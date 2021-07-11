public class main {
    public static void main(String[] args) {
        BaseAdvertising baseAdvertising = new BaseAdvertising();

        UI ui = new UI();

        ui.print_message(baseAdvertising.describeMe());

    }
}
