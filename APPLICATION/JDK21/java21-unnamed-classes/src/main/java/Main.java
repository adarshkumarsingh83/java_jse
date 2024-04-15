

public void main() {
    System.out.println(wish());
}

static String wish() {
    try {

        return System.getProperty("user.name") + " welcome to espark ";
    } catch (Exception _) {
        System.out.println("exception  occurred ");
    }

    return "default greet msg";
}
