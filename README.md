# QuestNavigasiMVVM_0024 - Praktikum Pertemuan 6

Proyek aplikasi Android berbasis **Jetpack Compose** untuk penugasan mata kuliah **Pengembangan Aplikasi Mobile (PAM) - Pertemuan 6**. Proyek ini mengimplementasikan alur navigasi formulir isian biodata (**FormIsian**) menuju layar hasil (**TampilData**) menggunakan pengelola navigasi (**Navigasi**) dengan kepatuhan manajemen resource Android (`dimens.xml`, `strings.xml`, `colors.xml`).

---

## 👤 Identitas Mahasiswa
- **Nama:** Hafiz Kurniawan
- **NIM:** 20220140024
- **Mata Kuliah:** Pengembangan Aplikasi Mobile (PAM)
- **Topik:** Pertemuan 6 - Quest Navigasi MVVM (Form Isian & Tampil Data Jetpack Compose)
- **Repository:** [https://github.com/wpiskaa/QuestNavigasiMVVM_0024.git](https://github.com/wpiskaa/QuestNavigasiMVVM_0024.git)

---

## 📱 Alur Layar dan Komponen Antarmuka (UI Components)

Aplikasi ini memiliki 2 layar utama yang dikelola oleh `Navigasi.kt`:

1. **Layar 1: Form Isian (`formulir.kt`)**
   - **Scaffold & TopAppBar:** Header aplikasi berlatar `R.color.teal_700` dengan judul `R.string.home` ("Form Isian").
   - **Input Nama Lengkap (`OutlinedTextField`):** Field input nama dengan shape rounded (`MaterialTheme.shapes.large`).
   - **Pilihan Jenis Kelamin (`RadioButton`):** Radio button horizontal untuk memilih `Laki-laki` atau `Perempuan`.
   - **Input Alamat (`OutlinedTextField`):** Field input teks alamat terstandarisasi.
   - **HorizontalDivider:** Garis pemisah antar field.
   - **Tombol Submit (`Button`):** Mengirimkan data input ke pengelola navigasi dan berpindah ke layar `TampilData`.

2. **Layar 2: Tampilan Data (`TampilData.kt`)**
   - **Scaffold & TopAppBar:** Header aplikasi dengan judul `R.string.tampil` ("Tampilan").
   - **Data Ringkasan:** Menampilkan kembali `NAMA LENGKAP`, `JENIS KELAMIN`, dan `ALAMAT` yang telah disubmit, dipisahkan oleh garis `HorizontalDivider` berwarna cyan.
   - **Tombol Back (`Button`):** Tombol kembali menuju layar `FormIsian`.

3. **Pengelola Navigasi (`Navigasi.kt`)**
   - Menggunakan enum `PengelolaHalaman` (`Form` dan `Tampil`) untuk mengontrol transisi state tampilan serta menyalurkan data masukan formulir secara dinamis.

---

## 🗂️ Struktur Resource Penugasan

- **`app/src/main/res/values/dimens.xml`**:
  - `padding_small`: `10dp`
  - `padding_medium`: `16dp`
  - `thickness_divider`: `1dp`

- **`app/src/main/res/values/strings.xml`**:
  - `app_name`: `PAM6`
  - `submit`: `Submit`
  - `back`: `Back`
  - `nama_lengkap`: `NAMA LENGKAP`
  - `jenis_kelamin`: `JENIS KELAMIN`
  - `alamat`: `ALAMAT`
  - `tampil`: `Tampilan`
  - `home`: `Form Isian`

---

## 📸 Dokumentasi / Preview Antarmuka

<img width="1917" height="1078" alt="Preview Form Isian" src="https://github.com/user-attachments/assets/313d54a2-fec9-4861-9e25-490b1d7b2b72" />
<img width="1917" height="1078" alt="Preview Tampilan Hasil dan Navigasi" src="https://github.com/user-attachments/assets/529f4b4a-32de-429b-b841-c78985df7c12" />
