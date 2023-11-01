public final class Singleton {
    public static String value;
    private static Singleton instance;
    LibraryArchive Archivee = new LibraryArchive();;

    private Singleton(String value) {

        Archivee.AddToArchive("What to read the rating of the most interesting books?");//0
        Archivee.AddToArchive("The path of Abai / Mukhtar Auezov");//1
        Archivee.AddToArchive("Kyz-Zhibek");//2
        Archivee.AddToArchive("Behind us Moscow / Bauyrzhan Momyshuly");//3
        Archivee.AddToArchive("Botagoz / Sabit Mukanov");//4
        Archivee.AddToArchive("Words of edification / Abai Kunanbayev");//0
        for (int i = 0; i <Archivee.Archival.size(); i++) {
            Archivee.reedRating(i);

            System.out.println(Archivee.reedRating(i));
        }
        this.value = value;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}