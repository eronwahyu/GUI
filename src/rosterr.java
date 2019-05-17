/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class rosterr {
    public String waktu_mulai;
    public String nama_matkul;
    public String waktu_selesai;
    public String jadwal_id;
    public String hari;
    

public rosterr(String waktu_mulai, String nama_matkul ,String waktu_selesai,String jadwal_id,String hari ){
    this.waktu_mulai = waktu_mulai;
    this.nama_matkul = nama_matkul;
    this.waktu_selesai = waktu_selesai;
    this.jadwal_id=jadwal_id;
    this.hari=hari;
}

    public String getWaktu_mulai() {
        return waktu_mulai;
    }

    public String getNama_matkul() {
        return nama_matkul;
    }

    public String getWaktu_selesai() {
        return waktu_selesai;
    }

    public String getJadwal_id() {
        return jadwal_id;
    }

    public String getHari() {
        return hari;
    }

}