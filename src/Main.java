public class Main {
    public static void main(String[] args) {
        Author ChuckPalahniuk = new Author ("Chuck", "Palahniuk");
        Book FightClub = new Book("FightClub", 1996, ChuckPalahniuk);
        System.out.println("Название книги: " + FightClub.getTitle());
        System.out.println("Год публикации книги: " + FightClub.getYear());
        System.out.println("Автор: " + ChuckPalahniuk.getName() + " " + ChuckPalahniuk.getSurname());

        FightClub.setYear(1999);
        System.out.println("Новый год публикации книги: " + FightClub.getYear());

        System.out.println("-------------------");

        Author WinstonGroom = new Author ("Winston", "Groom");
        Book ForrestGump = new Book("Forrest Gump", 1986, WinstonGroom);
        System.out.println("Название книги: " + ForrestGump.getTitle());
        System.out.println("Год публикации книги: " + ForrestGump.getYear());
        System.out.println("Автор: " + WinstonGroom.getName() + " " + WinstonGroom.getSurname());


        }
    }