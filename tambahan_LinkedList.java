import java.util.LinkedList;

public class tambahan_LinkedList {
    public static void main(String[] args) throws Exception {
        LinkedList<String> no_bp = new LinkedList<>();
        LinkedList<String> nama = new LinkedList<>();
        LinkedList<String> alamat = new LinkedList<>();

        no_bp.add("2111521005");
        nama.add("Shabrina Elfani Gucy");
        alamat.add("Solok");

        System.out.println("Data Awal");
        System.out.println("No BP : "+ no_bp);
        System.out.println("Nama : "+ nama);
        System.out.println("Alamat: "+ alamat);
        System.out.println("");

        //tambahkan data awal
        no_bp.addFirst("2111521009");
        nama.addFirst("Azzahra Athifah Dzaki");
        alamat.addFirst("Payakumbuh");

        System.out.println("Tambahkan Data di Awal");
        System.out.println("No BP : "+ no_bp);
        System.out.println("Nama : "+ nama);
        System.out.println("Alamat: "+ alamat);
        System.out.println("");

        //tambahkan data akhir
        no_bp.addLast("2111522005");
        nama.addLast("Rakhilca Yanedika");
        alamat.addLast("Lubuk Basung");

        System.out.println("Tambahkan Data di Akhir");
        System.out.println("No BP : "+ no_bp);
        System.out.println("Nama : "+ nama);
        System.out.println("Alamat: "+ alamat);
        System.out.println("");

        //menambahkan data
        no_bp.add(0,"2111522003");
        no_bp.add(1,"2111522002");
        no_bp.add(2,"2111522017");

        nama.add(0,"Rafiqatul Ulya");
        nama.add(1,"Niki Yulia Nada");
        nama.add(2,"Syakina Triyana");

        alamat.add(0,"Agam");
        alamat.add(1,"Payakumbuh");
        alamat.add(2,"Pariaman");

        System.out.println("Menambahkan Data Pada Index Ke 0,1,dan 2");
        System.out.println("No BP : "+ no_bp);
        System.out.println("Nama : "+ nama);
        System.out.println("Alamat: "+ alamat);
        System.out.println("");

        //menimpa atau menyisip data
        no_bp.set(0,"2111522021");
        nama.set(0,"Nadini Annisa Byant");
        alamat.set(0,"Padang");

        System.out.println("Menimpa atau Menyisip Data Pada Index ke 0");
        System.out.println("No BP : "+ no_bp);
        System.out.println("Nama : "+ nama);
        System.out.println("Alamat: "+ alamat);
        System.out.println("");

        //menghapus data awal
        no_bp.removeFirst();
        nama.removeFirst();
        alamat.remove();

        System.out.println("Menghapus Data Awal");
        System.out.println("No BP : "+ no_bp);
        System.out.println("Nama : "+ nama);
        System.out.println("Alamat: "+ alamat);
        System.out.println("");

        //Menghapus data akhir
        no_bp.removeLast();
        nama.removeLast();
        alamat.removeLast();

        System.out.println("Menghapus Data Akhir");
        System.out.println("No BP : "+ no_bp);
        System.out.println("Nama : "+ nama);
        System.out.println("Alamat: "+ alamat);
        System.out.println("");

        //menghapus data
        no_bp.remove(1);
        nama.remove(1);
        alamat.remove(1);

        System.out.println("Menghapus Data Pada Index Ke 1");
        System.out.println("No BP : "+ no_bp);
        System.out.println("Nama : "+ nama);
        System.out.println("Alamat: "+ alamat);
        System.out.println("");

        //fungsi pop
        System.out.println("Mengambil Data Pertama");
        System.out.println("No BP : "+ no_bp.pop());
        System.out.println("Nama : "+ nama.pop());
        System.out.println("Alamat: "+ alamat.pop());
        System.out.println("");

        //fungsi push
        no_bp.push("2111522031");
        nama.push("Khairunnisa Salsabila");
        alamat.push("Jambi");

        System.out.println("Menambahkan Data Pertama");
        System.out.println("No BP : "+ no_bp);
        System.out.println("Nama : "+ nama);
        System.out.println("Alamat: "+ alamat);
        System.out.println("");

        //fungsi get
        System.out.println("Mendapatkan Data Pada Index Ke 1");
        System.out.println("No BP \t\t : "+ no_bp.get(1));
        System.out.println("Nama \t : "+ nama.get(1));
        System.out.println("Alamat \t\t : "+ alamat.get(1));
        System.out.println("");







        }
}
