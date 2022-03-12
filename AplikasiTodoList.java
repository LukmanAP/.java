public class AplikasiTodoList {

    public static String[] model = new String[10];
    public static java.util.Scanner scanner = new  java.util.Scanner(System.in);

    public static void main(String[] args) {

        viewShowTodoList();

    }

    //Menapilakan Todo List

    public static void showTodoList() {
        System.out.println("====Show TodoList====");
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
              System.out.println(no + ". " + todo);
            }
        }

    }
    public static void testShowTodoList() {
        model[0] = "AYo kita belajar java yang keren";
        model[1] = "disini adlah tempat untuk belajar java";        //fungtion untuk mengetes showTodoList();
        showTodoList();
    }

    //Menambah Todo List
    public static void addTodoList(String todo) {
        //cek apakah model penuh

        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                //model masih ada yang kosong
                isFull = false;
                break;
            }
        }

        //jika penuh kira risize ukuran array 2 kali lipat
        if (isFull) {
            var temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        //tambahka ke posisi yang array nya NULL
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList() {
        for (int i = 0; i < 25; i++) {
            addTodoList("contoh todo ke- " + i);
        }                                           //fungtion untuk mengetes AddTodoList();

        showTodoList();
    }

    //Menghapus Todo List
    public  static boolean removeTodoList(Integer number) {
        if ((number - 1) >= model.length) {
            return false;
        } else if (model[number - 1] == null) {
            return false;
        } else {
            for (int i = (number - 1); i < model.length; i++)
                if (i == (model.length - 1)){
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }
            return true;
        }

    }
    public static void testRemoveTodoList() {
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");
        addTodoList("enam");
                                                                    //fungtion untuk mengetes RemoveTodoList
        var result = removeTodoList(20);
        System.out.println(result);

        result = removeTodoList(7);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

        showTodoList();

    }

    public static String input(String info) {
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }
    public static void testInput() {
        var name = input("Nama");
        System.out.println("Hii.. " + name);
                                                        //fungsion untuk mengetes input();
        var kerja = input("pekerjaan");
        System.out.println("anda bekerja di " + kerja );
    }

    //Menampilkan View Todo List
    public static void viewShowTodoList() {
        while (true) {
            showTodoList();

            System.out.println("\nMenu");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println(("x. Keluar"));

            var input = input("Pilih");

            if (input.equals("1")) {
                viewAddTodoList();
            } else if (input.equals("2")){
                viewRemoveTodoList();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak di mengerti");
            }
        }

    }

    public static void testViewShowTodoList() {
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");                 //fungtion untuk mengecek viewShowTodoList();
        addTodoList("empat");
        addTodoList("lima");
        viewShowTodoList();
    }

    //Menamoilkan View Menambahkan Todo List
    public static void viewAddTodoList() {
        System.out.println("MENAMBAH TODOLIST");

        var todo = input("Todo (x Jika Batal)");

        if (todo.equals("x")) {
            //batal
        } else {
            addTodoList(todo);
        }

    }

    public static void testViewAddTodoList() {
        viewAddTodoList();
                                    //fungtion untuk mengecek viewAddTodoList();
        showTodoList();
    }

    //Menampilkan VIew Menghapus Todo List
    public static void viewRemoveTodoList() {
        System.out.println("MENGHAPUS TIDOLIST");

        var number = input("Nomor yang di hapus(x. Jika batal");

        if (number.equals("x")) {
            //batal
        } else {
            boolean success = removeTodoList(Integer.valueOf(number));
            if (!success) {
                System.out.println("Gagal Menghapus TodoList : " + number);
            }
        }

    }

    public static void testViewRemoveTodoList() {
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");            //fungtion untuk mengecek viewRemoveTodoList();

        showTodoList();

        viewRemoveTodoList();

        showTodoList();
    }

}

/* 

====Show TodoList====

1.{
    Menu     
    1. Tambah
    2. Hapus 
    x. Keluar
    Pilih : 1 (*enter)
}

2.{
    MENAMBAH TODOLIST     
    Todo (x Jika Batal) : Belajar bahasa java (*enter)
}

2{
    ====Show TodoList====
    1. belajar bahasa java
    Menu
    1. Tambah
    2. Hapus
    x. Keluar
    Pilih : 1  (*enter)
}

3.{
    MENAMBAH TODOLIST     
    Todo (x Jika Batal) : Memecahkan persoalan java (*enter)
}

4.{
    ====Show TodoList====
    1. belajar bahasa java
    2. Memecahkan persoalan java
    Menu
    1. Tambah
    2. Hapus
    x. Keluar
    Pilih : 2  (*enter)
}

5.{
    MENGHAPUS TIDOLIST
    Nomor yang di hapus(x. Jika batal) : 1 (*enter)
}

6.{
    ====Show TodoList====
    1. Memecahkan persoalan java
    Menu
    1. Tambah
    2. Hapus
    x. Keluar
    Pilih : x (*enter)
}

7. {
    break;
}


*/