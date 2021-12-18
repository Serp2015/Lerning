public class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        //Do your magic here
        String temp = "";
        switch (names.length) {
            case 0:
                temp = "no one likes this";
                break;
            case 1:
                temp = names[0] + " likes this";
                break;
            case 2:
                temp = names[0] + " and " + names[1] + " like this";
                break;
            case 3:
                temp = names[0] + ", " + names[1] + " and " + names[2] + " like this";
                break;
            default:
                temp = names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
                break;
        }
        return temp;
    }
}
