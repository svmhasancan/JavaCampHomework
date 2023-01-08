# 3.Soru - B

# -23 ile N arasındaki tek sayıların çarpımı

carpim = 1
n = int(input("23'ten büyük ya da eşit bir n sayisi giriniz: "))

if(n<23):
    print("Lütfen 23'ten geçerli bir n sayisi giriniz!")

else:
    for i in range(-21,n,2):
        carpim = carpim * i

print(carpim)
