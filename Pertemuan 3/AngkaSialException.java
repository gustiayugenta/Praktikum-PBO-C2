/**
 * File         : AngkaSialException.java
 * Deskripsi    : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Nama         : Gusti Ayu Genta Bhuana Paramitha
 * NIM          : 24060123130110 
 */

public class AngkaSialException extends Exception{
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}