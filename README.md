
# 🧮 CRUD avec DAO Générique
## Description
Ce projet illustre la conception d’une application Java orientée objet pour gérer des utilisateurs et leurs profils :

- Définition d’une interface générique Identifiable pour assurer l’unicité des objets

- Implémentation des entités métier : Profile et Utilisateur

- Mise en place d’un DAO générique avec une implémentation en mémoire (ListDao)

- Création de services (ProfileService, UserService) pour encapsuler la logique métier

- Programme principal TestApp pour tester les opérations CRUD et les fonctionnalités métier
## Project Structure
```
projets/
├── UserProfileProject/
│   └── src/
│       └── ma/project/
│           ├── bean/
│           │   ├── Identifiable.java
│           │   ├── Profile.java
│           │   └── Utilisateur.java
│           ├── dao/
│           │   ├── Dao.java
│           │   └── ListDao.java
│           ├── service/
│           │   ├── ProfileService.java
│           │   └── UserService.java
│           └── TestApp.java
└── README.md
```
## ⚙️ Features

### **1.** Entités métier
Classe Identifiable

Méthodes :

- getId() : retourne l’identifiant unique

Classe Profile

Attributs :

- id (auto-incrémenté), code (String), description (String)

Méthodes :

- getCode(), setCode()

- getDescription(), setDescription()

- getId() : retourne l’identifiant unique

- toString() : représentation textuelle

Classe Utilisateur

Attributs :

- id (auto-incrémenté), login (String), password (String), profile (Profile)

Méthodes :

- getLogin(), setLogin()

- getPassword(), setPassword()

- getProfile(), setProfile()

- getId() : retourne l’identifiant unique

- toString() : représentation textuelle

### **2.** DAO générique
Interface Dao<T>

Méthodes :

- creat(T o) : création d’un objet

- update(T o) : mise à jour d’un objet

- delete(int id) : suppression par identifiant

- findById(int id) : recherche par identifiant

- findAll() : récupération de tous les objets

Classe ListDao<T extends Identifiable>

Attributs :

- items (List<T>) : stockage en mémoire

Méthodes :

- creat(T o) : ajoute un objet à la liste

- update(T o) : met à jour un objet existant

- delete(int id) : supprime un objet par identifiant

- findById(int id) : recherche un objet par identifiant

- findAll() : retourne une copie de la liste

### **3.** Services
Classe ProfileService

Attributs :

- dao (Dao<Profile>) : DAO interne

Méthodes :

- create(String code, String desc) : crée un profil

- update(Profile p) : met à jour un profil

- delete(int id) : supprime un profil

- findById(int id) : recherche un profil par identifiant

- findAll() : retourne tous les profils

Classe UserService

Attributs :

- dao (Dao<Utilisateur>) : DAO interne

Méthodes :

- create(String login, String pwd, Profile p) : crée un utilisateur

- update(Utilisateur u) : met à jour un utilisateur

- delete(int id) : supprime un utilisateur

- findById(int id) : recherche un utilisateur par identifiant

- findAll() : retourne tous les utilisateurs

- findByProfile(Profile profile) : retourne les utilisateurs associés à un profil donné

### **4.** Programme principal – TestApp
- Création de profils et d’utilisateurs

- Affichage de tous les profils et utilisateurs

- Mise à jour des données (description d’un profil, mot de passe d’un utilisateur)

- Suppression d’un utilisateur et d’un profil

- Fonctionnalité métier : recherche des utilisateurs par profil (ex. managers)
## 🖥️ Example Execution

### TestApp :

## 💡 Concepts Practiced

- Utilisation d’une interface générique DAO pour factoriser les opérations CRUD

- Implémentation en mémoire avec ListDao pour simplifier les tests

- Séparation claire entre entités, DAO, services et programme principal

- Encapsulation de la logique métier dans les services pour une meilleure maintenabilité
## 🧑‍💻 Author

- 👤 Agouram Hassan
- 🏫 Programmation orientée objet : java
- 🎓 Instructor	Mr.LACHGAR
- 📅 09 décembre 2025
