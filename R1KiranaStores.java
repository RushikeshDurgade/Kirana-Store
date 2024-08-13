import java.util.Scanner;
class KiranaStores {
    private String name;
    private String email;
    private String address;
    private long contact;
    private String password;
    static double TotalBill;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getContact() {
        return contact;
    }

    public void setContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Contact Number");
        contact = sc.nextLong();
        if (contact > 999999999 && contact < 10000000000L) {
            System.out.println("Contact Number is Valid");
        } else {
            System.err.println("Enter 10 digit number~!!!!");
            setContact();
        }

    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void Signup() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name");
        name = sc.nextLine();
        System.out.println("Enter email");
        email = sc.nextLine();
        System.out.println("Enter the Address");
        address = sc.nextLine();
        setContact();
        System.out.println("Enter Strong Password");
        password = sc.nextLine();
        login();
    }

    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for contact to login");
        System.out.println("Enter 2 for email to login");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("Enter the contact");
            long contact = sc.nextLong();
            sc.nextLine();
            System.out.println("Enter the password");
            String pass = sc.nextLine();
            if (this.contact == contact && this.password.equals(pass)) {
                System.out.println("Login Successful");
            } else {
                System.err.println("User Credentials Incorrect");
                login();
            }
        } else if (n == 2) {
            System.out.println("Enter the email");
            sc.nextLine();
            String email = sc.nextLine();
            System.out.println("Enter the password");
            String pass = sc.nextLine();
            System.out.println("Enter the password");
            if (this.email.equals(email) && this.password.equals(pass)) {
                System.out.println("Login Successful");
            } else {
                System.err.println("User Credentials Incorrect");
                login();
            }
        } else {
            System.err.println("Wrong Choice!!!Please try again");
            login();
        }
    }

    public void KiranaStores()
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for Biscuits");
        System.out.println("Press 2 for Soft Drinks");
        System.out.println("Press 3 for Masala");
        System.out.println("Press 4 for Cadbury");
        System.out.println("Press 5 for TootPaste");
        System.out.println("Press 6 for ToothBrush");
        System.out.println("Press 7 for Shampoo");
        System.out.println("Press 8 for Soap");
        System.out.println("Press 9 for Washing-Powder");
        System.out.println("Press 10 for Tea Powder");
        System.out.println("Press 11 for Exit");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                Biscuits b = new Biscuits();
                b.BiscuitsMenu();
                break;
            case 2:
                SoftDrinks s=new SoftDrinks();
                s.SoftDrinks();
                break;
            case 3:
                Masala m=new Masala();
                m.Masala();
                break;
            case 4:
                Cadbury c=new Cadbury();
                c.Cadbury();
                break;
            case 5:
                TootPaste t=new TootPaste();
                t.TootPaste();
                break;
            case 6:
                ToothBrush q=new ToothBrush();
                q.ToothBrush();
                break;
            case 7:
                Shampoo w=new Shampoo();
                w.Shampoo();
                break;
            case 8:
                Soap e=new Soap();
                e.Soap();
                break;
            case 9:
                WashingPowder r=new WashingPowder();
                r.WashingPowder();
                break;
            case 10:
                TeaPowder z=new TeaPowder();
                z.TeaPowder();
                break;
            case 11:
                System.out.println("Thank You for visiting");
                System.exit(0);
                break;
            default:
                System.err.println("Try Again!!!");
                KiranaStores();
                break;
        }
    }
}
class Biscuits extends KiranaStores
{
    public void BiscuitsMenu()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 for Parle Company Biscuits");
        System.out.println("Press 2 for Britania Company Biscuits");
        System.out.println("Press 3 for Sunfeast Company Biscuits");
        System.out.println("Press 4 for PriyaGold Company Biscuits");
        System.out.println("Press 5 for Cadbury-Oreo Biscuits");
        System.out.println("Press 6 to go back");
        int x=sc.nextInt();
        switch (x)
        {
            case 1:
                Parle p=new Parle();
                p.Parle();
                break;
            case 2:
                Britania b=new Britania();
                b.Britania();
                break;
            case 3:
                Sunfeast s=new Sunfeast();
                s.Sunfeast();
                break;
            case 4:
                PriyaGold g=new PriyaGold();
                g.PriyaGold();
                break;
            case 5:
                Oreo o=new Oreo();
                o.Oreo();
                break;
            case 6:
                KiranaStores();
                break;
            default:
                System.out.println("Please Try Again!!!");
                BiscuitsMenu();
                break;
        }
    }
}
    class Parle extends Biscuits {
    public void Parle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for Parle-Glucose Biscuits");
        System.out.println("Press 2 for 20-20 Cookies Biscuits");
        System.out.println("Press 3 for Krack-Jack Biscuits");
        System.out.println("Press 4 for Monaco Biscuits");
        System.out.println("Press 5 for Happy-Happy Biscuits");
        System.out.println("Press 6 for Hide and Seek Biscuits");
        System.out.println("Press 7 to go back");
        int p = sc.nextInt();
        switch (p) {
            case 1:
                ParleGlucose g = new ParleGlucose();
                g.ParleGlucose();
                break;
            case 2:
                Cookies c = new Cookies();
                c.Cookies();
                break;
            case 3:
                KrackJack k = new KrackJack();
                k.KrackJack();
                break;
            case 4:
                Monaco m = new Monaco();
                m.Monaco();
                break;
            case 5:
                HappyHappy h = new HappyHappy();
                h.HappyHappy();
                break;
            case 6:
                Hide_n_Seek s = new Hide_n_Seek();
                s.Hide_n_Seek();
                break;
            case 7:
                BiscuitsMenu();
                break;
            default:
                System.err.println("Please choose correct option");
                Parle();
                break;
        }
    }
}
        class ParleGlucose extends Parle {
        public void ParleGlucose() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 to order Rs 5 Parle-Glucose Biscuits");
            System.out.println("Press 2 to order Rs 10 Parle-Glucose Biscuits");
            System.out.println("Press 3 to order Rs 25 Parle-Glucose Biscuits");
            System.out.println("Press 4 to order Rs 50 Parle-Glucose Biscuits");
            System.out.println("Press 5 to go back");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Choose Y to order or N to go back");
                    char ch1 = sc.next().charAt(0);
                    if (ch1 == 'y' || ch1 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 5;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                ParleGlucose();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch1 == 'n' || ch1 == 'N') {
                        System.out.println("Choose another item");
                        ParleGlucose();
                    } else {
                        System.err.println("Please choose correct option");
                        ParleGlucose();
                    }
                    break;
                case 2:
                    System.out.println("Choose Y to order or N to go back");
                    char ch2 = sc.next().charAt(0);
                    if (ch2 == 'y' || ch2 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 10;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                ParleGlucose();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch2 == 'n' || ch2 == 'N') {
                        System.out.println("Choose another item");
                        ParleGlucose();
                    } else {
                        System.err.println("Please choose correct option");
                        ParleGlucose();
                    }
                    break;
                case 3:
                    System.out.println("Choose Y to order or N to go back");
                    char ch3 = sc.next().charAt(0);
                    if (ch3 == 'y' || ch3 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 25;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                ParleGlucose();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch3 == 'n' || ch3 == 'N') {
                        System.out.println("Choose another item");
                        ParleGlucose();
                    } else {
                        System.err.println("Please choose correct option");
                        ParleGlucose();
                    }
                    break;
                case 4:
                    System.out.println("Choose Y to order or N to go back");
                    char ch4 = sc.next().charAt(0);
                    if (ch4 == 'y' || ch4 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 50;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                ParleGlucose();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch4 == 'n' || ch4 == 'N') {
                        System.out.println("Choose another item");
                        ParleGlucose();
                    } else {
                        System.err.println("Please choose correct option");
                        ParleGlucose();
                    }
                    break;
                case 5:
                    Parle();
                    break;
                default:
                    System.err.println("Choose Correct Option");
                    ParleGlucose();
                    break;
            }
        }
    }

        class Cookies extends Parle {
        public void Cookies() {

            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 to order Rs 5 20-20 Cookies Biscuits");
            System.out.println("Press 2 to order Rs 10 20-20 Cookies Biscuits");
            System.out.println("Press 3 to order Rs 25 20-20 Cookies Biscuits");
            System.out.println("Press 4 to order Rs 50 20-20 Cookies Biscuits ");
            System.out.println("Press 5 to go back");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Choose Y to order or N to go back");
                    char ch1 = sc.next().charAt(0);
                    if (ch1 == 'y' || ch1 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 5;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                Cookies();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch1 == 'n' || ch1 == 'N') {
                        System.out.println("Choose another item");
                        Cookies();
                    } else {
                        System.err.println("Please choose correct option");
                        Cookies();
                    }
                    break;
                case 2:
                    System.out.println("Choose Y to order or N to go back");
                    char ch2 = sc.next().charAt(0);
                    if (ch2 == 'y' || ch2 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 10;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                Cookies();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch2 == 'n' || ch2 == 'N') {
                        System.out.println("Choose another item");
                        Cookies();
                    } else {
                        System.err.println("Please choose correct option");
                        Cookies();
                    }
                    break;
                case 3:
                    System.out.println("Choose Y to order or N to go back");
                    char ch3 = sc.next().charAt(0);
                    if (ch3 == 'y' || ch3 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 25;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                Cookies();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch3 == 'n' || ch3 == 'N') {
                        System.out.println("Choose another item");
                        Cookies();
                    } else {
                        System.err.println("Please choose correct option");
                        Cookies();
                    }
                    break;
                case 4:
                    System.out.println("Choose Y to order or N to go back");
                    char ch4 = sc.next().charAt(0);
                    if (ch4 == 'y' || ch4 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 50;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                Cookies();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch4 == 'n' || ch4 == 'N') {
                        System.out.println("Choose another item");
                        Cookies();
                    } else {
                        System.err.println("Please choose correct option");
                        Cookies();
                    }
                    break;
                case 5:
                    Parle();
                    break;
                default:
                    System.err.println("Choose Correct Option");
                    Cookies();
                    break;
            }
        }
    }

        class KrackJack extends Parle {
        public void KrackJack() {

            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 to order Rs 5 Krack-jack Biscuits");
            System.out.println("Press 2 to order Rs 10 Krack-jack Biscuits");
            System.out.println("Press 3 to order Rs 30 Krack-jack Biscuits");
            System.out.println("Press 4 to order Rs 60 Krack-jack Biscuits ");
            System.out.println("Press 5 to go back");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Choose Y to order or N to go back");
                    char ch1 = sc.next().charAt(0);
                    if (ch1 == 'y' || ch1 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 5;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                KrackJack();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch1 == 'n' || ch1 == 'N') {
                        System.out.println("Choose another item");
                        KrackJack();
                    } else {
                        System.err.println("Please choose correct option");
                        KrackJack();
                    }
                    break;
                case 2:
                    System.out.println("Choose Y to order or N to go back");
                    char ch2 = sc.next().charAt(0);
                    if (ch2 == 'y' || ch2 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 10;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                KrackJack();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch2 == 'n' || ch2 == 'N') {
                        System.out.println("Choose another item");
                        KrackJack();
                    } else {
                        System.err.println("Please choose correct option");
                        KrackJack();
                    }
                    break;
                case 3:
                    System.out.println("Choose Y to order or N to go back");
                    char ch3 = sc.next().charAt(0);
                    if (ch3 == 'y' || ch3 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 30;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                KrackJack();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch3 == 'n' || ch3 == 'N') {
                        System.out.println("Choose another item");
                        KrackJack();
                    } else {
                        System.err.println("Please choose correct option");
                        KrackJack();
                    }
                    break;
                case 4:
                    System.out.println("Choose Y to order or N to go back");
                    char ch4 = sc.next().charAt(0);
                    if (ch4 == 'y' || ch4 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 60;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                KrackJack();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch4 == 'n' || ch4 == 'N') {
                        System.out.println("Choose another item");
                        KrackJack();
                    } else {
                        System.err.println("Please choose correct option");
                        KrackJack();
                    }
                    break;
                case 5:
                    Parle();
                    break;
                default:
                    System.err.println("Choose Correct Option");
                    KrackJack();
                    break;
            }
        }
    }

        class Monaco extends Parle {
        public void Monaco() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 to order Rs 5 Monaco Biscuits");
            System.out.println("Press 2 to order Rs 10 Monaco Biscuits");
            System.out.println("Press 3 to order Rs 30 Monaco Biscuits");
            System.out.println("Press 4 to order Rs 50 Monaco Biscuits ");
            System.out.println("Press 5 to go back");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Choose Y to order or N to go back");
                    char ch1 = sc.next().charAt(0);
                    if (ch1 == 'y' || ch1 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 5;
                        System.out.println("Press to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                Monaco();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch1 == 'n' || ch1 == 'N') {
                        System.out.println("Choose another item");
                        Monaco();
                    } else {
                        System.err.println("Please choose correct option");
                        Monaco();
                    }
                    break;
                case 2:
                    System.out.println("Choose Y to order or N to go back");
                    char ch2 = sc.next().charAt(0);
                    if (ch2 == 'y' || ch2 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 10;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                Monaco();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch2 == 'n' || ch2 == 'N') {
                        System.out.println("Choose another item");
                        Monaco();
                    } else {
                        System.err.println("Please choose correct option");
                        Monaco();
                    }
                    break;
                case 3:
                    System.out.println("Choose Y to order or N to go back");
                    char ch3 = sc.next().charAt(0);
                    if (ch3 == 'y' || ch3 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 30;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                Monaco();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch3 == 'n' || ch3 == 'N') {
                        System.out.println("Choose another item");
                        Monaco();
                    } else {
                        System.err.println("Please choose correct option");
                        Monaco();
                    }
                    break;
                case 4:
                    System.out.println("Choose Y to order or N to go back");
                    char ch4 = sc.next().charAt(0);
                    if (ch4 == 'y' || ch4 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 50;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                Monaco();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch4 == 'n' || ch4 == 'N') {
                        System.out.println("Choose another item");
                        Monaco();
                    } else {
                        System.err.println("Please choose correct option");
                        Monaco();
                    }
                    break;
                case 5:
                    Parle();
                    break;
                default:
                    System.err.println("Choose Correct Option");
                    Monaco();
                    break;
            }
        }
    }

        class HappyHappy extends Parle {
        public void HappyHappy() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 to order Rs 5 Happy-Happy Biscuits");
            System.out.println("Press 2 to order Rs 10 Happy-Happy Biscuits");
            System.out.println("Press 3 to order Rs 30 Happy-Happy Biscuits");
            System.out.println("Press 4 to go back");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Choose Y to order or N to go back");
                    char ch1 = sc.next().charAt(0);
                    if (ch1 == 'y' || ch1 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 5;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                HappyHappy();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch1 == 'n' || ch1 == 'N') {
                        System.out.println("Choose another item");
                        HappyHappy();
                    } else {
                        System.err.println("Please choose correct option");
                        HappyHappy();
                    }
                    break;
                case 2:
                    System.out.println("Choose Y to order or N to go back");
                    char ch2 = sc.next().charAt(0);
                    if (ch2 == 'y' || ch2 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 10;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                HappyHappy();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch2 == 'n' || ch2 == 'N') {
                        System.out.println("Choose another item");
                        HappyHappy();
                    } else {
                        System.err.println("Please choose correct option");
                        HappyHappy();
                    }
                    break;
                case 3:
                    System.out.println("Choose Y to order or N to go back");
                    char ch3 = sc.next().charAt(0);
                    if (ch3 == 'y' || ch3 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 30;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                HappyHappy();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch3 == 'n' || ch3 == 'N') {
                        System.out.println("Choose another item");
                        HappyHappy();
                    } else {
                        System.err.println("Please choose correct option");
                        HappyHappy();
                    }
                    break;
                case 4:
                    Parle();
                    break;
                default:
                    System.err.println("Choose Correct Option");
                    HappyHappy();
                    break;

            }
        }
    }
        class Hide_n_Seek extends Parle {
            public void Hide_n_Seek() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Press 1 to order Rs 10 Hide&Seek Biscuits");
                System.out.println("Press 2 to order Rs 30 Hide&Seek Biscuits");
                System.out.println("Press 3 to go back");
                int n = sc.nextInt();
                switch (n) {
                    case 1:
                        System.out.println("Choose Y to order or N to go back");
                        char ch6 = sc.next().charAt(0);
                        if (ch6 == 'y' || ch6 == 'Y') {
                            System.out.println("Order has been confirmed");
                            TotalBill = TotalBill + 10;
                            System.out.println("Press 1 to order again");
                            System.out.println("Press 2 to go to Main Menu");
                            System.out.println("Press 3 to proceed for bill");
                            n = sc.nextInt();
                            switch (n) {
                                case 1:
                                    Hide_n_Seek();
                                    break;
                                case 2:
                                    KiranaStores();
                                    break;
                                case 3:
                                    System.out.println("Please Pay the Amount");
                                    break;
                            }
                        } else if (ch6 == 'n' || ch6 == 'N') {
                            System.out.println("Choose another item");
                            Hide_n_Seek();
                        } else {
                            System.err.println("Please choose correct option");
                            Hide_n_Seek();
                        }
                        break;
                    case 2:
                        System.out.println("Choose Y to order or N to go back");
                        char ch2 = sc.next().charAt(0);
                        if (ch2 == 'y' || ch2 == 'Y') {
                            System.out.println("Order has been confirmed");
                            TotalBill = TotalBill + 30;
                            System.out.println("Press 1 to order again");
                            System.out.println("Press 2 to go to Main Menu");
                            System.out.println("Press 3 to proceed for bill");
                            n = sc.nextInt();
                            switch (n) {
                                case 1:
                                    Hide_n_Seek();
                                    break;
                                case 2:
                                    KiranaStores();
                                    break;
                                case 3:
                                    System.out.println("Please Pay the Amount");
                                    break;
                            }
                        } else if (ch2 == 'n' || ch2 == 'N') {
                            System.out.println("Choose another item");
                            Hide_n_Seek();
                        } else {
                            System.err.println("Please choose correct option");
                            Hide_n_Seek();
                        }
                        break;
                    case 3:
                        Parle();
                        break;
                    default:
                        System.err.println("Choose Correct Option");
                        Hide_n_Seek();
                        break;

                }
            }
        }



    class Britania extends Biscuits {
        public void Britania()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Press 1 for Good-Day Biscuits");
            System.out.println("Press 2 for 50-50 Biscuits");
            System.out.println("Press 3 for Nutri-Choice Biscuits");
            System.out.println("Press 4 for Marie-Gold Biscuits");
            System.out.println("Press 5 for Tiger-Crunch Biscuits");
            System.out.println("Press 6 for Vita-Marie-Gold Biscuits");
            System.out.println("Press 7 to go back");
            int a=sc.nextInt();
            switch (a)
            {
                case 1:
                    GoodDay g=new GoodDay();
                    g.GoodDay();
                    break;
                case 2:
                    FiftyFifty f= new FiftyFifty();
                    f.FiftyFifty();
                    break;
                case 3:
                    NutriChoice n = new NutriChoice();
                    n.NutriChoice();
                    break;
                case 4:
                    MarieGold m = new MarieGold();
                    m.MarieGold();
                    break;
                case 5:
                    TigerCrunch t=new TigerCrunch();
                    t.TigerCrunch();
                    break;
                case 6:
                    VitaMarieGold v=new VitaMarieGold();
                    v.VitaMarieGold();
                    break;
                case 7:
                    BiscuitsMenu();
                    break;
                default:
                    System.out.println("Please Enter the Valid Input!!!");
                    Britania();
                    break;

            }
        }
    }
    class GoodDay extends Britania {
        public void GoodDay()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 to order Rs 5 GoodDay Biscuits");
            System.out.println("Press 2 to order Rs 10 GoodDay Biscuits");
            System.out.println("Press 3 to order Rs 25 GoodDay Biscuits");
            System.out.println("Press 4 to order Rs 50 GoodDay Biscuits");
            System.out.println("Press 5 to go back");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Choose Y to order or N to go back");
                    char ch1 = sc.next().charAt(0);
                    if (ch1 == 'y' || ch1 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 5;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                GoodDay();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch1 == 'n' || ch1 == 'N') {
                        System.out.println("Choose another item");
                        GoodDay();
                    } else {
                        System.err.println("Please choose correct option");
                        GoodDay();
                    }
                    break;
                case 2:
                    System.out.println("Choose Y to order or N to go back");
                    char ch2 = sc.next().charAt(0);
                    if (ch2 == 'y' || ch2 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 10;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                GoodDay();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch2 == 'n' || ch2 == 'N') {
                        System.out.println("Choose another item");
                        GoodDay();
                    } else {
                        System.err.println("Please choose correct option");
                        GoodDay();
                    }
                    break;
                case 3:
                    System.out.println("Choose Y to order or N to go back");
                    char ch3 = sc.next().charAt(0);
                    if (ch3 == 'y' || ch3 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 25;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                GoodDay();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch3 == 'n' || ch3 == 'N') {
                        System.out.println("Choose another item");
                        GoodDay();
                    } else {
                        System.err.println("Please choose correct option");
                        GoodDay();
                    }
                    break;
                case 4:
                    System.out.println("Choose Y to order or N to go back");
                    char ch4 = sc.next().charAt(0);
                    if (ch4 == 'y' || ch4 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 50;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                GoodDay();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch4 == 'n' || ch4 == 'N') {
                        System.out.println("Choose another item");
                        GoodDay();
                    } else {
                        System.err.println("Please choose correct option");
                        GoodDay();
                    }
                    break;
                case 5:
                    Britania();
                    break;
                default:
                    System.err.println("Choose Correct Option");
                    GoodDay();
                    break;
            }

        }
    }
    class FiftyFifty extends Britania{
    public void FiftyFifty(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to order Rs 10 50-50 Biscuits");
        System.out.println("Press 2 to order Rs 30 50-50 Biscuits");
        System.out.println("Press 3 to go back");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch6 = sc.next().charAt(0);
                if (ch6 == 'y' || ch6 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    n = sc.nextInt();
                    switch (n) {
                        case 1:
                            FiftyFifty();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch6 == 'n' || ch6 == 'N') {
                    System.out.println("Choose another item");
                    FiftyFifty();
                } else {
                    System.err.println("Please choose correct option");
                    FiftyFifty();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 30;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    n = sc.nextInt();
                    switch (n) {
                        case 1:
                            FiftyFifty();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    FiftyFifty();
                } else {
                    System.err.println("Please choose correct option");
                    FiftyFifty();
                }
                break;
            case 3:
                Britania();
                break;
            default:
                System.err.println("Choose Correct Option");
                FiftyFifty();
                break;

        }
    }
}
    class NutriChoice extends Britania {
    public void NutriChoice() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 to order Rs 10 Nutri-Choice Biscuits");
            System.out.println("Press 2 to order Rs 20 Nutri_Choice Biscuits");
            System.out.println("Press 3 to go back");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Choose Y to order or N to go back");
                    char ch6 = sc.next().charAt(0);
                    if (ch6 == 'y' || ch6 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 10;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                NutriChoice();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch6 == 'n' || ch6 == 'N') {
                        System.out.println("Choose another item");
                        NutriChoice();
                    } else {
                        System.err.println("Please choose correct option");
                        NutriChoice();
                    }
                    break;
                case 2:
                    System.out.println("Choose Y to order or N to go back");
                    char ch2 = sc.next().charAt(0);
                    if (ch2 == 'y' || ch2 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 20;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                NutriChoice();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch2 == 'n' || ch2 == 'N') {
                        System.out.println("Choose another item");
                        NutriChoice();
                    } else {
                        System.err.println("Please choose correct option");
                        NutriChoice();
                    }
                    break;
                case 3:
                    Britania();
                    break;
                default:
                    System.err.println("Choose Correct Option");
                    NutriChoice();
                    break;

            }
        }
    }
    class MarieGold extends Britania{
    public void MarieGold() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to order Rs 5 Marie-Gold Biscuits");
        System.out.println("Press 2 to order Rs 10 Marie-Gold Biscuits");
        System.out.println("Press 3 to order Rs 30 Marie-Gold Biscuits");
        System.out.println("Press 4 to order Rs 50 Marie-Gold Biscuits");
        System.out.println("Press 5 to go back");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 5;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    n = sc.nextInt();
                    switch (n) {
                        case 1:
                            MarieGold();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    MarieGold();
                } else {
                    System.err.println("Please choose correct option");
                    MarieGold();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    n = sc.nextInt();
                    switch (n) {
                        case 1:
                            MarieGold();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    MarieGold();
                } else {
                    System.err.println("Please choose correct option");
                    MarieGold();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 25;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    n = sc.nextInt();
                    switch (n) {
                        case 1:
                            MarieGold();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    MarieGold();
                } else {
                    System.err.println("Please choose correct option");
                    MarieGold();
                }
                break;
            case 4:
                System.out.println("Choose Y to order or N to go back");
                char ch4 = sc.next().charAt(0);
                if (ch4 == 'y' || ch4 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 50;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    n = sc.nextInt();
                    switch (n) {
                        case 1:
                            MarieGold();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch4 == 'n' || ch4 == 'N') {
                    System.out.println("Choose another item");
                    MarieGold();
                } else {
                    System.err.println("Please choose correct option");
                    MarieGold();
                }
                break;
            case 5:
                Britania();
                break;
            default:
                System.err.println("Choose Correct Option");
                MarieGold();
                break;
        }
    }
}
    class TigerCrunch extends Britania{
    public void TigerCrunch(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to order Rs 5 Tiger-Crunch Biscuits");
        System.out.println("Press 2 to order Rs 10 Tiger-Crunch Biscuits");
        System.out.println("Press 3 to go back");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch6 = sc.next().charAt(0);
                if (ch6 == 'y' || ch6 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 5;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    n = sc.nextInt();
                    switch (n) {
                        case 1:
                            TigerCrunch();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch6 == 'n' || ch6 == 'N') {
                    System.out.println("Choose another item");
                    TigerCrunch();
                } else {
                    System.err.println("Please choose correct option");
                    TigerCrunch();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    n = sc.nextInt();
                    switch (n) {
                        case 1:
                            TigerCrunch();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    TigerCrunch();
                } else {
                    System.err.println("Please choose correct option");
                    TigerCrunch();
                }
                break;
            case 3:
                Britania();
                break;
            default:
                System.err.println("Choose Correct Option");
                TigerCrunch();
                break;
        }
    }
}
    class VitaMarieGold extends Britania{
    public void VitaMarieGold(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to order Rs 5 Vita-Marie-Gold Biscuits");
        System.out.println("Press 2 to order Rs 10 Vita-Marie-Gold Biscuits");
        System.out.println("Press 3 to order Rs 30 Vita-Marie-Gold Biscuits");
        System.out.println("Press 4 to order Rs 45 Vita-Marie-Gold Biscuits");
        System.out.println("Press 5 to go back");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 5;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    n = sc.nextInt();
                    switch (n) {
                        case 1:
                            VitaMarieGold();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    VitaMarieGold();
                } else {
                    System.err.println("Please choose correct option");
                    VitaMarieGold();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    n = sc.nextInt();
                    switch (n) {
                        case 1:
                            VitaMarieGold();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    VitaMarieGold();
                } else {
                    System.err.println("Please choose correct option");
                    VitaMarieGold();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 30;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    n = sc.nextInt();
                    switch (n) {
                        case 1:
                            VitaMarieGold();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    VitaMarieGold();
                } else {
                    System.err.println("Please choose correct option");
                    VitaMarieGold();
                }
                break;
            case 4:
                System.out.println("Choose Y to order or N to go back");
                char ch4 = sc.next().charAt(0);
                if (ch4 == 'y' || ch4 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 45;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    n = sc.nextInt();
                    switch (n) {
                        case 1:
                            VitaMarieGold();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch4 == 'n' || ch4 == 'N') {
                    System.out.println("Choose another item");
                    VitaMarieGold();
                } else {
                    System.err.println("Please choose correct option");
                    VitaMarieGold();
                }
                break;
            case 5:
                Britania();
                break;
            default:
                System.err.println("Choose Correct Option");
                VitaMarieGold();
                break;
        }
    }
}

    class Sunfeast extends Biscuits {
    public void Sunfeast(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Dark Fantasy Biscuits");
        System.out.println("Press 2 to order Bounce Biscuits");
        System.out.println("Press 3 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                DarkFantasy d=new DarkFantasy();
                d.DarkFantasy();
                break;
            case 2:
                Bounce b=new Bounce();
                b.Bounce();
                break;
            case 3:
                BiscuitsMenu();
                break;
            default:
                System.out.println("Please Enter the Valid Number!!!");
                Sunfeast();
                break;
        }
    }
}
    class DarkFantasy extends Sunfeast{
    public void DarkFantasy(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order RS 30 Dark-Fantasy Biscuits");
        System.out.println("Press 2 to order RS 60 Dark-Fantasy Biscuits");
        System.out.println("Press 3 to go back");
        int b=sc.nextInt();
        switch (b)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch6 = sc.next().charAt(0);
                if (ch6 == 'y' || ch6 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 30;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    b = sc.nextInt();
                    switch (b) {
                        case 1:
                            DarkFantasy();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch6 == 'n' || ch6 == 'N') {
                    System.out.println("Choose another item");
                    DarkFantasy();
                } else {
                    System.err.println("Please choose correct option");
                    DarkFantasy();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 60;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    b = sc.nextInt();
                    switch (b) {
                        case 1:
                            DarkFantasy();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    DarkFantasy();
                } else {
                    System.err.println("Please choose correct option");
                    DarkFantasy();
                }
                break;
            case 3:
                Sunfeast();
                break;
            default:
                System.err.println("Choose Correct Option");
                DarkFantasy();
                break;
        }
    }
}
    class Bounce extends Sunfeast{
    public void Bounce(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to Order Orange-Bounce Biscuits");
        System.out.println("Press 2 to Order Chocolate-Bounce Biscuits");
        System.out.println("Press 3 to Order Strawberry-Bounce Biscuits");
        System.out.println("Press 4 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                OrangeBounce o=new OrangeBounce();
                o.OrangeBounce();
                break;
            case 2:
                ChocolateBounce c=new ChocolateBounce();
                c.ChocolateBounce();
                break;
            case 3:
                StrawBerryBounce s=new StrawBerryBounce();
                s.StrawBerryBounce();
                break;
            case 4:
                Sunfeast();
                break;
            default:
                System.out.println("Please choose correct Number!!!");
                Bounce();
                break;
        }
        }
    }
    class OrangeBounce extends Bounce{
    public void OrangeBounce(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please 1 to order RS 5 Orange-Bounce Biscuits");
        System.out.println("Please 2 to order RS 10 Orange-Bounce Biscuits");
        System.out.println("Please 3 to order RS 30 Orange-Bounce Biscuits");
        System.out.println("Please 4 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 5;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            OrangeBounce();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    OrangeBounce();
                } else {
                    System.err.println("Please choose correct option");
                    OrangeBounce();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            OrangeBounce();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    OrangeBounce();
                } else {
                    System.err.println("Please choose correct option");
                    OrangeBounce();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 30;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            OrangeBounce();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    OrangeBounce();
                } else {
                    System.err.println("Please choose correct option");
                    OrangeBounce();
                }
                break;
            case 4:
                Bounce();
                break;
                default:
                System.err.println("Choose Correct Option");
                OrangeBounce();
                break;
        }

    }
    }
    class ChocolateBounce extends Bounce{
    public void ChocolateBounce(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please 1 to order RS 5 Chocolate-Bounce Biscuits");
        System.out.println("Please 2 to order RS 10 Chocolate-Bounce Biscuits");
        System.out.println("Please 3 to order RS 30 Chocolate-Bounce Biscuits");
        System.out.println("Please 4 to go back");
        int a=sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 5;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            ChocolateBounce();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    ChocolateBounce();
                } else {
                    System.err.println("Please choose correct option");
                    ChocolateBounce();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            ChocolateBounce();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    ChocolateBounce();
                } else {
                    System.err.println("Please choose correct option");
                    ChocolateBounce();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 30;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            ChocolateBounce();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    ChocolateBounce();
                } else {
                    System.err.println("Please choose correct option");
                    ChocolateBounce();
                }
                break;
            case 4:
                Bounce();
                break;
            default:
                System.err.println("Choose Correct Option");
                ChocolateBounce();
                break;
        }
    }
    }
    class StrawBerryBounce extends Bounce{
    public void StrawBerryBounce(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please 1 to order RS 5 Chocolate-Bounce Biscuits");
        System.out.println("Please 2 to order RS 10 Chocolate-Bounce Biscuits");
        System.out.println("Please 3 to order RS 30 Chocolate-Bounce Biscuits");
        System.out.println("Please 4 to go back");
        int a=sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 5;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            StrawBerryBounce();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    StrawBerryBounce();
                } else {
                    System.err.println("Please choose correct option");
                    StrawBerryBounce();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            StrawBerryBounce();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    StrawBerryBounce();
                } else {
                    System.err.println("Please choose correct option");
                    StrawBerryBounce();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 30;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            StrawBerryBounce();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    StrawBerryBounce();
                } else {
                    System.err.println("Please choose correct option");
                    StrawBerryBounce();
                }
                break;
            case 4:
                Bounce();
                break;
            default:
                System.err.println("Choose Correct Option");
                StrawBerryBounce();
                break;
        }
    }
}
    class PriyaGold extends Biscuits {
    public void PriyaGold(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Butter-Delite Biscuits");
        System.out.println("Press 2 to order Digestive Biscuits");
        System.out.println("Press 3 to order CNC Biscuits");
        System.out.println("Press 4 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                ButterDelite b=new ButterDelite();
                b.ButterDelite();
                break;
            case 2:
                Digestive d=new Digestive();
                d.Digestive();
                break;
            case 3:
                CNC c=new CNC();
                c.CNC();
                break;
            case 4:
                BiscuitsMenu();
                break;
            default:
                System.out.println("Please Enter the Valid Number!!!");
                PriyaGold();
                break;
        }
    }
    }
    class ButterDelite extends PriyaGold{
    public void ButterDelite(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Press 1 to order RS 10 Butter-Delite Biscuits");
       System.out.println("Press 2 to order RS 30 Butter-Delite Biscuits");
       System.out.println("Press 3 to go back");
       int a=sc.nextInt();
       switch (a)
       {
           case 1:
               System.out.println("Choose Y to order or N to go back");
               char ch6 = sc.next().charAt(0);
               if (ch6 == 'y' || ch6 == 'Y') {
                   System.out.println("Order has been confirmed");
                   TotalBill = TotalBill + 10;
                   System.out.println("Press 1 to order again");
                   System.out.println("Press 2 to go to Main Menu");
                   System.out.println("Press 3 to proceed for bill");
                   a = sc.nextInt();
                   switch (a) {
                       case 1:
                           ButterDelite();
                           break;
                       case 2:
                           KiranaStores();
                           break;
                       case 3:
                           System.out.println("Please Pay the Amount");
                           break;
                   }
               } else if (ch6 == 'n' || ch6 == 'N') {
                   System.out.println("Choose another item");
                   ButterDelite();
               } else {
                   System.err.println("Please choose correct option");
                   ButterDelite();
               }
               break;
           case 2:
               System.out.println("Choose Y to order or N to go back");
               char ch2 = sc.next().charAt(0);
               if (ch2 == 'y' || ch2 == 'Y') {
                   System.out.println("Order has been confirmed");
                   TotalBill = TotalBill + 30;
                   System.out.println("Press 1 to order again");
                   System.out.println("Press 2 to go to Main Menu");
                   System.out.println("Press 3 to proceed for bill");
                   a = sc.nextInt();
                   switch (a) {
                       case 1:
                           ButterDelite();
                           break;
                       case 2:
                           KiranaStores();
                           break;
                       case 3:
                           System.out.println("Please Pay the Amount");
                           break;
                   }
               } else if (ch2 == 'n' || ch2 == 'N') {
                   System.out.println("Choose another item");
                   ButterDelite();
               } else {
                   System.err.println("Please choose correct option");
                   ButterDelite();
               }
               break;
           case 3:
               PriyaGold();
               break;
           default:
               System.err.println("Choose Correct Option");
               ButterDelite();
               break;
       }
    }
    }
    class Digestive extends PriyaGold{
    public void Digestive(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order RS 10 Butter-Delite Biscuits");
        System.out.println("Press 2 to order RS 20 Butter-Delite Biscuits");
        System.out.println("Press 3 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch6 = sc.next().charAt(0);
                if (ch6 == 'y' || ch6 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            Digestive();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch6 == 'n' || ch6 == 'N') {
                    System.out.println("Choose another item");
                    Digestive();
                } else {
                    System.err.println("Please choose correct option");
                    Digestive();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 20;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            Digestive();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    Digestive();
                } else {
                    System.err.println("Please choose correct option");
                    Digestive();
                }
                break;
            case 3:
                PriyaGold();
                break;
            default:
                System.err.println("Choose Correct Option");
                Digestive();
                break;
        }
    }
    }
    class CNC extends PriyaGold{
    public void CNC(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order RS 10 CNC Biscuits");
        System.out.println("Press 2 to order RS 40 CNC Biscuits");
        System.out.println("Press 3 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch6 = sc.next().charAt(0);
                if (ch6 == 'y' || ch6 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            CNC();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch6 == 'n' || ch6 == 'N') {
                    System.out.println("Choose another item");
                    CNC();
                } else {
                    System.err.println("Please choose correct option");
                    CNC();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 30;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            CNC();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    CNC();
                } else {
                    System.err.println("Please choose correct option");
                    CNC();
                }
                break;
            case 3:
                PriyaGold();
                break;
            default:
                System.err.println("Choose Correct Option");
                CNC();
                break;
        }
    }
    }
    class Oreo extends Biscuits {
    public void Oreo(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Press 1 to order Chocolate-Oreo Biscuits");
    System.out.println("Press 2 to order Vanilla-Oreo Biscuits");
    System.out.println("Press 3 to order Strawberry-Oreo Biscuits");
    System.out.println("Press 4 to go back");
    int a=sc.nextInt();
    switch (a)
    {
        case 1:
            ChocolateOreo c =new ChocolateOreo();
            c.ChocolateOreo();
            break;
        case 2:
            VanillaOreo v=new VanillaOreo();
            v.VanillaOreo();
            break;
        case 3:
            StrawBerryOreo s=new StrawBerryOreo();
            s.StrawBerryOreo();
            break;
        case 4:
            BiscuitsMenu();
            break;
        default:
            System.out.println("Please Choose Correct Number!!!");
            Oreo();
            break;
    }
    }
    }
    class ChocolateOreo extends Oreo{
    public void ChocolateOreo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order RS 10 Chocolate-Oreo Biscuits");
        System.out.println("Press 2 to order RS 30 Chocolate-Oreo Biscuits");
        System.out.println("Press 3 to order RS 50 Chocolate-Oreo Biscuits");
        System.out.println("Press 4 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            ChocolateOreo();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    ChocolateOreo();
                } else {
                    System.err.println("Please choose correct option");
                    ChocolateOreo();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 30;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            ChocolateOreo();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    ChocolateOreo();
                } else {
                    System.err.println("Please choose correct option");
                    ChocolateOreo();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 50;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            ChocolateOreo();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    ChocolateOreo();
                } else {
                    System.err.println("Please choose correct option");
                    ChocolateOreo();
                }
                break;

            case 4:
                Oreo();
                break;
            default:
                System.err.println("Choose Correct Option");
                ChocolateOreo();
                break;
        }
    }
}
    class VanillaOreo extends Oreo{
    public void VanillaOreo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order RS 10 Vanilla-Oreo Biscuits");
        System.out.println("Press 2 to order RS 30 Vanilla-Oreo Biscuits");
        System.out.println("Press 3 to order RS 50 Vanilla-Oreo Biscuits");
        System.out.println("Press 4 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            VanillaOreo();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    VanillaOreo();
                } else {
                    System.err.println("Please choose correct option");
                    VanillaOreo();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 30;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            VanillaOreo();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    VanillaOreo();
                } else {
                    System.err.println("Please choose correct option");
                    VanillaOreo();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 50;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            VanillaOreo();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    VanillaOreo();
                } else {
                    System.err.println("Please choose correct option");
                    VanillaOreo();
                }
                break;

            case 4:
                Oreo();
                break;
            default:
                System.err.println("Choose Correct Option");
                VanillaOreo();
                break;
        }
    }
    }
    class StrawBerryOreo extends Oreo{
    public void StrawBerryOreo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order RS 10 StrawBerry-Oreo Biscuits");
        System.out.println("Press 2 to order RS 30 StrawBerry-Oreo Biscuits");
        System.out.println("Press 3 to order RS 50 StrawBerry-Oreo Biscuits");
        System.out.println("Press 4 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            StrawBerryOreo();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    StrawBerryOreo();
                } else {
                    System.err.println("Please choose correct option");
                    StrawBerryOreo();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 30;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            StrawBerryOreo();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    StrawBerryOreo();
                } else {
                    System.err.println("Please choose correct option");
                    StrawBerryOreo();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 50;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            StrawBerryOreo();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    StrawBerryOreo();
                } else {
                    System.err.println("Please choose correct option");
                    StrawBerryOreo();
                }
                break;

            case 4:
                Oreo();
                break;
            default:
                System.err.println("Choose Correct Option");
                StrawBerryOreo();
                break;
        }
    }
    }
    class SoftDrinks extends KiranaStores {
    public void SoftDrinks(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Sprite SoftDrink");
        System.out.println("Press 2 to order Pepsi SoftDrink");
        System.out.println("Press 3 to order Coca-Cola SoftDrink");
        System.out.println("Press 4 to order Fanta SoftDrink");
        System.out.println("Press 5 to order Thumbs SoftDrink");
        System.out.println("Press 6 to order Frooti SoftDrink");
        System.out.println("Press 7 to order Maaza SoftDrink");
        System.out.println("Press 8 to order Mineral-Water SoftDrink");
        System.out.println("Press 9 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                Sprite s=new Sprite();
                s.Sprite();
                break;
            case 2:
                Pepsi p=new Pepsi();
                p.Pepsi();
                break;
            case 3:
                CocaCola c=new CocaCola();
                c.CocaCola();
                break;
            case 4:
                Fanta f=new Fanta();
                f.Fanta();
                break;
            case 5:
                ThumbsUp t=new ThumbsUp();
                t.ThumbsUp();
                break;
            case 6:
                Frooti r=new Frooti();
                r.Frooti();
                break;
            case 7:
                Maaza m=new Maaza();
                m.Maaza();
                break;
            case 8:
                MineralWater w=new MineralWater();
                w.MineralWater();
                break;
            case 9:
                KiranaStores();
                break;
            default:
                System.out.println("Choose the Correct Number!!!");
                SoftDrinks();
                break;
        }
    }
    }
    class Sprite extends SoftDrinks{
    public void Sprite(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order 250ml Rs 20 Sprite SoftDrinks");
        System.out.println("Press 2 to order 750ml Rs 40 Sprite SoftDrinks");
        System.out.println("Press 3 to order 1 litre Rs 50 Sprite SoftDrinks");
        System.out.println("Press 4 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 20;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            Sprite();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    Sprite();
                } else {
                    System.err.println("Please choose correct option");
                    Sprite();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 40;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            Sprite();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    Sprite();
                } else {
                    System.err.println("Please choose correct option");
                    Sprite();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 50;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            Sprite();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    Sprite();
                } else {
                    System.err.println("Please choose correct option");
                    Sprite();
                }
                break;

            case 4:
                SoftDrinks();
                break;
            default:
                System.err.println("Choose Correct Option");
                Sprite();
                break;
        }
    }
    }
    class Pepsi extends SoftDrinks{
    public void Pepsi(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order 250ml Rs 20 Pepsi SoftDrinks");
        System.out.println("Press 2 to order 750ml Rs 40 Pepsi SoftDrinks");
        System.out.println("Press 3 to order 1 litre Rs 50 Pepsi SoftDrinks");
        System.out.println("Press 4 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 20;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            Pepsi();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    Pepsi();
                } else {
                    System.err.println("Please choose correct option");
                    Pepsi();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 40;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            Pepsi();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    Pepsi();
                } else {
                    System.err.println("Please choose correct option");
                    Pepsi();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 50;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            Pepsi();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    Pepsi();
                } else {
                    System.err.println("Please choose correct option");
                    Pepsi();
                }
                break;

            case 4:
                SoftDrinks();
                break;
            default:
                System.err.println("Choose Correct Option");
                Pepsi();
                break;
        }
    }
    }
    class CocaCola extends SoftDrinks{
    public void CocaCola(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order 250ml Rs 20 CocaCola SoftDrinks");
        System.out.println("Press 2 to order 750ml Rs 40 CocaCola SoftDrinks");
        System.out.println("Press 3 to order 1 litre Rs 50 CocaCola SoftDrinks");
        System.out.println("Press 4 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 20;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            CocaCola();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    CocaCola();
                } else {
                    System.err.println("Please choose correct option");
                    CocaCola();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 40;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            CocaCola();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    CocaCola();
                } else {
                    System.err.println("Please choose correct option");
                    CocaCola();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 50;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            CocaCola();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    CocaCola();
                } else {
                    System.err.println("Please choose correct option");
                    CocaCola();
                }
                break;

            case 4:
                SoftDrinks();
                break;
            default:
                System.err.println("Choose Correct Option");
                CocaCola();
                break;
        }
    }
    }
    class Fanta extends SoftDrinks{
    public void Fanta(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order 250ml Rs 20 Fanta SoftDrinks");
        System.out.println("Press 2 to order 750ml Rs 40 Fanta SoftDrinks");
        System.out.println("Press 3 to order 1 litre Rs 50 Fanta SoftDrinks");
        System.out.println("Press 4 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 20;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            Fanta();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    Fanta();
                } else {
                    System.err.println("Please choose correct option");
                    Fanta();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 40;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            Fanta();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    Fanta();
                } else {
                    System.err.println("Please choose correct option");
                    Fanta();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 50;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            Fanta();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    Fanta();
                } else {
                    System.err.println("Please choose correct option");
                    Fanta();
                }
                break;

            case 4:
                SoftDrinks();
                break;
            default:
                System.err.println("Choose Correct Option");
                Fanta();
                break;
        }
    }
    }
    class ThumbsUp extends SoftDrinks{
    public void ThumbsUp(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order 250ml Rs 20 ThumbsUp SoftDrinks");
        System.out.println("Press 2 to order 750ml Rs 40 ThumbsUp SoftDrinks");
        System.out.println("Press 3 to order 1 litre Rs 50 ThumbsUp SoftDrinks");
        System.out.println("Press 4 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 20;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            ThumbsUp();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    ThumbsUp();
                } else {
                    System.err.println("Please choose correct option");
                    ThumbsUp();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 40;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            ThumbsUp();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    ThumbsUp();
                } else {
                    System.err.println("Please choose correct option");
                    ThumbsUp();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 50;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            ThumbsUp();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    ThumbsUp();
                } else {
                    System.err.println("Please choose correct option");
                    ThumbsUp();
                }
                break;

            case 4:
                SoftDrinks();
                break;
            default:
                System.err.println("Choose Correct Option");
                ThumbsUp();
                break;
        }
    }
    }
    class Frooti extends SoftDrinks{
    public void Frooti(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Tetrapack(150ml) Rs 10 Frooti SoftDrinks");
        System.out.println("Press 2 to order 250ml Rs 20 Frooti SoftDrinks");
        System.out.println("Press 3 to order 750ml Rs 40 Frooti SoftDrinks");
        System.out.println("Press 4 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            Frooti();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    Frooti();
                } else {
                    System.err.println("Please choose correct option");
                    Frooti();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 20;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            Frooti();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    Frooti();
                } else {
                    System.err.println("Please choose correct option");
                    Frooti();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 40;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            Frooti();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    Frooti();
                } else {
                    System.err.println("Please choose correct option");
                    Frooti();
                }
                break;

            case 4:
                SoftDrinks();
                break;
            default:
                System.err.println("Choose Correct Option");
                Frooti();
                break;
        }
    }
    }
    class Maaza extends SoftDrinks{
    public void Maaza(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Tetrapack(150ml) Rs 10 Maaza SoftDrinks");
        System.out.println("Press 2 to order 250ml Rs 20 Maaza SoftDrinks");
        System.out.println("Press 3 to order 600ml Rs 42 Maaza SoftDrinks");
        System.out.println("Press 4 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            Maaza();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    Maaza();
                } else {
                    System.err.println("Please choose correct option");
                    Maaza();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 20;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            Maaza();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    Maaza();
                } else {
                    System.err.println("Please choose correct option");
                    Maaza();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 42;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            Maaza();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    Maaza();
                } else {
                    System.err.println("Please choose correct option");
                    Maaza();
                }
                break;

            case 4:
                SoftDrinks();
                break;
            default:
                System.err.println("Choose Correct Option");
                Maaza();
                break;
        }
    }
    }
    class MineralWater extends SoftDrinks{
    public void MineralWater(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order 250ml Rs 10 Sprite SoftDrinks");
        System.out.println("Press 2 to order 1 litre Rs 20 Sprite SoftDrinks");
        System.out.println("Press 3 to order 3 litre Rs 30 Sprite SoftDrinks");
        System.out.println("Press 4 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            MineralWater();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    MineralWater();
                } else {
                    System.err.println("Please choose correct option");
                    MineralWater();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 20;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            MineralWater();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    MineralWater();
                } else {
                    System.err.println("Please choose correct option");
                    MineralWater();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 30;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            MineralWater();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    MineralWater();
                } else {
                    System.err.println("Please choose correct option");
                    MineralWater();
                }
                break;

            case 4:
                SoftDrinks();
                break;
            default:
                System.err.println("Choose Correct Option");
                MineralWater();
                break;
        }
    }
    }
    class Masala extends KiranaStores {
    public void Masala() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to order Everest Shahi Biryani Masala");
        System.out.println("Press 2 to order Everest Meat Masala");
        System.out.println("Press 3 to order Everest Garam Masala Masala");
        System.out.println("Press 4 to order Everest Kitchen King Masala");
        System.out.println("Press 5 to order Everest Pav Bhaji Masala");
        System.out.println("Press 6 to order Everest Pani-Puri Masala");
        System.out.println("Press 7 to order Everest Chicken Masala");
        System.out.println("Press 8 to order Everest Sambhar Masala");
        System.out.println("Press 9 to order Everest Chat Masala");
        System.out.println("Press 10 to order Chilli Power");
        System.out.println("Press 11 to order Everest Chhole Masala");
        System.out.println("Press 12 to order Everest Coriander Powder");
        System.out.println("Press 13 to order Everest Turmeric Powder");
        System.out.println("Press 14 to go back");
        int z=sc.nextInt();
        switch (z)
        {
            case 1:
                ShahiBiryaniMasala a=new ShahiBiryaniMasala();
                a.ShahiBiryaniMasala();
                break;
            case 2:
                MeatMasala b=new MeatMasala();
                b.MeatMasala();
                break;
            case 3:
                GaramMasala c=new GaramMasala();
                c.GaramMasala();
                break;
            case 4:
                KitchenKing d=new KitchenKing();
                d.KitchenKing();
                break;
            case 5:
                PavBhajiMasala e=new PavBhajiMasala();
                e.PavBhajiMasala();
                break;
            case 6:
                PaniPuriMasala f=new PaniPuriMasala();
                f.PaniPuriMasala();
                break;
            case 7:
                ChickenMasala g=new ChickenMasala();
                g.ChickenMasala();
                break;
            case 8:
                SambharMasala h=new SambharMasala();
                h.SambharMasala();
                break;
            case 9:
                ChatMasala i=new ChatMasala();
                i.ChatMasala();
                break;
            case 10:
                ChilliPowder j=new ChilliPowder();
                j.ChilliPowder();
                break;
            case 11:
                ChholeMasala k=new ChholeMasala();
                k.ChholeMasala();
                break;
            case 12:
                CorianderPowder l=new CorianderPowder();
                l.CorianderPowder();
                break;
            case 13:
                TurmericPowder m=new TurmericPowder();
                m.TurmericPowder();
                break;
            case 14:
                KiranaStores();
                break;
            default:
                System.out.println("Please Choose Correct Number!!!");
                Masala();
                break;
        }
    }
    }
    class ShahiBiryaniMasala extends Masala{
    public void ShahiBiryaniMasala(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Rs 5 Shahi-Biryani Masala");
        System.out.println("Press 2 to order Rs 10 Shahi-Biryani Masala");
        System.out.println("Press 3 to order 50gm Rs 65 Shahi-Biryani Masala");
        System.out.println("Press 4 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 5;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            ShahiBiryaniMasala();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    ShahiBiryaniMasala();
                } else {
                    System.err.println("Please choose correct option");
                    ShahiBiryaniMasala();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            ShahiBiryaniMasala();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    ShahiBiryaniMasala();
                } else {
                    System.err.println("Please choose correct option");
                    ShahiBiryaniMasala();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 65;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            ShahiBiryaniMasala();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    ShahiBiryaniMasala();
                } else {
                    System.err.println("Please choose correct option");
                    ShahiBiryaniMasala();
                }
                break;

            case 4:
                Masala();
                break;
            default:
                System.err.println("Choose Correct Option");
                ShahiBiryaniMasala();
                break;
        }
        }
    }
    class MeatMasala extends Masala{
    public void MeatMasala(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Rs 5 Meat Masala");
        System.out.println("Press 2 to order Rs 10 Meat Masala");
        System.out.println("Press 3 to order 50gm Rs 63 Meat Masala");
        System.out.println("Press 4 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 5;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            MeatMasala();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    MeatMasala();
                } else {
                    System.err.println("Please choose correct option");
                    MeatMasala();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            MeatMasala();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    MeatMasala();
                } else {
                    System.err.println("Please choose correct option");
                    MeatMasala();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 63;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            MeatMasala();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    MeatMasala();
                } else {
                    System.err.println("Please choose correct option");
                    MeatMasala();
                }
                break;

            case 4:
                Masala();
                break;
            default:
                System.err.println("Choose Correct Option");
                MeatMasala();
                break;
        }
    }
    }

    class GaramMasala extends Masala{
    public void GaramMasala(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Rs 5 Garam Masala");
        System.out.println("Press 2 to order Rs 10 Garam Masala");
        System.out.println("Press 3 to order 50gm Rs 60 Garam Masala");
        System.out.println("Press 4 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 5;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            GaramMasala();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    GaramMasala();
                } else {
                    System.err.println("Please choose correct option");
                    GaramMasala();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            GaramMasala();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    GaramMasala();
                } else {
                    System.err.println("Please choose correct option");
                    GaramMasala();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 60;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            GaramMasala();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    GaramMasala();
                } else {
                    System.err.println("Please choose correct option");
                    GaramMasala();
                }
                break;

            case 4:
                Masala();
                break;
            default:
                System.err.println("Choose Correct Option");
                GaramMasala();
                break;
        }
    }
    }
    class KitchenKing extends Masala{
    public void KitchenKing(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Rs 5 Kitchen Masala");
        System.out.println("Press 2 to order Rs 10 Kitchen Masala");
        System.out.println("Press 3 to order 50gm Rs 60 Kitchen Masala");
        System.out.println("Press 4 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 5;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            KitchenKing();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    KitchenKing();
                } else {
                    System.err.println("Please choose correct option");
                    KitchenKing();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            KitchenKing();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    KitchenKing();
                } else {
                    System.err.println("Please choose correct option");
                    KitchenKing();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 60;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            KitchenKing();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    KitchenKing();
                } else {
                    System.err.println("Please choose correct option");
                    KitchenKing();
                }
                break;

            case 4:
                Masala();
                break;
            default:
                System.err.println("Choose Correct Option");
                KitchenKing();
                break;
        }
    }
    }
    class PavBhajiMasala extends Masala{
    public void PavBhajiMasala(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Rs 5 Pav Bhaji Masala");
        System.out.println("Press 2 to order Rs 10 Pav Bhaji Masala");
        System.out.println("Press 3 to order 50gm Rs 50 Pav Bhaji Masala");
        System.out.println("Press 4 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 5;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            PavBhajiMasala();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    PavBhajiMasala();
                } else {
                    System.err.println("Please choose correct option");
                    PavBhajiMasala();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            PavBhajiMasala();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    PavBhajiMasala();
                } else {
                    System.err.println("Please choose correct option");
                    PavBhajiMasala();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 50;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            PavBhajiMasala();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    PavBhajiMasala();
                } else {
                    System.err.println("Please choose correct option");
                    PavBhajiMasala();
                }
                break;

            case 4:
                Masala();
                break;
            default:
                System.err.println("Choose Correct Option");
                PavBhajiMasala();
                break;
        }
    }
    }
    class PaniPuriMasala extends Masala{
    public void PaniPuriMasala(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Rs 5 Pani Puri Masala");
        System.out.println("Press 2 to order Rs 10 Pani Puri Masala");
        System.out.println("Press 3 to order 50gm Rs 60 Pani Puri Masala");
        System.out.println("Press 4 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 5;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            PaniPuriMasala();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    PaniPuriMasala();
                } else {
                    System.err.println("Please choose correct option");
                    PaniPuriMasala();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            PaniPuriMasala();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    PaniPuriMasala();
                } else {
                    System.err.println("Please choose correct option");
                    PaniPuriMasala();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 60;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            PaniPuriMasala();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    PaniPuriMasala();
                } else {
                    System.err.println("Please choose correct option");
                    PaniPuriMasala();
                }
                break;

            case 4:
                Masala();
                break;
            default:
                System.err.println("Choose Correct Option");
                PaniPuriMasala();
                break;
        }
    }
    }
    class ChickenMasala extends Masala{
    public void ChickenMasala(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Rs 5 Chicken Masala");
        System.out.println("Press 2 to order Rs 10 Chicken Masala");
        System.out.println("Press 3 to order 50gm Rs 70 Chicken Masala");
        System.out.println("Press 4 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 5;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            ChickenMasala();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    ChickenMasala();
                } else {
                    System.err.println("Please choose correct option");
                    ChickenMasala();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            ChickenMasala();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    ChickenMasala();
                } else {
                    System.err.println("Please choose correct option");
                    ChickenMasala();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 70;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            ChickenMasala();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    ChickenMasala();
                } else {
                    System.err.println("Please choose correct option");
                    ChickenMasala();
                }
                break;

            case 4:
                Masala();
                break;
            default:
                System.err.println("Choose Correct Option");
                ChickenMasala();
                break;
        }
    }
    }
    class  SambharMasala extends  Masala{
    public void  SambharMasala(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Rs 5 Garam Masala");
        System.out.println("Press 2 to order Rs 10 Garam Masala");
        System.out.println("Press 3 to order 50gm Rs 60 Garam Masala");
        System.out.println("Press 4 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 5;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            SambharMasala();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    SambharMasala();
                } else {
                    System.err.println("Please choose correct option");
                    SambharMasala();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            SambharMasala();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    SambharMasala();
                } else {
                    System.err.println("Please choose correct option");
                    SambharMasala();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 60;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            SambharMasala();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    SambharMasala();
                } else {
                    System.err.println("Please choose correct option");
                    SambharMasala();
                }
                break;

            case 4:
                Masala();
                break;
            default:
                System.err.println("Choose Correct Option");
                SambharMasala();
                break;
        }
    }
    }
    class ChatMasala extends Masala{
    public void ChatMasala(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Rs 5 Chat Masala");
        System.out.println("Press 2 to order Rs 10 Chat Masala");
        System.out.println("Press 3 to order 50gm Rs 55 Chat Masala");
        System.out.println("Press 4 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 5;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            ChatMasala();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    ChatMasala();
                } else {
                    System.err.println("Please choose correct option");
                    ChatMasala();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            ChatMasala();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    ChatMasala();
                } else {
                    System.err.println("Please choose correct option");
                    ChatMasala();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 55;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            ChatMasala();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    ChatMasala();
                } else {
                    System.err.println("Please choose correct option");
                    ChatMasala();
                }
                break;

            case 4:
                Masala();
                break;
            default:
                System.err.println("Choose Correct Option");
                ChatMasala();
                break;
        }
    }
    }
    class ChilliPowder extends Masala{
    public void ChilliPowder(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Rs 5 Chilli Masala");
        System.out.println("Press 2 to order Rs 10 Chilli Masala");
        System.out.println("Press 3 to order 50gm Rs 65 Chilli Masala");
        System.out.println("Press 4 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 5;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            ChilliPowder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    ChilliPowder();
                } else {
                    System.err.println("Please choose correct option");
                    ChilliPowder();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            ChilliPowder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    ChilliPowder();
                } else {
                    System.err.println("Please choose correct option");
                    ChilliPowder();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 65;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            ChilliPowder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    ChilliPowder();
                } else {
                    System.err.println("Please choose correct option");
                    ChilliPowder();
                }
                break;

            case 4:
                Masala();
                break;
            default:
                System.err.println("Choose Correct Option");
                ChilliPowder();
                break;
        }
    }
    }
    class ChholeMasala extends Masala{
    public void ChholeMasala(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Rs 5 Chhole Masala");
        System.out.println("Press 2 to order Rs 10 Chhole Masala");
        System.out.println("Press 3 to order 50gm Rs 55 Chhole Masala");
        System.out.println("Press 4 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 5;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            ChholeMasala();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    ChholeMasala();
                } else {
                    System.err.println("Please choose correct option");
                    ChholeMasala();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            ChholeMasala();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    ChholeMasala();
                } else {
                    System.err.println("Please choose correct option");
                    ChholeMasala();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 55;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            ChholeMasala();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    ChholeMasala();
                } else {
                    System.err.println("Please choose correct option");
                    ChholeMasala();
                }
                break;

            case 4:
                Masala();
                break;
            default:
                System.err.println("Choose Correct Option");
                ChholeMasala();
                break;
        }
    }
    }
    class CorianderPowder extends Masala{
    public void CorianderPowder(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Rs 5 Coriander Masala");
        System.out.println("Press 2 to order Rs 10 Coriander Masala");
        System.out.println("Press 3 to order 50gm Rs 50 Coriander Masala");
        System.out.println("Press 4 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 5;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            CorianderPowder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    CorianderPowder();
                } else {
                    System.err.println("Please choose correct option");
                    CorianderPowder();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            CorianderPowder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    CorianderPowder();
                } else {
                    System.err.println("Please choose correct option");
                    CorianderPowder();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 50;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            CorianderPowder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    CorianderPowder();
                } else {
                    System.err.println("Please choose correct option");
                    CorianderPowder();
                }
                break;

            case 4:
                Masala();
                break;
            default:
                System.err.println("Choose Correct Option");
                CorianderPowder();
                break;
        }
    }
    }
    class TurmericPowder extends Masala{
    public void TurmericPowder(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Rs 5 Turmeric Masala");
        System.out.println("Press 2 to order Rs 10 Turmeric Masala");
        System.out.println("Press 3 to order 50gm Rs 55 Turmeric Masala");
        System.out.println("Press 4 to go back");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 5;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            TurmericPowder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    TurmericPowder();
                } else {
                    System.err.println("Please choose correct option");
                    TurmericPowder();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            TurmericPowder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    TurmericPowder();
                } else {
                    System.err.println("Please choose correct option");
                    TurmericPowder();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 55;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            TurmericPowder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    TurmericPowder();
                } else {
                    System.err.println("Please choose correct option");
                    TurmericPowder();
                }
                break;

            case 4:
                Masala();
                break;
            default:
                System.err.println("Choose Correct Option");
                TurmericPowder();
                break;
        }
    }
    }
    class Cadbury extends KiranaStores {
    public void Cadbury(){
    Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Dairy-Milk Cadbury");
        System.out.println("Press 2 to order 5 Star Cadbury");
        System.out.println("Press 3 to order Kit-Kat Cadbury");
        System.out.println("Press 4 to go back");
        int z=sc.nextInt();
        switch (z)
        {
            case 1:
                DairyMilk a=new DairyMilk();
                a.DairyMilk();
                break;
            case 2:
                FiveStar b=new FiveStar();
                b.FiveStar();
                break;
            case 3:
                KitKat c=new KitKat();
                c.KitKat();
                break;
            case 4:
                KiranaStores();
                break;
            default:
                System.err.println("Please choose correct Number!!!");
                Cadbury();
                break;
        }
    }
    }
    class DairyMilk extends Cadbury{
    public void DairyMilk(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Rs 10 Cadbury Dairy Milk");
        System.out.println("Press 2 to order Rs 20 Cadbury Dairy Milk");
        System.out.println("Press 3 to order Rs 40 Cadbury Dairy Milk");
        System.out.println("Press 4 to order Rs 45 Cadbury Dairy Milk Roast Almond Chocolate");
        System.out.println("Press 5 to order Rs 70 Cadbury Dairy Milk Silk Oreo Chocolate Bars");
        System.out.println("Press 6 to order Rs 80 Cadbury Dairy Milk Silk Chocolate Bars");
        System.out.println("Press 7 to order Rs 85 Cadbury Dairy Milk Silk Fruits & Nuts Chocolate Bars");
        System.out.println("Press 8 to order Rs 90 Cadbury Dairy Milk Roast Almond Chocolate Bars");
        System.out.println("Press 9 to order Rs 95 Cadbury Dairy Milk Silk Bubbly Chocolate Bars");
        System.out.println("Press 10 to order Rs 100 Cadbury Dairy Milk Chocolate Bars");
        System.out.println("Press 11 to order Rs 120 Cadbury Dairy Milk Bournville Cranberry Dark Chocolate Bars");
        System.out.println("Press 12 to go back");
        int z=sc.nextInt();
        switch (z)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            DairyMilk();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    DairyMilk();
                } else {
                    System.err.println("Please choose correct option");
                    DairyMilk();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 20;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            DairyMilk();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    DairyMilk();
                } else {
                    System.err.println("Please choose correct option");
                    DairyMilk();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 40;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            DairyMilk();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    DairyMilk();
                } else {
                    System.err.println("Please choose correct option");
                    DairyMilk();
                }
                break;
            case 4:
                System.out.println("Choose Y to order or N to go back");
                char ch4 = sc.next().charAt(0);
                if (ch4 == 'y' || ch4 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 45;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            DairyMilk();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch4 == 'n' || ch4 == 'N') {
                    System.out.println("Choose another item");
                    DairyMilk();
                } else {
                    System.err.println("Please choose correct option");
                    DairyMilk();
                }
                break;
            case 5:
                System.out.println("Choose Y to order or N to go back");
                char ch5 = sc.next().charAt(0);
                if (ch5 == 'y' || ch5 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 70;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            DairyMilk();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch5 == 'n' || ch5 == 'N') {
                    System.out.println("Choose another item");
                    DairyMilk();
                } else {
                    System.err.println("Please choose correct option");
                    DairyMilk();
                }
                break;
            case 6:
                System.out.println("Choose Y to order or N to go back");
                char ch6 = sc.next().charAt(0);
                if (ch6 == 'y' || ch6 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 80;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            DairyMilk();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch6 == 'n' || ch6 == 'N') {
                    System.out.println("Choose another item");
                    DairyMilk();
                } else {
                    System.err.println("Please choose correct option");
                    DairyMilk();
                }
                break;
            case 7:
                System.out.println("Choose Y to order or N to go back");
                char ch7 = sc.next().charAt(0);
                if (ch7 == 'y' || ch7 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 85;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            DairyMilk();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch7 == 'n' || ch7 == 'N') {
                    System.out.println("Choose another item");
                    DairyMilk();
                } else {
                    System.err.println("Please choose correct option");
                    DairyMilk();
                }
                break;
            case 8:
                System.out.println("Choose Y to order or N to go back");
                char ch8 = sc.next().charAt(0);
                if (ch8 == 'y' || ch8 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 90;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            DairyMilk();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch8 == 'n' || ch8 == 'N') {
                    System.out.println("Choose another item");
                    DairyMilk();
                } else {
                    System.err.println("Please choose correct option");
                    DairyMilk();
                }
                break;
            case 9:
                System.out.println("Choose Y to order or N to go back");
                char ch9 = sc.next().charAt(0);
                if (ch9 == 'y' || ch9 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 95;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            DairyMilk();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch9 == 'n' || ch9 == 'N') {
                    System.out.println("Choose another item");
                    DairyMilk();
                } else {
                    System.err.println("Please choose correct option");
                    DairyMilk();
                }
                break;
            case 10:
                System.out.println("Choose Y to order or N to go back");
                char ch10 = sc.next().charAt(0);
                if (ch10 == 'y' || ch10 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 100;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            DairyMilk();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch10 == 'n' || ch10 == 'N') {
                    System.out.println("Choose another item");
                    DairyMilk();
                } else {
                    System.err.println("Please choose correct option");
                    DairyMilk();
                }
                break;
            case 11:
                System.out.println("Choose Y to order or N to go back");
                char ch11 = sc.next().charAt(0);
                if (ch11 == 'y' || ch11 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 120;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            DairyMilk();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch11 == 'n' || ch11 == 'N') {
                    System.out.println("Choose another item");
                    DairyMilk();
                } else {
                    System.err.println("Please choose correct option");
                    DairyMilk();
                }
                break;
            case 12:
                Cadbury();
                break;
            default:
                System.err.println("Please Choose Correct Number!!!");
                DairyMilk();
                break;
        }
    }
    }
    class FiveStar extends Cadbury{
    public void FiveStar(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Rs 5 5-Star Cadbury");
        System.out.println("Press 2 to order Rs 10 5-Star Cadbury");
        System.out.println("Press 3 to order Rs 20 5-Star Cadbury");
        System.out.println("Press 4 to order Rs 30 5-Star 3D Cadbury");
        System.out.println("Press 5 to order Rs 35 5-Star Oreo Cadbury");
        System.out.println("Press 6 to go back");
        int z=sc.nextInt();
        switch (z)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 5;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            FiveStar();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    FiveStar();
                } else {
                    System.err.println("Please choose correct option");
                    FiveStar();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            FiveStar();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    FiveStar();
                } else {
                    System.err.println("Please choose correct option");
                    FiveStar();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 20;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            FiveStar();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    FiveStar();
                } else {
                    System.err.println("Please choose correct option");
                    FiveStar();
                }
                break;
            case 4:
                System.out.println("Choose Y to order or N to go back");
                char ch4 = sc.next().charAt(0);
                if (ch4 == 'y' || ch4 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 30;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            FiveStar();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch4 == 'n' || ch4 == 'N') {
                    System.out.println("Choose another item");
                    FiveStar();
                } else {
                    System.err.println("Please choose correct option");
                    FiveStar();
                }
                break;
            case 5:
                System.out.println("Choose Y to order or N to go back");
                char ch5 = sc.next().charAt(0);
                if (ch5 == 'y' || ch5 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 35;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            FiveStar();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch5 == 'n' || ch5 == 'N') {
                    System.out.println("Choose another item");
                    FiveStar();
                } else {
                    System.err.println("Please choose correct option");
                    FiveStar();
                }
                break;
            case 6:
                Cadbury();
                break;
            default:
                System.err.println("Please Choose Correct Number!!!");
                FiveStar();
                break;
        }
    }
    }
    class KitKat extends Cadbury{
    public void KitKat(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Rs 5 Kitkat Cadbury");
        System.out.println("Press 2 to order Rs 10 Kitkat Cadbury");
        System.out.println("Press 3 to order Rs 20 Kitkat Cadbury");
        System.out.println("Press 4 to order Rs 30 Kitkat Cadbury");
        System.out.println("Press 5 to go back");
        int z=sc.nextInt();
        switch (z) {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 5;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            KitKat();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    KitKat();
                } else {
                    System.err.println("Please choose correct option");
                    KitKat();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            KitKat();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    KitKat();
                } else {
                    System.err.println("Please choose correct option");
                    KitKat();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 20;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            KitKat();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    KitKat();
                } else {
                    System.err.println("Please choose correct option");
                    KitKat();
                }
                break;
            case 4:
                System.out.println("Choose Y to order or N to go back");
                char ch4 = sc.next().charAt(0);
                if (ch4 == 'y' || ch4 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 30;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            KitKat();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch4 == 'n' || ch4 == 'N') {
                    System.out.println("Choose another item");
                    KitKat();
                } else {
                    System.err.println("Please choose correct option");
                    KitKat();
                }
                break;
            case 5:
                Cadbury();
                break;
            default:
                System.err.println("Please Choose Correct Number!!!");
                KitKat();
                break;
        }
    }
    }
    class TootPaste extends KiranaStores{
    public void TootPaste(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Colgate Tootpaste");
        System.out.println("Press 2 to order Maxfresh Tootpaste");
        System.out.println("Press 3 to order Sensodyne Tootpaste");
        System.out.println("Press 4 to order Pepsodent Tootpaste");
        System.out.println("Press 5 to go back");
        int z=sc.nextInt();
        switch (z)
        {
            case 1:
                Colgate a=new Colgate();
                a.Colgate();
                break;
            case 2:
                MaxFresh b=new MaxFresh();
                b.MaxFresh();
                break;
            case 3:
                Sensodyne c=new Sensodyne();
                c.Sensodyne();
                break;
            case 4:
                Pepsodent d=new Pepsodent();
                d.Pepsodent();
                break;
            case 5:
                KiranaStores();
                break;
            default:
                System.err.println("Choose Correct Number");
                TootPaste();
                break;
        }
    }
    }
    class Colgate extends TootPaste{
    public void Colgate(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order 17gm Rs 10 Colgate Tootpaste");
        System.out.println("Press 2 to order 36gm Rs 20 Colgate Tootpaste");
        System.out.println("Press 3 to order 100gm Rs 55 Colgate Tootpaste");
        System.out.println("Press 4 to order 200gm Rs 92 Colgate Tootpaste");
        System.out.println("Press 5 to go back");
        int z=sc.nextInt();
        switch (z)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            Colgate();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    Colgate();
                } else {
                    System.err.println("Please choose correct option");
                    Colgate();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 20;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            Colgate();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    Colgate();
                } else {
                    System.err.println("Please choose correct option");
                    Colgate();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 55;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            Colgate();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    Colgate();
                } else {
                    System.err.println("Please choose correct option");
                    Colgate();
                }
                break;
            case 4:
                System.out.println("Choose Y to order or N to go back");
                char ch4 = sc.next().charAt(0);
                if (ch4 == 'y' || ch4 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 92;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            Colgate();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch4 == 'n' || ch4 == 'N') {
                    System.out.println("Choose another item");
                    Colgate();
                } else {
                    System.err.println("Please choose correct option");
                    Colgate();
                }
                break;
            case 5:
                TootPaste();
                break;
            default:
                System.err.println("Please Choose Correct Number!!!");
                Colgate();
                break;
        }
    }
    }
    class MaxFresh extends TootPaste{
    public void MaxFresh(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order 17gm Rs 10 MaxFresh Tootpaste");
        System.out.println("Press 2 to order 36gm Rs 20 MaxFresh Tootpaste");
        System.out.println("Press 3 to order 100gm Rs 58 MaxFresh Tootpaste");
        System.out.println("Press 4 to order 200gm Rs 96 MaxFresh Tootpaste");
        System.out.println("Press 5 to go back");
        int z=sc.nextInt();
        switch (z)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            MaxFresh();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    MaxFresh();
                } else {
                    System.err.println("Please choose correct option");
                    MaxFresh();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 20;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            MaxFresh();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    MaxFresh();
                } else {
                    System.err.println("Please choose correct option");
                    MaxFresh();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 58;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            MaxFresh();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    MaxFresh();
                } else {
                    System.err.println("Please choose correct option");
                    MaxFresh();
                }
                break;
            case 4:
                System.out.println("Choose Y to order or N to go back");
                char ch4 = sc.next().charAt(0);
                if (ch4 == 'y' || ch4 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 96;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            MaxFresh();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch4 == 'n' || ch4 == 'N') {
                    System.out.println("Choose another item");
                    MaxFresh();
                } else {
                    System.err.println("Please choose correct option");
                    MaxFresh();
                }
                break;
            case 5:
                TootPaste();
                break;
            default:
                System.err.println("Please Choose Correct Number!!!");
                MaxFresh();
                break;
        }
    }
    }
    class Sensodyne extends TootPaste{
    public void Sensodyne(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order 17gm Rs 10 Sensodyne Tootpaste");
        System.out.println("Press 2 to order 36gm Rs 20 Sensodyne Tootpaste");
        System.out.println("Press 3 to order 100gm Rs 55 Sensodyne Tootpaste");
        System.out.println("Press 4 to order 200gm Rs 92 Sensodyne Tootpaste");
        System.out.println("Press 5 to go back");
        int z=sc.nextInt();
        switch (z)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            Sensodyne();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    Sensodyne();
                } else {
                    System.err.println("Please choose correct option");
                    Sensodyne();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 20;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            Sensodyne();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    Sensodyne();
                } else {
                    System.err.println("Please choose correct option");
                    Sensodyne();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 55;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            Sensodyne();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    Sensodyne();
                } else {
                    System.err.println("Please choose correct option");
                    Sensodyne();
                }
                break;
            case 4:
                System.out.println("Choose Y to order or N to go back");
                char ch4 = sc.next().charAt(0);
                if (ch4 == 'y' || ch4 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 92;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            Sensodyne();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch4 == 'n' || ch4 == 'N') {
                    System.out.println("Choose another item");
                    Sensodyne();
                } else {
                    System.err.println("Please choose correct option");
                    Sensodyne();
                }
                break;
            case 5:
                TootPaste();
                break;
            default:
                System.err.println("Please Choose Correct Number!!!");
                Sensodyne();
                break;
        }
    }
    }
    class Pepsodent extends TootPaste{
    public void Pepsodent(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order 17gm Rs 10 Pepsodent Tootpaste");
        System.out.println("Press 2 to order 36gm Rs 20 Pepsodent Tootpaste");
        System.out.println("Press 3 to order 100gm Rs 50 Pepsodent Tootpaste");
        System.out.println("Press 4 to order 200gm Rs 74 Pepsodent Tootpaste");
        System.out.println("Press 5 to go back");
        int z=sc.nextInt();
        switch (z)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            Pepsodent();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    Pepsodent();
                } else {
                    System.err.println("Please choose correct option");
                    Pepsodent();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 20;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            Pepsodent();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    Pepsodent();
                } else {
                    System.err.println("Please choose correct option");
                    Pepsodent();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 50;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            Pepsodent();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    Pepsodent();
                } else {
                    System.err.println("Please choose correct option");
                    Pepsodent();
                }
                break;
            case 4:
                System.out.println("Choose Y to order or N to go back");
                char ch4 = sc.next().charAt(0);
                if (ch4 == 'y' || ch4 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 74;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            Pepsodent();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch4 == 'n' || ch4 == 'N') {
                    System.out.println("Choose another item");
                    Pepsodent();
                } else {
                    System.err.println("Please choose correct option");
                    Pepsodent();
                }
                break;
            case 5:
                TootPaste();
                break;
            default:
                System.err.println("Please Choose Correct Number!!!");
                Pepsodent();
                break;
        }
    }
    }
    class ToothBrush extends KiranaStores{
    public void ToothBrush(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Rs 20 Colgate ToothBrush");
        System.out.println("Press 2 to order Rs 35 Oral-B ToothBrush");
        System.out.println("Press 3 to order Rs 40 Sensodyne ToothBrush");
        System.out.println("Press 4 to order Rs 55 Colgate Soft ToothBrush");
        System.out.println("Press 5 to go back");
        int z=sc.nextInt();
        switch (z)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 20;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            ToothBrush();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    ToothBrush();
                } else {
                    System.err.println("Please choose correct option");
                    ToothBrush();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 35;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            ToothBrush();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    ToothBrush();
                } else {
                    System.err.println("Please choose correct option");
                    ToothBrush();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 40;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            ToothBrush();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    ToothBrush();
                } else {
                    System.err.println("Please choose correct option");
                    ToothBrush();
                }
                break;
            case 4:
                System.out.println("Choose Y to order or N to go back");
                char ch4 = sc.next().charAt(0);
                if (ch4 == 'y' || ch4 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 55;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            ToothBrush();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch4 == 'n' || ch4 == 'N') {
                    System.out.println("Choose another item");
                    ToothBrush();
                } else {
                    System.err.println("Please choose correct option");
                    ToothBrush();
                }
                break;
            case 5:
                ToothBrush();
                break;
            default:
                System.err.println("Please Choose Correct Number!!!");
                ToothBrush();
                break;
        }
    }
    }
    class Shampoo extends KiranaStores{
    public void Shampoo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Clinic-Plus Shampoo");
        System.out.println("Press 2 to order Sun-Silk Shampoo");
        System.out.println("Press 3 to order Head&Sholder Shampoo");
        System.out.println("Press 4 to order Dove Shampoo");
        System.out.println("Press 5 to order Pantene Shampoo");
        System.out.println("Press 6 to order Induleka Shampoo");
        System.out.println("Press 7 to order Vatika Shampoo");
        System.out.println("Press 8 to go back");
        int z=sc.nextInt();
        switch (z)
        {
            case 1:
                ClinicPlus a= new ClinicPlus();
                a.ClinicPlus();
                break;
            case 2:
                SunSilk b=new SunSilk();
                b.SunSilk();
                break;
            case 3:
                HeadAndSholder c=new HeadAndSholder();
                c.HeadAndSholder();
                break;
            case 4:
                Dove d=new Dove();
                d.Dove();
                break;
            case 5:
                Pantene e=new Pantene();
                e.Pantene();
                break;
            case 6:
                Induleka f=new Induleka();
                f.Induleka();
                break;
            case 7:
                Vatika g=new Vatika();
                g.Vatika();
                break;
            case 8:
                KiranaStores();
                break;
            default:
                System.out.println("Please Enter the Correct Number!!!");
                Shampoo();
                break;
        }
    }
    }
    class ClinicPlus extends Shampoo{
    public void ClinicPlus(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Rs 1 Clinic-Plus Shampoo");
        System.out.println("Press 2 to order Rs 20 Clinic-Plus Shampoo");
        System.out.println("Press 3 to order 80ml Rs 49 Clinic-Plus Shampoo");
        System.out.println("Press 4 to order 175ml Rs 86 Clinic-Plus Shampoo");
        System.out.println("Press 5 to go back");
        int z=sc.nextInt();
        switch (z)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 1;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            ClinicPlus();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    ClinicPlus();
                } else {
                    System.err.println("Please choose correct option");
                    ClinicPlus();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 20;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            ClinicPlus();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    ClinicPlus();
                } else {
                    System.err.println("Please choose correct option");
                    ClinicPlus();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 49;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            ClinicPlus();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    ClinicPlus();
                } else {
                    System.err.println("Please choose correct option");
                    ClinicPlus();
                }
                break;
            case 4:
                System.out.println("Choose Y to order or N to go back");
                char ch4 = sc.next().charAt(0);
                if (ch4 == 'y' || ch4 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 86;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            ClinicPlus();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch4 == 'n' || ch4 == 'N') {
                    System.out.println("Choose another item");
                    ClinicPlus();
                } else {
                    System.err.println("Please choose correct option");
                    ClinicPlus();
                }
                break;
            case 5:
                Shampoo();
                break;
            default:
                System.err.println("Please Choose Correct Number!!!");
                ClinicPlus();
                break;
        }
    }
    }
    class SunSilk extends Shampoo{
    public void SunSilk(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Rs 1 SunSilk Shampoo");
        System.out.println("Press 2 to order 80ml Rs 58 SunSilk Shampoo");
        System.out.println("Press 3 to order 160ml Rs 78 SunSilk Shampoo");
        System.out.println("Press 4 to go back");
        int z=sc.nextInt();
        switch (z)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 1;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            SunSilk();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    SunSilk();
                } else {
                    System.err.println("Please choose correct option");
                    SunSilk();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 58;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            SunSilk();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    SunSilk();
                } else {
                    System.err.println("Please choose correct option");
                    SunSilk();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 78;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            SunSilk();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    SunSilk();
                } else {
                    System.err.println("Please choose correct option");
                    SunSilk();
                }
                break;
            case 4:
                Shampoo();
                break;
            default:
                System.err.println("Please Choose Correct Number!!!");
                SunSilk();
                break;
        }
    }
    }
    class HeadAndSholder extends Shampoo{
    public void HeadAndSholder(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Rs 2 Head&Sholder Shampoo");
        System.out.println("Press 2 to order Rs 4 Head&Sholder Shampoo");
        System.out.println("Press 3 to order 75ml Rs 79 Head&Sholder Shampoo");
        System.out.println("Press 4 to order 170ml Rs 193 Head&Sholder Shampoo");
        System.out.println("Press 5 to go back");
        int z=sc.nextInt();
        switch (z)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 2;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            HeadAndSholder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    HeadAndSholder();
                } else {
                    System.err.println("Please choose correct option");
                    HeadAndSholder();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 4;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            HeadAndSholder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    HeadAndSholder();
                } else {
                    System.err.println("Please choose correct option");
                    HeadAndSholder();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 79;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            HeadAndSholder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    HeadAndSholder();
                } else {
                    System.err.println("Please choose correct option");
                    HeadAndSholder();
                }
                break;
            case 4:
                System.out.println("Choose Y to order or N to go back");
                char ch4 = sc.next().charAt(0);
                if (ch4 == 'y' || ch4 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 193;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            HeadAndSholder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch4 == 'n' || ch4 == 'N') {
                    System.out.println("Choose another item");
                    HeadAndSholder();
                } else {
                    System.err.println("Please choose correct option");
                    HeadAndSholder();
                }
                break;
            case 5:
                Shampoo();
                break;
            default:
                System.err.println("Please Choose Correct Number!!!");
                HeadAndSholder();
                break;
        }
    }
    public void HeadAndSholderConditioner(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order 80ml Rs 71 Head & Shoulders Anti-Hairfall Anti-Dandruff Hair Conditioner");
        System.out.println("Press 2 to order 80ml Rs 75 Head & Shoulders Smooth & Silky  Conditioner");
        System.out.println("Press 3 to order 170ml Rs 140 Head & Shoulders Anti-Hairfall Anti-Dandruff Hair Conditioner");
        System.out.println("Press 4 to order 170ml Rs 147 Head & Shoulders Smooth & Silky  Conditioner");
        System.out.println("Press 5 to go back");
        int z=sc.nextInt();
        switch (z)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 71;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            HeadAndSholderConditioner();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    HeadAndSholderConditioner();
                } else {
                    System.err.println("Please choose correct option");
                    HeadAndSholderConditioner();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 75;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            HeadAndSholderConditioner();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    HeadAndSholderConditioner();
                } else {
                    System.err.println("Please choose correct option");
                    HeadAndSholderConditioner();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 140;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            HeadAndSholderConditioner();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    HeadAndSholderConditioner();
                } else {
                    System.err.println("Please choose correct option");
                    HeadAndSholderConditioner();
                }
                break;
            case 4:
                System.out.println("Choose Y to order or N to go back");
                char ch4 = sc.next().charAt(0);
                if (ch4 == 'y' || ch4 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 147;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            HeadAndSholderConditioner();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch4 == 'n' || ch4 == 'N') {
                    System.out.println("Choose another item");
                    HeadAndSholderConditioner();
                } else {
                    System.err.println("Please choose correct option");
                    HeadAndSholderConditioner();
                }
                break;
            case 5:
                Shampoo();
                break;
            default:
                System.err.println("Please Choose Correct Number!!!");
                HeadAndSholderConditioner();
                break;
        }


    }
    }
    class Dove extends Shampoo{
    public void Dove(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Rs 4 Dove Shampoo");
        System.out.println("Press 2 to order 80ml Rs 71 Dove Shampoo");
        System.out.println("Press 3 to order 180ml Rs 157 Dove Shampoo");
        System.out.println("Press 4 to go back");
        int z=sc.nextInt();
        switch (z)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 4;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            Dove();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    Dove();
                } else {
                    System.err.println("Please choose correct option");
                    Dove();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 71;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            Dove();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    Dove();
                } else {
                    System.err.println("Please choose correct option");
                    Dove();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 157;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            Dove();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    Dove();
                } else {
                    System.err.println("Please choose correct option");
                    Dove();
                }
                break;
            case 4:
                Shampoo();
                break;
            default:
                System.err.println("Please Choose Correct Number!!!");
                Dove();
                break;
        }
    }
        public void DoveConditioner() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 to order 80ml Rs 69 Dove Anti-Hairfall Anti-Dandruff Hair Conditioner");
            System.out.println("Press 2 to order 80ml Rs 72 Dove Smooth & Silky  Conditioner");
            System.out.println("Press 3 to order 170ml Rs 135 Dove Anti-Hairfall Anti-Dandruff Hair Conditioner");
            System.out.println("Press 4 to order 170ml Rs 141 Dove Smooth & Silky  Conditioner");
            System.out.println("Press 5 to go back");
            int z = sc.nextInt();
            switch (z) {
                case 1:
                    System.out.println("Choose Y to order or N to go back");
                    char ch1 = sc.next().charAt(0);
                    if (ch1 == 'y' || ch1 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 69;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                DoveConditioner();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch1 == 'n' || ch1 == 'N') {
                        System.out.println("Choose another item");
                        DoveConditioner();
                    } else {
                        System.err.println("Please choose correct option");
                        DoveConditioner();
                    }
                    break;
                case 2:
                    System.out.println("Choose Y to order or N to go back");
                    char ch2 = sc.next().charAt(0);
                    if (ch2 == 'y' || ch2 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 72;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                DoveConditioner();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch2 == 'n' || ch2 == 'N') {
                        System.out.println("Choose another item");
                        DoveConditioner();
                    } else {
                        System.err.println("Please choose correct option");
                        DoveConditioner();
                    }
                    break;
                case 3:
                    System.out.println("Choose Y to order or N to go back");
                    char ch3 = sc.next().charAt(0);
                    if (ch3 == 'y' || ch3 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 135;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                DoveConditioner();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch3 == 'n' || ch3 == 'N') {
                        System.out.println("Choose another item");
                        DoveConditioner();
                    } else {
                        System.err.println("Please choose correct option");
                        DoveConditioner();
                    }
                    break;
                case 4:
                    System.out.println("Choose Y to order or N to go back");
                    char ch4 = sc.next().charAt(0);
                    if (ch4 == 'y' || ch4 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 141;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                DoveConditioner();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch4 == 'n' || ch4 == 'N') {
                        System.out.println("Choose another item");
                        DoveConditioner();
                    } else {
                        System.err.println("Please choose correct option");
                        DoveConditioner();
                    }
                    break;
                case 5:
                    Shampoo();
                    break;
                default:
                    System.err.println("Please Choose Correct Number!!!");
                    DoveConditioner();
                    break;
            }
        }
    }
    class Pantene extends Shampoo {
        public void Pantene() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 to order Rs 4 Pantene Shampoo");
            System.out.println("Press 2 to order 75ml Rs 69 Pantene Shampoo");
            System.out.println("Press 3 to order 180ml Rs 172 Pantene Shampoo");
            System.out.println("Press 4 to go back");
            int z = sc.nextInt();
            switch (z) {
                case 1:
                    System.out.println("Choose Y to order or N to go back");
                    char ch1 = sc.next().charAt(0);
                    if (ch1 == 'y' || ch1 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 4;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                Pantene();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch1 == 'n' || ch1 == 'N') {
                        System.out.println("Choose another item");
                        Pantene();
                    } else {
                        System.err.println("Please choose correct option");
                        Pantene();
                    }
                    break;
                case 2:
                    System.out.println("Choose Y to order or N to go back");
                    char ch2 = sc.next().charAt(0);
                    if (ch2 == 'y' || ch2 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 69;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                Pantene();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch2 == 'n' || ch2 == 'N') {
                        System.out.println("Choose another item");
                        Pantene();
                    } else {
                        System.err.println("Please choose correct option");
                        Pantene();
                    }
                    break;
                case 3:
                    System.out.println("Choose Y to order or N to go back");
                    char ch3 = sc.next().charAt(0);
                    if (ch3 == 'y' || ch3 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 172;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                Pantene();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch3 == 'n' || ch3 == 'N') {
                        System.out.println("Choose another item");
                        Pantene();
                    } else {
                        System.err.println("Please choose correct option");
                        Pantene();
                    }
                    break;

                case 4:
                    Shampoo();
                    break;
                default:
                    System.err.println("Please Choose Correct Number!!!");
                    Pantene();
                    break;
            }
        }

        public void PanteneConditioner() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 to order 80ml Rs 65 Pantene Anti-Hairfall Anti-Dandruff Hair Conditioner");
            System.out.println("Press 2 to order 80ml Rs 72 Pantene Smooth & Silky  Conditioner");
            System.out.println("Press 3 to order 170ml Rs 140 Pantene Anti-Hairfall Anti-Dandruff Hair Conditioner");
            System.out.println("Press 4 to order 170ml Rs 147 Pantene Smooth & Silky  Conditioner");
            System.out.println("Press 5 to go back");
            int z = sc.nextInt();
            switch (z) {
                case 1:
                    System.out.println("Choose Y to order or N to go back");
                    char ch1 = sc.next().charAt(0);
                    if (ch1 == 'y' || ch1 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 65;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                PanteneConditioner();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch1 == 'n' || ch1 == 'N') {
                        System.out.println("Choose another item");
                        PanteneConditioner();
                    } else {
                        System.err.println("Please choose correct option");
                        PanteneConditioner();
                    }
                    break;
                case 2:
                    System.out.println("Choose Y to order or N to go back");
                    char ch2 = sc.next().charAt(0);
                    if (ch2 == 'y' || ch2 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 72;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                PanteneConditioner();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch2 == 'n' || ch2 == 'N') {
                        System.out.println("Choose another item");
                        PanteneConditioner();
                    } else {
                        System.err.println("Please choose correct option");
                        PanteneConditioner();
                    }
                    break;
                case 3:
                    System.out.println("Choose Y to order or N to go back");
                    char ch3 = sc.next().charAt(0);
                    if (ch3 == 'y' || ch3 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 140;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                PanteneConditioner();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch3 == 'n' || ch3 == 'N') {
                        System.out.println("Choose another item");
                        PanteneConditioner();
                    } else {
                        System.err.println("Please choose correct option");
                        PanteneConditioner();
                    }
                    break;
                case 4:
                    System.out.println("Choose Y to order or N to go back");
                    char ch4 = sc.next().charAt(0);
                    if (ch4 == 'y' || ch4 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 147;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                PanteneConditioner();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch4 == 'n' || ch4 == 'N') {
                        System.out.println("Choose another item");
                        PanteneConditioner();
                    } else {
                        System.err.println("Please choose correct option");
                        PanteneConditioner();
                    }
                    break;
                case 5:
                    Shampoo();
                    break;
                default:
                    System.err.println("Please Choose Correct Number!!!");
                    PanteneConditioner();
                    break;
            }
        }
    }

    class Induleka extends Shampoo{
    public void Induleka(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Rs 5 Induleka Shampoo");
        System.out.println("Press 2 to order 50ml Rs 62 Induleka Shampoo");
        System.out.println("Press 3 to order 100ml Rs 135 Induleka Shampoo");
        System.out.println("Press 4 to go back");
        int z=sc.nextInt();
        switch (z)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 5;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            Induleka();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    Induleka();
                } else {
                    System.err.println("Please choose correct option");
                    Induleka();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 62;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            Induleka();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    Induleka();
                } else {
                    System.err.println("Please choose correct option");
                    Induleka();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 135;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            Induleka();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    Induleka();
                } else {
                    System.err.println("Please choose correct option");
                    Induleka();
                }
                break;

            case 4:
                Shampoo();
                break;
            default:
                System.err.println("Please Choose Correct Number!!!");
                Induleka();
                break;
        }
    }
    }
    class Vatika extends Shampoo{
    public void Vatika(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Rs 1 Vatika Shampoo");
        System.out.println("Press 2 to order 100ml Rs 45 Vatika Shampoo");
        System.out.println("Press 3 to order 180ml Rs 85 Vatika Shampoo");
        System.out.println("Press 4 to go back");
        int z=sc.nextInt();
        switch (z)
        {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 1;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            Vatika();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    Vatika();
                } else {
                    System.err.println("Please choose correct option");
                    Vatika();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 45;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            Vatika();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    Vatika();
                } else {
                    System.err.println("Please choose correct option");
                    Vatika();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 85;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            Vatika();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    Vatika();
                } else {
                    System.err.println("Please choose correct option");
                    Vatika();
                }
                break;

            case 4:
                Shampoo();
                break;
            default:
                System.err.println("Please Choose Correct Number!!!");
                Vatika();
                break;
        }
    }
    }

    class Soap extends KiranaStores {
        public void Soap() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 to order Bathing Soap");
            System.out.println("Press 2 to order Washing Utensils Soap");
            System.out.println("Press 3 to order Washing Clothes Soap");
            System.out.println("Press 4 to go back");
            int z = sc.nextInt();
            switch (z) {
                case 1:
                    BathingSoap();
                    break;
                case 2:
                    WahingUtensils();
                    break;
                case 3:
                    WahingClothes();
                    break;
                case 4:
                    KiranaStores();
                    break;
                default:
                    System.out.println("Please Correct Number!!!");
                    Soap();
                    break;
            }
        }

        public void BathingSoap() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 to order LifeBouy Soap");
            System.out.println("Press 2 to order Dettol Soap");
            System.out.println("Press 3 to order Dove Soap");
            System.out.println("Press 4 to order Santoor Soap");
            System.out.println("Press 5 to order Lux Soap");
            System.out.println("Press 6 to go back");
            int z = sc.nextInt();
            switch (z) {
                case 1:
                    LifeBouySoap();
                    break;
                case 2:
                    DettolSoap();
                    break;
                case 3:
                    DoveSoap();
                    break;
                case 4:
                    SantoorSoap();
                    break;
                case 5:
                    LuxSoap();
                    break;
                case 6:
                    Soap();
                    break;
                default:
                    System.out.println("Choose Correct Number!!!");
                    BathingSoap();
                    break;
            }
        }

        public void LifeBouySoap() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 to order Rs 10 LifeBouy Soap");
            System.out.println("Press 2 to order 100gm Rs 37 LifeBouy Soap");
            System.out.println("Press 3 to order 125gm Rs 40 LifeBouy Soap");
            System.out.println("Press 4 to to back");
            int z = sc.nextInt();
            switch (z) {
                case 1:
                    System.out.println("Choose Y to order or N to go back");
                    char ch1 = sc.next().charAt(0);
                    if (ch1 == 'y' || ch1 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 10;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                LifeBouySoap();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch1 == 'n' || ch1 == 'N') {
                        System.out.println("Choose another item");
                        LifeBouySoap();
                    } else {
                        System.err.println("Please choose correct option");
                        LifeBouySoap();
                    }
                    break;
                case 2:
                    System.out.println("Choose Y to order or N to go back");
                    char ch2 = sc.next().charAt(0);
                    if (ch2 == 'y' || ch2 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 37;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                LifeBouySoap();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch2 == 'n' || ch2 == 'N') {
                        System.out.println("Choose another item");
                        LifeBouySoap();
                    } else {
                        System.err.println("Please choose correct option");
                        LifeBouySoap();
                    }
                    break;
                case 3:
                    System.out.println("Choose Y to order or N to go back");
                    char ch3 = sc.next().charAt(0);
                    if (ch3 == 'y' || ch3 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 40;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                LifeBouySoap();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch3 == 'n' || ch3 == 'N') {
                        System.out.println("Choose another item");
                        LifeBouySoap();
                    } else {
                        System.err.println("Please choose correct option");
                        LifeBouySoap();
                    }
                    break;

                case 4:
                    BathingSoap();Soap();
                    break;
                default:
                    System.err.println("Please Choose Correct Number!!!");
                    LifeBouySoap();
                    break;

            }
        }

        public void DettolSoap() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 to order Rs 10 Dettol Soap");
            System.out.println("Press 2 to order 100gm Rs 35 Dettol Soap");
            System.out.println("Press 3 to order 125gm Rs 39 Dettol Soap");
            System.out.println("Press 4 to to back");
            int z = sc.nextInt();
            switch (z) {
                case 1:
                    System.out.println("Choose Y to order or N to go back");
                    char ch1 = sc.next().charAt(0);
                    if (ch1 == 'y' || ch1 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 10;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                DettolSoap();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch1 == 'n' || ch1 == 'N') {
                        System.out.println("Choose another item");
                        DettolSoap();
                    } else {
                        System.err.println("Please choose correct option");
                        DettolSoap();
                    }
                    break;
                case 2:
                    System.out.println("Choose Y to order or N to go back");
                    char ch2 = sc.next().charAt(0);
                    if (ch2 == 'y' || ch2 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 35;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                DettolSoap();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch2 == 'n' || ch2 == 'N') {
                        System.out.println("Choose another item");
                        DettolSoap();
                    } else {
                        System.err.println("Please choose correct option");
                        DettolSoap();
                    }
                    break;
                case 3:
                    System.out.println("Choose Y to order or N to go back");
                    char ch3 = sc.next().charAt(0);
                    if (ch3 == 'y' || ch3 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 39;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                DettolSoap();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch3 == 'n' || ch3 == 'N') {
                        System.out.println("Choose another item");
                        DettolSoap();
                    } else {
                        System.err.println("Please choose correct option");
                        DettolSoap();
                    }
                    break;

                case 4:
                    BathingSoap();Soap();
                    break;
                default:
                    System.err.println("Please Choose Correct Number!!!");
                    DettolSoap();
                    break;

            }
        }

        public void DoveSoap() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 to order Rs 10 Dove Soap");
            System.out.println("Press 2 to order 100gm Rs 37 Dove Soap");
            System.out.println("Press 3 to order 125gm Rs 42 Dove Soap");
            System.out.println("Press 4 to to back");
            int z = sc.nextInt();
            switch (z) {
                case 1:
                    System.out.println("Choose Y to order or N to go back");
                    char ch1 = sc.next().charAt(0);
                    if (ch1 == 'y' || ch1 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 10;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                DoveSoap();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch1 == 'n' || ch1 == 'N') {
                        System.out.println("Choose another item");
                        DoveSoap();
                    } else {
                        System.err.println("Please choose correct option");
                        DoveSoap();
                    }
                    break;
                case 2:
                    System.out.println("Choose Y to order or N to go back");
                    char ch2 = sc.next().charAt(0);
                    if (ch2 == 'y' || ch2 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 37;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                DoveSoap();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch2 == 'n' || ch2 == 'N') {
                        System.out.println("Choose another item");
                        DoveSoap();
                    } else {
                        System.err.println("Please choose correct option");
                        DoveSoap();
                    }
                    break;
                case 3:
                    System.out.println("Choose Y to order or N to go back");
                    char ch3 = sc.next().charAt(0);
                    if (ch3 == 'y' || ch3 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 42;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                DoveSoap();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch3 == 'n' || ch3 == 'N') {
                        System.out.println("Choose another item");
                        DoveSoap();
                    } else {
                        System.err.println("Please choose correct option");
                        DoveSoap();
                    }
                    break;

                case 4:
                    BathingSoap();Soap();
                    break;
                default:
                    System.err.println("Please Choose Correct Number!!!");
                    DoveSoap();
                    break;

            }
        }

        public void SantoorSoap() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 to order Rs 10 Santoor Soap");
            System.out.println("Press 2 to order 100gm Rs 39 Santoor Soap");
            System.out.println("Press 3 to order 125gm Rs 44 Santoor Soap");
            System.out.println("Press 4 to to back");
            int z = sc.nextInt();
            switch (z) {
                case 1:
                    System.out.println("Choose Y to order or N to go back");
                    char ch1 = sc.next().charAt(0);
                    if (ch1 == 'y' || ch1 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 10;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                SantoorSoap();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch1 == 'n' || ch1 == 'N') {
                        System.out.println("Choose another item");
                        SantoorSoap();
                    } else {
                        System.err.println("Please choose correct option");
                        SantoorSoap();
                    }
                    break;
                case 2:
                    System.out.println("Choose Y to order or N to go back");
                    char ch2 = sc.next().charAt(0);
                    if (ch2 == 'y' || ch2 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 39;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                SantoorSoap();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch2 == 'n' || ch2 == 'N') {
                        System.out.println("Choose another item");
                        SantoorSoap();
                    } else {
                        System.err.println("Please choose correct option");
                        SantoorSoap();
                    }
                    break;
                case 3:
                    System.out.println("Choose Y to order or N to go back");
                    char ch3 = sc.next().charAt(0);
                    if (ch3 == 'y' || ch3 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 44;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                SantoorSoap();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch3 == 'n' || ch3 == 'N') {
                        System.out.println("Choose another item");
                        SantoorSoap();
                    } else {
                        System.err.println("Please choose correct option");
                        SantoorSoap();
                    }
                    break;

                case 4:
                    BathingSoap();Soap();
                    break;
                default:
                    System.err.println("Please Choose Correct Number!!!");
                    SantoorSoap();
                    break;

            }
        }

        public void LuxSoap() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 to order Rs 10 Lux Soap");
            System.out.println("Press 2 to order 100gm Rs 37 Lux Soap");
            System.out.println("Press 3 to order 125gm Rs 40 Lux Soap");
            System.out.println("Press 4 to to back");
            int z = sc.nextInt();
            switch (z) {
                case 1:
                    System.out.println("Choose Y to order or N to go back");
                    char ch1 = sc.next().charAt(0);
                    if (ch1 == 'y' || ch1 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 10;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                LuxSoap();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch1 == 'n' || ch1 == 'N') {
                        System.out.println("Choose another item");
                        LuxSoap();
                    } else {
                        System.err.println("Please choose correct option");
                        LuxSoap();
                    }
                    break;
                case 2:
                    System.out.println("Choose Y to order or N to go back");
                    char ch2 = sc.next().charAt(0);
                    if (ch2 == 'y' || ch2 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 37;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                LuxSoap();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch2 == 'n' || ch2 == 'N') {
                        System.out.println("Choose another item");
                        LuxSoap();
                    } else {
                        System.err.println("Please choose correct option");
                        LuxSoap();
                    }
                    break;
                case 3:
                    System.out.println("Choose Y to order or N to go back");
                    char ch3 = sc.next().charAt(0);
                    if (ch3 == 'y' || ch3 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 40;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                LuxSoap();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch3 == 'n' || ch3 == 'N') {
                        System.out.println("Choose another item");
                        LuxSoap();
                    } else {
                        System.err.println("Please choose correct option");
                        LuxSoap();
                    }
                    break;

                case 4:
                    BathingSoap();Soap();
                    break;
                default:
                    System.err.println("Please Choose Correct Number!!!");
                    LuxSoap();
                    break;

            }
        }

        public void WahingUtensils() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 to order Rs 5 Vim Bar Soap");
            System.out.println("Press 2 to order Rs 10 Vim Bar Soap");
            System.out.println("Press 3 to order Rs 30 Vim Bar Soap");
            System.out.println("Press 4 to go back");
            int z = sc.nextInt();
            switch (z) {
                case 1:
                    System.out.println("Choose Y to order or N to go back");
                    char ch1 = sc.next().charAt(0);
                    if (ch1 == 'y' || ch1 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 5;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                WahingUtensils();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch1 == 'n' || ch1 == 'N') {
                        System.out.println("Choose another item");
                        WahingUtensils();
                    } else {
                        System.err.println("Please choose correct option");
                        WahingUtensils();
                    }
                    break;
                case 2:
                    System.out.println("Choose Y to order or N to go back");
                    char ch2 = sc.next().charAt(0);
                    if (ch2 == 'y' || ch2 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 10;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                WahingUtensils();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch2 == 'n' || ch2 == 'N') {
                        System.out.println("Choose another item");
                        WahingUtensils();
                    } else {
                        System.err.println("Please choose correct option");
                        WahingUtensils();
                    }
                    break;
                case 3:
                    System.out.println("Choose Y to order or N to go back");
                    char ch3 = sc.next().charAt(0);
                    if (ch3 == 'y' || ch3 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 30;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                WahingUtensils();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch3 == 'n' || ch3 == 'N') {
                        System.out.println("Choose another item");
                        WahingUtensils();
                    } else {
                        System.err.println("Please choose correct option");
                        WahingUtensils();
                    }
                    break;

                case 4:
                    Soap();
                    break;
                default:
                    System.err.println("Please Choose Correct Number!!!");
                    WahingUtensils();
                    break;

            }
        }

        public void WahingClothes() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 to order Rin Washing Soap");
            System.out.println("Press 2 to order Surf-Excel Washing Soap");
            System.out.println("Press 3 to order Wheel Washing Soap");
            System.out.println("Press 4 to order Tide Washing Soap");
            System.out.println("Press 5 to go back");
            int z = sc.nextInt();
            switch (z) {
                case 1:
                    RinSoap();
                    break;
                case 2:
                    SurfExcelSoap();
                    break;
                case 3:
                    WheelSoap();
                    break;
                case 4:
                    TideSoap();
                    break;
                case 5:
                    KiranaStores();
                    break;
                default:
                    System.out.println("Please Correct Number!!!");
                    Soap();
                    break;
            }
        }

        public void RinSoap() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 to order Rs 5 Rin Soap");
            System.out.println("Press 2 to order Rs 10 Rin Soap");
            System.out.println("Press 3 to order Rs 25 Rin Soap");
            System.out.println("Press 4 to go back");
            int z = sc.nextInt();
            switch (z) {
                case 1:
                    System.out.println("Choose Y to order or N to go back");
                    char ch1 = sc.next().charAt(0);
                    if (ch1 == 'y' || ch1 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 5;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                RinSoap();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch1 == 'n' || ch1 == 'N') {
                        System.out.println("Choose another item");
                        RinSoap();
                    } else {
                        System.err.println("Please choose correct option");
                        RinSoap();
                    }
                    break;
                case 2:
                    System.out.println("Choose Y to order or N to go back");
                    char ch2 = sc.next().charAt(0);
                    if (ch2 == 'y' || ch2 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 10;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                RinSoap();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch2 == 'n' || ch2 == 'N') {
                        System.out.println("Choose another item");
                        RinSoap();
                    } else {
                        System.err.println("Please choose correct option");
                        RinSoap();
                    }
                    break;
                case 3:
                    System.out.println("Choose Y to order or N to go back");
                    char ch3 = sc.next().charAt(0);
                    if (ch3 == 'y' || ch3 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 25;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                RinSoap();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch3 == 'n' || ch3 == 'N') {
                        System.out.println("Choose another item");
                        RinSoap();
                    } else {
                        System.err.println("Please choose correct option");
                        RinSoap();
                    }
                    break;

                case 4:
                    WahingClothes();
                    break;
                default:
                    System.err.println("Please Choose Correct Number!!!");
                    RinSoap();
                    break;

            }
        }

        public void SurfExcelSoap() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 to order Rs 5 Surf-Excel Soap");
            System.out.println("Press 2 to order Rs 10 Surf-Excel Soap");
            System.out.println("Press 3 to order Rs 30 Surf-Excel Soap");
            System.out.println("Press 4 to go back");
            int z = sc.nextInt();
            switch (z) {
                case 1:
                    System.out.println("Choose Y to order or N to go back");
                    char ch1 = sc.next().charAt(0);
                    if (ch1 == 'y' || ch1 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 5;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                SurfExcelSoap();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch1 == 'n' || ch1 == 'N') {
                        System.out.println("Choose another item");
                        SurfExcelSoap();
                    } else {
                        System.err.println("Please choose correct option");
                        SurfExcelSoap();
                    }
                    break;
                case 2:
                    System.out.println("Choose Y to order or N to go back");
                    char ch2 = sc.next().charAt(0);
                    if (ch2 == 'y' || ch2 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 10;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                SurfExcelSoap();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch2 == 'n' || ch2 == 'N') {
                        System.out.println("Choose another item");
                        SurfExcelSoap();
                    } else {
                        System.err.println("Please choose correct option");
                        SurfExcelSoap();
                    }
                    break;
                case 3:
                    System.out.println("Choose Y to order or N to go back");
                    char ch3 = sc.next().charAt(0);
                    if (ch3 == 'y' || ch3 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 30;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                SurfExcelSoap();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch3 == 'n' || ch3 == 'N') {
                        System.out.println("Choose another item");
                        SurfExcelSoap();
                    } else {
                        System.err.println("Please choose correct option");
                        SurfExcelSoap();
                    }
                    break;

                case 4:
                    WahingClothes();
                    break;
                default:
                    System.err.println("Please Choose Correct Number!!!");
                    SurfExcelSoap();
                    break;

            }
        }

        public void WheelSoap() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 to order Rs 5 Wheel Soap");
            System.out.println("Press 2 to order Rs 10 Wheel Soap");
            System.out.println("Press 3 to order Rs 22 Wheel Soap");
            System.out.println("Press 4 to go back");
            int z = sc.nextInt();
            switch (z) {
                case 1:
                    System.out.println("Choose Y to order or N to go back");
                    char ch1 = sc.next().charAt(0);
                    if (ch1 == 'y' || ch1 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 5;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                WheelSoap();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch1 == 'n' || ch1 == 'N') {
                        System.out.println("Choose another item");
                        WheelSoap();
                    } else {
                        System.err.println("Please choose correct option");
                        WheelSoap();
                    }
                    break;
                case 2:
                    System.out.println("Choose Y to order or N to go back");
                    char ch2 = sc.next().charAt(0);
                    if (ch2 == 'y' || ch2 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 10;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                WheelSoap();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch2 == 'n' || ch2 == 'N') {
                        System.out.println("Choose another item");
                        WheelSoap();
                    } else {
                        System.err.println("Please choose correct option");
                        WheelSoap();
                    }
                    break;
                case 3:
                    System.out.println("Choose Y to order or N to go back");
                    char ch3 = sc.next().charAt(0);
                    if (ch3 == 'y' || ch3 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 22;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                WheelSoap();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch3 == 'n' || ch3 == 'N') {
                        System.out.println("Choose another item");
                        WheelSoap();
                    } else {
                        System.err.println("Please choose correct option");
                        WheelSoap();
                    }
                    break;

                case 4:
                    WahingClothes();
                    break;
                default:
                    System.err.println("Please Choose Correct Number!!!");
                    WheelSoap();
                    break;

            }
        }

        public void TideSoap() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 to order Rs 5 Tide Soap");
            System.out.println("Press 2 to order Rs 10 Tide Soap");
            System.out.println("Press 3 to order Rs 25 Tide Soap");
            System.out.println("Press 4 to go back");
            int z = sc.nextInt();
            switch (z) {
                case 1:
                    System.out.println("Choose Y to order or N to go back");
                    char ch1 = sc.next().charAt(0);
                    if (ch1 == 'y' || ch1 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 5;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                TideSoap();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch1 == 'n' || ch1 == 'N') {
                        System.out.println("Choose another item");
                        TideSoap();
                    } else {
                        System.err.println("Please choose correct option");
                        TideSoap();
                    }
                    break;
                case 2:
                    System.out.println("Choose Y to order or N to go back");
                    char ch2 = sc.next().charAt(0);
                    if (ch2 == 'y' || ch2 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 10;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                TideSoap();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch2 == 'n' || ch2 == 'N') {
                        System.out.println("Choose another item");
                        TideSoap();
                    } else {
                        System.err.println("Please choose correct option");
                        TideSoap();
                    }
                    break;
                case 3:
                    System.out.println("Choose Y to order or N to go back");
                    char ch3 = sc.next().charAt(0);
                    if (ch3 == 'y' || ch3 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 25;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                TideSoap();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch3 == 'n' || ch3 == 'N') {
                        System.out.println("Choose another item");
                        TideSoap();
                    } else {
                        System.err.println("Please choose correct option");
                        TideSoap();
                    }
                    break;

                case 4:
                    WahingClothes();
                    break;
                default:
                    System.err.println("Please Choose Correct Number!!!");
                    TideSoap();
                    break;

            }
        }
    }
