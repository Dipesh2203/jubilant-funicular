# Full Stack Item Management App

A simple full-stack application built using Spring Boot for the backend and a web frontend deployed separately. The backend is containerized using Docker and deployed on Render, while the frontend is deployed on Netlify.

---

## 🚀 Live URLs

### Frontend

[https://java-test-task.netlify.app/](https://java-test-task.netlify.app/)

### Backend

[https://jubilant-funicular-56a9.onrender.com](https://jubilant-funicular-56a9.onrender.com)

---

## ✨ Features

* View all items
* Add a new item
* Fetch a single item using ID
* REST-based backend
* Separate frontend and backend deployment

---

## 🛠 Tech Stack

* Backend: Spring Boot (Java)
* Build Tool: Maven
* Containerization: Docker
* Frontend: HTML / JavaScript
* Cloud Hosting:

  * Frontend: Netlify
  * Backend: Render
* Version Control: GitHub

---

## 📁 Project Structure

```
src/main/java/com/example/project
 ├── controllers
 ├── services
 ├── repositories
 └── BloomsomeApplication.java
```

---

## 🔗 API Base URL (Backend)

[https://jubilant-funicular-56a9.onrender.com](https://jubilant-funicular-56a9.onrender.com)

---

## 📌 API Endpoints

```
GET    /items/all
POST   /items/add
GET    /items/{id}
```

### Endpoint details

* GET /items/all
  Fetch all items

* POST /items/add
  Add a new item

* GET /items/{id}
  Fetch a single item using its ID

---

## 🧾 Sample API Request – Add Item

**POST** `/items/add`

**Full URL**

```
https://jubilant-funicular-56a9.onrender.com/items/add
```

**Request Body (JSON – example)**

```
{
  "name": "Laptop",
  "description": "Office laptop",
  "price": 45000
}
```

**Header**

```
Content-Type: application/json
```

---

## ⚙️ Prerequisites (for local run)

* Java 11 
* Maven

---

## ☁️ Deployment

### Backend

* Docker image is built from the project
* Repository is connected to Render
* Environment variables are configured
* Application is deployed as a Docker service

### Frontend

* Static frontend files are deployed on Netlify
* Frontend calls the backend APIs hosted on Render

---

## 👨‍🎓 Author

Dipesh Kumar
[dipesh2203@gmail.com](dipesh2203@gmail.com)

---

## 📄 License

This project is created for learning and academic purposes.
