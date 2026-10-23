# QuestNavigasiMVVM_0024 - Praktikum Pertemuan 6

Proyek aplikasi Android berbasis **Jetpack Compose** untuk penugasan mata kuliah **Pengembangan Aplikasi Mobile (PAM) - Pertemuan 6**. Proyek ini mengimplementasikan tata letak formulir isian biodata (**FormIsian**) yang disusun secara terstruktur dengan manajemen resource Android (`dimens.xml`, `strings.xml`, `colors.xml`).

---

## 👤 Identitas Mahasiswa
- **Nama:** wpiskaa
- **NIM:** 20220140024 (0024)
- **Mata Kuliah:** Pengembangan Aplikasi Mobile (PAM)
- **Topik:** Pertemuan 6 - Quest Navigasi MVVM (Form Isian Jetpack Compose)
- **Repository:** [https://github.com/wpiskaa/QuestNavigasiMVVM_0024.git](https://github.com/wpiskaa/QuestNavigasiMVVM_0024.git)

---

## 📱 Fitur dan Komponen Antarmuka (UI Components)

Aplikasi ini menggunakan komponen Material 3 modern dalam Jetpack Compose:

1. **TopAppBar & Scaffold**
   - Menggunakan `Scaffold` sebagai fondasi tata letak.
   - `TopAppBar` dengan judul formulir berbasis resource string (`R.string.home` = "Form Isian") dan latar belakang `R.color.teal_700`.

2. **Input Nama Lengkap (`OutlinedTextField`)**
   - `OutlinedTextField` dengan rounded shape (`MaterialTheme.shapes.large`), lebar 250dp, dan label "Nama Lengkap".

3. **Pemisah Antar Field (`HorizontalDivider`)**
   - Garis pemisah horizontal dengan ketebalan `DividerDefaults.Thickness` / `1dp` dan warna `Color.Red`.

4. **Pilihan Jenis Kelamin (`RadioButton`)**
   - Pilihan radio dinamis berbasis list: `listOf("Laki-laki", "Perempuan")` dengan tata letak horizontal (`Row`).

5. **Input Alamat (`OutlinedTextField`)**
   - `OutlinedTextField` untuk isian alamat dengan ukuran terstandarisasi.

6. **Tombol Kirim (`Button`)**
   - Tombol "Submit" lebar penuh (`fillMaxWidth`) dengan teks berbasis string resource (`R.string.submit`).

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

<img width="1917" height="1078" alt="Preview Tampilan Formulir Isian PAM 6" src="https://github.com/user-attachments/assets/313d54a2-fec9-4861-9e25-490b1d7b2b72" />
<img width="1917" height="1078" alt="Preview Struktur Kode Formulir Compose" src="https://github.com/user-attachments/assets/529f4b4a-32de-429b-b841-c78985df7c12" />
