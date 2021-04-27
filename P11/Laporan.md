# Praktikum 11 Linked List
## Pertanyaan 9.2.3
1. Karena Linked List pada awalnya belum terisi sama sekali
2. alamat ndInput.next akan menyimpan alamat temp.next 
sedangkan alamat temp.next akan berisi alamat ndInput
3. untuk mendeteksi, jika temp.next.next adalah null, dapat dipastikan bahwa temp.next adalah tail

## Pertanyaan 9.3.3
1. Agar Perulangan berhenti ketika selesai melakukan sekali penghapusan, dan tidak akan mengapus lebih dari satu kali
2. Jika alamat temp.next adalah key, maka alamat temp.next akan diganti diganti dengan alamat setelah temp.next
3. Nilai yang dapat dikembalikan adalah nilai dari index yang di masukkan, entah itu bertype data apa saja
