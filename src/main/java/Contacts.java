public class Contacts {

    public static class Info {
        private final String firstName;
        private final String lastName;
        private final String twitter;

        public Info(String firstName, String lastName, String twitterHandle) {
            this.firstName = firstName;
            this.lastName  = lastName;
            this.twitter   = twitterHandle;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getTwitterHandle() {
            return twitter;
        }
    }

    public static Info get(String name) {
        return new Info("Paul", "Moore", "@pdmoore");
    }
}
