public class arrayMhs {
    public static void main(String[] args) {
        mhs mahasiswa1 = new mhs("A11.2020.12561", "Lukman ", 3.6f);
        mhs mahasiswa2 = new mhs("A11.2020.12561", "Jokog", 3.6f);
        mhs mahasiswa3 = new mhs("A11.2020.12561", "ucup", 3.6f);
        mhs mahasiswa4 = new mhs("A11.2020.12561", "cimengg", 3.6f);
        mhs mahasiswa5 = new mhs("A11.2020.12561", "agung", 3.6f);

        // mahasiswa.printInfo();

        mhs[] arrMhs = new mhs[5];
        arrMhs[0] = mahasiswa1;
        arrMhs[1] = mahasiswa2;
        arrMhs[2] = mahasiswa3;
        arrMhs[3] = mahasiswa4;
        arrMhs[4] = mahasiswa5;

        for (int i = 0; i < arrMhs.length; i++) {
            System.out.print(arrMhs[i].nim + "\t" + arrMhs[i].nama + "\t" + arrMhs[i].ipk + "\n");
        }
    }

}
