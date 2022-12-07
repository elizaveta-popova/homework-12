public class Main {
    public static void main(String[] args) {
        Book FightClub = new Book("FightClub", 1996, "Chuck Palahniuk");
        System.out.println("Название книги: " + FightClub.getTitle());
        System.out.println("Год публикации книги: " + FightClub.getYear());
        System.out.println("Автор книги: " + FightClub.getAuthorName());
        FightClub.setYear(1999);
        System.out.println("Новый год публикации книги: " + FightClub.getYear());

        Author ChuckPalahniuk = new Author ("Chuck", "Palahniuk");
        System.out.println("Автор: " + ChuckPalahniuk.getName());
        System.out.println("Фамилия автора: " + ChuckPalahniuk.getSurname());

        System.out.println("-------------------");

        Book ForrestGump = new Book("Forrest Gump", 1986, "Winston Groom");
        System.out.println("Название книги: " + ForrestGump.getTitle());
        System.out.println("Год публикации книги: " + ForrestGump.getYear());
        System.out.println("Автор книги: " + ForrestGump.getAuthorName());

        Author WinstonGroom = new Author ("Winston", "Groom");
        System.out.println("Имя автора: " + WinstonGroom.getName());
        System.out.println("Фамилия автора: " + WinstonGroom.getSurname());



        }
    }