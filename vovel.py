l=["a","e","i","o","u","A","E","I","O","U"]
l1=["b","c","d","f","g","h","i","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z","B","C","D","F","G","H","J","K","L","M","N","P","Q","R","S","T","V","W","X","Y","Z"]
a=input()

if a in l:
    print("Vowel")
elif a in l1:
    print("Consonant")
else:
    print("Invalid")
