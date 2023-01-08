# 3.soru - A

# 3 ile N arasındaki tüm sayıların toplamı

toplam = 0
n = int(input("23'ten büyük ya da eşit bir n sayisi giriniz: "))

if(n<23):
    print("Lütfen 23'ten geçerli bir n sayisi giriniz!")

else:
    for i in range(4,n):
        toplam = toplam + i
        i = i + 1
        

print(toplam)