class WashingPowder extends KiranaStores{
    public void WashingPowder(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Ariel Washing Powder");
        System.out.println("Press 2 to order Surf-Excel Washing Powder");
        System.out.println("Press 3 to order Tide Washing Powder");
        System.out.println("Press 4 to order Wheel Washing Powder");
        System.out.println("Press 5 to go back");
        int z=sc.nextInt();
        switch (z)
        {
            case 1:
                ArielWashingPowder();
                break;
            case 2:
                SurfExcelWashingPowder();
                break;
            case 3:
                TideWashingPowder();
                break;
            case 4:
                WheelWashingPowder();
                break;
            case 5:
                KiranaStores();
                break;
            default:
                System.out.println("Please Correct Number!!!");
                WashingPowder();
                break;
        }
    }
    public void ArielWashingPowder(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to order  Rs 10 Ariel Washing Powder");
        System.out.println("Press 2 to order 200gm Rs 45 Ariel Washing Powder");
        System.out.println("Press 3 to order 500gm Rs 66 Ariel Washing Powder");
        System.out.println("Press 4 to order 1kg Rs 120 Ariel Washing Powder");
        System.out.println("Press 5 to go back");
        int z = sc.nextInt();
        switch (z) {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            ArielWashingPowder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    ArielWashingPowder();
                } else {
                    System.err.println("Please choose correct option");
                    ArielWashingPowder();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 45;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            ArielWashingPowder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    ArielWashingPowder();
                } else {
                    System.err.println("Please choose correct option");
                    ArielWashingPowder();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 66;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            ArielWashingPowder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    ArielWashingPowder();
                } else {
                    System.err.println("Please choose correct option");
                    ArielWashingPowder();
                }
                break;
            case 4:
                System.out.println("Choose Y to order or N to go back");
                char ch4 = sc.next().charAt(0);
                if (ch4 == 'y' || ch4 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 120;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            ArielWashingPowder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch4 == 'n' || ch4 == 'N') {
                    System.out.println("Choose another item");
                    ArielWashingPowder();
                } else {
                    System.err.println("Please choose correct option");
                    ArielWashingPowder();
                }
                break;
            case 5:
                WashingPowder();
                break;
            default:
                System.err.println("Please Choose Correct Number!!!");
                ArielWashingPowder();
                break;
        }
    }
    public void SurfExcelWashingPowder(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to order Rs 10 Surf-Excel Washing Powder");
        System.out.println("Press 2 to order 200gm Rs 25 Surf-Excel Washing Powder");
        System.out.println("Press 3 to order 500gm Rs 48 Surf-Excel Washing Powder");
        System.out.println("Press 4 to order 1Kg Rs 86 Surf-Excel Washing Powder");
        System.out.println("Press 5 to go back");
        int z = sc.nextInt();
        switch (z) {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            SurfExcelWashingPowder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    SurfExcelWashingPowder();
                } else {
                    System.err.println("Please choose correct option");
                    SurfExcelWashingPowder();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 25;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            SurfExcelWashingPowder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    SurfExcelWashingPowder();
                } else {
                    System.err.println("Please choose correct option");
                    SurfExcelWashingPowder();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 48;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            SurfExcelWashingPowder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    SurfExcelWashingPowder();
                } else {
                    System.err.println("Please choose correct option");
                    SurfExcelWashingPowder();
                }
                break;
            case 4:
                System.out.println("Choose Y to order or N to go back");
                char ch4 = sc.next().charAt(0);
                if (ch4 == 'y' || ch4 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 86;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            SurfExcelWashingPowder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch4 == 'n' || ch4 == 'N') {
                    System.out.println("Choose another item");
                    SurfExcelWashingPowder();
                } else {
                    System.err.println("Please choose correct option");
                    SurfExcelWashingPowder();
                }
                break;
            case 5:
                WashingPowder();
                break;
            default:
                System.err.println("Please Choose Correct Number!!!");
                SurfExcelWashingPowder();
                break;
        }
    }
    public void TideWashingPowder(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to order Rs 10 Tide Washing Powder");
        System.out.println("Press 2 to order 200gm Rs 28 Tide Washing Powder");
        System.out.println("Press 3 to order 500gm Rs 64 Tide Washing Powder");
        System.out.println("Press 4 to order 1Kg Rs 130 Tide Washing Powder");
        System.out.println("Press 5 to go back");
        int z = sc.nextInt();
        switch (z) {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            TideWashingPowder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    TideWashingPowder();
                } else {
                    System.err.println("Please choose correct option");
                    TideWashingPowder();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 28;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            TideWashingPowder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    TideWashingPowder();
                } else {
                    System.err.println("Please choose correct option");
                    TideWashingPowder();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 64;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            TideWashingPowder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    TideWashingPowder();
                } else {
                    System.err.println("Please choose correct option");
                    TideWashingPowder();
                }
                break;
            case 4:
                System.out.println("Choose Y to order or N to go back");
                char ch4 = sc.next().charAt(0);
                if (ch4 == 'y' || ch4 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 130;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            TideWashingPowder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch4 == 'n' || ch4 == 'N') {
                    System.out.println("Choose another item");
                    TideWashingPowder();
                } else {
                    System.err.println("Please choose correct option");
                    TideWashingPowder();
                }
                break;
            case 5:
                WashingPowder();
                break;
            default:
                System.err.println("Please Choose Correct Number!!!");
                TideWashingPowder();
                break;
        }
    }
    public void WheelWashingPowder(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to order Rs 10 Wheel Washing Powder");
        System.out.println("Press 2 to order 200gm Rs 24 Wheel Washing Powder");
        System.out.println("Press 3 to order 500gm Rs 42 Wheel Washing Powder");
        System.out.println("Press 4 to order 1Kg Rs 40 Wheel Washing Powder");
        System.out.println("Press 5 to go back");
        int z = sc.nextInt();
        switch (z) {
            case 1:
                System.out.println("Choose Y to order or N to go back");
                char ch1 = sc.next().charAt(0);
                if (ch1 == 'y' || ch1 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 10;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            WheelWashingPowder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch1 == 'n' || ch1 == 'N') {
                    System.out.println("Choose another item");
                    WheelWashingPowder();
                } else {
                    System.err.println("Please choose correct option");
                    WheelWashingPowder();
                }
                break;
            case 2:
                System.out.println("Choose Y to order or N to go back");
                char ch2 = sc.next().charAt(0);
                if (ch2 == 'y' || ch2 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 24;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            WheelWashingPowder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch2 == 'n' || ch2 == 'N') {
                    System.out.println("Choose another item");
                    WheelWashingPowder();
                } else {
                    System.err.println("Please choose correct option");
                    WheelWashingPowder();
                }
                break;
            case 3:
                System.out.println("Choose Y to order or N to go back");
                char ch3 = sc.next().charAt(0);
                if (ch3 == 'y' || ch3 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 42;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            WheelWashingPowder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch3 == 'n' || ch3 == 'N') {
                    System.out.println("Choose another item");
                    WheelWashingPowder();
                } else {
                    System.err.println("Please choose correct option");
                    WheelWashingPowder();
                }
                break;
            case 4:
                System.out.println("Choose Y to order or N to go back");
                char ch4 = sc.next().charAt(0);
                if (ch4 == 'y' || ch4 == 'Y') {
                    System.out.println("Order has been confirmed");
                    TotalBill = TotalBill + 80;
                    System.out.println("Press 1 to order again");
                    System.out.println("Press 2 to go to Main Menu");
                    System.out.println("Press 3 to proceed for bill");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            WheelWashingPowder();
                            break;
                        case 2:
                            KiranaStores();
                            break;
                        case 3:
                            System.out.println("Please Pay the Amount");
                            break;
                    }
                } else if (ch4 == 'n' || ch4 == 'N') {
                    System.out.println("Choose another item");
                    WheelWashingPowder();
                } else {
                    System.err.println("Please choose correct option");
                    WheelWashingPowder();
                }
                break;
            case 5:
                WashingPowder();
                break;
            default:
                System.err.println("Please Choose Correct Number!!!");
                WheelWashingPowder();
                break;
        }
    }
}

    class TeaPowder extends KiranaStores{
    public void TeaPowder(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to order Society Tea Powder");
        System.out.println("Press 2 to order Girnar Tea Powder");
        System.out.println("Press 3 to order Red-Label Tea Powder");
        System.out.println("Press 4 to go back");
        int z=sc.nextInt();
        switch (z)
        {
            case 1:
                SocietyTeaPowder();
                break;
            case 2:
                GirnarTeaPowder();
                break;
            case 3:
                RedLabelTeaPowder();
                break;
            case 4:
                KiranaStores();
                break;
            default:
                System.err.println("Please Enter correct Number!!!");
                TeaPowder();
                break;
        }
        }
        public void SocietyTeaPowder(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Press 1 to order Rs 10 Society Tea Powder");
            System.out.println("Press 2 to order 100gm Rs 51 Society Tea Powder");
            System.out.println("Press 3 to order 250gm Rs 140 Society Tea Powder");
            System.out.println("Press 4 to order 500gm Rs 266 Society Tea Powder");
            System.out.println("Press 5 to go back");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Choose Y to order or N to go back");
                    char ch1 = sc.next().charAt(0);
                    if (ch1 == 'y' || ch1 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 10;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                SocietyTeaPowder();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch1 == 'n' || ch1 == 'N') {
                        System.out.println("Choose another item");
                        SocietyTeaPowder();
                    } else {
                        System.err.println("Please choose correct option");
                        SocietyTeaPowder();
                    }
                    break;
                case 2:
                    System.out.println("Choose Y to order or N to go back");
                    char ch2 = sc.next().charAt(0);
                    if (ch2 == 'y' || ch2 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 51;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                SocietyTeaPowder();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch2 == 'n' || ch2 == 'N') {
                        System.out.println("Choose another item");
                        SocietyTeaPowder();
                    } else {
                        System.err.println("Please choose correct option");
                        SocietyTeaPowder();
                    }
                    break;
                case 3:
                    System.out.println("Choose Y to order or N to go back");
                    char ch3 = sc.next().charAt(0);
                    if (ch3 == 'y' || ch3 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 140;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                SocietyTeaPowder();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch3 == 'n' || ch3 == 'N') {
                        System.out.println("Choose another item");
                        SocietyTeaPowder();
                    } else {
                        System.err.println("Please choose correct option");
                        SocietyTeaPowder();
                    }
                    break;
                case 4:
                    System.out.println("Choose Y to order or N to go back");
                    char ch4 = sc.next().charAt(0);
                    if (ch4 == 'y' || ch4 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 266;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                SocietyTeaPowder();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch4 == 'n' || ch4 == 'N') {
                        System.out.println("Choose another item");
                        SocietyTeaPowder();
                    } else {
                        System.err.println("Please choose correct option");
                        SocietyTeaPowder();
                    }
                    break;
                case 5:
                    TeaPowder();
                    break;
                default:
                    System.err.println("Choose Correct Option");
                    SocietyTeaPowder();
                    break;
            }
        }
        public void GirnarTeaPowder(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Press 1 to order Rs 10 Girnar Tea Powder");
            System.out.println("Press 2 to order 100gm Rs 41 Girnar Tea Powder");
            System.out.println("Press 3 to order 250gm Rs 145 Girnar Tea Powder");
            System.out.println("Press 4 to order 500gm Rs 255 Girnar Tea Powder");
            System.out.println("Press 5 to go back");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Choose Y to order or N to go back");
                    char ch1 = sc.next().charAt(0);
                    if (ch1 == 'y' || ch1 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 10;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                GirnarTeaPowder();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch1 == 'n' || ch1 == 'N') {
                        System.out.println("Choose another item");
                        GirnarTeaPowder();
                    } else {
                        System.err.println("Please choose correct option");
                        GirnarTeaPowder();
                    }
                    break;
                case 2:
                    System.out.println("Choose Y to order or N to go back");
                    char ch2 = sc.next().charAt(0);
                    if (ch2 == 'y' || ch2 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 41;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                GirnarTeaPowder();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch2 == 'n' || ch2 == 'N') {
                        System.out.println("Choose another item");
                        GirnarTeaPowder();
                    } else {
                        System.err.println("Please choose correct option");
                        GirnarTeaPowder();
                    }
                    break;
                case 3:
                    System.out.println("Choose Y to order or N to go back");
                    char ch3 = sc.next().charAt(0);
                    if (ch3 == 'y' || ch3 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 145;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                GirnarTeaPowder();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch3 == 'n' || ch3 == 'N') {
                        System.out.println("Choose another item");
                        GirnarTeaPowder();
                    } else {
                        System.err.println("Please choose correct option");
                        GirnarTeaPowder();
                    }
                    break;
                case 4:
                    System.out.println("Choose Y to order or N to go back");
                    char ch4 = sc.next().charAt(0);
                    if (ch4 == 'y' || ch4 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 255;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                GirnarTeaPowder();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch4 == 'n' || ch4 == 'N') {
                        System.out.println("Choose another item");
                        GirnarTeaPowder();
                    } else {
                        System.err.println("Please choose correct option");
                        GirnarTeaPowder();
                    }
                    break;
                case 5:
                    TeaPowder();
                    break;
                default:
                    System.err.println("Choose Correct Option");
                    GirnarTeaPowder();
                    break;
            }
        }
        public void RedLabelTeaPowder(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Press 1 to order Rs 10 Red-Label Tea Powder");
            System.out.println("Press 2 to order 100gm Rs 52 Red-Label Tea Powder");
            System.out.println("Press 3 to order 250gm Rs 130 Red-Label Tea Powder");
            System.out.println("Press 4 to order 500gm Rs 242 Red-Label Tea Powder");
            System.out.println("Press 5 to go back");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Choose Y to order or N to go back");
                    char ch1 = sc.next().charAt(0);
                    if (ch1 == 'y' || ch1 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 10;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                RedLabelTeaPowder();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch1 == 'n' || ch1 == 'N') {
                        System.out.println("Choose another item");
                        RedLabelTeaPowder();
                    } else {
                        System.err.println("Please choose correct option");
                        RedLabelTeaPowder();
                    }
                    break;
                case 2:
                    System.out.println("Choose Y to order or N to go back");
                    char ch2 = sc.next().charAt(0);
                    if (ch2 == 'y' || ch2 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 52;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                RedLabelTeaPowder();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch2 == 'n' || ch2 == 'N') {
                        System.out.println("Choose another item");
                        RedLabelTeaPowder();
                    } else {
                        System.err.println("Please choose correct option");
                        RedLabelTeaPowder();
                    }
                    break;
                case 3:
                    System.out.println("Choose Y to order or N to go back");
                    char ch3 = sc.next().charAt(0);
                    if (ch3 == 'y' || ch3 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 130;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                RedLabelTeaPowder();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch3 == 'n' || ch3 == 'N') {
                        System.out.println("Choose another item");
                        RedLabelTeaPowder();
                    } else {
                        System.err.println("Please choose correct option");
                        RedLabelTeaPowder();
                    }
                    break;
                case 4:
                    System.out.println("Choose Y to order or N to go back");
                    char ch4 = sc.next().charAt(0);
                    if (ch4 == 'y' || ch4 == 'Y') {
                        System.out.println("Order has been confirmed");
                        TotalBill = TotalBill + 242;
                        System.out.println("Press 1 to order again");
                        System.out.println("Press 2 to go to Main Menu");
                        System.out.println("Press 3 to proceed for bill");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                RedLabelTeaPowder();
                                break;
                            case 2:
                                KiranaStores();
                                break;
                            case 3:
                                System.out.println("Please Pay the Amount");
                                break;
                        }
                    } else if (ch4 == 'n' || ch4 == 'N') {
                        System.out.println("Choose another item");
                        RedLabelTeaPowder();
                    } else {
                        System.err.println("Please choose correct option");
                        RedLabelTeaPowder();
                    }
                    break;
                case 5:
                    TeaPowder();
                    break;
                default:
                    System.err.println("Choose Correct Option");
                    RedLabelTeaPowder();
                    break;
            }
        }
        }


    public class R1KiranaStores
    {
        static
        {
            System.out.println("=====Welcome to Kirana Store!!!=====");
            System.out.println("=====Cash Payment Available!!!=====");
        }

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 for Signup");
            System.out.println("Press 2 for login");
            System.out.println("Press 3 for Exit");
            int x = sc.nextInt();
            KiranaStores r = new KiranaStores();
            switch (x)
            {
                case 1:
                    r.Signup();
                    break;
                case 2:
                    r.login();
                    break;
                case 3:
                    System.out.println("Thank You for Visiting");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Invalid Input!!! Please Try Again!!!");
                    main(null);
            }
            r.KiranaStores();
            System.out.println(KiranaStores.TotalBill);
        }
    }