public class UsingStaticExample {
    private String subject;

    public UsingStaticExample(String subject) {
        this.subject = subject;
    }

    public void print(){
        System.out.println("sbject " + subject);
        System.out.println("website " + MyWebsite.website);
    }
}
