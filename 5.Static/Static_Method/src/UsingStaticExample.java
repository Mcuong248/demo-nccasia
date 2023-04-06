public class UsingStaticExample {
    private String subject;

    public UsingStaticExample(String subject) {
        this.subject = subject;
    }

    public void print(){
        System.out.println("subject: " + subject);
        System.out.println("website: " + MyWebsite.website);
    }

    public static void changeWebsite(String website){
        MyWebsite.website = website;
    }
}
