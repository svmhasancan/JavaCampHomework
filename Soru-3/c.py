# 3. Soru - C

# 21 ile n arasındaki çift sayıların aritmetik ortalaması

toplam = 0
n = int(input("23'ten büyük ya da eşit bir n sayisi giriniz: "))
terimSayisi = []

if(n<23):
    print("Lütfen 23'ten geçerli bir n sayisi giriniz!")

else:
    for i in range(22,n):
        if i%2 == 0:
            toplam = toplam + i
            terimSayisi.append(i) # append fonkisyonu array'e 21-N arasındaki çift sayıları terimSayisi array'ine ekliyor
            
#Kod fazlalığı olmasın , daha temiz kod olsun diye 21-N arasındaki çift sayıları yukarıdaki terimSayisi array'inde tuttum , len fonksiyonu ile de array'in eleman sayısını aldım.

ortalama = toplam / len(terimSayisi)

print(ortalama)

