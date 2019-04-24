#!/usr/bin/python
# -*- encoding: utf8 -*-
import random

# Recherche dichotomique
# Complexité : O(logn)
# Renvoie la position de l'élément e dans le tableau t, ou None
# -------------------------------------------- À CODER --------------------------------------------
def dichoSearch(t, e):
	#on definit 1ér et dernier index tu tab.
	f=0
	l=len(t)-1
	#si l'élément qu'on cherche se trouve dans la 1er position:
	if t[0]==e:
		return 0;
	else:
		while f<=l:
			milieu=(f+l)//2
			if t[milieu]==e:
				return milieu
			else:
				if milieu>e:
					l-=1
				else:
					f+=1
		return -1

	
# Test
print("recherche dichotomique")
t = [1,2,4]; # Il faut un tableau trié
print(t);
for i in range(len(t)):
	print("recherche de ", t[i], ":");
	idx = dichoSearch(t, t[i]);
	print("résultat :", idx);

print("recherche de 3 :");
idx = dichoSearch(t, 3);
print("résultat :", idx);
print("recherche de 6 :");
idx = dichoSearch(t, 6);
print("résultat :", idx);
print("recherche de -1 :");
idx = dichoSearch(t, -1);
print("résultat :", idx);
print("");


# Renvoie un tableau de longueur n rempli d'entiers choisis aléatoirement entre 0 et 100 (inclus), fonction utilisée pour tester votre code
def randomArray(n):
	return [random.randint(0, 100) for i in range(n)]; # NE PAS MODIFIER

# Fonction pour savoir si un tableau est trié
# Renvoie True si le tableau t est trié (par ordre croissant) et False sinon
# Complexité : O(n)
# -------------------------------------------- À CODER --------------------------------------------
def isSortedArray(t):
	if len(t)==0 or len(t)==1:
		return True
	i=1
	while i<len(t):
		if t[i]<t[i-1]:
			return False
		i+=1
	return True
print("isSortedArray")
for i in range(0, 10):
	t = randomArray(i); # on crée un tableau aléatoire de taille i
	
	print(t, isSortedArray(t));
print("");


# Tri par insertion
# Complexité : meuilleur cas: O(n)(déjà trié) // pire cas: O(n**2)
# (Algorithme en place : le tableau t est modifié)
# -------------------------------------------- À CODER --------------------------------------------
def insertSort(t):
	j=0
	for i in range(len(t)-1):
		j=i+1
		while j>1 and isSortedArray(t)==False:
			temporaire=t[j]
			t[j]=t[j-1]
			t[j-1]=temporaire
			j-=1
	
# Test
print("Tri par insertion")
for i in range(5):
	t = randomArray(i);
	print("random:", t, isSortedArray(t));
	insertSort(t);
	print("sorted:", t, isSortedArray(t));
print("");



# Tri par sélection
# Complexité : n**2 dans la meilleure et le pire cas
# (Algorithme en place : le tableau t est modifié)
# -------------------------------------------- À CODER --------------------------------------------
def selectSort(t):
	posmin=0
	temporaire=0
	for i in range(len(t)):
		posmin=i
		for j in range(i+1,len(t)):
			if t[j]<t[i]:
				posmin=j
		if i!=posmin:
			temporaire=t[i]
			t[i]=t[posmin]
			t[posmin]=temporaire

# Test
print("Tri par sélection")
for i in range(5):
	t = randomArray(i);
	print("random:", t, isSortedArray(t));
	selectSort(t);
	print("sorted:", t, isSortedArray(t));
print("");
