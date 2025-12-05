class Books {
    String manga[] = {"Black Clover", "Shonen", "Yūki Tabata"};
    int volume = 2;
}

public class testing {
    public static void main(String[] args) {

        Books b = new Books();

        System.out.print(
            "Manga Name: " + b.manga[0] +
            "\nGenres: " + b.manga[1] +
            "\nAuthor: " + b.manga[2] +
            "\nVolume no: " + b.volume
        );
    }
}
