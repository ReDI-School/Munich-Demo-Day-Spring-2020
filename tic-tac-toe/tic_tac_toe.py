# Umgebung
x= ["*"," ", "*", " ","*"," ", "*"," ", "*", " ","*"," ", "*","\n"]
y1= ["*"," ", "."," ", "*"," ","."," ", "*"," ", "."," ", "*","\n"]
y2= ["*"," ", "."," ", "*"," ","."," ", "*"," ", "."," ", "*","\n"]
y3= ["*"," ", "."," ", "*"," ","."," ", "*"," ", "."," ", "*","\n"]

print(''.join(x))
print(''.join(y1))
print(''.join(y2))
print(''.join(y3))
print(''.join(x))  

# Beginn der Spiel
Spieler = "1"

for i in range (0,9):   
  #Frage an Benutzer
  frage1 = int(input(" Welche Liste moechte sie aenderen?"))
  frage2 = int(input(" Welche Stelle moechte sie aenderen?"))
  
  #Welche Spieler
  if Spieler == "1":
    mark = "X"
    Spieler = "2"
  else:
    mark = "O"
    Spieler = "1"
    
  #Grid Aenderung 
  if frage1==1:
    y1[frage2] = mark
  elif frage1==2:
    y2[frage2] = mark
  else:
    y3[frage2] = mark
    
  #Zeige geaenderte Umgebung
  print(''.join(x))
  print(''.join(y1))
  print(''.join(y2))
  print(''.join(y3))
  print(''.join(x))
  
  #Ueberpruefung
  #Waagerecht
  if y1[2] == y1[6] == y1[10] == "X" or y2[2] == y2[6] == y2[10] == "X" or y3[2] == y3[6] == y3[10] == "X":
    print('Spieler 1 hat gewonnen!')
    break
  elif y1[2] == y1[6] == y1[10] == "O" or y2[2] == y2[6] == y2[10] == "O" or y3[2] == y3[6] == y3[10] == "O":
    print('Spieler 2 hat gewonnen!')
    break

  #Senkrecht
  if y1[2] == y2[2] == y3[2] == "X" or y1[6] == y2[6] == y3[6] == "X" or y1[10] == y2[10] == y3[10] == "X":
    print('Spieler 1 hat gewonnen!')
    break
  elif y1[2] == y2[2] == y3[2] == "O" or y1[6] == y2[6] == y3[6] == "O" or y1[10] == y2[10] == y3[10] == "O":
    print('Spieler 2 hat gewonnen!')
    break

  #Diagonal
  if y1[2]==y2[6]==y3[10]=="X" or y1[10]==y2[6]==y3[2]=="X":
    print('Spieler 1 hat gewonnen!')
    break
  elif y1[2]==y2[6]==y3[10]=="O" or y1[10]==y2[6]==y3[2]=="O":
    print('Spieler 2 hat gewonnen!')
    break
