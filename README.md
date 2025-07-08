# Quantum Bookstore

A Java-based bookstore management system that handles both physical and digital book sales with automated delivery services.

## Project Overview

Quantum Bookstore is an object-oriented Java application that simulates a modern bookstore capable of managing inventory, processing purchases, and handling deliveries for both physical paper books and digital e-books. The system implements clean architecture principles with separate layers for entities, services, and exception handling.

## Features

### Core Functionality
- **Inventory Management**: Add, remove, and track book quantities
- **Purchase Processing**: Handle customer purchases with balance validation
- **Dual Book Types**: Support for both physical paper books and digital e-books
- **Automated Delivery**: Different delivery methods for physical and digital items
- **Outdated Book Removal**: Automatically remove books older than specified years
- **Exception Handling**: Comprehensive error handling for various business scenarios

### Book Types
- **Paper Books**: Physical books delivered via shipping service
- **E-Books**: Digital books delivered via email with file format and size properties

### Delivery Services
- **Physical Delivery**: Ships paper books to customer addresses
- **Email Delivery**: Sends e-book download links to customer emails

## Architecture

### Package Structure
```
com.fawry.quantumbookstore/
├── entities/
│   ├── people/          # Customer, Author, Identity classes
│   └── stores/          # Bookstore management
├── items/               # Book types and item interfaces
├── services/
│   ├── purchaseservice/ # Purchase logic and factory
│   └── deliveryservice/ # Delivery implementations
├── exceptions/          # Custom exception classes
└── QuantumBookstoreApp.java  # Main application
```

### Design Patterns
- **Factory Pattern**: `PurchaseServiceFactory` creates appropriate purchase services
- **Strategy Pattern**: Different delivery services for different item types

## Key Classes

### Core Entities
- `Bookstore`: Main store management with inventory tracking
- `Customer`: Customer information with digital identity and balance
- `Author`: Book author with identity management
- `Book`: Abstract base class for all book types
- `PaperBook` & `EBook`: Concrete book implementations

### Services
- `PurchaseService`: Abstract purchase processing logic
- `PhysicalPurchaseService` & `DigitalPurchaseService`: Specific purchase implementations
- `DeliveryService`: Interface for delivery methods
- `PhysicalDeliveryService` & `EmailDeliveryService`: Delivery implementations

### Exception Handling
- `OutOfStockException`: When requested quantity exceeds inventory
- `InsufficientBalanceException`: When customer balance is insufficient
- `ItemNotForSaleException`: When item is not available for purchase
- `InvalidQuantityException`: When invalid quantity is specified
- `ItemNotFoundException`: When item is not in inventory


## Example Usage

The main application demonstrates:
1. Creating a bookstore instance
2. Adding paper books and e-books to inventory
3. Creating customers with balance
4. Processing various purchase scenarios
5. Handling insufficient stock and balance cases
6. Removing outdated books from inventory

## Error Handling

The system provides comprehensive error handling for:
- Inventory management errors
- Purchase validation failures
- Delivery service issues
- Invalid customer data
- Stock availability problems


## Development Notes

This project demonstrates:
- Clean code principles
- Object-oriented design patterns
- Exception handling best practices
- Factory method implementation
- Strategy pattern usage

---

*This project was developed as part of the Fawry fullstack software development internship program.*


![QuantumBookstoreRunning](https://github.com/user-attachments/assets/10f252b1-0b3e-4939-af61-7e888c772136)
