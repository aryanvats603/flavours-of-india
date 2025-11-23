
# 🍛 Flavours of India

> A modern full-stack food delivery application with futuristic UI design

[![React](https://img.shields.io/badge/React-18.x-61dafb?logo=react)](https://reactjs.org/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-6db33f?logo=springboot)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/MySQL-8.0-4479a1?logo=mysql)](https://www.mysql.com/)

## ✨ Features

- 🛒 **Customer Portal** - Browse menu, add to cart, secure checkout
- 👨‍💼 **Admin Panel** - Manage menu items, track orders
- 💳 **Razorpay Integration** - Secure payment processing
- ☁️ **AWS S3** - Cloud image storage
- 🔐 **JWT Authentication** - Secure user sessions
- 🎨 **Futuristic UI** - Dark theme with gradient animations
- 📱 **Fully Responsive** - Works on all devices

## 🚀 Tech Stack

**Frontend:** React, Bootstrap 5, Custom CSS  
**Backend:** Spring Boot, Spring Security,JWT, JPA/Hibernate
**Database:** MongoDB
**Storage:** AWS S3  
**Payment:** Razorpay

## ⚙️ Quick Setup

### Prerequisites
- Node.js 16+
- Java 17+
- MongoDB 6.0+
- Maven 3.8+

### Backend Setup
```bash
# Navigate to backend
cd foodiesapi

# Configure application.properties
cp src/main/resources/application.properties.example src/main/resources/application.properties
# Edit with your credentials

# Run
mvn spring-boot:run
```

### Frontend Setup
```bash
# Navigate to frontend
cd foodies

# Install dependencies
npm install

# Configure environment
cp .env.example .env
# Edit with your API URL and Razorpay key

# Run
npm run dev
```

### Admin Panel Setup
```bash
cd adminpanel
npm install
npm run dev
```

## 🔐 Environment Variables

**Backend** (`application.properties`):
```properties
spring.data.mongodb.uri=mongodb://localhost:27017/food_delivery
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
aws.access.key=YOUR_AWS_KEY
aws.secret.key=YOUR_AWS_SECRET
razorpay.key.id=YOUR_RAZORPAY_KEY
razorpay.key.secret=YOUR_RAZORPAY_SECRET
```

**Frontend** (`.env`):
```env
REACT_APP_API_URL=http://localhost:8080/api
REACT_APP_RAZORPAY_KEY=YOUR_RAZORPAY_KEY
```

## 📂 Project Structure
```
flavours-of-india/
├── foodiesapi/          # Spring Boot Backend
├── foodies/             # React Customer Frontend
├── adminpanel/          # React Admin Panel
└── README.md
```

## 🎯 Key Endpoints
```
POST   /api/register           - User registration
POST   /api/login              - User login
GET    /api/food/list          - Get all food items
POST   /api/cart/add           - Add to cart
POST   /api/order/place        - Place order
POST   /api/order/verify       - Verify payment
```

## 🎨 UI Highlights

- Dark futuristic theme with gradient effects
- Glassmorphism design elements
- Smooth animations and transitions
- Mobile-first responsive design

## 📝 License

MIT License - feel free to use this project for learning!

## 👨‍💻 Author

**Aryan Vats**  
GitHub: [@aryanvats603](https://github.com/aryanvats603)

---

⭐ **Star this repo if you found it helpful!**
