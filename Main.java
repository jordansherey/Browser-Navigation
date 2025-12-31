public static void main() {
    Scanner input = new Scanner(System.in);
    int userChoice;

    do {
        System.out.println("##### Welcome to JBrowse #####");
        System.out.println("1) Visit Webpage (url)");
        System.out.println("2) Go Back");
        System.out.println("3) Go Forward");
        System.out.println("4) Show Browsing History");
        System.out.println("5) Clear Browsing History");
        System.out.println("6) Exit JBrowse");

        userChoice = input.nextInt();

        switch (userChoice) {
            case 1:
                System.out.println("Enter URL");
                String url = input.nextLine();
                BrowserNavigation visit = new BrowserNavigation<>();
                visit.visitWebsite(url);
                System.out.println("Please stand by....");
                break;

            case 2:
                BrowserNavigation back = new BrowserNavigation();
                back.goBack();
                break;

            case 3:
                BrowserNavigation forward = new BrowserNavigation();
                forward.goForward();
                break;
            case 4:
                BrowserNavigation showHistory = new BrowserNavigation();
                showHistory.showHistory();
                break;
            case 5:
                BrowserNavigation clear = new BrowserNavigation();
                clear.clearHistory();
                break;
            case 6:
                System.out.println("Thank you for using JBrowse!");
                System.out.println("##### Exiting JBrowse #####");

            default:
                System.out.println("Invalid choice");
                System.out.println("Please choose a valid # from 1 - 6");
        }

    } while (userChoice != 6);
}
