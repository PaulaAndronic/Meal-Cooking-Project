# Meal-Cooking-Project
Dezvoltat cu ajutorul programarii orientate pe obiect, proiectul ofera diferite tipuri de ingrediente si indicatii (retete pentru fiecare fel de mancare, tipuri de mancare - normale, speciale). Pe baza alegerilor din MainExamen.java (considerate ca fiind ale clientilor), clientii sunt serviti si datele despre ingrediente sunt actualizate constant sau programul intoarce o exceptie.

Pentru a gati un fel de mancare normal sau special este nevoie ca toate ingredientele sa fie in cantitate suficienta pentru reteta respectiva, iar in cazul felurilor de mancare speciale exista si un interval de valabilitate. Asadar, un fel de mancare special va putea fi gatit doar in perioada lui de valabilitate, altfel va fi intoarsa o exceptie de tipul InvalidSpecialDishException. De asemenea, se verifica si ca felurile de mancare cerute sa existe in lista de feluri ce pot fi gatite in aplicatie.

Pentru gestionarea datelor despre ingrediente si retete, s-au implementat metode de adaugare, actualizare si returnare a datelor. S-a folosit o singura colectie atat pentru stocarea datelor despre felurile de mancare normale, cat si pentru cele speciale.

Rularea se face din MainExamen.java, iar toate fisierele trebuie sa fie in package Examen_java pentru o functionare corecta.
