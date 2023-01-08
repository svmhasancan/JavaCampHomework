bolum1 = [0,0,0,0,0]
bolum2 = [0,0,0,0,0]




if bolum1 == [1,1,1,1,1] or bolum2 == [1,1,1,1,1]:
    print("Tüm Koltuklar Dolu.Diğer Uçuşumuz 3 saat sonra yapilacaktir.")
    
else:
    secilecekBolum = int(input("Sigara içilen bölüm için 1 , sigara içilmeyen bölüm için 2'ye basiniz: "))

    if secilecekBolum == 1:
        if bolum1 == [1,1,1,1,1]:
            print("Bu Bölümde Boş Koltuk Bulunmamaktadir.Dilerseniz Sigara İçilen Bölümden Reazervasyon Yapabilirsiniz.")


        print(bolum1)
        koltuk = int(input("Oturmak istediğiniz koltuğu seçiniz (1-5.koltuklar) "))
        if(bolum1[koltuk - 1] == 0):
            bolum1[koltuk - 1] = 1
            print("Bilet alma işlemi tamamlandi" + "Bölüm : 1.Bölüm " + "Koltuk Numarasi :" + str(koltuk))
            print(bolum1)
        else:
            print("Koltuk Dolu.Lütfen Başka Bir koltuk Seçiniz")

    elif secilecekBolum == 2:
        if bolum2 == [1,1,1,1,1]:
            print("Bu Bölümde Boş Koltuk Bulunmamaktadir.Dilerseniz Sigara İçilen Bölümden Reazervasyon Yapabilirsiniz.")


        print(bolum2)
        koltuk = int(input("Oturmak istediğiniz koltuğu seçiniz (1-5.koltuklar) "))
        if(bolum2[koltuk - 1] == 0):
            bolum2[koltuk - 1] = 1
            print("Bilet alma işlemi tamamlandi" + "Bölüm : 2.Bölüm " + "Koltuk Numarasi :" + str(koltuk))
            print(bolum2)
        else:
            print("Koltuk Dolu.Lütfen Başka Bir koltuk Seçiniz")







