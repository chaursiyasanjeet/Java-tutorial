public class string {
    public static void main(String[] args) {

        // concatenate->adding strings
        String firstname = "sanjeet";
        String lastname = "kumar";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);

        // charAt
        String name = "sanjeet";
        System.out.println(name.charAt(5));

        // length
        System.out.println(name.length());

        // replace
        String name2 = name.replace('e', 'E');
        System.out.println(name2);

        // substring
        String name3 = "sanjeet and kumar";
        System.out.println(name3.substring(0, 8));

    }
}
