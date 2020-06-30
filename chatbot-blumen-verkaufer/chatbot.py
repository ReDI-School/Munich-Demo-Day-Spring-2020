# Variablen
liste_schnittblumen = ["Rosen", "Tulpen", "Sonnenblumen"]
preisliste_schnittblumen = [10,12,14]

liste_gartenpflanzen = ["Pfingstrosen", "Sonnenblumen", "Geranien"]
preisliste_gartenpflanzen = [20,30,40]

liste_farben = ['rot', 'weiß', 'gelb', 'blau']
liste_groesse = ['gross', 'klein']
liste_anlaesse = ['Geburtstag', 'Valentinstag', 'Muttertag', 'Trauertag']
liste_liefern_zeit = ['Mo 10-6', 'Di 10-4', 
                    'Mi 9-13', 'Do 10-15', 
                    'Fr 9-14', 'Sa 8-12', 
                    'Feiertag 10-12']

fehl_eingabe = "not error"

### Begrüßung
print ('Hallo')

### Welche Blumen?
print('Welche Blumen moechten Sie bestellen? Schnittblumen oder Gartenpflanzen?')
pflanzenart = input('Wähle zwischen 1 und 2: ')

if pflanzenart == "1":
  print('Okay, Sie möchten Schnittblumen')
  print("Welche Schnittblumen möchtest Du bestellen? ")
  print(liste_schnittblumen)
  auswahl_blumen = input("Wähle zwischen 1-3: ")
  int_index = int(auswahl_blumen)-1
  print('Okay, Sie möchten', liste_schnittblumen[int_index])  
  preis_blumen = preisliste_schnittblumen[int_index]
  
  print('Der Preis beträgt',preis_blumen,'€')
  
elif pflanzenart == "2":
  print('Okay, Sie möchten Gartenpflanzen')
  print("Welche Gartenpflanzen moechtest Du bestellen?")
  print(liste_gartenpflanzen)
  auswahl_blumen = input("Wähle zwischen 1-3: ")
  int_index = int(auswahl_blumen)-1
  print('Okay, Sie möchten', liste_gartenpflanzen[int_index])
  preis_blumen = preisliste_gartenpflanzen[int_index]
  
  print('Der Preis beträgt',preis_blumen,'€')  
  
else:
  fehl_eingabe = 'error'
  print('Wir haben leider nur Schnittblumen oder Gartenpflanzen')
    
### Welche Farben & Größe?
if fehl_eingabe == 'error':
  print('Error')
  
else:
  print('Welche Farbe sollen die Blumen haben?')	
  print('Wir haben diese Farben: ', liste_farben)	
  eingabe_farbe = input('Wähle zwischen 1-4: ')
  int_index = int(eingabe_farbe)-1
  farbe = liste_farben[int_index]
  print('Du möchtest Blumen in der Farbe: ', farbe)
  print('Welche Größe des Strauss?', liste_groesse, '?')
  groesse = input('gross oder klein?')
  print('Du möchtest den Strauss', groesse)
  
  if groesse == "gross":
    groessen_faktor = 1.5
  elif groesse == "klein":
    groessen_faktor = 1
    
### Anlass der Blumen
print('Zu welchem Anlass möchten Sie die Blumen?')
print(liste_anlaesse)
eingabe_anlass = input('Wähle zwischen 1 bis 4 aus: ')

anlass = liste_anlaesse[int(eingabe_anlass) - 1]

print('OK, Sie haben', anlass, 'gewählt')

### Lieferung
ArtDerLieferung=input ('Möchten Sie die Blumen abholden oder liefern?')
print('OK, Sie möchten', ArtDerLieferung)

if ArtDerLieferung == 'abholen':
  lieferkosten = 0
  print('OK, Sie können die Blumen zwischen 9 und 17 Uhr abholen')
  
elif ArtDerLieferung == 'liefern':
  lieferkosten = 4.0
  print('ok. wenn sollte es geliefert werden')
  print ('Wir haben diese Lieferzeit:') 
  print(liste_liefern_zeit)
  eingabe_liefern_zeit = input('Wähle zwischen 1-7')
  int_index = int(eingabe_liefern_zeit)-1
  Liefern_zeit = liste_liefern_zeit[int_index]
  print('Du möchtest liefern in der liefern Zeit: ', Liefern_zeit)
	
### Berechnung der Kosten
Gesamtpreis = (preis_blumen * groessen_faktor) + lieferkosten
print('Vielen Dank für Ihre Bestellung. Ihre Blumen kosten',Gesamtpreis,'€.')
    
### Verabschiedung
print ('Bis zum naechsten Mal')
